package com.cdk8s.plugin;

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

/**
 * 用于展示代码模板
 * zchtodo 检查下这个类的作用
 */
public class ElementTemplatesProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        /* 关联 xml 文件，支持多个 */
        // return new String[]{"element", "ant-design-vue"};
        return new String[]{"ant-design-vue"};
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return null;
    }
}
