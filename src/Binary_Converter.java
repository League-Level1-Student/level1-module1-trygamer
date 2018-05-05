import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Converter implements ActionListener {
	
	static JFrame f = new JFrame();
	static JPanel p = new JPanel();
	static JButton c =new JButton();
	static JTextField answer = new JTextField(20);
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
	
	public void j() {
		
		f.setTitle("Binary");
		
		f.add(p);
		f.setVisible(true);
		
		c.setText("converter");
		c.addActionListener(this);
		p.add(answer);
		p.add(c);
	
		f.pack();
	
	}
	
	
	public static void main(String[] args) {
		
		Binary_Converter hi =new Binary_Converter();
		
		hi.j();
		
	}
	public void actionPerformed(ActionEvent e) {
		
	String text =answer.getText();
	
	System.out.println(convert(text));
		
		
		
		
		
	}
	}

