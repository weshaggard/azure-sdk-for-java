// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The resource management error additional info.
 */
@Immutable
public final class ErrorAdditionalInfo implements JsonSerializable<ErrorAdditionalInfo> {
    /*
     * The additional info type.
     */
    @Generated
    private String type;

    /*
     * The additional info.
     */
    @Generated
    private Object info;

    /**
     * Creates an instance of ErrorAdditionalInfo class.
     */
    @Generated
    public ErrorAdditionalInfo() {
    }

    /**
     * Get the type property: The additional info type.
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Get the info property: The additional info.
     * 
     * @return the info value.
     */
    @Generated
    public Object getInfo() {
        return this.info;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ErrorAdditionalInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ErrorAdditionalInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ErrorAdditionalInfo.
     */
    @Generated
    public static ErrorAdditionalInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ErrorAdditionalInfo deserializedErrorAdditionalInfo = new ErrorAdditionalInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedErrorAdditionalInfo.type = reader.getString();
                } else if ("info".equals(fieldName)) {
                    deserializedErrorAdditionalInfo.info = reader.readUntyped();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedErrorAdditionalInfo;
        });
    }
}
