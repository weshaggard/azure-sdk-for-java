// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A stream analytics input.
 */
@Fluent
public final class TestInputInner {
    /*
     * The stream analytics input to test.
     */
    @JsonProperty(value = "input", required = true)
    private InputInner input;

    /**
     * Creates an instance of TestInputInner class.
     */
    public TestInputInner() {
    }

    /**
     * Get the input property: The stream analytics input to test.
     * 
     * @return the input value.
     */
    public InputInner input() {
        return this.input;
    }

    /**
     * Set the input property: The stream analytics input to test.
     * 
     * @param input the input value to set.
     * @return the TestInputInner object itself.
     */
    public TestInputInner withInput(InputInner input) {
        this.input = input;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (input() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property input in model TestInputInner"));
        } else {
            input().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TestInputInner.class);
}
