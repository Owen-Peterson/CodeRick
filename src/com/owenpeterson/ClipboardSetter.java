package com.owenpeterson;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ClipboardSetter {
    public static void setClipboard(String incomingClipboard){
        StringSelection stringSelection = new StringSelection(incomingClipboard);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
    }
}
