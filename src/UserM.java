/* import javax.swing.*;
import java.awt.event.*;

public class UserM extends JFrame implements ActionListener {
    private User user;
    private JLabel nameLabel, emailLabel, phoneLabel;
    private JTextField nameField, emailField, phoneField;
    private JButton userInfoButton, updateButton;

    public UserM(User user) {
        this.user = user;

        setTitle("User Account");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        nameLabel = new JLabel("Name: " + user.getName());
        nameLabel.setBounds(30, 20, 200, 25);
        add(nameLabel);

        userInfoButton = new JButton("User Info");
        userInfoButton.setBounds(30, 50, 120, 30);
        userInfoButton.addActionListener(this);
        add(userInfoButton);

        emailLabel = new JLabel("Email: ");
        emailLabel.setBounds(30, 100, 80, 25);
        add(emailLabel);

        emailField = new JTextField(user.getEmail());
        emailField.setBounds(120, 100, 200, 25);
        add(emailField);

        phoneLabel = new JLabel("Phone: ");
        phoneLabel.setBounds(30, 140, 80, 25);
        add(phoneLabel);

        phoneField = new JTextField(user.getPhoneNumber());
        phoneField.setBounds(120, 140, 200, 25);
        add(phoneField);

        updateButton = new JButton("Update");
        updateButton.setBounds(150, 180, 100, 30);
        updateButton.addActionListener(this);
        add(updateButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == userInfoButton) {
            JOptionPane.showMessageDialog(this,
                    "Name: " + user.getName() + "\n" +
                            "Email: " + user.getEmail() + "\n" +
                            "Phone: " + user.getPhoneNumber(),
                    "User Info", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == updateButton) {
            String newEmail = emailField.getText();
            String newPhone = phoneField.getText();

            user.setEmail(newEmail);
            user.setPhoneNumber(newPhone);

            JOptionPane.showMessageDialog(this, "Details updated successfully!", "Update", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        User user = new User("username", "password", "email@example.com", "123456789", "John Doe", 12345, "Male", 987654321, "Nationality");
        new UserM (user);
    }
} /*




 /*  import javax.swing.*;
import java.awt.event.*;
public class UserM extends JFrame implements ActionListener {
    private JTextField nameField, emailField, phoneField;
    private JButton updateButton;
    private User user; // Assuming you have a User object

    public UserM(User user) {
        this.user = user;

        setTitle("User Information");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 80, 25);
        add(nameLabel);

        nameField = new JTextField(user.getName());
        nameField.setBounds(120, 30, 200, 25);
        add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 70, 80, 25);
        add(emailLabel);

        emailField = new JTextField(user.getEmail());
        emailField.setBounds(120, 70, 200, 25);
        add(emailField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(30, 110, 80, 25);
        add(phoneLabel);

        phoneField = new JTextField(user.getPhoneNumber());
        phoneField.setBounds(120, 110, 200, 25);
        add(phoneField);

        updateButton = new JButton("Update");
        updateButton.setBounds(150, 150, 100, 30);
        updateButton.addActionListener(this);
        add(updateButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == updateButton) {
            String newName = nameField.getText();
            String newEmail = emailField.getText();
            String newPhone = phoneField.getText();

            user.setName(newName);
            user.setEmail(newEmail);
            user.setPhoneNumber(newPhone);

            // Perform actions to update user object or database
            // For example: user.updateName(newName); user.updateEmail(newEmail);
            // You can add your logic here to update the user data
        }
    }

    public static void main(String[] args) {
        // Create a User object
        User user = new User("username", "password", "email@example.com", "123456789", "John Doe", 12345, "Male", 987654321, "Nationality");

        // Create and display the GUI
        new UserM(user);
    }
}
*/