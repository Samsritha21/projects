package project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainpage {
    private JFrame frame;
    private Addnewbook ab;
    private LendABook lb;  // Fixed class name to follow Java naming conventions
    private SearchABook sb;  // Fixed class name to follow Java naming conventions

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Mainpage window = new Mainpage();
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
    public Mainpage() {
        initialize();
    }

    public void showab() {
        ab = new Addnewbook();
        ab.getFrame().setVisible(true);
    }

    public void showlb() {
        lb = new LendABook();  // Fixed class name
        lb.getFrame().setVisible(true);
    }

    public void showsb() {
        sb = new SearchABook();  // Fixed class name
        sb.getFrame().setVisible(true);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 255, 255));
        frame.setBounds(100, 100, 845, 453);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btn1 = new JButton("Add New Book");  // Removed extra \r\n
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showab();
            }
        });
        btn1.setForeground(new Color(0, 0, 0));
        btn1.setBackground(new Color(255, 255, 128));
        btn1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn1.setBounds(302, 116, 220, 34);
        frame.getContentPane().add(btn1);

        JButton btn2 = new JButton("Lend a Book");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showlb();
            }
        });
        btn2.setBackground(new Color(255, 255, 128));
        btn2.setForeground(new Color(0, 0, 0));
        btn2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn2.setBounds(302, 187, 220, 34);
        frame.getContentPane().add(btn2);

        JButton btn3 = new JButton("Search a Book");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showsb();
            }
        });
        btn3.setBackground(new Color(255, 255, 128));
        btn3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btn3.setBounds(302, 267, 220, 34);
        frame.getContentPane().add(btn3);

        JLabel lblNewLabel = new JLabel("DASHBOARD");
        lblNewLabel.setForeground(new Color(0, 64, 128));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel.setBounds(273, 29, 287, 42);
        frame.getContentPane().add(lblNewLabel);
    }
    
    // Added getter for frame to be consistent with other classes
    public JFrame getFrame() {
        return frame;
    }
}
