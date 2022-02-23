// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.resourcemanager;

import com.azure.resourcemanager.AzureResourceManager;
import com.azure.spring.cloud.autoconfigure.condition.ConditionalOnMissingProperty;
import com.azure.spring.cloud.autoconfigure.implementation.eventhubs.properties.AzureEventHubsProperties;
import com.azure.spring.cloud.autoconfigure.implementation.resourcemanager.EventHubsResourceMetadata;
import com.azure.spring.resourcemanager.connectionstring.EventHubsArmConnectionStringProvider;
import com.azure.spring.resourcemanager.implementation.provisioning.DefaultEventHubsProvisioner;
import com.azure.spring.resourcemanager.provisioning.EventHubsProvisioner;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

/**
 * Auto-configuration for Azure EventHubs ResourceManager.
 */
@ConditionalOnProperty(prefix = AzureEventHubsProperties.PREFIX, value = "enabled", havingValue = "true", matchIfMissing = true)
@ConditionalOnBean(AzureResourceManager.class)
@AutoConfigureAfter(AzureResourceManagerAutoConfiguration.class)
@EnableConfigurationProperties(EventHubsResourceMetadata.class)
public class AzureEventHubsResourceManagerAutoConfiguration extends AzureServiceResourceManagerConfigurationBase {

    private final EventHubsResourceMetadata resourceMetadata;

    /**
     * Create {@link AzureEventHubsResourceManagerAutoConfiguration} instance
     * @param azureResourceManager the azure resource manager
     * @param resourceMetadata the Event Hubs resource metadata
     */
    public AzureEventHubsResourceManagerAutoConfiguration(AzureResourceManager azureResourceManager,
                                                          EventHubsResourceMetadata resourceMetadata) {
        super(azureResourceManager);
        this.resourceMetadata = resourceMetadata;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = AzureEventHubsProperties.PREFIX, value = "namespace")
    @ConditionalOnMissingProperty(prefix = AzureEventHubsProperties.PREFIX, value = "connection-string")
    @Order
    public EventHubsArmConnectionStringProvider eventHubsArmConnectionStringProvider() {

        return new EventHubsArmConnectionStringProvider(this.azureResourceManager, resourceMetadata,
            resourceMetadata.getName());
    }

    @Bean
    @ConditionalOnMissingBean
    public EventHubsProvisioner eventHubsProvisioner() {
        return new DefaultEventHubsProvisioner(this.azureResourceManager, this.resourceMetadata);
    }

}