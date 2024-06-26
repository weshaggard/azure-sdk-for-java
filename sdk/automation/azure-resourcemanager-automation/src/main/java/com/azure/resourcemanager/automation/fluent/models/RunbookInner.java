// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.automation.models.ContentLink;
import com.azure.resourcemanager.automation.models.RunbookParameter;
import com.azure.resourcemanager.automation.models.RunbookProvisioningState;
import com.azure.resourcemanager.automation.models.RunbookState;
import com.azure.resourcemanager.automation.models.RunbookTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Definition of the runbook type. */
@Fluent
public final class RunbookInner extends Resource {
    /*
     * Gets or sets the runbook properties.
     */
    @JsonProperty(value = "properties")
    private RunbookPropertiesInner innerProperties;

    /*
     * Gets or sets the etag of the resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the innerProperties property: Gets or sets the runbook properties.
     *
     * @return the innerProperties value.
     */
    private RunbookPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: Gets or sets the etag of the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Gets or sets the etag of the resource.
     *
     * @param etag the etag value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RunbookInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RunbookInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the runbookType property: Gets or sets the type of the runbook.
     *
     * @return the runbookType value.
     */
    public RunbookTypeEnum runbookType() {
        return this.innerProperties() == null ? null : this.innerProperties().runbookType();
    }

    /**
     * Set the runbookType property: Gets or sets the type of the runbook.
     *
     * @param runbookType the runbookType value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withRunbookType(RunbookTypeEnum runbookType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withRunbookType(runbookType);
        return this;
    }

    /**
     * Get the publishContentLink property: Gets or sets the published runbook content link.
     *
     * @return the publishContentLink value.
     */
    public ContentLink publishContentLink() {
        return this.innerProperties() == null ? null : this.innerProperties().publishContentLink();
    }

    /**
     * Set the publishContentLink property: Gets or sets the published runbook content link.
     *
     * @param publishContentLink the publishContentLink value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withPublishContentLink(ContentLink publishContentLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withPublishContentLink(publishContentLink);
        return this;
    }

    /**
     * Get the state property: Gets or sets the state of the runbook.
     *
     * @return the state value.
     */
    public RunbookState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Gets or sets the state of the runbook.
     *
     * @param state the state value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withState(RunbookState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the logVerbose property: Gets or sets verbose log option.
     *
     * @return the logVerbose value.
     */
    public Boolean logVerbose() {
        return this.innerProperties() == null ? null : this.innerProperties().logVerbose();
    }

    /**
     * Set the logVerbose property: Gets or sets verbose log option.
     *
     * @param logVerbose the logVerbose value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withLogVerbose(Boolean logVerbose) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withLogVerbose(logVerbose);
        return this;
    }

    /**
     * Get the logProgress property: Gets or sets progress log option.
     *
     * @return the logProgress value.
     */
    public Boolean logProgress() {
        return this.innerProperties() == null ? null : this.innerProperties().logProgress();
    }

    /**
     * Set the logProgress property: Gets or sets progress log option.
     *
     * @param logProgress the logProgress value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withLogProgress(Boolean logProgress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withLogProgress(logProgress);
        return this;
    }

    /**
     * Get the logActivityTrace property: Gets or sets the option to log activity trace of the runbook.
     *
     * @return the logActivityTrace value.
     */
    public Integer logActivityTrace() {
        return this.innerProperties() == null ? null : this.innerProperties().logActivityTrace();
    }

    /**
     * Set the logActivityTrace property: Gets or sets the option to log activity trace of the runbook.
     *
     * @param logActivityTrace the logActivityTrace value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withLogActivityTrace(Integer logActivityTrace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withLogActivityTrace(logActivityTrace);
        return this;
    }

    /**
     * Get the jobCount property: Gets or sets the job count of the runbook.
     *
     * @return the jobCount value.
     */
    public Integer jobCount() {
        return this.innerProperties() == null ? null : this.innerProperties().jobCount();
    }

    /**
     * Set the jobCount property: Gets or sets the job count of the runbook.
     *
     * @param jobCount the jobCount value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withJobCount(Integer jobCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withJobCount(jobCount);
        return this;
    }

    /**
     * Get the parameters property: Gets or sets the runbook parameters.
     *
     * @return the parameters value.
     */
    public Map<String, RunbookParameter> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: Gets or sets the runbook parameters.
     *
     * @param parameters the parameters value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withParameters(Map<String, RunbookParameter> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the outputTypes property: Gets or sets the runbook output types.
     *
     * @return the outputTypes value.
     */
    public List<String> outputTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().outputTypes();
    }

    /**
     * Set the outputTypes property: Gets or sets the runbook output types.
     *
     * @param outputTypes the outputTypes value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withOutputTypes(List<String> outputTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withOutputTypes(outputTypes);
        return this;
    }

    /**
     * Get the draft property: Gets or sets the draft runbook properties.
     *
     * @return the draft value.
     */
    public RunbookDraftInner draft() {
        return this.innerProperties() == null ? null : this.innerProperties().draft();
    }

    /**
     * Set the draft property: Gets or sets the draft runbook properties.
     *
     * @param draft the draft value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withDraft(RunbookDraftInner draft) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withDraft(draft);
        return this;
    }

    /**
     * Get the provisioningState property: Gets or sets the provisioning state of the runbook.
     *
     * @return the provisioningState value.
     */
    public RunbookProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Gets or sets the provisioning state of the runbook.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withProvisioningState(RunbookProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the lastModifiedBy property: Gets or sets the last modified by.
     *
     * @return the lastModifiedBy value.
     */
    public String lastModifiedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedBy();
    }

    /**
     * Set the lastModifiedBy property: Gets or sets the last modified by.
     *
     * @param lastModifiedBy the lastModifiedBy value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withLastModifiedBy(String lastModifiedBy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * Get the creationTime property: Gets or sets the creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().creationTime();
    }

    /**
     * Set the creationTime property: Gets or sets the creation time.
     *
     * @param creationTime the creationTime value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withCreationTime(OffsetDateTime creationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withCreationTime(creationTime);
        return this;
    }

    /**
     * Get the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModifiedTime();
    }

    /**
     * Set the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * Get the description property: Gets or sets the description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Gets or sets the description.
     *
     * @param description the description value to set.
     * @return the RunbookInner object itself.
     */
    public RunbookInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunbookPropertiesInner();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
