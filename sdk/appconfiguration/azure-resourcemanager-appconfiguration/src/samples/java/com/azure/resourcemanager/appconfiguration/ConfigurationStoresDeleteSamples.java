// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration;

import com.azure.core.util.Context;

/** Samples for ConfigurationStores Delete. */
public final class ConfigurationStoresDeleteSamples {
    /**
     * Sample code: ConfigurationStores_Delete.
     *
     * @param appConfigurationManager Entry point to AppConfigurationManager.
     */
    public static void configurationStoresDelete(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager appConfigurationManager) {
        appConfigurationManager.configurationStores().delete("myResourceGroup", "contoso", Context.NONE);
    }
}