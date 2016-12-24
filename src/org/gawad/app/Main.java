package org.gawad.app;

import org.gawad.thirdparty.Connection;
import org.gawad.thirdparty.soap.Access;
import org.gawad.ui.JFrameMainApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * Created by Vadim on 23.12.2016.
 */
public class Main {

    public static void main (String [] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Connection conn = new Connection();
                JFrameMainApp jFrameMainApp = new JFrameMainApp(conn);
                conn.setjFrameMainApp(jFrameMainApp);
                conn.setAccess(getAccess());
                jFrameMainApp.createGUI();
            }
        });
    }

    private static Access getAccess () {
        Access access = new Access();

        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            access.setResellerCode(prop.getProperty("resellerCode"));
            access.setUserName(prop.getProperty("username"));
            access.setPassword(prop.getProperty("password"));

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        access.setLang("en");
        return access;
    }
}
