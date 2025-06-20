// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.security.attestation.models.PolicyModification;
import java.io.IOException;
import java.util.Objects;

/**
 * The result of a policy certificate modification.
 */
@Fluent
public final class PolicyResult implements JsonSerializable<PolicyResult> {
    /*
     * The result of the operation
     */
    @Generated
    private PolicyModification policyResolution;

    /*
     * The SHA256 hash of the policy object modified
     */
    @Generated
    private Base64Url policyTokenHash;

    /*
     * The certificate used to sign the policy object, if specified
     */
    @Generated
    private JsonWebKey policySigner;

    /*
     * A JSON Web Token containing a StoredAttestationPolicy object with the attestation policy
     */
    @Generated
    private String policy;

    /**
     * Creates an instance of PolicyResult class.
     */
    @Generated
    public PolicyResult() {
    }

    /**
     * Get the policyResolution property: The result of the operation.
     * 
     * @return the policyResolution value.
     */
    @Generated
    public PolicyModification getPolicyResolution() {
        return this.policyResolution;
    }

    /**
     * Set the policyResolution property: The result of the operation.
     * 
     * @param policyResolution the policyResolution value to set.
     * @return the PolicyResult object itself.
     */
    @Generated
    public PolicyResult setPolicyResolution(PolicyModification policyResolution) {
        this.policyResolution = policyResolution;
        return this;
    }

    /**
     * Get the policyTokenHash property: The SHA256 hash of the policy object modified.
     * 
     * @return the policyTokenHash value.
     */
    @Generated
    public byte[] getPolicyTokenHash() {
        if (this.policyTokenHash == null) {
            return null;
        }
        return this.policyTokenHash.decodedBytes();
    }

    /**
     * Set the policyTokenHash property: The SHA256 hash of the policy object modified.
     * 
     * @param policyTokenHash the policyTokenHash value to set.
     * @return the PolicyResult object itself.
     */
    @Generated
    public PolicyResult setPolicyTokenHash(byte[] policyTokenHash) {
        if (policyTokenHash == null) {
            this.policyTokenHash = null;
        } else {
            this.policyTokenHash = Base64Url.encode(CoreUtils.clone(policyTokenHash));
        }
        return this;
    }

    /**
     * Get the policySigner property: The certificate used to sign the policy object, if specified.
     * 
     * @return the policySigner value.
     */
    @Generated
    public JsonWebKey getPolicySigner() {
        return this.policySigner;
    }

    /**
     * Set the policySigner property: The certificate used to sign the policy object, if specified.
     * 
     * @param policySigner the policySigner value to set.
     * @return the PolicyResult object itself.
     */
    @Generated
    public PolicyResult setPolicySigner(JsonWebKey policySigner) {
        this.policySigner = policySigner;
        return this;
    }

    /**
     * Get the policy property: A JSON Web Token containing a StoredAttestationPolicy object with the attestation
     * policy.
     * 
     * @return the policy value.
     */
    @Generated
    public String getPolicy() {
        return this.policy;
    }

    /**
     * Set the policy property: A JSON Web Token containing a StoredAttestationPolicy object with the attestation
     * policy.
     * 
     * @param policy the policy value to set.
     * @return the PolicyResult object itself.
     */
    @Generated
    public PolicyResult setPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getPolicySigner() != null) {
            getPolicySigner().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("x-ms-policy-result",
            this.policyResolution == null ? null : this.policyResolution.toString());
        jsonWriter.writeStringField("x-ms-policy-token-hash", Objects.toString(this.policyTokenHash, null));
        jsonWriter.writeJsonField("x-ms-policy-signer", this.policySigner);
        jsonWriter.writeStringField("x-ms-policy", this.policy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PolicyResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PolicyResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PolicyResult.
     */
    @Generated
    public static PolicyResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PolicyResult deserializedPolicyResult = new PolicyResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("x-ms-policy-result".equals(fieldName)) {
                    deserializedPolicyResult.policyResolution = PolicyModification.fromString(reader.getString());
                } else if ("x-ms-policy-token-hash".equals(fieldName)) {
                    deserializedPolicyResult.policyTokenHash
                        = reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                } else if ("x-ms-policy-signer".equals(fieldName)) {
                    deserializedPolicyResult.policySigner = JsonWebKey.fromJson(reader);
                } else if ("x-ms-policy".equals(fieldName)) {
                    deserializedPolicyResult.policy = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPolicyResult;
        });
    }
}
