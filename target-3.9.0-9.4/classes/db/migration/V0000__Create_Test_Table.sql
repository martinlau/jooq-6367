
CREATE TYPE test_status AS ENUM (
  'ACTIVE',
  'SUSPENDED'
);

CREATE TABLE test (
  id       UUID                     NOT NULL PRIMARY KEY,
  status   test_status              NOT NULL DEFAULT 'ACTIVE'
);

