/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gn.theme.skin;

import javafx.scene.Cursor;
import javafx.scene.control.TextField;

/**
 *
 * @author SBS
 */
public class ClearableSkin extends SkinAction {

    public ClearableSkin(TextField textField) {
        super(textField);
    }

    @Override
    void mouseReleased() {
        getTextField().setText(""); // no null pointer
    }

    @Override
    void textChanged() {
        if(!getTextField().isFocused() && getTextField().getText() == null )
            return;
        getButton().setVisible(getTextField().isFocused() && !getTextField().getText().isEmpty());
    }

    @Override
    void focusChanged() {
        if(!getTextField().isFocused() && getTextField().getText() == null )
            return;
        getButton().setVisible(getTextField().isFocused() && !getTextField().getText().isEmpty());
    }

    private void altCursor(){
        getButton().setCursor(
                getButton().isVisible()
                        ? Cursor.HAND : Cursor.DEFAULT
        );
    }

    @Override
    void mousePressed() {
    }
}
