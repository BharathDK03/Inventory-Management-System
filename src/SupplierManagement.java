import javax.swing.*;
import java.awt.*;

public class SupplierManagement extends JPanel {

    SupplierManagement() {

        setLayout(new GridLayout(3, 1, 20, 20));

        add(createCard("Dell Supplier"));

        add(createCard("HP Supplier"));

        add(createCard("Logitech Supplier"));
    }

    JPanel createCard(String name) {

        JPanel panel = new JPanel();

        panel.setBackground(Color.WHITE);

        panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel(name);

        label.setFont(new Font("Arial", Font.BOLD, 20));

        JButton btn = new JButton("Order Stock");

        btn.addActionListener(e -> {

            JOptionPane.showMessageDialog(null,
                    "Stock Ordered Successfully");
        });

        panel.add(label, BorderLayout.CENTER);

        panel.add(btn, BorderLayout.SOUTH);

        return panel;
    }
}