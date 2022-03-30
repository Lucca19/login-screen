import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;

public class login extends JFrame {

    private JPanel contentPane;
    private JTextField txtLoginC;
    private JButton btnCancel;
    private JPasswordField txtSenhaC;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login frame = new login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLUE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnEnter = new JButton("ENTER");
        btnEnter.setFont(new Font("Arial Black", Font.PLAIN, 11));
        btnEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnEnter.setBounds(223, 216, 89, 23);
        contentPane.add(btnEnter);

        btnCancel = new JButton("CANCEL");
        btnCancel.setFont(new Font("Arial Black", Font.PLAIN, 11));
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnCancel.setForeground(Color.RED);
        btnCancel.setBounds(124, 216, 89, 23);
        contentPane.add(btnCancel);

        JLabel lblNewLabel = new JLabel("Senha");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 13));
        lblNewLabel.setBounds(95, 119, 62, 20);
        contentPane.add(lblNewLabel);

        txtLoginC = new JTextField();
        txtLoginC.setBounds(167, 80, 122, 20);
        contentPane.add(txtLoginC);
        txtLoginC.setColumns(10);

        JLabel lblNewLabel2 = new JLabel("Login");
        lblNewLabel2.setForeground(Color.BLACK);
        lblNewLabel2.setFont(new Font("Arial Black", Font.PLAIN, 13));
        lblNewLabel2.setBounds(95, 80, 62, 23);
        contentPane.add(lblNewLabel2);

        JCheckBox txtExibirSenha = new JCheckBox("Exibir Senha");
        txtExibirSenha.setBackground(Color.BLUE);
        txtExibirSenha.setBounds(167, 146, 97, 23);
        contentPane.add(txtExibirSenha);

        txtSenhaC = new JPasswordField();

        txtExibirSenha.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent arg0) {

                if (txtExibirSenha.isSelected()) {
                    txtSenhaC.setEchoChar((char) 0);

                } else {

                    txtSenhaC.setEchoChar('*');

                }
            }
        });

        txtSenhaC.setBounds(167, 119, 122, 20);
        contentPane.add(txtSenhaC);

        JLabel logo = new JLabel("");
        logo.setHorizontalAlignment(SwingConstants.CENTER);
        logo.setBounds(299, 11, 125, 99);
        contentPane.add(logo);
    }
}
