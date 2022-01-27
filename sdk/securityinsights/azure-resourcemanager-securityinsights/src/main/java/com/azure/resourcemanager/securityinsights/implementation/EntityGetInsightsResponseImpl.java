// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.resourcemanager.securityinsights.fluent.models.EntityGetInsightsResponseInner;
import com.azure.resourcemanager.securityinsights.models.EntityGetInsightsResponse;
import com.azure.resourcemanager.securityinsights.models.EntityInsightItem;
import com.azure.resourcemanager.securityinsights.models.GetInsightsResultsMetadata;
import java.util.Collections;
import java.util.List;

public final class EntityGetInsightsResponseImpl implements EntityGetInsightsResponse {
    private EntityGetInsightsResponseInner innerObject;

    private final com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager;

    EntityGetInsightsResponseImpl(
        EntityGetInsightsResponseInner innerObject,
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public GetInsightsResultsMetadata metadata() {
        return this.innerModel().metadata();
    }

    public List<EntityInsightItem> value() {
        List<EntityInsightItem> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public EntityGetInsightsResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager() {
        return this.serviceManager;
    }
}