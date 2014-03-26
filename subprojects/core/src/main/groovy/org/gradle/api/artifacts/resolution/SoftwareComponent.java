/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.artifacts.resolution;

import org.gradle.api.Incubating;
import org.gradle.api.artifacts.component.ComponentIdentifier;

/**
 * A software component with resolved artifacts.
 *
 * Implementations have the following equals contract:
 * {@code other != null && getClass() == other.getClass() && getId().equals(other.getId());}
 *
 * @param <T> the type of software artifact belonging to this component
 *
 * @since 1.12
 */
@Incubating
public interface SoftwareComponent<T extends SoftwareArtifact> {
    ComponentIdentifier getId();
}
