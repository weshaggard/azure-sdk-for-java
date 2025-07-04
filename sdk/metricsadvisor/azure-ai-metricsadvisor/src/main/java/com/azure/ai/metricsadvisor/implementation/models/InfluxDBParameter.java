// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The InfluxDBParameter model.
 */
@Fluent
public final class InfluxDBParameter implements JsonSerializable<InfluxDBParameter> {
    /*
     * The connection string of this InfluxDB
     */
    @Generated
    private String connectionString;

    /*
     * A database name
     */
    @Generated
    private String database;

    /*
     * The user name of the account that can access this database
     */
    @Generated
    private String userName;

    /*
     * The password of the account that can access this database
     */
    @Generated
    private String password;

    /*
     * The script to query this database
     */
    @Generated
    private String query;

    /**
     * Creates an instance of InfluxDBParameter class.
     */
    @Generated
    public InfluxDBParameter() {
    }

    /**
     * Get the connectionString property: The connection string of this InfluxDB.
     * 
     * @return the connectionString value.
     */
    @Generated
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of this InfluxDB.
     * 
     * @param connectionString the connectionString value to set.
     * @return the InfluxDBParameter object itself.
     */
    @Generated
    public InfluxDBParameter setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the database property: A database name.
     * 
     * @return the database value.
     */
    @Generated
    public String getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: A database name.
     * 
     * @param database the database value to set.
     * @return the InfluxDBParameter object itself.
     */
    @Generated
    public InfluxDBParameter setDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * Get the userName property: The user name of the account that can access this database.
     * 
     * @return the userName value.
     */
    @Generated
    public String getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: The user name of the account that can access this database.
     * 
     * @param userName the userName value to set.
     * @return the InfluxDBParameter object itself.
     */
    @Generated
    public InfluxDBParameter setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: The password of the account that can access this database.
     * 
     * @return the password value.
     */
    @Generated
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password of the account that can access this database.
     * 
     * @param password the password value to set.
     * @return the InfluxDBParameter object itself.
     */
    @Generated
    public InfluxDBParameter setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the query property: The script to query this database.
     * 
     * @return the query value.
     */
    @Generated
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: The script to query this database.
     * 
     * @param query the query value to set.
     * @return the InfluxDBParameter object itself.
     */
    @Generated
    public InfluxDBParameter setQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("query", this.query);
        jsonWriter.writeStringField("connectionString", this.connectionString);
        jsonWriter.writeStringField("database", this.database);
        jsonWriter.writeStringField("userName", this.userName);
        jsonWriter.writeStringField("password", this.password);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InfluxDBParameter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InfluxDBParameter if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the InfluxDBParameter.
     */
    @Generated
    public static InfluxDBParameter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InfluxDBParameter deserializedInfluxDBParameter = new InfluxDBParameter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("query".equals(fieldName)) {
                    deserializedInfluxDBParameter.query = reader.getString();
                } else if ("connectionString".equals(fieldName)) {
                    deserializedInfluxDBParameter.connectionString = reader.getString();
                } else if ("database".equals(fieldName)) {
                    deserializedInfluxDBParameter.database = reader.getString();
                } else if ("userName".equals(fieldName)) {
                    deserializedInfluxDBParameter.userName = reader.getString();
                } else if ("password".equals(fieldName)) {
                    deserializedInfluxDBParameter.password = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInfluxDBParameter;
        });
    }
}
