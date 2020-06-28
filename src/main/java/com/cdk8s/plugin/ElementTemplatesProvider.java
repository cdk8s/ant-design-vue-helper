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
        /* 关联 element.xml */
        return new String[]{"element", "vux"};
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return null;
    }
}
