
CREATE TYPE another_status AS ENUM (
  'ACTIVE',
  'SUSPENDED'
);

CREATE TABLE another (
  id       UUID                     NOT NULL PRIMARY KEY,
  status   another_status           NOT NULL DEFAULT 'ACTIVE'
);

