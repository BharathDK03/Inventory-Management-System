import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    JPanel sidebar;
    JPanel content;

    Dashboard() {

        setTitle("Inventory Dashboard");

        setSize(1200, 700);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        sidebar = new JPanel();

        sidebar.setBackground(new Color(30, 41, 59));

        sidebar.setPreferredSize(new Dimension(220, 700));

        sidebar.setLayout(new GridLayout(10, 1, 10, 10));

        JButton products = new JButton("Products");

        JButton suppliers = new JButton("Suppliers");

        JButton orders = new JButton("Orders");

        styleButton(products);

        styleButton(suppliers);

        styleButton(orders);

        sidebar.add(products);

        sidebar.add(suppliers);

        sidebar.add(orders);

        content = new JPanel();

        content.setBackground(new Color(241, 245, 249));

        add(sidebar, BorderLayout.WEST);

        add(content, BorderLayout.CENTER);

        products.addActionListener(e -> {

            content.removeAll();

            content.add(new ProductManagement());

            content.revalidate();

            content.repaint();
        });

        suppliers.addActionListener(e -> {

            content.removeAll();

            content.add(new SupplierManagement());

            content.revalidate();

            content.repaint();
        });

        orders.addActionListener(e -> {

            content.removeAll();

            content.add(new OrderManagement());

            content.revalidate();

            content.repaint();
        });

        setVisible(true);
    }

    void styleButton(JButton btn) {

        btn.setBackground(new Color(51, 65, 85));

        btn.setForeground(Color.WHITE);

        btn.setFocusPainted(false);

        btn.setFont(new Font("Arial", Font.BOLD, 16));
    }
}