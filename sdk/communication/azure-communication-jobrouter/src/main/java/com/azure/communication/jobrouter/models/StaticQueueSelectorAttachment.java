// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Describes a queue selector that will be attached to a job.
 */
@Fluent
public final class StaticQueueSelectorAttachment extends QueueSelectorAttachment {

    /*
     * The type discriminator describing a sub-type of QueueSelectorAttachment.
     */
    @Generated
    private QueueSelectorAttachmentKind kind = QueueSelectorAttachmentKind.STATIC;

    /*
     * The queue selector to attach.
     */
    @Generated
    private RouterQueueSelector queueSelector;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    /**
     * Creates an instance of StaticQueueSelectorAttachment class.
     */
    @Generated
    public StaticQueueSelectorAttachment() {
    }

    /**
     * Get the kind property: The type discriminator describing a sub-type of QueueSelectorAttachment.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public QueueSelectorAttachmentKind getKind() {
        return this.kind;
    }

    /**
     * Get the queueSelector property: The queue selector to attach.
     *
     * @return the queueSelector value.
     */
    @Generated
    public RouterQueueSelector getQueueSelector() {
        return this.queueSelector;
    }

    /**
     * Set the queueSelector property: The queue selector to attach.
     * <p>Required when create the resource.</p>
     *
     * @param queueSelector the queueSelector value to set.
     * @return the StaticQueueSelectorAttachment object itself.
     */
    @Generated
    public StaticQueueSelectorAttachment setQueueSelector(RouterQueueSelector queueSelector) {
        this.queueSelector = queueSelector;
        this.updatedProperties.add("queueSelector");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (JsonMergePatchHelper.getQueueSelectorAttachmentAccessor().isJsonMergePatch(this)) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            jsonWriter.writeJsonField("queueSelector", this.queueSelector);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind.toString());
        if (updatedProperties.contains("queueSelector")) {
            if (this.queueSelector == null) {
                jsonWriter.writeNullField("queueSelector");
            } else {
                JsonMergePatchHelper.getRouterQueueSelectorAccessor()
                    .prepareModelForJsonMergePatch(this.queueSelector, true);
                jsonWriter.writeJsonField("queueSelector", this.queueSelector);
                JsonMergePatchHelper.getRouterQueueSelectorAccessor()
                    .prepareModelForJsonMergePatch(this.queueSelector, false);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StaticQueueSelectorAttachment from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of StaticQueueSelectorAttachment if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StaticQueueSelectorAttachment.
     */
    @Generated
    public static StaticQueueSelectorAttachment fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StaticQueueSelectorAttachment deserializedStaticQueueSelectorAttachment
                = new StaticQueueSelectorAttachment();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    deserializedStaticQueueSelectorAttachment.kind
                        = QueueSelectorAttachmentKind.fromString(reader.getString());
                } else if ("queueSelector".equals(fieldName)) {
                    deserializedStaticQueueSelectorAttachment.queueSelector = RouterQueueSelector.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedStaticQueueSelectorAttachment;
        });
    }

    /**
     * Creates an instance of StaticQueueSelectorAttachment class.
     *
     * @param queueSelector the queueSelector value to set.
     */
    public StaticQueueSelectorAttachment(RouterQueueSelector queueSelector) {
        this.queueSelector = queueSelector;
        this.updatedProperties.add("queueSelector");
    }
}
