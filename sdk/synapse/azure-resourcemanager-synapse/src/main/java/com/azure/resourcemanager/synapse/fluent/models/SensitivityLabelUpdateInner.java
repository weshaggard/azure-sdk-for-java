// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.SensitivityLabelUpdateKind;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A sensitivity label update operation. */
@JsonFlatten
@Fluent
public class SensitivityLabelUpdateInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SensitivityLabelUpdateInner.class);

    /*
     * The op property.
     */
    @JsonProperty(value = "properties.op")
    private SensitivityLabelUpdateKind op;

    /*
     * Schema name of the column to update.
     */
    @JsonProperty(value = "properties.schema")
    private String schema;

    /*
     * Table name of the column to update.
     */
    @JsonProperty(value = "properties.table")
    private String table;

    /*
     * Column name to update.
     */
    @JsonProperty(value = "properties.column")
    private String column;

    /*
     * The sensitivity label information to apply on a column.
     */
    @JsonProperty(value = "properties.sensitivityLabel")
    private SensitivityLabelInner sensitivityLabel;

    /**
     * Get the op property: The op property.
     *
     * @return the op value.
     */
    public SensitivityLabelUpdateKind op() {
        return this.op;
    }

    /**
     * Set the op property: The op property.
     *
     * @param op the op value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withOp(SensitivityLabelUpdateKind op) {
        this.op = op;
        return this;
    }

    /**
     * Get the schema property: Schema name of the column to update.
     *
     * @return the schema value.
     */
    public String schema() {
        return this.schema;
    }

    /**
     * Set the schema property: Schema name of the column to update.
     *
     * @param schema the schema value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the table property: Table name of the column to update.
     *
     * @return the table value.
     */
    public String table() {
        return this.table;
    }

    /**
     * Set the table property: Table name of the column to update.
     *
     * @param table the table value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get the column property: Column name to update.
     *
     * @return the column value.
     */
    public String column() {
        return this.column;
    }

    /**
     * Set the column property: Column name to update.
     *
     * @param column the column value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withColumn(String column) {
        this.column = column;
        return this;
    }

    /**
     * Get the sensitivityLabel property: The sensitivity label information to apply on a column.
     *
     * @return the sensitivityLabel value.
     */
    public SensitivityLabelInner sensitivityLabel() {
        return this.sensitivityLabel;
    }

    /**
     * Set the sensitivityLabel property: The sensitivity label information to apply on a column.
     *
     * @param sensitivityLabel the sensitivityLabel value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withSensitivityLabel(SensitivityLabelInner sensitivityLabel) {
        this.sensitivityLabel = sensitivityLabel;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sensitivityLabel() != null) {
            sensitivityLabel().validate();
        }
    }
}
