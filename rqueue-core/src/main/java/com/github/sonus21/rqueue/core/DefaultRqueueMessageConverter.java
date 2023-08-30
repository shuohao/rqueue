/*
 * Copyright (c) 2020-2023 Sonu Kumar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *
 */

package com.github.sonus21.rqueue.core;

import com.github.sonus21.rqueue.converter.GenericMessageConverter;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import lombok.EqualsAndHashCode;
import org.springframework.messaging.converter.CompositeMessageConverter;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.converter.StringMessageConverter;

/**
 * Rqueue message converter
 *
 * <p>Default Message Converter for Rqueue messages.
 */
@EqualsAndHashCode(callSuper = true)
public final class DefaultRqueueMessageConverter extends CompositeMessageConverter {

  public DefaultRqueueMessageConverter() {
    // do not change order
    super(ImmutableList.of(new GenericMessageConverter(), new StringMessageConverter()));
  }

  public DefaultRqueueMessageConverter(Collection<MessageConverter> converters) {
    super(converters);
  }
}
