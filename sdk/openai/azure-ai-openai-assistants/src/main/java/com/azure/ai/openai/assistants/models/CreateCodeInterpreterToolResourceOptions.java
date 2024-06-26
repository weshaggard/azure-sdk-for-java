// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A set of resources that will be used by the `code_interpreter` tool. Request object.
 */
@Fluent
public final class CreateCodeInterpreterToolResourceOptions
    implements JsonSerializable<CreateCodeInterpreterToolResourceOptions> {

    /*
     * A list of file IDs made available to the `code_interpreter` tool.
     */
    @Generated
    private List<String> fileIds;

    /**
     * Creates an instance of CreateCodeInterpreterToolResourceOptions class.
     */
    @Generated
    public CreateCodeInterpreterToolResourceOptions() {
    }

    /**
     * Get the fileIds property: A list of file IDs made available to the `code_interpreter` tool.
     *
     * @return the fileIds value.
     */
    @Generated
    public List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * Set the fileIds property: A list of file IDs made available to the `code_interpreter` tool.
     *
     * @param fileIds the fileIds value to set.
     * @return the CreateCodeInterpreterToolResourceOptions object itself.
     */
    @Generated
    public CreateCodeInterpreterToolResourceOptions setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("file_ids", this.fileIds, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateCodeInterpreterToolResourceOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateCodeInterpreterToolResourceOptions if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CreateCodeInterpreterToolResourceOptions.
     */
    @Generated
    public static CreateCodeInterpreterToolResourceOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateCodeInterpreterToolResourceOptions deserializedCreateCodeInterpreterToolResourceOptions
                = new CreateCodeInterpreterToolResourceOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("file_ids".equals(fieldName)) {
                    List<String> fileIds = reader.readArray(reader1 -> reader1.getString());
                    deserializedCreateCodeInterpreterToolResourceOptions.fileIds = fileIds;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedCreateCodeInterpreterToolResourceOptions;
        });
    }
}
