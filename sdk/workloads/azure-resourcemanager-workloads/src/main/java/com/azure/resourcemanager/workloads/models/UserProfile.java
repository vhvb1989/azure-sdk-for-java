// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** User profile to configure on a compute resources such as VM, VMSS. */
@Fluent
public final class UserProfile {
    /*
     * User name
     */
    @JsonProperty(value = "userName", required = true)
    private String username;

    /*
     * SSH public key data
     */
    @JsonProperty(value = "sshPublicKey", required = true)
    private String sshPublicKey;

    /**
     * Get the username property: User name.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: User name.
     *
     * @param username the username value to set.
     * @return the UserProfile object itself.
     */
    public UserProfile withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the sshPublicKey property: SSH public key data.
     *
     * @return the sshPublicKey value.
     */
    public String sshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * Set the sshPublicKey property: SSH public key data.
     *
     * @param sshPublicKey the sshPublicKey value to set.
     * @return the UserProfile object itself.
     */
    public UserProfile withSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (username() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property username in model UserProfile"));
        }
        if (sshPublicKey() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sshPublicKey in model UserProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserProfile.class);
}
