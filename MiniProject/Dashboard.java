import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

class FoodItem
{
    String name;
    int price;
    int quantity;

    FoodItem(String name, int price)
    {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }
}

public class Dashboard extends JFrame
{
    JPanel itemPanel;
    JTable cart;
    DefaultTableModel tableModel;
    JButton bill, clear;

    FoodItem items[] = {
        /* 0->3 */
        new FoodItem("Vada Pav",16),
        new FoodItem("Samosa Pav",20),
        new FoodItem("Misal Pav",50),
        new FoodItem("Bhaji Pav",20),
        // add fast food here
        /* 4->6 */
        new FoodItem("Upma",35),
        new FoodItem("Poha",35),
        new FoodItem("Sabudana Vada",40),
        // add snacks here
        /* 7->10 */
        new FoodItem("Idli Sambar",30),
        new FoodItem("Medu Vada",40),
        new FoodItem("Sada Dosa",40),
        new FoodItem("Masala Dosa",50),
        // add south Indian item here
    };

    JButton buttons[] = new JButton[items.length];

    Dashboard()
    {
        this.setLayout(new BorderLayout());
        itemPanel = new JPanel();
        itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.Y_AXIS));

        // fast food
        JLabel fastFoodLabel = new JLabel("Fast Food");
        fastFoodLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel fastFoodPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        buttons[0] = createImageButton(items[0],"imgs\\vadapav.jpg");
        buttons[1] = createImageButton(items[1],"imgs\\samosapav.jpg");
        buttons[2] = createImageButton(items[2],"imgs\\misalpav.jpg");
        buttons[3] = createImageButton(items[3],"imgs\\bhajipav.jpg");

        fastFoodPanel.add(buttons[0]);
        fastFoodPanel.add(buttons[1]);
        fastFoodPanel.add(buttons[2]);
        fastFoodPanel.add(buttons[3]);

        // snacks
        JLabel snacksLabel = new JLabel("Snacks");
        snacksLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel snacksPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        buttons[4] = createImageButton(items[4],"imgs\\upma.jpg");
        buttons[5] = createImageButton(items[5],"imgs\\poha.jpg");
        buttons[6] = createImageButton(items[6],"imgs\\sabudanavada.jpg");

        snacksPanel.add(buttons[4]);
        snacksPanel.add(buttons[5]);
        snacksPanel.add(buttons[6]);

        // south Indian
        JLabel southLabel = new JLabel("South Indian");
        southLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        buttons[7] = createImageButton(items[7],"imgs\\idlisambar.jpg");
        buttons[8] = createImageButton(items[8],"imgs\\meduvada.jpg");
        buttons[9] = createImageButton(items[9],"imgs\\sadadosa.jpg");
        buttons[10] = createImageButton(items[10],"imgs\\masaladosa.jpg");

        southPanel.add(buttons[7]);
        southPanel.add(buttons[8]);
        southPanel.add(buttons[9]);
        southPanel.add(buttons[10]);

        itemPanel.add(fastFoodLabel);
        itemPanel.add(fastFoodPanel);
        itemPanel.add(snacksLabel);
        itemPanel.add(snacksPanel);
        itemPanel.add(southLabel);
        itemPanel.add(southPanel);

        // cart
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Item");
        tableModel.addColumn("Price");
        tableModel.addColumn("Qty");
        tableModel.addColumn("Total");

        cart = new JTable(tableModel);

        JPanel cartPanel = new JPanel(new BorderLayout());
        cartPanel.add(new JScrollPane(cart), BorderLayout.CENTER);

        bill = new JButton("Generate Bill");
        clear = new JButton("Clear Cart");

        JPanel bottom = new JPanel();
        bottom.add(bill);
        bottom.add(clear);

        cartPanel.add(bottom, BorderLayout.SOUTH);
        cartPanel.setPreferredSize(new Dimension(350,0));

        // qty ++
        for(int i=0;i<items.length;i++)
        {
            int c = i;
            buttons[i].addActionListener(e -> {
                items[c].quantity++;
                updateCart();
            });
        }

        // bill event
        bill.addActionListener(e -> generateBill());

        // cart event
        clear.addActionListener(e -> clearCart());

        this.add(itemPanel, BorderLayout.CENTER);
        this.add(cartPanel, BorderLayout.EAST);

        this.setTitle("Food Ordering System");
        this.setSize(1000,600);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // create button
    JButton createButton(FoodItem item)
    {
        JButton btn = new JButton(item.name+" ₹"+item.price);
        btn.setFont(new Font("Arial", Font.BOLD, 14));
        return btn;
    }

    // create image button
    JButton createImageButton(FoodItem item, String path)
    {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage().getScaledInstance(80,80,Image.SCALE_SMOOTH);
        ImageIcon resized = new ImageIcon(img);

        JButton btn = new JButton(item.name+" ₹"+item.price,resized);
        btn.setHorizontalAlignment(JButton.CENTER);
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.BOTTOM);

        return btn;
    }

    // update cart
    void updateCart()
    {
        tableModel.setRowCount(0); // clear table
        int total=0;
        for(int i=0;i<items.length;i++)
        {
            FoodItem item = items[i];
            if(item.quantity>0)
            {
                int itemTotal = item.quantity * item.price;
                total += itemTotal;
                tableModel.addRow(new Object[]{item.name,item.price,item.quantity,itemTotal});
            }
        }

        // Add total row
        tableModel.addRow(new Object[]{"","","Total", total});
    }

    // Generate bill
    void generateBill()
    {
        JOptionPane.showMessageDialog(this,"Bill Generated!\nCheck table for details.");
    }

    // Clear cart
    void clearCart()
    {
        for(int i=0;i<items.length;i++)
        {
            items[i].quantity = 0;
        }
        tableModel.setRowCount(0);
    }
}