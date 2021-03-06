package com.github.aamnony.idev.vhdl.display;

import com.github.aamnony.idev.vhdl.lang.VhdlArchitectureBody;
import com.intellij.navigation.ItemPresentation;

import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class VhdlArchitecturePresentation implements ItemPresentation {
    private final VhdlArchitectureBody body;

    public VhdlArchitecturePresentation(VhdlArchitectureBody body) {
        this.body = body;
    }

    @Override
    public String getPresentableText() {
        String archName = body.getIdentifierList().get(0).getName();
        String entityName = body.getRefname().getText();
        return String.format("%s: %s", archName, entityName);
    }

    @Nullable
    @Override
    public String getLocationString() {
        return null;
    }

    @Override
    public Icon getIcon(boolean unused) {
        return body.getIcon(0);
    }
}
