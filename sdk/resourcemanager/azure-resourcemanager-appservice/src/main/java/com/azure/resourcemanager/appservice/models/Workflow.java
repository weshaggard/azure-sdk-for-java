// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.appservice.fluent.models.WorkflowProperties;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * The workflow type.
 */
@Fluent
public final class Workflow extends WorkflowResource {
    /*
     * The workflow properties.
     */
    private WorkflowProperties innerProperties;

    /*
     * Managed service identity.
     */
    private ManagedServiceIdentity identity;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of Workflow class.
     */
    public Workflow() {
    }

    /**
     * Get the innerProperties property: The workflow properties.
     * 
     * @return the innerProperties value.
     */
    private WorkflowProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: Managed service identity.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity.
     * 
     * @param identity the identity value to set.
     * @return the Workflow object itself.
     */
    public Workflow withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Workflow withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Workflow withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state.
     * 
     * @return the provisioningState value.
     */
    public WorkflowProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the createdTime property: Gets the created time.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTime();
    }

    /**
     * Get the changedTime property: Gets the changed time.
     * 
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().changedTime();
    }

    /**
     * Get the state property: The state.
     * 
     * @return the state value.
     */
    public WorkflowState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: The state.
     * 
     * @param state the state value to set.
     * @return the Workflow object itself.
     */
    public Workflow withState(WorkflowState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the version property: Gets the version.
     * 
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the accessEndpoint property: Gets the access endpoint.
     * 
     * @return the accessEndpoint value.
     */
    public String accessEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().accessEndpoint();
    }

    /**
     * Get the endpointsConfiguration property: The endpoints configuration.
     * 
     * @return the endpointsConfiguration value.
     */
    public FlowEndpointsConfiguration endpointsConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointsConfiguration();
    }

    /**
     * Set the endpointsConfiguration property: The endpoints configuration.
     * 
     * @param endpointsConfiguration the endpointsConfiguration value to set.
     * @return the Workflow object itself.
     */
    public Workflow withEndpointsConfiguration(FlowEndpointsConfiguration endpointsConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowProperties();
        }
        this.innerProperties().withEndpointsConfiguration(endpointsConfiguration);
        return this;
    }

    /**
     * Get the accessControl property: The access control configuration.
     * 
     * @return the accessControl value.
     */
    public FlowAccessControlConfiguration accessControl() {
        return this.innerProperties() == null ? null : this.innerProperties().accessControl();
    }

    /**
     * Set the accessControl property: The access control configuration.
     * 
     * @param accessControl the accessControl value to set.
     * @return the Workflow object itself.
     */
    public Workflow withAccessControl(FlowAccessControlConfiguration accessControl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowProperties();
        }
        this.innerProperties().withAccessControl(accessControl);
        return this;
    }

    /**
     * Get the sku property: The sku.
     * 
     * @return the sku value.
     */
    public WorkflowSku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Get the integrationAccount property: The integration account.
     * 
     * @return the integrationAccount value.
     */
    public ResourceReference integrationAccount() {
        return this.innerProperties() == null ? null : this.innerProperties().integrationAccount();
    }

    /**
     * Set the integrationAccount property: The integration account.
     * 
     * @param integrationAccount the integrationAccount value to set.
     * @return the Workflow object itself.
     */
    public Workflow withIntegrationAccount(ResourceReference integrationAccount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowProperties();
        }
        this.innerProperties().withIntegrationAccount(integrationAccount);
        return this;
    }

    /**
     * Get the integrationServiceEnvironment property: The integration service environment.
     * 
     * @return the integrationServiceEnvironment value.
     */
    public ResourceReference integrationServiceEnvironment() {
        return this.innerProperties() == null ? null : this.innerProperties().integrationServiceEnvironment();
    }

    /**
     * Set the integrationServiceEnvironment property: The integration service environment.
     * 
     * @param integrationServiceEnvironment the integrationServiceEnvironment value to set.
     * @return the Workflow object itself.
     */
    public Workflow withIntegrationServiceEnvironment(ResourceReference integrationServiceEnvironment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowProperties();
        }
        this.innerProperties().withIntegrationServiceEnvironment(integrationServiceEnvironment);
        return this;
    }

    /**
     * Get the definition property: The definition.
     * 
     * @return the definition value.
     */
    public Object definition() {
        return this.innerProperties() == null ? null : this.innerProperties().definition();
    }

    /**
     * Set the definition property: The definition.
     * 
     * @param definition the definition value to set.
     * @return the Workflow object itself.
     */
    public Workflow withDefinition(Object definition) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowProperties();
        }
        this.innerProperties().withDefinition(definition);
        return this;
    }

    /**
     * Get the parameters property: The parameters.
     * 
     * @return the parameters value.
     */
    public Map<String, WorkflowParameter> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: The parameters.
     * 
     * @param parameters the parameters value to set.
     * @return the Workflow object itself.
     */
    public Workflow withParameters(Map<String, WorkflowParameter> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the kind property: The workflow kind.
     * 
     * @return the kind value.
     */
    public Kind kind() {
        return this.innerProperties() == null ? null : this.innerProperties().kind();
    }

    /**
     * Set the kind property: The workflow kind.
     * 
     * @param kind the kind value to set.
     * @return the Workflow object itself.
     */
    public Workflow withKind(Kind kind) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkflowProperties();
        }
        this.innerProperties().withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Workflow from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Workflow if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Workflow.
     */
    public static Workflow fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Workflow deserializedWorkflow = new Workflow();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedWorkflow.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedWorkflow.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedWorkflow.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedWorkflow.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedWorkflow.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedWorkflow.innerProperties = WorkflowProperties.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedWorkflow.identity = ManagedServiceIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkflow;
        });
    }
}
