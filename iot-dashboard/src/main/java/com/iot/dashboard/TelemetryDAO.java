package com.iot.dashboard;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class TelemetryDAO {
    private final DynamoDbClient ddb;
    private final String tableName;

    public TelemetryDAO(String endpoint, String tableName) {
        AwsBasicCredentials creds = AwsBasicCredentials.create("dummy", "dummy");
        this.ddb = DynamoDbClient.builder()
                .endpointOverride(URI.create(endpoint))
                .region(Region.US_EAST_1)
                .credentialsProvider(StaticCredentialsProvider.create(creds))
                .build();
        this.tableName = tableName;
    }

    public boolean putTelemetry(TelemetryRecord t) {
        Map<String, AttributeValue> item = new HashMap<>();
        item.put("device_id", AttributeValue.builder().s(t.getDeviceId()).build());

        String tsString = Long.toString(t.getTs());
        item.put("ts", AttributeValue.builder().s(tsString).build());

        DateTimeFormatter fmtLocal = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());

        String tsLocal = fmtLocal.format(Instant.ofEpochMilli(t.getTs()));
        item.put("ts_local", AttributeValue.builder().s(tsLocal).build());


        item.put("metric", AttributeValue.builder().s(t.getMetric()).build());
        item.put("value", AttributeValue.builder().s(t.getValue()).build());

        if (t.getOwnerId() != null) {
            item.put("owner_id", AttributeValue.builder().n(String.valueOf(t.getOwnerId())).build());
        }

        try {
            PutItemRequest req = PutItemRequest.builder()
                    .tableName(tableName)
                    .item(item)
                    .build();
            ddb.putItem(req);
            return true;
        } catch (Exception e) {
            System.err.println("putTelemetry error: " + e.getMessage());
            return false;
        }
    }

    public void close() {
        ddb.close();
    }

    public static TelemetryDAO local() {
        return new TelemetryDAO("http://localhost:8000", "Telemetry");
    }
}