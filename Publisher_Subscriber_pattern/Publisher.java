package Publisher_Subscriber_pattern;

public interface Publisher {
    void addSub(Subscriber subscriber);
    void removeSub(Subscriber subscriber);
    void notifySub(String msg);
}
