// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.SentinelOnboardingStateInner;

/** An immutable client-side representation of SentinelOnboardingState. */
public interface SentinelOnboardingState {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: Etag of the azure resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the customerManagedKey property: Flag that indicates the status of the CMK setting.
     *
     * @return the customerManagedKey value.
     */
    Boolean customerManagedKey();

    /**
     * Gets the inner com.azure.resourcemanager.securityinsights.fluent.models.SentinelOnboardingStateInner object.
     *
     * @return the inner object.
     */
    SentinelOnboardingStateInner innerModel();

    /** The entirety of the SentinelOnboardingState definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The SentinelOnboardingState definition stages. */
    interface DefinitionStages {
        /** The first stage of the SentinelOnboardingState definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the SentinelOnboardingState definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @return the next definition stage.
             */
            WithCreate withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /**
         * The stage of the SentinelOnboardingState definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithEtag, DefinitionStages.WithCustomerManagedKey {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SentinelOnboardingState create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SentinelOnboardingState create(Context context);
        }
        /** The stage of the SentinelOnboardingState definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: Etag of the azure resource.
             *
             * @param etag Etag of the azure resource.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the SentinelOnboardingState definition allowing to specify customerManagedKey. */
        interface WithCustomerManagedKey {
            /**
             * Specifies the customerManagedKey property: Flag that indicates the status of the CMK setting.
             *
             * @param customerManagedKey Flag that indicates the status of the CMK setting.
             * @return the next definition stage.
             */
            WithCreate withCustomerManagedKey(Boolean customerManagedKey);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SentinelOnboardingState refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SentinelOnboardingState refresh(Context context);
}