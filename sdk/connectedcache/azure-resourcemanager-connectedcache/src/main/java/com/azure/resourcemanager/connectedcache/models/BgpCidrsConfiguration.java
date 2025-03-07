// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.connectedcache.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Mcc cache node Bgp Cidr details.
 */
@Immutable
public final class BgpCidrsConfiguration implements JsonSerializable<BgpCidrsConfiguration> {
    /*
     * Mcc cache node Bgp Cidr details.
     */
    private List<String> bgpCidrs;

    /**
     * Creates an instance of BgpCidrsConfiguration class.
     */
    private BgpCidrsConfiguration() {
    }

    /**
     * Get the bgpCidrs property: Mcc cache node Bgp Cidr details.
     * 
     * @return the bgpCidrs value.
     */
    public List<String> bgpCidrs() {
        return this.bgpCidrs;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BgpCidrsConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BgpCidrsConfiguration if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BgpCidrsConfiguration.
     */
    public static BgpCidrsConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BgpCidrsConfiguration deserializedBgpCidrsConfiguration = new BgpCidrsConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bgpCidrs".equals(fieldName)) {
                    List<String> bgpCidrs = reader.readArray(reader1 -> reader1.getString());
                    deserializedBgpCidrsConfiguration.bgpCidrs = bgpCidrs;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBgpCidrsConfiguration;
        });
    }
}
