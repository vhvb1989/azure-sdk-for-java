// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dnsresolver.fluent.DnsResolverManagementClient;
import com.azure.resourcemanager.dnsresolver.implementation.DnsForwardingRulesetsImpl;
import com.azure.resourcemanager.dnsresolver.implementation.DnsResolverManagementClientBuilder;
import com.azure.resourcemanager.dnsresolver.implementation.DnsResolversImpl;
import com.azure.resourcemanager.dnsresolver.implementation.ForwardingRulesImpl;
import com.azure.resourcemanager.dnsresolver.implementation.InboundEndpointsImpl;
import com.azure.resourcemanager.dnsresolver.implementation.OutboundEndpointsImpl;
import com.azure.resourcemanager.dnsresolver.implementation.VirtualNetworkLinksImpl;
import com.azure.resourcemanager.dnsresolver.models.DnsForwardingRulesets;
import com.azure.resourcemanager.dnsresolver.models.DnsResolvers;
import com.azure.resourcemanager.dnsresolver.models.ForwardingRules;
import com.azure.resourcemanager.dnsresolver.models.InboundEndpoints;
import com.azure.resourcemanager.dnsresolver.models.OutboundEndpoints;
import com.azure.resourcemanager.dnsresolver.models.VirtualNetworkLinks;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to DnsResolverManager. The DNS Resolver Management Client. */
public final class DnsResolverManager {
    private DnsResolvers dnsResolvers;

    private InboundEndpoints inboundEndpoints;

    private OutboundEndpoints outboundEndpoints;

    private DnsForwardingRulesets dnsForwardingRulesets;

    private ForwardingRules forwardingRules;

    private VirtualNetworkLinks virtualNetworkLinks;

    private final DnsResolverManagementClient clientObject;

    private DnsResolverManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new DnsResolverManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of DnsResolver service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the DnsResolver service API instance.
     */
    public static DnsResolverManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Gets a Configurable instance that can be used to create DnsResolverManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new DnsResolverManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private final ClientLogger logger = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval = Objects.requireNonNull(defaultPollInterval, "'retryPolicy' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'httpPipeline' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of DnsResolver service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the DnsResolver service API instance.
         */
        public DnsResolverManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.dnsresolver")
                .append("/")
                .append("1.0.0-beta.1");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new DnsResolverManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /** @return Resource collection API of DnsResolvers. */
    public DnsResolvers dnsResolvers() {
        if (this.dnsResolvers == null) {
            this.dnsResolvers = new DnsResolversImpl(clientObject.getDnsResolvers(), this);
        }
        return dnsResolvers;
    }

    /** @return Resource collection API of InboundEndpoints. */
    public InboundEndpoints inboundEndpoints() {
        if (this.inboundEndpoints == null) {
            this.inboundEndpoints = new InboundEndpointsImpl(clientObject.getInboundEndpoints(), this);
        }
        return inboundEndpoints;
    }

    /** @return Resource collection API of OutboundEndpoints. */
    public OutboundEndpoints outboundEndpoints() {
        if (this.outboundEndpoints == null) {
            this.outboundEndpoints = new OutboundEndpointsImpl(clientObject.getOutboundEndpoints(), this);
        }
        return outboundEndpoints;
    }

    /** @return Resource collection API of DnsForwardingRulesets. */
    public DnsForwardingRulesets dnsForwardingRulesets() {
        if (this.dnsForwardingRulesets == null) {
            this.dnsForwardingRulesets = new DnsForwardingRulesetsImpl(clientObject.getDnsForwardingRulesets(), this);
        }
        return dnsForwardingRulesets;
    }

    /** @return Resource collection API of ForwardingRules. */
    public ForwardingRules forwardingRules() {
        if (this.forwardingRules == null) {
            this.forwardingRules = new ForwardingRulesImpl(clientObject.getForwardingRules(), this);
        }
        return forwardingRules;
    }

    /** @return Resource collection API of VirtualNetworkLinks. */
    public VirtualNetworkLinks virtualNetworkLinks() {
        if (this.virtualNetworkLinks == null) {
            this.virtualNetworkLinks = new VirtualNetworkLinksImpl(clientObject.getVirtualNetworkLinks(), this);
        }
        return virtualNetworkLinks;
    }

    /**
     * @return Wrapped service client DnsResolverManagementClient providing direct access to the underlying
     *     auto-generated API implementation, based on Azure REST API.
     */
    public DnsResolverManagementClient serviceClient() {
        return this.clientObject;
    }
}