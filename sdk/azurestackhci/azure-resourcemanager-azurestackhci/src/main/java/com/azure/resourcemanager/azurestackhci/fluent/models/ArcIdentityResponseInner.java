// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ArcIdentity details. */
@Immutable
public final class ArcIdentityResponseInner {
    /*
     * ArcIdentity properties.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private ArcIdentityResponseProperties innerProperties;

    /**
     * Get the innerProperties property: ArcIdentity properties.
     *
     * @return the innerProperties value.
     */
    private ArcIdentityResponseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the arcApplicationClientId property: The arcApplicationClientId property.
     *
     * @return the arcApplicationClientId value.
     */
    public String arcApplicationClientId() {
        return this.innerProperties() == null ? null : this.innerProperties().arcApplicationClientId();
    }

    /**
     * Set the arcApplicationClientId property: The arcApplicationClientId property.
     *
     * @param arcApplicationClientId the arcApplicationClientId value to set.
     * @return the ArcIdentityResponseInner object itself.
     */
    public ArcIdentityResponseInner withArcApplicationClientId(String arcApplicationClientId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcIdentityResponseProperties();
        }
        this.innerProperties().withArcApplicationClientId(arcApplicationClientId);
        return this;
    }

    /**
     * Get the arcApplicationTenantId property: The arcApplicationTenantId property.
     *
     * @return the arcApplicationTenantId value.
     */
    public String arcApplicationTenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().arcApplicationTenantId();
    }

    /**
     * Set the arcApplicationTenantId property: The arcApplicationTenantId property.
     *
     * @param arcApplicationTenantId the arcApplicationTenantId value to set.
     * @return the ArcIdentityResponseInner object itself.
     */
    public ArcIdentityResponseInner withArcApplicationTenantId(String arcApplicationTenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcIdentityResponseProperties();
        }
        this.innerProperties().withArcApplicationTenantId(arcApplicationTenantId);
        return this;
    }

    /**
     * Get the arcServicePrincipalObjectId property: The arcServicePrincipalObjectId property.
     *
     * @return the arcServicePrincipalObjectId value.
     */
    public String arcServicePrincipalObjectId() {
        return this.innerProperties() == null ? null : this.innerProperties().arcServicePrincipalObjectId();
    }

    /**
     * Set the arcServicePrincipalObjectId property: The arcServicePrincipalObjectId property.
     *
     * @param arcServicePrincipalObjectId the arcServicePrincipalObjectId value to set.
     * @return the ArcIdentityResponseInner object itself.
     */
    public ArcIdentityResponseInner withArcServicePrincipalObjectId(String arcServicePrincipalObjectId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcIdentityResponseProperties();
        }
        this.innerProperties().withArcServicePrincipalObjectId(arcServicePrincipalObjectId);
        return this;
    }

    /**
     * Get the arcApplicationObjectId property: The arcApplicationObjectId property.
     *
     * @return the arcApplicationObjectId value.
     */
    public String arcApplicationObjectId() {
        return this.innerProperties() == null ? null : this.innerProperties().arcApplicationObjectId();
    }

    /**
     * Set the arcApplicationObjectId property: The arcApplicationObjectId property.
     *
     * @param arcApplicationObjectId the arcApplicationObjectId value to set.
     * @return the ArcIdentityResponseInner object itself.
     */
    public ArcIdentityResponseInner withArcApplicationObjectId(String arcApplicationObjectId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ArcIdentityResponseProperties();
        }
        this.innerProperties().withArcApplicationObjectId(arcApplicationObjectId);
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
