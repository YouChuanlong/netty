/*
 * Copyright 2022 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/**
 * This package contains a handler that can convert {@link io.netty5.buffer.ByteBuf} instances into
 * {@link io.netty5.buffer.api.Buffer}, and vice versa.
 * <p>
 * This can be used to build pipelines that contain handlers that operate on different buffer types.
 */
package io.netty5.handler.adaptor;
