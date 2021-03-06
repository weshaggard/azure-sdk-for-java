// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Deployment device status. */
@Fluent
public final class DeploymentDeviceState {
    /*
     * Device identity.
     */
    @JsonProperty(value = "deviceId", required = true)
    private String deviceId;

    /*
     * The number of times this deployment has been retried on this device.
     */
    @JsonProperty(value = "retryCount", required = true)
    private int retryCount;

    /*
     * Boolean flag indicating whether this device is in a newer deployment and
     * can no longer retry this deployment.
     */
    @JsonProperty(value = "movedOnToNewDeployment", required = true)
    private boolean movedOnToNewDeployment;

    /*
     * Deployment device state.
     */
    @JsonProperty(value = "deviceState", required = true)
    private DeviceDeploymentState deviceState;

    /**
     * Get the deviceId property: Device identity.
     *
     * @return the deviceId value.
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: Device identity.
     *
     * @param deviceId the deviceId value to set.
     * @return the DeploymentDeviceState object itself.
     */
    public DeploymentDeviceState setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the retryCount property: The number of times this deployment has been retried on this device.
     *
     * @return the retryCount value.
     */
    public int getRetryCount() {
        return this.retryCount;
    }

    /**
     * Set the retryCount property: The number of times this deployment has been retried on this device.
     *
     * @param retryCount the retryCount value to set.
     * @return the DeploymentDeviceState object itself.
     */
    public DeploymentDeviceState setRetryCount(int retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * Get the movedOnToNewDeployment property: Boolean flag indicating whether this device is in a newer deployment and
     * can no longer retry this deployment.
     *
     * @return the movedOnToNewDeployment value.
     */
    public boolean isMovedOnToNewDeployment() {
        return this.movedOnToNewDeployment;
    }

    /**
     * Set the movedOnToNewDeployment property: Boolean flag indicating whether this device is in a newer deployment and
     * can no longer retry this deployment.
     *
     * @param movedOnToNewDeployment the movedOnToNewDeployment value to set.
     * @return the DeploymentDeviceState object itself.
     */
    public DeploymentDeviceState setMovedOnToNewDeployment(boolean movedOnToNewDeployment) {
        this.movedOnToNewDeployment = movedOnToNewDeployment;
        return this;
    }

    /**
     * Get the deviceState property: Deployment device state.
     *
     * @return the deviceState value.
     */
    public DeviceDeploymentState getDeviceState() {
        return this.deviceState;
    }

    /**
     * Set the deviceState property: Deployment device state.
     *
     * @param deviceState the deviceState value to set.
     * @return the DeploymentDeviceState object itself.
     */
    public DeploymentDeviceState setDeviceState(DeviceDeploymentState deviceState) {
        this.deviceState = deviceState;
        return this;
    }
}
