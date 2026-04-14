import javax.swing.*;
import java.awt.event.*;


public class LoginPage extends JFrame
{
    JLabel userName;
    JLabel password;
    JTextField user;
    JPasswordField pass;
    JButton login;
    JButton close;
    LoginPage()
    {
        userName = new JLabel("Username: ");
        userName.setBounds(200,100,100,30);
        password = new JLabel("Password: ");
        password.setBounds(200,150,100,30);

        user = new JTextField();
        user.setBounds(270,100,120,30);

        pass = new JPasswordField();
        pass.setBounds(270,150,120,30);

        login = new JButton("Login");
        login.setBounds(200,200,80,30);
        login.addActionListener(e->{
            if (user.getText().equals("a") && String.valueOf(pass.getPassword()).equals("a")) 
            {
                new Dashboard();
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Credentials","Invalid Credentials",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        close = new JButton("Close");
        close.setBounds(310,200,80,30);
        close.addActionListener(e->{
            this.dispose();
        });
        
        this.add(userName);
        this.add(user);
        this.add(password);
        this.add(pass);
        this.add(login);
        this.add(close);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600,600);
        this.setVisible(true);
    }
}