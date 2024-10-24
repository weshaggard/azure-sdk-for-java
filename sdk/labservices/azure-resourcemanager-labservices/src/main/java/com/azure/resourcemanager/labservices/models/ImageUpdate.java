// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.labservices.fluent.models.ImageUpdateProperties;
import java.io.IOException;

/**
 * Lab services virtual machine image for updates.
 */
@Fluent
public final class ImageUpdate implements JsonSerializable<ImageUpdate> {
    /*
     * Image resource properties
     */
    private ImageUpdateProperties innerProperties;

    /**
     * Creates an instance of ImageUpdate class.
     */
    public ImageUpdate() {
    }

    /**
     * Get the innerProperties property: Image resource properties.
     * 
     * @return the innerProperties value.
     */
    private ImageUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the enabledState property: Is the image enabled.
     * 
     * @return the enabledState value.
     */
    public EnableState enabledState() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledState();
    }

    /**
     * Set the enabledState property: Is the image enabled.
     * 
     * @param enabledState the enabledState value to set.
     * @return the ImageUpdate object itself.
     */
    public ImageUpdate withEnabledState(EnableState enabledState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ImageUpdateProperties();
        }
        this.innerProperties().withEnabledState(enabledState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageUpdate if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImageUpdate.
     */
    public static ImageUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageUpdate deserializedImageUpdate = new ImageUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedImageUpdate.innerProperties = ImageUpdateProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageUpdate;
        });
    }
}
