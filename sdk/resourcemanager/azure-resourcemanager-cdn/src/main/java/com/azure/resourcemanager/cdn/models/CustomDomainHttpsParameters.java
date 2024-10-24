// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The JSON object that contains the properties to secure a custom domain.
 */
@Fluent
public class CustomDomainHttpsParameters implements JsonSerializable<CustomDomainHttpsParameters> {
    /*
     * Defines the source of the SSL certificate.
     */
    private CertificateSource certificateSource = CertificateSource.fromString("CustomDomainHttpsParameters");

    /*
     * Defines the TLS extension protocol that is used for secure delivery.
     */
    private ProtocolType protocolType;

    /*
     * TLS protocol version that will be used for Https
     */
    private MinimumTlsVersion minimumTlsVersion;

    /**
     * Creates an instance of CustomDomainHttpsParameters class.
     */
    public CustomDomainHttpsParameters() {
    }

    /**
     * Get the certificateSource property: Defines the source of the SSL certificate.
     * 
     * @return the certificateSource value.
     */
    public CertificateSource certificateSource() {
        return this.certificateSource;
    }

    /**
     * Get the protocolType property: Defines the TLS extension protocol that is used for secure delivery.
     * 
     * @return the protocolType value.
     */
    public ProtocolType protocolType() {
        return this.protocolType;
    }

    /**
     * Set the protocolType property: Defines the TLS extension protocol that is used for secure delivery.
     * 
     * @param protocolType the protocolType value to set.
     * @return the CustomDomainHttpsParameters object itself.
     */
    public CustomDomainHttpsParameters withProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get the minimumTlsVersion property: TLS protocol version that will be used for Https.
     * 
     * @return the minimumTlsVersion value.
     */
    public MinimumTlsVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimumTlsVersion property: TLS protocol version that will be used for Https.
     * 
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the CustomDomainHttpsParameters object itself.
     */
    public CustomDomainHttpsParameters withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (protocolType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property protocolType in model CustomDomainHttpsParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomDomainHttpsParameters.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("protocolType", this.protocolType == null ? null : this.protocolType.toString());
        jsonWriter.writeStringField("certificateSource",
            this.certificateSource == null ? null : this.certificateSource.toString());
        jsonWriter.writeStringField("minimumTlsVersion",
            this.minimumTlsVersion == null ? null : this.minimumTlsVersion.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomDomainHttpsParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomDomainHttpsParameters if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CustomDomainHttpsParameters.
     */
    public static CustomDomainHttpsParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("certificateSource".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("Cdn".equals(discriminatorValue)) {
                    return CdnManagedHttpsParameters.fromJson(readerToUse.reset());
                } else if ("AzureKeyVault".equals(discriminatorValue)) {
                    return UserManagedHttpsParameters.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static CustomDomainHttpsParameters fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomDomainHttpsParameters deserializedCustomDomainHttpsParameters = new CustomDomainHttpsParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("protocolType".equals(fieldName)) {
                    deserializedCustomDomainHttpsParameters.protocolType = ProtocolType.fromString(reader.getString());
                } else if ("certificateSource".equals(fieldName)) {
                    deserializedCustomDomainHttpsParameters.certificateSource
                        = CertificateSource.fromString(reader.getString());
                } else if ("minimumTlsVersion".equals(fieldName)) {
                    deserializedCustomDomainHttpsParameters.minimumTlsVersion
                        = MinimumTlsVersion.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomDomainHttpsParameters;
        });
    }
}
