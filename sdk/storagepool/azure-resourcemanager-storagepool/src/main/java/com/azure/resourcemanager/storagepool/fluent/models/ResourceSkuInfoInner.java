// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storagepool.models.ResourceSkuCapability;
import com.azure.resourcemanager.storagepool.models.ResourceSkuLocationInfo;
import com.azure.resourcemanager.storagepool.models.ResourceSkuRestrictions;
import java.io.IOException;
import java.util.List;

/**
 * Resource SKU Details.
 */
@Immutable
public final class ResourceSkuInfoInner implements JsonSerializable<ResourceSkuInfoInner> {
    /*
     * StoragePool RP API version
     */
    private String apiVersion;

    /*
     * StoragePool resource type
     */
    private String resourceType;

    /*
     * List of additional capabilities for StoragePool resource.
     */
    private List<ResourceSkuCapability> capabilities;

    /*
     * Zones and zone capabilities in those locations where the SKU is available.
     */
    private ResourceSkuLocationInfo locationInfo;

    /*
     * Sku name
     */
    private String name;

    /*
     * Sku tier
     */
    private String tier;

    /*
     * The restrictions because of which SKU cannot be used. This is empty if there are no restrictions.
     */
    private List<ResourceSkuRestrictions> restrictions;

    /**
     * Creates an instance of ResourceSkuInfoInner class.
     */
    public ResourceSkuInfoInner() {
    }

    /**
     * Get the apiVersion property: StoragePool RP API version.
     * 
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Get the resourceType property: StoragePool resource type.
     * 
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the capabilities property: List of additional capabilities for StoragePool resource.
     * 
     * @return the capabilities value.
     */
    public List<ResourceSkuCapability> capabilities() {
        return this.capabilities;
    }

    /**
     * Get the locationInfo property: Zones and zone capabilities in those locations where the SKU is available.
     * 
     * @return the locationInfo value.
     */
    public ResourceSkuLocationInfo locationInfo() {
        return this.locationInfo;
    }

    /**
     * Get the name property: Sku name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the tier property: Sku tier.
     * 
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Get the restrictions property: The restrictions because of which SKU cannot be used. This is empty if there are
     * no restrictions.
     * 
     * @return the restrictions value.
     */
    public List<ResourceSkuRestrictions> restrictions() {
        return this.restrictions;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
        if (locationInfo() != null) {
            locationInfo().validate();
        }
        if (restrictions() != null) {
            restrictions().forEach(e -> e.validate());
        }
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
     * Reads an instance of ResourceSkuInfoInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceSkuInfoInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceSkuInfoInner.
     */
    public static ResourceSkuInfoInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceSkuInfoInner deserializedResourceSkuInfoInner = new ResourceSkuInfoInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("apiVersion".equals(fieldName)) {
                    deserializedResourceSkuInfoInner.apiVersion = reader.getString();
                } else if ("resourceType".equals(fieldName)) {
                    deserializedResourceSkuInfoInner.resourceType = reader.getString();
                } else if ("capabilities".equals(fieldName)) {
                    List<ResourceSkuCapability> capabilities
                        = reader.readArray(reader1 -> ResourceSkuCapability.fromJson(reader1));
                    deserializedResourceSkuInfoInner.capabilities = capabilities;
                } else if ("locationInfo".equals(fieldName)) {
                    deserializedResourceSkuInfoInner.locationInfo = ResourceSkuLocationInfo.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedResourceSkuInfoInner.name = reader.getString();
                } else if ("tier".equals(fieldName)) {
                    deserializedResourceSkuInfoInner.tier = reader.getString();
                } else if ("restrictions".equals(fieldName)) {
                    List<ResourceSkuRestrictions> restrictions
                        = reader.readArray(reader1 -> ResourceSkuRestrictions.fromJson(reader1));
                    deserializedResourceSkuInfoInner.restrictions = restrictions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceSkuInfoInner;
        });
    }
}
