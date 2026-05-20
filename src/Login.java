import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    JTextField username;
    JPasswordField password;
    JButton loginBtn;

    Login() {

        setTitle("Inventory Login");

        setSize(400, 300);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setBackground(new Color(30, 41, 59));

        panel.setLayout(null);

        JLabel title = new JLabel("Inventory System");

        title.setForeground(Color.WHITE);

        title.setFont(new Font("Arial", Font.BOLD, 24));

        title.setBounds(90, 30, 250, 30);

        panel.add(title);

        JLabel userLabel = new JLabel("Username");

        userLabel.setForeground(Color.WHITE);

        userLabel.setBounds(50, 90, 100, 30);

        panel.add(userLabel);

        username = new JTextField();

        username.setBounds(150, 90, 180, 30);

        panel.add(username);

        JLabel passLabel = new JLabel("Password");

        passLabel.setForeground(Color.WHITE);

        passLabel.setBounds(50, 140, 100, 30);

        panel.add(passLabel);

        password = new JPasswordField();

        password.setBounds(150, 140, 180, 30);

        panel.add(password);

        loginBtn = new JButton("Login");

        loginBtn.setBounds(140, 200, 120, 40);

        loginBtn.setBackground(new Color(37, 99, 235));

        loginBtn.setForeground(Color.WHITE);

        panel.add(loginBtn);

        loginBtn.addActionListener(e -> {

            String user = username.getText();

            String pass = new String(password.getPassword());

            if (user.equals("admin") && pass.equals("admin")) {

                new Dashboard();

                dispose();

            } else {

                JOptionPane.showMessageDialog(null,
                        "Invalid Login");

            }
        });

        add(panel);

        setVisible(true);
    }
}