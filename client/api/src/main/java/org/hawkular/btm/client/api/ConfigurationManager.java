/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hawkular.btm.client.api;

import org.hawkular.btm.api.model.config.CollectorConfiguration;

/**
 * This interface represents the BTM client side configuration manager.
 *
 * @author gbrown
 */
public interface ConfigurationManager {

    /**
     * This method returns the collector configuration.
     *
     * @return The collection configuration
     */
    CollectorConfiguration getConfiguration();

}
