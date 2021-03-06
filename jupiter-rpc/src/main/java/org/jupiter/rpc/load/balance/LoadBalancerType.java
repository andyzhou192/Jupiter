/*
 * Copyright (c) 2015 The Jupiter Project
 *
 * Licensed under the Apache License, version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jupiter.rpc.load.balance;

/**
 * jupiter
 * org.jupiter.rpc.load.balance
 *
 * @author jiachun.fjc
 */
public enum LoadBalancerType {
    ROUND_ROBIN,                // 加权轮询
    RANDOM,                     // 加权随机
    EXT_SPI_SINGLETON,          // 用户自行扩展, SPI方式加载, 单例
    EXT_SPI_PROTOTYPE;          // 用户自行扩展, SPI方式加载

    public static LoadBalancerType parse(String name) {
        for (LoadBalancerType s : values()) {
            if (s.name().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public static LoadBalancerType getDefault() {
        return RANDOM;
    }
}
