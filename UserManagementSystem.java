import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserManagementSystem {
    private JFrame frame;
    private JTextField searchField;
    private JButton searchButton;
    private JTextField userIdField;
    private JTextField nameField;
    private JTextField contactInfoField;
    private JTextField fineBalanceField;
    private JButton addUserButton;
    private JTable resultTable;

    public UserManagementSystem() {
        frame = new JFrame("User Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel userPanel = new JPanel();
        userPanel.setLayout(new BorderLayout());

        JPanel searchPanel = new JPanel();
        searchField = new JTextField(20);
        searchButton = new JButton("Search");
        searchPanel.add(new JLabel("Search: "));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        userIdField = new JTextField(20);
        nameField = new JTextField(20);
        contactInfoField = new JTextField(20);
        fineBalanceField = new JTextField(20);

        inputPanel.add(new JLabel("User ID: "));
        inputPanel.add(userIdField);
        inputPanel.add(new JLabel("Name: "));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Contact Info: "));
        inputPanel.add(contactInfoField);
        inputPanel.add(new JLabel("Fine Balance: "));
        inputPanel.add(fineBalanceField);

        addUserButton = new JButton("Add User");

        JPanel userInputPanel = new JPanel();
        userInputPanel.setLayout(new BorderLayout());
        userInputPanel.add(inputPanel, BorderLayout.CENTER);
        userInputPanel.add(addUserButton, BorderLayout.SOUTH);

        JPanel resultPanel = new JPanel();
        resultTable = new JTable(10, 2);
        resultPanel.add(new JScrollPane(resultTable));

        userPanel.add(searchPanel, BorderLayout.NORTH);
        userPanel.add(userInputPanel, BorderLayout.WEST);
        userPanel.add(resultPanel, BorderLayout.CENTER);

        frame.add(userPanel);
        frame.setVisible(true);

        // Add action listeners here for searchButton and addUserButton
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement search functionality
            }
        });

        addUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement add user functionality
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new UserManagementSystem();
            }
        });
    }
}

