import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ProductManagement extends JPanel {

    ProductManagement() {

        setLayout(new BorderLayout());

        JLabel title = new JLabel("Products");

        title.setFont(new Font("Arial", Font.BOLD, 28));

        add(title, BorderLayout.NORTH);

        JPanel productsPanel = new JPanel();

        productsPanel.setLayout(new GridLayout(3, 1, 20, 20));

        productsPanel.setBackground(new Color(241, 245, 249));

        productsPanel.add(createProductCard(
                "Laptop",
                10,
                "Dell Supplier"));

        productsPanel.add(createProductCard(
                "Mouse",
                50,
                "HP Supplier"));

        productsPanel.add(createProductCard(
                "Keyboard",
                30,
                "Logitech Supplier"));

        JScrollPane pane = new JScrollPane(productsPanel);

        add(pane, BorderLayout.CENTER);
    }

    JPanel createProductCard(
            String name,
            int stock,
            String supplier) {

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(4, 1));

        panel.setBackground(Color.WHITE);

        panel.setBorder(BorderFactory.createLineBorder(
                Color.LIGHT_GRAY));

        JLabel productName = new JLabel(name);

        productName.setFont(new Font(
                "Arial",
                Font.BOLD,
                22));

        JLabel stockLabel = new JLabel(
                "Stock: " + stock);

        JLabel supplierLabel = new JLabel(
                "Supplier: " + supplier);

        JButton orderBtn = new JButton(
                "Customer Order");

        orderBtn.setBackground(
                new Color(37, 99, 235));

        orderBtn.setForeground(Color.WHITE);

        orderBtn.addActionListener(new ActionListener() {

            int currentStock = stock;

            public void actionPerformed(ActionEvent e) {

                if (currentStock > 0) {

                    currentStock--;

                    stockLabel.setText(
                            "Stock: " + currentStock);

                    JOptionPane.showMessageDialog(
                            null,
                            "Order Placed Successfully");

                } else {

                    JOptionPane.showMessageDialog(
                            null,
                            "Out Of Stock");

                }
            }
        });

        panel.add(productName);

        panel.add(stockLabel);

        panel.add(supplierLabel);

        panel.add(orderBtn);

        return panel;
    }
}