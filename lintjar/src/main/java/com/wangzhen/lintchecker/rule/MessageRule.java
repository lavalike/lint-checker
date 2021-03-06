package com.wangzhen.lintchecker.rule;

import com.wangzhen.lintchecker.callback.Rule;

/**
 * Message提示信息
 * Created by wangzhen on 2018/4/21.
 */
public class MessageRule implements Rule {
    @Override
    public String getId() {
        return MessageRule.class.getSimpleName();
    }

    @Override
    public String getBriefDescription() {
        return "Message使用不规范";
    }

    @Override
    public String getExplanation() {
        return "建议使用Message.obtain()";
    }
}
