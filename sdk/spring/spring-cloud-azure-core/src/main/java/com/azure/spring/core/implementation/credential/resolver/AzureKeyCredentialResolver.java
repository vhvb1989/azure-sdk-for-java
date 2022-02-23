// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.core.implementation.credential.resolver;

import com.azure.core.credential.AzureKeyCredential;
import com.azure.spring.core.aware.authentication.KeyAware;
import com.azure.spring.core.credential.AzureCredentialResolver;
import com.azure.spring.core.properties.AzureProperties;
import org.springframework.util.StringUtils;

/**
 * Resolve the token credential according to the azure properties.
 */
public final class AzureKeyCredentialResolver implements AzureCredentialResolver<AzureKeyCredential> {

    @Override
    public AzureKeyCredential resolve(AzureProperties properties) {
        if (!isResolvable(properties)) {
            return null;
        }

        String key = ((KeyAware) properties).getKey();
        if (!StringUtils.hasText(key)) {
            return null;
        }

        return new AzureKeyCredential(key);
    }

    @Override
    public boolean isResolvable(AzureProperties properties) {
        return properties instanceof KeyAware;
    }

}