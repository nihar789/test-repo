CREATE TABLE IF NOT EXISTS customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS gadgets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    device_id VARCHAR(50),
    status VARCHAR(10),
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);