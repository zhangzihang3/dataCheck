package com.zzh.check.converter;

import java.beans.PropertyEditorSupport;

/**
 * @author 张子行
 * @class TODO
 */
public class myPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        super.setAsText(text);
    }

    @Override
    public String getAsText() {
        return super.getAsText();
    }
}
