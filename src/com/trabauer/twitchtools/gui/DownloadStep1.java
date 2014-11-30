package com.trabauer.twitchtools.gui;

import com.trabauer.twitchtools.controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;

/**
 * Created by Flo on 16.11.2014.
 */
public class DownloadStep1 {
    private JPanel mainPanel;
    private JTextField twitchUrlTextField;
    private JButton nextButton;


    public DownloadStep1() {
        super();
        nextButton.setActionCommand("nextButton1");
        twitchUrlTextField.setToolTipText("Enter the URL of the past broadcast here. " +
                "Usually looks the URL looks like: \"http://www.twitch.tv/dreamhacksc2/b/593890038\"");
    }



    public JPanel getMainPanel() {
        return mainPanel;
    }

    public String getTwitchUrl() {
        System.out.println(twitchUrlTextField.getText());
        return twitchUrlTextField.getText();
    }

    public void addActionListener(ActionListener actionListener) {
        nextButton.addActionListener(actionListener);
        twitchUrlTextField.addActionListener(actionListener);
    }
}
