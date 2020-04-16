import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;

public class ButtonEventExam2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonEventExam2 frame = new ButtonEventExam2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonEventExam2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("red");
		btnNewButton.setHorizontalAlignment(SwingConstants.TRAILING);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("orange");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("yellow");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("green");
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("blue");
		contentPane.add(btnNewButton_3);
	}

}
