// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The updatable properties of the OracleSubscription.
 */
@Fluent
public final class OracleSubscriptionUpdateProperties {
    /*
     * Product code for the term unit
     */
    @JsonProperty(value = "productCode")
    private String productCode;

    /*
     * Intent for the update operation
     */
    @JsonProperty(value = "intent")
    private Intent intent;

    /**
     * Creates an instance of OracleSubscriptionUpdateProperties class.
     */
    public OracleSubscriptionUpdateProperties() {
    }

    /**
     * Get the productCode property: Product code for the term unit.
     * 
     * @return the productCode value.
     */
    public String productCode() {
        return this.productCode;
    }

    /**
     * Set the productCode property: Product code for the term unit.
     * 
     * @param productCode the productCode value to set.
     * @return the OracleSubscriptionUpdateProperties object itself.
     */
    public OracleSubscriptionUpdateProperties withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * Get the intent property: Intent for the update operation.
     * 
     * @return the intent value.
     */
    public Intent intent() {
        return this.intent;
    }

    /**
     * Set the intent property: Intent for the update operation.
     * 
     * @param intent the intent value to set.
     * @return the OracleSubscriptionUpdateProperties object itself.
     */
    public OracleSubscriptionUpdateProperties withIntent(Intent intent) {
        this.intent = intent;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
