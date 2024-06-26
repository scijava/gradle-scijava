/*
 * Copyright 2024 the original author or authors.
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
package org.gradle.api.internal.plugins.software

import org.gradle.api.Incubating
import org.gradle.api.Plugin
import org.gradle.api.Project
import kotlin.reflect.KClass

/**
 * Marks a Settings plugin as registering one or more software types.
 *
 * @since 8.9
 */
@Incubating
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegistersSoftwareTypes(
    /**
     * The [Project] plugins that provide the software types.
     *
     * @since 8.9
     */
    vararg val value: KClass<out Plugin<Project>>)
