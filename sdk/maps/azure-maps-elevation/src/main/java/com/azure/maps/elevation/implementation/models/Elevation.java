// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.elevation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The elevation data.
 */
@Fluent
public final class Elevation implements JsonSerializable<Elevation> {
    /*
     * A location represented as a latitude and longitude.
     */
    private LatLongPair coordinate;

    /*
     * The elevation value in meters.
     */
    private Float elevationInMeter;

    /**
     * Creates an instance of Elevation class.
     */
    public Elevation() {
    }

    /**
     * Get the coordinate property: A location represented as a latitude and longitude.
     * 
     * @return the coordinate value.
     */
    public LatLongPair getCoordinate() {
        return this.coordinate;
    }

    /**
     * Set the coordinate property: A location represented as a latitude and longitude.
     * 
     * @param coordinate the coordinate value to set.
     * @return the Elevation object itself.
     */
    public Elevation setCoordinate(LatLongPair coordinate) {
        this.coordinate = coordinate;
        return this;
    }

    /**
     * Get the elevationInMeter property: The elevation value in meters.
     * 
     * @return the elevationInMeter value.
     */
    public Float getElevationInMeters() {
        return this.elevationInMeter;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("coordinate", this.coordinate);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Elevation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Elevation if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Elevation.
     */
    public static Elevation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Elevation deserializedElevation = new Elevation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("coordinate".equals(fieldName)) {
                    deserializedElevation.coordinate = LatLongPair.fromJson(reader);
                } else if ("elevationInMeter".equals(fieldName)) {
                    deserializedElevation.elevationInMeter = reader.getNullable(JsonReader::getFloat);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedElevation;
        });
    }
}
