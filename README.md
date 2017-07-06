If you run `run-tests.sh` you get the usual maven spam, followed by:

```
target-3.8.7-9.4-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.8.7-9.4-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.8.7-9.5-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.8.7-9.5-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.8.7-9.6-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.8.7-9.6-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.9.0-9.4-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.9.0-9.4-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

target-3.9.0-9.5-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.9.0-9.5-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

target-3.9.0-9.6-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.9.0-9.6-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

target-3.9.3-9.4-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.9.3-9.4-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

target-3.9.3-9.5-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.9.3-9.5-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

target-3.9.3-9.6-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-3.9.3-9.6-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

```

Target folders are `target-${JOOQ_VERSION}-${POSTGRES_VERSION}-${JOOQ_OUTPUT_SCHEMA_TO_DEFAULT}`.

Note the change in behaviour from jOOQ 3.8.7 to 3.9.0 with `<outputSchemaToDefault>true</outputSchemaToDefault>`, where ```TableField<TestRecord, TestStatus>``` becomes ```TableField<TestRecord, Object>```, however the correct behaviour occurs in all versions when `<outputSchemaToDefault>false</outputSchemaToDefault>`.
