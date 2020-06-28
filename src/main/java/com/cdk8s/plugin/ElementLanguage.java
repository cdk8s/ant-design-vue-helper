package com.cdk8s.plugin;

import com.intellij.lang.Language;

public class ElementLanguage extends Language {
    public static final ElementLanguage INSTANCE = new ElementLanguage();
    private ElementLanguage() {
        super("Shen");
    }
}
