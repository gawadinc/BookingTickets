package org.gawad.ui;

import org.gawad.thirdparty.Connection;
import org.gawad.thirdparty.soap.OriginDestinationSearch;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 * Created by Vadim on 24.12.2016.
 */

public class JFrameMainApp {

    JPanel panel = new JPanel();
    FlowLayout panelLayout = new FlowLayout();

    JTextField originalTextField = new JTextField("CHA",10);
    JTextField destinationTextField = new JTextField("HKG",10);
    JTextArea result = new JTextArea(20, 20);

    Connection conn;

    public JFrameMainApp (Connection conn){
        this.conn = conn;
    }

    public void createGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Booking Tickets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton quitButton = new JButton("Quit");
        JButton sendButton = new JButton("Send");

        quitButton.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });

        sendButton.addActionListener((ActionEvent event) -> {
            conn.call();
        });

        panel.setLayout(panelLayout);
        panel.add(originalTextField);
        panel.add(destinationTextField);
        panel.add(sendButton);
        panel.add(quitButton);
        panel.add(result);

        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(500, 400));

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public OriginDestinationSearch getOriginDestinationSearch () {
        OriginDestinationSearch originDestinationSearch = new OriginDestinationSearch();
        originDestinationSearch.setOriginCode(originalTextField.getText());
        originDestinationSearch.setDestinationCode(destinationTextField.getText());
        return originDestinationSearch;
    }

    public void printResult(String str) {
        result.append(str + "\n");
    }
}