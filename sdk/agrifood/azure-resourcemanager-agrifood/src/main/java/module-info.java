// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.agrifood {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.agrifood;
    exports com.azure.resourcemanager.agrifood.fluent;
    exports com.azure.resourcemanager.agrifood.fluent.models;
    exports com.azure.resourcemanager.agrifood.models;

    opens com.azure.resourcemanager.agrifood.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.agrifood.models to com.azure.core;
}
