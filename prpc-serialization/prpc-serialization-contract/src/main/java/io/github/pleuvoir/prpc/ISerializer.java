/*
 * Copyright © 2020 pleuvoir (pleuvior@foxmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.pleuvoir.prpc;

import io.github.pleuvoir.prpc.contract.Contract;
import io.github.pleuvoir.prpc.exception.SerializationException;

/**
 * 序列化器
 *
 * @author <a href="mailto:fuwei@daojia-inc.com">pleuvoir</a>
 */
@Contract
public interface ISerializer {

  /**
   * 对象转为字节数组
   */
  byte[] serialize(final Object obj) throws SerializationException;

  /**
   * 字节数组转为对象
   */
  <T> T deserialize(final byte[] bytes, final Class<T> clazz) throws SerializationException;
}
