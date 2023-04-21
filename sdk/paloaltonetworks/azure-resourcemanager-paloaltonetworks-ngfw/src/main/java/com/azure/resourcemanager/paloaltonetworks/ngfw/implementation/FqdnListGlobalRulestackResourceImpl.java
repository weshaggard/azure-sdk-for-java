// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FqdnListGlobalRulestackResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FqdnListGlobalRulestackResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class FqdnListGlobalRulestackResourceImpl implements FqdnListGlobalRulestackResource {
    private FqdnListGlobalRulestackResourceInner innerObject;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    FqdnListGlobalRulestackResourceImpl(
        FqdnListGlobalRulestackResourceInner innerObject,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String description() {
        return this.innerModel().description();
    }

    public List<String> fqdnList() {
        List<String> inner = this.innerModel().fqdnList();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String auditComment() {
        return this.innerModel().auditComment();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public FqdnListGlobalRulestackResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }
}