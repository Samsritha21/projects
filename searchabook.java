package project;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
29
public class searchabook {
private JFrame frame;
private JTextField textField;
private JTextField textField_1;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
searchabook window = new searchabook();
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
public searchabook() {
30
initialize();
}
public JFrame getFrame() {
return frame;
}
/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setBackground(new Color(255, 255, 128));
frame.setBounds(100, 100, 771, 449);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
JLabel lblEnterTheBook = new JLabel("Enter the Book Details");
lblEnterTheBook.setHorizontalAlignment(SwingConstants.CENTER);
lblEnterTheBook.setFont(new Font("Tahoma", Font.BOLD, 15));
lblEnterTheBook.setBounds(184, 46, 372, 29);
frame.getContentPane().add(lblEnterTheBook);
JLabel lblBookId = new JLabel("Book Id");
lblBookId.setHorizontalAlignment(SwingConstants.CENTER);
31
lblBookId.setFont(new Font("Tahoma", Font.BOLD, 15));
lblBookId.setBounds(92, 115, 161, 29);
frame.getContentPane().add(lblBookId);
JLabel lblBookName = new JLabel("Book Name");
lblBookName.setHorizontalAlignment(SwingConstants.CENTER);
lblBookName.setFont(new Font("Tahoma", Font.BOLD, 15));
lblBookName.setBounds(92, 175, 161, 29);
frame.getContentPane().add(lblBookName);
textField = new JTextField();
textField.setFont(new Font("Tahoma", Font.BOLD, 15));
textField.setColumns(10);
textField.setBounds(263, 115, 280, 29);
frame.getContentPane().add(textField);
textField_1 = new JTextField();
textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_1.setColumns(10);
textField_1.setBounds(263, 175, 280, 29);
frame.getContentPane().add(textField_1);
JButton btn1 = new JButton("Search");
32
btn1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
}
});
btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
btn1.setBounds(239, 247, 103, 29);
frame.getContentPane().add(btn1);
JButton btn2 = new JButton("Close");
btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
btn2.setBounds(402, 247, 103, 29);
frame.getContentPane().add(btn2);
}
}
