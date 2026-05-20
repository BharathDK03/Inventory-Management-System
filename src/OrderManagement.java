import javax.swing.*;
import java.awt.*;

public class OrderManagement extends JPanel {

    OrderManagement() {

        setLayout(new BorderLayout());

        JLabel title = new JLabel("Orders");

        title.setFont(new Font("Arial", Font.BOLD, 28));

        add(title, BorderLayout.NORTH);

        String columns[] = {
                "Order ID",
                "Product",
                "Quantity"
        };

        String data[][] = {
                { "1", "Laptop", "2" },
                { "2", "Mouse", "5" }
        };

        JTable table = new JTable(data, columns);

        JScrollPane pane = new JScrollPane(table);

        add(pane, BorderLayout.CENTER);
    }
}