/*
 * Copyright 2022 Enaium
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

package cn.enaium.kook.spring.boot.starter.model.sign.data.extra.event.channel;

import cn.enaium.kook.spring.boot.starter.annotation.event.Listener;
import cn.enaium.kook.spring.boot.starter.model.sign.data.extra.SystemMessageExtra;

import java.util.Map;

/**
 * 频道内用户取消 reaction
 *
 * @author Enaium
 * @since 0.1.0
 */
@Listener
public class DeletedReactionChannel extends SystemMessageExtra<Map<Object, Object>> {

    public static final String TYPE = "deleted_reaction";

    /**
     * 用户点击的消息 id
     */
    public String msg_id;
    /**
     * 点击的用户
     */
    public String user_id;
    /**
     * 频道 id
     */
    public String channel_id;
    /**
     * 消息对象, 包含 id 表情 id, name 表情名称
     */
    public Map<Integer, String> emoji;
}
