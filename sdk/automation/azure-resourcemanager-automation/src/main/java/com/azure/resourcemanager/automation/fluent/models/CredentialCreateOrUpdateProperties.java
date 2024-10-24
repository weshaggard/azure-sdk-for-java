// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties of the create credential operation.
 */
@Fluent
public final class CredentialCreateOrUpdateProperties implements JsonSerializable<CredentialCreateOrUpdateProperties> {
    /*
     * Gets or sets the user name of the credential.
     */
    private String username;

    /*
     * Gets or sets the password of the credential.
     */
    private String password;

    /*
     * Gets or sets the description of the credential.
     */
    private String description;

    /**
     * Creates an instance of CredentialCreateOrUpdateProperties class.
     */
    public CredentialCreateOrUpdateProperties() {
    }

    /**
     * Get the username property: Gets or sets the user name of the credential.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Gets or sets the user name of the credential.
     * 
     * @param username the username value to set.
     * @return the CredentialCreateOrUpdateProperties object itself.
     */
    public CredentialCreateOrUpdateProperties withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Gets or sets the password of the credential.
     * 
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Gets or sets the password of the credential.
     * 
     * @param password the password value to set.
     * @return the CredentialCreateOrUpdateProperties object itself.
     */
    public CredentialCreateOrUpdateProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the description property: Gets or sets the description of the credential.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description of the credential.
     * 
     * @param description the description value to set.
     * @return the CredentialCreateOrUpdateProperties object itself.
     */
    public CredentialCreateOrUpdateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (username() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property username in model CredentialCreateOrUpdateProperties"));
        }
        if (password() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property password in model CredentialCreateOrUpdateProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CredentialCreateOrUpdateProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("userName", this.username);
        jsonWriter.writeStringField("password", this.password);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CredentialCreateOrUpdateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CredentialCreateOrUpdateProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CredentialCreateOrUpdateProperties.
     */
    public static CredentialCreateOrUpdateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CredentialCreateOrUpdateProperties deserializedCredentialCreateOrUpdateProperties
                = new CredentialCreateOrUpdateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("userName".equals(fieldName)) {
                    deserializedCredentialCreateOrUpdateProperties.username = reader.getString();
                } else if ("password".equals(fieldName)) {
                    deserializedCredentialCreateOrUpdateProperties.password = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedCredentialCreateOrUpdateProperties.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCredentialCreateOrUpdateProperties;
        });
    }
}
