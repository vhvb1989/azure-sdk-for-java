// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appconfiguration.models.CheckNameAvailabilityParameters;
import com.azure.resourcemanager.appconfiguration.models.ConfigurationResourceType;

/** Samples for Operations CheckNameAvailability. */
public final class OperationsCheckNameAvailabilitySamples {
    /**
     * Sample code: ConfigurationStores_CheckNameAvailable.
     *
     * @param appConfigurationManager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresCheckNameAvailable(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager appConfigurationManager) {
        appConfigurationManager
            .operations()
            .checkNameAvailabilityWithResponse(
                new CheckNameAvailabilityParameters()
                    .withName("contoso")
                    .withType(ConfigurationResourceType.MICROSOFT_APP_CONFIGURATION_CONFIGURATION_STORES),
                Context.NONE);
    }

    /**
     * Sample code: ConfigurationStores_CheckNameNotAvailable.
     *
     * @param appConfigurationManager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresCheckNameNotAvailable(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager appConfigurationManager) {
        appConfigurationManager
            .operations()
            .checkNameAvailabilityWithResponse(
                new CheckNameAvailabilityParameters()
                    .withName("contoso")
                    .withType(ConfigurationResourceType.MICROSOFT_APP_CONFIGURATION_CONFIGURATION_STORES),
                Context.NONE);
    }
}