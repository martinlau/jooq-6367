If you run `run-tests.sh` you get the usual maven spam, followed by:

```
target-9.4-3.8.7-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.4-3.8.7-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.4-3.9.0-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.4-3.9.0-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

target-9.4-3.9.3-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.4-3.9.3-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

target-9.5-3.8.7-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.5-3.8.7-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.5-3.9.0-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.5-3.9.0-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

target-9.5-3.9.3-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.5-3.9.3-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

target-9.6-3.8.7-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.6-3.8.7-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.6-3.9.0-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.6-3.9.0-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

target-9.6-3.9.3-false/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

target-9.6-3.9.3-true/generated-sources/jooq/com/example/tables/Test.java
    public final TableField<TestRecord, Object> STATUS = createField("status", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");
```

Target folders are `target-${JOOQ_VERSION}-${POSTGRES_VERSION}-${JOOQ_OUTPUT_SCHEMA_TO_DEFAULT_FLAG}`.

Note the change in behaviour from jOOQ 3.8.7 to 3.9.0 with `&lt;outputSchemaToDefault&gt;true&lt;/outputSchemaToDefault&gt;`, where ```TableField<TestRecord, TestStatus>``` becomes ```TableField<TestRecord, Object>```, however the correct behaviour occurs in all versions when `&lt;outputSchemaToDefault&gt;false&lt;/outputSchemaToDefault&gt;`.
