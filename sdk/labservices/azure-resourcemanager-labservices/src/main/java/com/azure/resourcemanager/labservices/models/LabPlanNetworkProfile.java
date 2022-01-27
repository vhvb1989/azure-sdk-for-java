// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Profile for how to handle networking for Lab Plans. */
@Fluent
public final class LabPlanNetworkProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LabPlanNetworkProfile.class);

    /*
     * The external subnet resource id
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /**
     * Get the subnetId property: The external subnet resource id.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The external subnet resource id.
     *
     * @param subnetId the subnetId value to set.
     * @return the LabPlanNetworkProfile object itself.
     */
    public LabPlanNetworkProfile withSubnetId(String subnetId) {
        this.subnetId = subnetId;
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