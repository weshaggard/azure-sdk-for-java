// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.v2.storage.blob.models;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.http.models.HttpHeaderName;
import io.clientcore.core.http.models.HttpHeaders;
import io.clientcore.core.utils.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * The BlobsCreateSnapshotHeaders model.
 */
@Metadata(properties = { MetadataProperties.FLUENT })
public final class BlobsCreateSnapshotHeaders {
    /*
     * The x-ms-snapshot property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String xMsSnapshot;

    /*
     * The x-ms-version property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String xMsVersion;

    /*
     * The ETag property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String eTag;

    /*
     * The Last-Modified property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-version-id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String xMsVersionId;

    /*
     * The x-ms-request-id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String xMsRequestId;

    /*
     * The x-ms-request-server-encrypted property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private Boolean xMsRequestServerEncrypted;

    /*
     * The x-ms-client-request-id property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private String xMsClientRequestId;

    /*
     * The Date property.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    private DateTimeRfc1123 date;

    private static final HttpHeaderName X_MS_SNAPSHOT = HttpHeaderName.fromString("x-ms-snapshot");

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    private static final HttpHeaderName X_MS_VERSION_ID = HttpHeaderName.fromString("x-ms-version-id");

    private static final HttpHeaderName X_MS_REQUEST_ID = HttpHeaderName.fromString("x-ms-request-id");

    private static final HttpHeaderName X_MS_REQUEST_SERVER_ENCRYPTED
        = HttpHeaderName.fromString("x-ms-request-server-encrypted");

    private static final HttpHeaderName X_MS_CLIENT_REQUEST_ID = HttpHeaderName.fromString("x-ms-client-request-id");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of BlobsCreateSnapshotHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public BlobsCreateSnapshotHeaders(HttpHeaders rawHeaders) {
        this.xMsSnapshot = rawHeaders.getValue(X_MS_SNAPSHOT);
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        String lastModified = rawHeaders.getValue(HttpHeaderName.LAST_MODIFIED);
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        } else {
            this.lastModified = null;
        }
        this.xMsVersionId = rawHeaders.getValue(X_MS_VERSION_ID);
        this.xMsRequestId = rawHeaders.getValue(X_MS_REQUEST_ID);
        String xMsRequestServerEncrypted = rawHeaders.getValue(X_MS_REQUEST_SERVER_ENCRYPTED);
        if (xMsRequestServerEncrypted != null) {
            this.xMsRequestServerEncrypted = Boolean.parseBoolean(xMsRequestServerEncrypted);
        } else {
            this.xMsRequestServerEncrypted = null;
        }
        this.xMsClientRequestId = rawHeaders.getValue(X_MS_CLIENT_REQUEST_ID);
        String date = rawHeaders.getValue(HttpHeaderName.DATE);
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        } else {
            this.date = null;
        }
    }

    /**
     * Get the xMsSnapshot property: The x-ms-snapshot property.
     * 
     * @return the xMsSnapshot value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getXMsSnapshot() {
        return this.xMsSnapshot;
    }

    /**
     * Set the xMsSnapshot property: The x-ms-snapshot property.
     * 
     * @param xMsSnapshot the xMsSnapshot value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BlobsCreateSnapshotHeaders setXMsSnapshot(String xMsSnapshot) {
        this.xMsSnapshot = xMsSnapshot;
        return this;
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     * 
     * @return the xMsVersion value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     * 
     * @param xMsVersion the xMsVersion value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BlobsCreateSnapshotHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     * 
     * @return the eTag value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     * 
     * @param eTag the eTag value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BlobsCreateSnapshotHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     * 
     * @return the lastModified value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     * 
     * @param lastModified the lastModified value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BlobsCreateSnapshotHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsVersionId property: The x-ms-version-id property.
     * 
     * @return the xMsVersionId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getXMsVersionId() {
        return this.xMsVersionId;
    }

    /**
     * Set the xMsVersionId property: The x-ms-version-id property.
     * 
     * @param xMsVersionId the xMsVersionId value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BlobsCreateSnapshotHeaders setXMsVersionId(String xMsVersionId) {
        this.xMsVersionId = xMsVersionId;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     * 
     * @return the xMsRequestId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     * 
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BlobsCreateSnapshotHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     * 
     * @return the xMsRequestServerEncrypted value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public Boolean isXMsRequestServerEncrypted() {
        return this.xMsRequestServerEncrypted;
    }

    /**
     * Set the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     * 
     * @param xMsRequestServerEncrypted the xMsRequestServerEncrypted value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BlobsCreateSnapshotHeaders setXMsRequestServerEncrypted(Boolean xMsRequestServerEncrypted) {
        this.xMsRequestServerEncrypted = xMsRequestServerEncrypted;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id property.
     * 
     * @return the xMsClientRequestId value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id property.
     * 
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BlobsCreateSnapshotHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    /**
     * Get the date property: The Date property.
     * 
     * @return the date value.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     * 
     * @param date the date value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    @Metadata(properties = { MetadataProperties.GENERATED })
    public BlobsCreateSnapshotHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }
}
