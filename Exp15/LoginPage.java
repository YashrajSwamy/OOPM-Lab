import javax.swing.*;

class LPage extends JFrame
{
    JLabel userName;
    JLabel password;
    JTextField user;
    JPasswordField pass;
    JButton login;
    JButton close;
    LPage()
    {
        userName = new JLabel("Username: ");
        userName.setBounds(200,200,100,30);
        password = new JLabel("Password: ");
        password.setBounds(200,250,100,30);

        user = new JTextField();
        user.setBounds(270,200,120,30);

        pass = new JPasswordField();
        pass.setBounds(270,250,120,30);

        login = new JButton("Login");
        login.setBounds(200,300,80,30);
        login.addActionListener(e->{
            if (user.getText().equals("Yashraj") && String.valueOf(pass.getPassword()).equals("171")) 
            {
                JOptionPane.showMessageDialog(this,"Login Successful\n"+"Welcome "+user.getText(),"Success",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Credentials","Invalid Credentials",JOptionPane.ERROR_MESSAGE);
            }
        });
        
        close = new JButton("Close");
        close.setBounds(310,300,80,30);
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
		this.setTitle("Login Page");
        this.setResizable(false);
        this.setVisible(true);
    }
}

public class LoginPage
{
    public static void main(String[] args)
    {
        LPage loginPage = new LPage();
    }
}