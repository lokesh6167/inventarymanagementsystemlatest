-- H2 will create tables if they don't exist
-- If tables already exist, this script will not recreate them

CREATE TABLE IF NOT EXISTS product (
  id INT PRIMARY KEY AUTO_INCREMENT,
  product_group VARCHAR(30),
  product_item VARCHAR(30),
  ware_house_code VARCHAR(30),
  stock_quantity INT
);

CREATE TABLE IF NOT EXISTS transaction (
  id INT PRIMARY KEY AUTO_INCREMENT,
  ware_house_code VARCHAR(30),
  product_group VARCHAR(30),
  product_item VARCHAR(30),
  invoice_number VARCHAR(30),
  transaction_type VARCHAR(10),
  date_of_transaction TIMESTAMP,
  transaction_quantity INT
);
