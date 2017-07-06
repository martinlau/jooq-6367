/*
 * This file is generated by jOOQ.
*/
package com.example.tables;


import com.example.Keys;
import com.example.Public;
import com.example.enums.TestStatus;
import com.example.tables.records.TestRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Test extends TableImpl<TestRecord> {

    private static final long serialVersionUID = -1841024929;

    /**
     * The reference instance of <code>public.test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestRecord> getRecordType() {
        return TestRecord.class;
    }

    /**
     * The column <code>public.test.id</code>.
     */
    public final TableField<TestRecord, UUID> ID = createField("id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.test.status</code>.
     */
    public final TableField<TestRecord, TestStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.example.enums.TestStatus.class), this, "");

    /**
     * Create a <code>public.test</code> table reference
     */
    public Test() {
        this("test", null);
    }

    /**
     * Create an aliased <code>public.test</code> table reference
     */
    public Test(String alias) {
        this(alias, TEST);
    }

    private Test(String alias, Table<TestRecord> aliased) {
        this(alias, aliased, null);
    }

    private Test(String alias, Table<TestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestRecord> getPrimaryKey() {
        return Keys.TEST_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestRecord>> getKeys() {
        return Arrays.<UniqueKey<TestRecord>>asList(Keys.TEST_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Test as(String alias) {
        return new Test(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Test rename(String name) {
        return new Test(name, null);
    }
}