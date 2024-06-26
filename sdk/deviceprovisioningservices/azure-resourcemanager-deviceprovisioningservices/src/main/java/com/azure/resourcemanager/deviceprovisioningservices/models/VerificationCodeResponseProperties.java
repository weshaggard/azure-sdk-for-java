// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VerificationCodeResponseProperties model. */
@Fluent
public final class VerificationCodeResponseProperties {
    /*
     * Verification code.
     */
    @JsonProperty(value = "verificationCode")
    private String verificationCode;

    /*
     * Certificate subject.
     */
    @JsonProperty(value = "subject")
    private String subject;

    /*
     * Code expiry.
     */
    @JsonProperty(value = "expiry")
    private String expiry;

    /*
     * Certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * Indicate if the certificate is verified by owner of private key.
     */
    @JsonProperty(value = "isVerified")
    private Boolean isVerified;

    /*
     * base-64 representation of X509 certificate .cer file or just .pem file
     * content.
     */
    @JsonProperty(value = "certificate")
    private byte[] certificate;

    /*
     * Certificate created time.
     */
    @JsonProperty(value = "created")
    private String created;

    /*
     * Certificate updated time.
     */
    @JsonProperty(value = "updated")
    private String updated;

    /**
     * Get the verificationCode property: Verification code.
     *
     * @return the verificationCode value.
     */
    public String verificationCode() {
        return this.verificationCode;
    }

    /**
     * Set the verificationCode property: Verification code.
     *
     * @param verificationCode the verificationCode value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    /**
     * Get the subject property: Certificate subject.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set the subject property: Certificate subject.
     *
     * @param subject the subject value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the expiry property: Code expiry.
     *
     * @return the expiry value.
     */
    public String expiry() {
        return this.expiry;
    }

    /**
     * Set the expiry property: Code expiry.
     *
     * @param expiry the expiry value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withExpiry(String expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: Certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the isVerified property: Indicate if the certificate is verified by owner of private key.
     *
     * @return the isVerified value.
     */
    public Boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Set the isVerified property: Indicate if the certificate is verified by owner of private key.
     *
     * @param isVerified the isVerified value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    /**
     * Get the certificate property: base-64 representation of X509 certificate .cer file or just .pem file content.
     *
     * @return the certificate value.
     */
    public byte[] certificate() {
        return CoreUtils.clone(this.certificate);
    }

    /**
     * Set the certificate property: base-64 representation of X509 certificate .cer file or just .pem file content.
     *
     * @param certificate the certificate value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withCertificate(byte[] certificate) {
        this.certificate = CoreUtils.clone(certificate);
        return this;
    }

    /**
     * Get the created property: Certificate created time.
     *
     * @return the created value.
     */
    public String created() {
        return this.created;
    }

    /**
     * Set the created property: Certificate created time.
     *
     * @param created the created value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * Get the updated property: Certificate updated time.
     *
     * @return the updated value.
     */
    public String updated() {
        return this.updated;
    }

    /**
     * Set the updated property: Certificate updated time.
     *
     * @param updated the updated value to set.
     * @return the VerificationCodeResponseProperties object itself.
     */
    public VerificationCodeResponseProperties withUpdated(String updated) {
        this.updated = updated;
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
