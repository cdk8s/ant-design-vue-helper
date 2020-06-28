package com.cdk8s.plugin;

import com.intellij.lang.Language;

public class ElementLanguage extends Language {
    public static final ElementLanguage INSTANCE = new ElementLanguage();
    private ElementLanguage() {
    	// zchtodo 检查下这个类的作用
        super("Shen");
    }
}
