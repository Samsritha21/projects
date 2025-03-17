package project;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Addnewbook {
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Addnewbook window = new Addnewbook();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public JFrame getFrame() {
        return frame;
    }

    public Addnewbook() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(255, 255, 128));
        frame.setBounds(100, 100, 780, 435);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Enter the New Book Details");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(129, 28, 372, 29);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblBookId = new JLabel("Book Id");
        lblBookId.setHorizontalAlignment(SwingConstants.CENTER);
        lblBookId.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblBookId.setBounds(83, 94, 161, 29);
        frame.getContentPane().add(lblBookId);

        JLabel lblBookName = new JLabel("Book Name");
        lblBookName.setHorizontalAlignment(SwingConstants.CENTER);
        lblBookName.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblBookName.setBounds(83, 149, 161, 29);
        frame.getContentPane().add(lblBookName);

        JLabel lblBookAuthor = new JLabel("Book Author");
        lblBookAuthor.setHorizontalAlignment(SwingConstants.CENTER);
        lblBookAuthor.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblBookAuthor.setBounds(83, 208, 161, 29);
        frame.getContentPane().add(lblBookAuthor);

        JLabel lblBookPrice = new JLabel("Book Price");
        lblBookPrice.setHorizontalAlignment(SwingConstants.CENTER);
        lblBookPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblBookPrice.setBounds(83, 270, 161, 29);
        frame.getContentPane().add(lblBookPrice);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 15));
        textField.setBounds(270, 94, 280, 29);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        textField_1.setColumns(10);
        textField_1.setBounds(270, 149, 280, 29);
        frame.getContentPane().add(textField_1);

        textField_2 = new JTextField();
        textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        textField_2.setColumns(10);
        textField_2.setBounds(270, 208, 280, 29);
        frame.getContentPane().add(textField_2);

        textField_3 = new JTextField();
        textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
        textField_3.setColumns(10);
        textField_3.setBounds(270, 270, 280, 29);
        frame.getContentPane().add(textField_3);

        JButton btnAdd = new JButton("Add");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s="New Book Added Successfully!\nBook Name: "+textField_1.getText();
                JOptionPane.showMessageDialog(frame,s);
            }
        });
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnAdd.setBounds(180, 337, 103, 29);
        frame.getContentPane().add(btnAdd);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnCancel.setBounds(383, 337, 103, 29);
        frame.getContentPane().add(btnCancel);
    }
}
