// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.core.properties.profile;

import com.azure.spring.core.aware.AzureProfileOptionsAware;

/**
 * The AzureProfile defines the properties related to an Azure subscription.
 */
public final class AzureProfileProperties extends AzureProfileAdapter {

    private String tenantId;
    private String subscriptionId;
    private AzureProfileOptionsAware.CloudType cloudType;
    private final AzureEnvironmentProperties environment;

    /**
     * Construct an {@link AzureProfileProperties} instance with default value.
     */
    public AzureProfileProperties() {
        environment = new AzureEnvironmentProperties();
        setCloudType(AzureProfileOptionsAware.CloudType.AZURE);
    }

    /**
     * @return The tenant id.
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Set the tenant id.
     * @param tenantId The tenant id.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * @return The subscription id.
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Set the subscription id.
     * @param subscriptionId The subscription id.
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Get the cloud type.
     * @return The cloud type.
     */
    @Override
    public AzureProfileOptionsAware.CloudType getCloudType() {
        return cloudType;
    }

    /**
     * Set the cloud type.
     * @param cloudType the cloud type.
     */
    public void setCloudType(AzureProfileOptionsAware.CloudType cloudType) {
        this.cloudType = cloudType;

        // Explicitly call this method to merge default cloud endpoints to the environment object.
        changeEnvironmentAccordingToCloud();
    }

    /**
     * Get the Azure environment.
     * @return The Azure environment.
     */
    @Override
    public AzureEnvironmentProperties getEnvironment() {
        return environment;
    }

}