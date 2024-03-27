
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class LoginForm extends JFrame implements ActionListener {
    private JTextField emailField, passwordField;

    public LoginForm() {
        setTitle("Formulario de Login");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JTextField();

        JButton registrarButton = new JButton("Registrar");
        registrarButton.addActionListener(this);

        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(registrarButton);

        add(panel);
    }

  public void actionPerformed(ActionEvent e) {
    String email = emailField.getText();
    String password = passwordField.getText();

    if (email.equals("alumno@ulp.edu.ar") && password.equals("12345678")) {
        JOptionPane.showMessageDialog(this, "¡Bienvenido!");
    } else {
        JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos");
    }
}
  
  

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginForm form = new LoginForm();
            form.setVisible(true);
        });
    }
}