// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Represents an operation to be performed on the object.
 */
@Fluent
public final class StorageTaskOperation {
    /*
     * The operation to be performed on the object.
     */
    @JsonProperty(value = "name", required = true)
    private StorageTaskOperationName name;

    /*
     * Key-value parameters for the operation.
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> parameters;

    /*
     * Action to be taken when the operation is successful for a object.
     */
    @JsonProperty(value = "onSuccess")
    private OnSuccess onSuccess;

    /*
     * Action to be taken when the operation fails for a object.
     */
    @JsonProperty(value = "onFailure")
    private OnFailure onFailure;

    /**
     * Creates an instance of StorageTaskOperation class.
     */
    public StorageTaskOperation() {
    }

    /**
     * Get the name property: The operation to be performed on the object.
     * 
     * @return the name value.
     */
    public StorageTaskOperationName name() {
        return this.name;
    }

    /**
     * Set the name property: The operation to be performed on the object.
     * 
     * @param name the name value to set.
     * @return the StorageTaskOperation object itself.
     */
    public StorageTaskOperation withName(StorageTaskOperationName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the parameters property: Key-value parameters for the operation.
     * 
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Key-value parameters for the operation.
     * 
     * @param parameters the parameters value to set.
     * @return the StorageTaskOperation object itself.
     */
    public StorageTaskOperation withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the onSuccess property: Action to be taken when the operation is successful for a object.
     * 
     * @return the onSuccess value.
     */
    public OnSuccess onSuccess() {
        return this.onSuccess;
    }

    /**
     * Set the onSuccess property: Action to be taken when the operation is successful for a object.
     * 
     * @param onSuccess the onSuccess value to set.
     * @return the StorageTaskOperation object itself.
     */
    public StorageTaskOperation withOnSuccess(OnSuccess onSuccess) {
        this.onSuccess = onSuccess;
        return this;
    }

    /**
     * Get the onFailure property: Action to be taken when the operation fails for a object.
     * 
     * @return the onFailure value.
     */
    public OnFailure onFailure() {
        return this.onFailure;
    }

    /**
     * Set the onFailure property: Action to be taken when the operation fails for a object.
     * 
     * @param onFailure the onFailure value to set.
     * @return the StorageTaskOperation object itself.
     */
    public StorageTaskOperation withOnFailure(OnFailure onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property name in model StorageTaskOperation"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageTaskOperation.class);
}
