import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.Timer;

public class UserLoginDemo {
    public static void main(String[] args) {
        HashMap<String, String> login = new HashMap<>();
        login.put("Justin", "123");

        Frame frame = new Frame();
        Label usr = new Label("Username:");
        Label pwd = new Label("Password:");
        Label result = new Label("Result Here");
        TextField user = new TextField();
        TextField pass = new TextField();
        Button btn = new Button("Login");
        Button btn2 = new Button("Register");

        result.setVisible(false);
        pass.setEchoChar('*');
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setVisible(true);

        pass.setPreferredSize(new Dimension(100, 27));
        user.setPreferredSize(new Dimension(100, 27));

        frame.add(usr);
        frame.add(user);
        frame.add(pwd);
        frame.add(pass);
        frame.add(btn);
        frame.add(btn2);
        frame.add(result);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String buttonLabel = e.getActionCommand();
                System.out.println(buttonLabel);
                String name = user.getText();
                String passwd = pass.getText();
                switch (buttonLabel) {
                    case "Login":
                        if (login.get(name) != null) {
                            if (login.get(name).equals(passwd)) {
                                result.setText("Login Successful");
                                showComponentTemporarily(frame, 200, "green");
                            }
                        } else {
                            result.setText("Login Failed");
                            showComponentTemporarily(frame, 200, "red");
                        }
                        break;

                    case "Register":
                        if (name.length() < 1 || passwd.length() < 1) {
                            result.setText("Registration Failed");
                            showComponentTemporarily(frame, 200, "red");
                            break;
                        } else {
                            login.put(name, passwd);
                            result.setText("Registration Successful");
                            showComponentTemporarily(frame, 200, "green");
                            break;
                        }
                    default:
                        break;
                }
                showComponentTemporarily(result, frame, 3000);
                result.setVisible(true);
                result.revalidate();
                result.repaint();
                pass.setText("");
                user.setText("");
            }
        };

        btn.addActionListener(actionListener);
        btn2.addActionListener(actionListener);
    }

    private static void showComponentTemporarily(Label label, Frame frame, int time) {
        // Show the label
        label.setVisible(true);

        // Create a timer to hide the label after 3 seconds (3000 milliseconds)
        Timer timer = new Timer(time, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                label.setVisible(false);

                // Revalidate and repaint the frame to update the display
                frame.revalidate();
                frame.repaint();
            }
        });
        timer.setRepeats(false); // Only execute once
        timer.start();

        // Revalidate and repaint the frame to update the display
        frame.revalidate();
        frame.repaint();
    }

    private static void showComponentTemporarily(Frame frame, int time, String colorname) {
        switch (colorname) {
            case "red":
                frame.setBackground(Color.red);
                break;
            case "green":
                frame.setBackground(Color.green);
            default:
                break;
        }
        Timer timer = new Timer(time, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                frame.setBackground(Color.WHITE);
                frame.revalidate();
                frame.repaint();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}
