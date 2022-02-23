// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.core.implementation.credential.resolver;

import com.azure.core.credential.AzureNamedKeyCredential;
import com.azure.spring.core.aware.authentication.NamedKeyAware;
import com.azure.spring.core.credential.AzureCredentialResolver;
import com.azure.spring.core.properties.AzureProperties;
import com.azure.spring.core.properties.authentication.NamedKeyProperties;
import org.springframework.util.StringUtils;

/**
 * Resolve the named key credential according to the azure properties.
 */
public final class AzureNamedKeyCredentialResolver implements AzureCredentialResolver<AzureNamedKeyCredential> {

    @Override
    public AzureNamedKeyCredential resolve(AzureProperties properties) {
        if (!isResolvable(properties)) {
            return null;
        }

        NamedKeyProperties namedKey = ((NamedKeyAware) properties).getNamedKey();
        if (namedKey == null || !StringUtils.hasText(namedKey.getName()) || !StringUtils.hasText(namedKey.getKey())) {
            return null;
        }

        return new AzureNamedKeyCredential(namedKey.getName(), namedKey.getKey());
    }

    @Override
    public boolean isResolvable(AzureProperties properties) {
        return properties instanceof NamedKeyAware;
    }

}