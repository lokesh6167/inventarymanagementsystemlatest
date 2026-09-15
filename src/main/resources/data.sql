-- This file will be executed on startup to create initial data if tables are empty
-- H2 will NOT delete data on app restart

-- Initial sample data (only if running for first time)
INSERT IGNORE INTO product (id, product_group, product_item, ware_house_code, stock_quantity) 
VALUES (1, 'ProductGroup1', 'ProductItem1', 'Warehouse1', 100);

INSERT IGNORE INTO product (id, product_group, product_item, ware_house_code, stock_quantity) 
VALUES (2, 'ProductGroup2', 'ProductItem2', 'Kochada i', 0);
