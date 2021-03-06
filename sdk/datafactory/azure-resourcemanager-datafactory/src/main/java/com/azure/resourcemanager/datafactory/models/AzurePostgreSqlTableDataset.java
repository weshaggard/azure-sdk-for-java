// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Azure PostgreSQL dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzurePostgreSqlTable")
@JsonFlatten
@Fluent
public class AzurePostgreSqlTableDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzurePostgreSqlTableDataset.class);

    /*
     * The table name of the Azure PostgreSQL database which includes both
     * schema and table. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /*
     * The table name of the Azure PostgreSQL database. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /*
     * The schema name of the Azure PostgreSQL database. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.schema")
    private Object schemaTypePropertiesSchema;

    /**
     * Get the tableName property: The table name of the Azure PostgreSQL database which includes both schema and table.
     * Type: string (or Expression with resultType string).
     *
     * @return the tableName value.
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The table name of the Azure PostgreSQL database which includes both schema and table.
     * Type: string (or Expression with resultType string).
     *
     * @param tableName the tableName value to set.
     * @return the AzurePostgreSqlTableDataset object itself.
     */
    public AzurePostgreSqlTableDataset withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the table property: The table name of the Azure PostgreSQL database. Type: string (or Expression with
     * resultType string).
     *
     * @return the table value.
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table property: The table name of the Azure PostgreSQL database. Type: string (or Expression with
     * resultType string).
     *
     * @param table the table value to set.
     * @return the AzurePostgreSqlTableDataset object itself.
     */
    public AzurePostgreSqlTableDataset withTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * Get the schemaTypePropertiesSchema property: The schema name of the Azure PostgreSQL database. Type: string (or
     * Expression with resultType string).
     *
     * @return the schemaTypePropertiesSchema value.
     */
    public Object schemaTypePropertiesSchema() {
        return this.schemaTypePropertiesSchema;
    }

    /**
     * Set the schemaTypePropertiesSchema property: The schema name of the Azure PostgreSQL database. Type: string (or
     * Expression with resultType string).
     *
     * @param schemaTypePropertiesSchema the schemaTypePropertiesSchema value to set.
     * @return the AzurePostgreSqlTableDataset object itself.
     */
    public AzurePostgreSqlTableDataset withSchemaTypePropertiesSchema(Object schemaTypePropertiesSchema) {
        this.schemaTypePropertiesSchema = schemaTypePropertiesSchema;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzurePostgreSqlTableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzurePostgreSqlTableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzurePostgreSqlTableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzurePostgreSqlTableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzurePostgreSqlTableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzurePostgreSqlTableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzurePostgreSqlTableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
