/*
 * This file is generated by jOOQ.
*/
package com.example.tables.records;


import com.example.tables.Another;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AnotherRecord extends UpdatableRecordImpl<AnotherRecord> implements Record2<UUID, Object> {

    private static final long serialVersionUID = -1412039542;

    /**
     * Setter for <code>another.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>another.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>another.status</code>.
     */
    public void setStatus(Object value) {
        set(1, value);
    }

    /**
     * Getter for <code>another.status</code>.
     */
    public Object getStatus() {
        return (Object) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UUID, Object> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UUID, Object> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Another.ANOTHER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field2() {
        return Another.ANOTHER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value2() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AnotherRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AnotherRecord value2(Object value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AnotherRecord values(UUID value1, Object value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AnotherRecord
     */
    public AnotherRecord() {
        super(Another.ANOTHER);
    }

    /**
     * Create a detached, initialised AnotherRecord
     */
    public AnotherRecord(UUID id, Object status) {
        super(Another.ANOTHER);

        set(0, id);
        set(1, status);
    }
}
