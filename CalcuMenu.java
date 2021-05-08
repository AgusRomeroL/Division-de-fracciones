import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CalcuMenu extends JFrame {

	private JPanel contentPane;
	private JTextField nume0;
	private JTextField deno0;
	private JTextField nume1;
	private JTextField deno1;
	private JButton resta;
	private JButton multiplicacion;
	private JButton division;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcuMenu frame = new CalcuMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CalcuMenu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton suma = new JButton(" +");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num0 =Integer.parseInt(nume0.getText());
				int num1 =Integer.parseInt(nume1.getText());
				int den0 =Integer.parseInt(deno0.getText());
				int den1 =Integer.parseInt(deno1.getText());
				Suma llamada = new Suma();
				llamada.AddFraction(num0,num1,den0,den1);
			}
		});
		suma.setBounds(41, 120, 48, 23);
		contentPane.add(suma);
		
		nume0 = new JTextField();
		nume0.setBounds(31, 31, 86, 20);
		contentPane.add(nume0);
		nume0.setColumns(10);
		
		deno0 = new JTextField();
		deno0.setBounds(31, 64, 86, 20);
		contentPane.add(deno0);
		deno0.setColumns(10);
		
		nume1 = new JTextField();
		nume1.setBounds(155, 31, 86, 20);
		contentPane.add(nume1);
		nume1.setColumns(10);
		
		deno1 = new JTextField();
		deno1.setBounds(152, 64, 86, 20);
		contentPane.add(deno1);
		deno1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NUMERADOR 1");
		lblNewLabel.setBounds(31, 21, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DENOMINADOR 1");
		lblNewLabel_1.setBounds(31, 84, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("NUMERADOR 2");
		lblNewLabel_3.setBounds(155, 21, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DENOMINADOR 2");
		lblNewLabel_4.setBounds(155, 84, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		resta = new JButton(" -");
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num0 =Integer.parseInt(nume0.getText());
				int num1 =Integer.parseInt(nume1.getText());
				int den0 =Integer.parseInt(deno0.getText());
				int den1 =Integer.parseInt(deno1.getText());
				 Resta llamada=new  Resta();
					llamada.AddFraction(num0,num1,den0,den1);
			}
		});
		resta.setBounds(41, 161, 48, 23);
		contentPane.add(resta);
		
		multiplicacion = new JButton(" *");
		multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num0 =Integer.parseInt(nume0.getText());
				int num1 =Integer.parseInt(nume1.getText());
				int den0 =Integer.parseInt(deno0.getText());
				int den1 =Integer.parseInt(deno1.getText());
			 Multiplicacion llamada = new  Multiplicacion();
				llamada.AddFraction(num0,num1,den0,den1);
			}
		});
		multiplicacion.setBounds(109, 120, 48, 23);
		contentPane.add(multiplicacion);
		
		division = new JButton(" /");
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num0 =Integer.parseInt(nume0.getText());
				int num1 =Integer.parseInt(nume1.getText());
				int den0 =Integer.parseInt(deno0.getText());
				int den1 =Integer.parseInt(deno1.getText());
				 Division llamada=new   Division();
					llamada.AddFraction(num0,num1,den0,den1);
				
			}
		});
		division.setBounds(109, 161, 48, 23);
		contentPane.add(division);
		
		JLabel lblNewLabel_2 = new JLabel("CALCULADORA");
		lblNewLabel_2.setBounds(107, 0, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nume0.setText("");
				nume1.setText("");
				deno0.setText("");
				deno1.setText("");
			}
		});
		btnNewButton.setBounds(168, 120, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Historial");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Historial llamada=new   Historial();
					llamada.mostrar();
			}
		});
		btnNewButton_1.setBounds(168, 161, 89, 23);
		contentPane.add(btnNewButton_1);
		
	}
}