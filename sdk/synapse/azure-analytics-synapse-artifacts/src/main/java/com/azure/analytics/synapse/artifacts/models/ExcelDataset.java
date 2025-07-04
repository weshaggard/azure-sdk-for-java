// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Excel dataset.
 */
@Fluent
public class ExcelDataset extends Dataset {
    /*
     * Type of dataset.
     */
    @Generated
    private String type = "Excel";

    /*
     * The location of the excel storage.
     */
    @Generated
    private DatasetLocation location;

    /*
     * The sheet name of excel file. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object sheetName;

    /*
     * The sheet index of excel file and default value is 0. Type: integer (or Expression with resultType integer)
     */
    @Generated
    private Object sheetIndex;

    /*
     * The partial data of one sheet. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object range;

    /*
     * When used as input, treat the first row of data as headers. When used as output,write the headers into the output
     * as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     */
    @Generated
    private Object firstRowAsHeader;

    /*
     * The data compression method used for the json dataset.
     */
    @Generated
    private DatasetCompression compression;

    /*
     * The null value string. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object nullValue;

    /**
     * Creates an instance of ExcelDataset class.
     */
    @Generated
    public ExcelDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the location property: The location of the excel storage.
     * 
     * @return the location value.
     */
    @Generated
    public DatasetLocation getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location of the excel storage.
     * 
     * @param location the location value to set.
     * @return the ExcelDataset object itself.
     */
    @Generated
    public ExcelDataset setLocation(DatasetLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the sheetName property: The sheet name of excel file. Type: string (or Expression with resultType string).
     * 
     * @return the sheetName value.
     */
    @Generated
    public Object getSheetName() {
        return this.sheetName;
    }

    /**
     * Set the sheetName property: The sheet name of excel file. Type: string (or Expression with resultType string).
     * 
     * @param sheetName the sheetName value to set.
     * @return the ExcelDataset object itself.
     */
    @Generated
    public ExcelDataset setSheetName(Object sheetName) {
        this.sheetName = sheetName;
        return this;
    }

    /**
     * Get the sheetIndex property: The sheet index of excel file and default value is 0. Type: integer (or Expression
     * with resultType integer).
     * 
     * @return the sheetIndex value.
     */
    @Generated
    public Object getSheetIndex() {
        return this.sheetIndex;
    }

    /**
     * Set the sheetIndex property: The sheet index of excel file and default value is 0. Type: integer (or Expression
     * with resultType integer).
     * 
     * @param sheetIndex the sheetIndex value to set.
     * @return the ExcelDataset object itself.
     */
    @Generated
    public ExcelDataset setSheetIndex(Object sheetIndex) {
        this.sheetIndex = sheetIndex;
        return this;
    }

    /**
     * Get the range property: The partial data of one sheet. Type: string (or Expression with resultType string).
     * 
     * @return the range value.
     */
    @Generated
    public Object getRange() {
        return this.range;
    }

    /**
     * Set the range property: The partial data of one sheet. Type: string (or Expression with resultType string).
     * 
     * @param range the range value to set.
     * @return the ExcelDataset object itself.
     */
    @Generated
    public ExcelDataset setRange(Object range) {
        this.range = range;
        return this;
    }

    /**
     * Get the firstRowAsHeader property: When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the firstRowAsHeader value.
     */
    @Generated
    public Object getFirstRowAsHeader() {
        return this.firstRowAsHeader;
    }

    /**
     * Set the firstRowAsHeader property: When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param firstRowAsHeader the firstRowAsHeader value to set.
     * @return the ExcelDataset object itself.
     */
    @Generated
    public ExcelDataset setFirstRowAsHeader(Object firstRowAsHeader) {
        this.firstRowAsHeader = firstRowAsHeader;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the json dataset.
     * 
     * @return the compression value.
     */
    @Generated
    public DatasetCompression getCompression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the json dataset.
     * 
     * @param compression the compression value to set.
     * @return the ExcelDataset object itself.
     */
    @Generated
    public ExcelDataset setCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Get the nullValue property: The null value string. Type: string (or Expression with resultType string).
     * 
     * @return the nullValue value.
     */
    @Generated
    public Object getNullValue() {
        return this.nullValue;
    }

    /**
     * Set the nullValue property: The null value string. Type: string (or Expression with resultType string).
     * 
     * @param nullValue the nullValue value to set.
     * @return the ExcelDataset object itself.
     */
    @Generated
    public ExcelDataset setNullValue(Object nullValue) {
        this.nullValue = nullValue;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public ExcelDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public ExcelDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public ExcelDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public ExcelDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public ExcelDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public ExcelDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public ExcelDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("linkedServiceName", getLinkedServiceName());
        jsonWriter.writeStringField("description", getDescription());
        if (getStructure() != null) {
            jsonWriter.writeUntypedField("structure", getStructure());
        }
        if (getSchema() != null) {
            jsonWriter.writeUntypedField("schema", getSchema());
        }
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeJsonField("folder", getFolder());
        jsonWriter.writeStringField("type", this.type);
        if (location != null
            || sheetName != null
            || sheetIndex != null
            || range != null
            || firstRowAsHeader != null
            || compression != null
            || nullValue != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeJsonField("location", this.location);
            if (this.sheetName != null) {
                jsonWriter.writeUntypedField("sheetName", this.sheetName);
            }
            if (this.sheetIndex != null) {
                jsonWriter.writeUntypedField("sheetIndex", this.sheetIndex);
            }
            if (this.range != null) {
                jsonWriter.writeUntypedField("range", this.range);
            }
            if (this.firstRowAsHeader != null) {
                jsonWriter.writeUntypedField("firstRowAsHeader", this.firstRowAsHeader);
            }
            jsonWriter.writeJsonField("compression", this.compression);
            if (this.nullValue != null) {
                jsonWriter.writeUntypedField("nullValue", this.nullValue);
            }
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExcelDataset from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExcelDataset if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExcelDataset.
     */
    @Generated
    public static ExcelDataset fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExcelDataset deserializedExcelDataset = new ExcelDataset();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("linkedServiceName".equals(fieldName)) {
                    deserializedExcelDataset.setLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedExcelDataset.setDescription(reader.getString());
                } else if ("structure".equals(fieldName)) {
                    deserializedExcelDataset.setStructure(reader.readUntyped());
                } else if ("schema".equals(fieldName)) {
                    deserializedExcelDataset.setSchema(reader.readUntyped());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedExcelDataset.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedExcelDataset.setAnnotations(annotations);
                } else if ("folder".equals(fieldName)) {
                    deserializedExcelDataset.setFolder(DatasetFolder.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedExcelDataset.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("location".equals(fieldName)) {
                            deserializedExcelDataset.location = DatasetLocation.fromJson(reader);
                        } else if ("sheetName".equals(fieldName)) {
                            deserializedExcelDataset.sheetName = reader.readUntyped();
                        } else if ("sheetIndex".equals(fieldName)) {
                            deserializedExcelDataset.sheetIndex = reader.readUntyped();
                        } else if ("range".equals(fieldName)) {
                            deserializedExcelDataset.range = reader.readUntyped();
                        } else if ("firstRowAsHeader".equals(fieldName)) {
                            deserializedExcelDataset.firstRowAsHeader = reader.readUntyped();
                        } else if ("compression".equals(fieldName)) {
                            deserializedExcelDataset.compression = DatasetCompression.fromJson(reader);
                        } else if ("nullValue".equals(fieldName)) {
                            deserializedExcelDataset.nullValue = reader.readUntyped();
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedExcelDataset.setAdditionalProperties(additionalProperties);

            return deserializedExcelDataset;
        });
    }
}
