package com.cdk8s.plugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

// zchtodo 检查下这个类的作用
public class ElementFileType extends LanguageFileType {
    public static final ElementFileType INSTANCE = new ElementFileType();

    private ElementFileType() {
        super(ElementLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Shen file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Shen language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "element";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ElementIcons.FILE;
    }
}
