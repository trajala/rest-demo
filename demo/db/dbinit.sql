CREATE TABLE IF NOT EXISTS customer (
  id VARCHAR(36) NOT NULL,
  name VARCHAR(128) NOT NULL,
  email VARCHAR(128) NOT NULL
);

INSERT IGNORE INTO customer VALUES('f85eae6e-4bb0-4cc3-a90f-cdb55563606d','Demo User 1','demo1@demo');
INSERT IGNORE INTO customer VALUES('f7dc304d-a09f-4f26-b72a-f7aed5ebcd19','Demo User 2','demo2@demo');
INSERT IGNORE INTO customer VALUES('fcdd4bd3-3cd3-4d16-b63c-7f75f12363d5','Demo User 3','demo3@demo');