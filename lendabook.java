package project;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Window;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class lendabook {
private JFrame frame;
private JTextField textField;
private JTextField textField_3;
23
private JTextField textField_1;
private JTextField textField_4;
private JTextField textField_2;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
lendabook window = new lendabook();
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
public lendabook() {
24
initialize();
}
/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setBackground(new Color(255, 255, 128));
frame.setBounds(100, 100, 737, 444);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
JLabel lblEnterTheReaders = new JLabel("Enter the Reader's Details");
lblEnterTheReaders.setHorizontalAlignment(SwingConstants.CENTER);
lblEnterTheReaders.setFont(new Font("Tahoma", Font.BOLD, 15));
lblEnterTheReaders.setBounds(129, 26, 372, 29);
frame.getContentPane().add(lblEnterTheReaders);
JLabel lblBookId = new JLabel("Book Id");
lblBookId.setHorizontalAlignment(SwingConstants.CENTER);
lblBookId.setFont(new Font("Tahoma", Font.BOLD, 15));
lblBookId.setBounds(84, 84, 161, 29);
25
frame.getContentPane().add(lblBookId);
JLabel lblBookName = new JLabel("Book Name");
lblBookName.setHorizontalAlignment(SwingConstants.CENTER);
lblBookName.setFont(new Font("Tahoma", Font.BOLD, 15));
lblBookName.setBounds(84, 138, 161, 29);
frame.getContentPane().add(lblBookName);
JLabel lblReadersName_1 = new JLabel("Reader's Name");
lblReadersName_1.setHorizontalAlignment(SwingConstants.CENTER);
lblReadersName_1.setFont(new Font("Tahoma", Font.BOLD, 15));
lblReadersName_1.setBounds(84, 192, 161, 29);
frame.getContentPane().add(lblReadersName_1);
textField = new JTextField();
textField.setFont(new Font("Tahoma", Font.BOLD, 15));
textField.setColumns(10);
textField.setBounds(254, 86, 280, 29);
frame.getContentPane().add(textField);
JLabel lblIssueDate = new JLabel("Issue Date");
lblIssueDate.setHorizontalAlignment(SwingConstants.CENTER);
lblIssueDate.setFont(new Font("Tahoma", Font.BOLD, 15));
26
lblIssueDate.setBounds(84, 250, 161, 29);
frame.getContentPane().add(lblIssueDate);
JButton btn1 = new JButton("Issue");
btn1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String s="Book Issued Successfully to "+textField_1.getText()+"!\nBook Name:
"+textField_3.getText()+"\nIssue Date: "+textField_4.getText()+"\nReturn Date:
"+textField_2.getText();
JOptionPane.showMessageDialog(frame,s);
}
});
btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
btn1.setBounds(176, 365, 103, 29);
frame.getContentPane().add(btn1);
textField_3 = new JTextField();
textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_3.setColumns(10);
textField_3.setBounds(255, 138, 280, 29);
frame.getContentPane().add(textField_3);
textField_1 = new JTextField();
27
textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_1.setColumns(10);
textField_1.setBounds(254, 192, 280, 29);
frame.getContentPane().add(textField_1);
textField_4 = new JTextField();
textField_4.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_4.setColumns(10);
textField_4.setBounds(254, 250, 280, 29);
frame.getContentPane().add(textField_4);
JLabel lblReturnDate = new JLabel("Return Date");
lblReturnDate.setHorizontalAlignment(SwingConstants.CENTER);
lblReturnDate.setFont(new Font("Tahoma", Font.BOLD, 15));
lblReturnDate.setBounds(84, 303, 161, 29);
frame.getContentPane().add(lblReturnDate);
textField_2 = new JTextField();
textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
textField_2.setColumns(10);
textField_2.setBounds(254, 303, 280, 29);
frame.getContentPane().add(textField_2);
28
JButton btn2 = new JButton("Cancel");
btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
btn2.setBounds(371, 365, 103, 29);
frame.getContentPane().add(btn2);
}
public JFrame getFrame() {
// TODO Auto-generated method stub
return frame;
}
}
