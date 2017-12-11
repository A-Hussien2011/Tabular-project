import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TabularCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtDontCare;
	private JTextField txtMinterms;
	private JTextField txtMinterm;
	private JTextField txtDontCares;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabularCalculator frame = new TabularCalculator();
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
	public TabularCalculator() {
		setResizable(false);
		
		JLabel lblMinterms = new JLabel("New label");
		
		txtMinterm = new JTextField();
		txtMinterm.setColumns(10);
		
		JLabel lblDontCares = new JLabel("New label");
		
		txtDontCares = new JTextField();
		txtDontCares.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		
		JLabel lblResult = new JLabel("Result");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(62)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMinterms)
						.addComponent(lblDontCares))
					.addPreferredGap(ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtDontCares, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMinterm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(108))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(142)
					.addComponent(btnCalculate)
					.addContainerGap(203, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(158)
					.addComponent(lblResult)
					.addContainerGap(230, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMinterms)
						.addComponent(txtMinterm, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDontCares)
						.addComponent(txtDontCares, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnCalculate)
					.addGap(18)
					.addComponent(lblResult)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Minterms");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtDontCare = new JTextField();
		txtDontCare.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("DontCares");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		txtMinterms = new JTextField();
		txtMinterms.setColumns(10);
		
		
		
		JLabel lblDisplay = new JLabel("Result");
		lblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisplay.setForeground(new Color(0, 100, 0));
		lblDisplay.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnCalc = new JButton("Calculate");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ones = txtMinterms.getText();
				String DontCares = txtDontCare.getText();
				FinalStageMinimizer obj = new FinalStageMinimizer(ones , DontCares);
				lblDisplay.setText(obj.getMinimizedResult());
			}
		});
		btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(48)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1))
							.addGap(116)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtMinterms, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
								.addComponent(txtDontCare, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(155)
							.addComponent(btnCalc))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblDisplay, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtMinterms, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtDontCare, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnCalc)
					.addGap(18)
					.addComponent(lblDisplay, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
