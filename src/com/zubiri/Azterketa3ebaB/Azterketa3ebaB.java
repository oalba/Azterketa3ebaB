package com.zubiri.Azterketa3ebaB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Azterketa3ebaB extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Azterketa3ebaB frame = new Azterketa3ebaB();
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
	public Azterketa3ebaB() {
		super("CheckBox Odei");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOpcin = new JLabel("Opciones:");
		lblOpcin.setBounds(12, 12, 88, 15);
		contentPane.add(lblOpcin);
		
		JCheckBox chckbxA = new JCheckBox("A");
		chckbxA.setBounds(114, 8, 54, 23);
		contentPane.add(chckbxA);
		
		JCheckBox chckbxB = new JCheckBox("B");
		chckbxB.setBounds(114, 35, 54, 23);
		contentPane.add(chckbxB);
		
		JCheckBox chckbxC = new JCheckBox("C");
		chckbxC.setBounds(114, 62, 54, 23);
		contentPane.add(chckbxC);
		
		JCheckBox chckbxD = new JCheckBox("D");
		chckbxD.setBounds(114, 89, 54, 23);
		contentPane.add(chckbxD);
		
		JCheckBox chckbxE = new JCheckBox("E");
		chckbxE.setBounds(172, 8, 54, 23);
		contentPane.add(chckbxE);
		
		JCheckBox chckbxF = new JCheckBox("F");
		chckbxF.setBounds(172, 35, 54, 23);
		contentPane.add(chckbxF);
		
		JCheckBox chckbxG = new JCheckBox("G");
		chckbxG.setBounds(172, 62, 54, 23);
		contentPane.add(chckbxG);
		
		JCheckBox chckbxH = new JCheckBox("H");
		chckbxH.setBounds(172, 89, 54, 23);
		contentPane.add(chckbxH);
		
		JButton btnOk = new JButton("OK");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Las opciones seleccionadas son: ");
				if (chckbxA.isSelected()){
					System.out.print("A ");
				}
				if (chckbxB.isSelected()){
					System.out.print("B ");
				}
				if (chckbxC.isSelected()){
					System.out.print("C ");
				}
				if (chckbxD.isSelected()){
					System.out.print("D ");
				}
				if (chckbxE.isSelected()){
					System.out.print("E ");
				}
				if (chckbxF.isSelected()){
					System.out.print("F ");
				}
				if (chckbxG.isSelected()){
					System.out.print("G ");
				}
				if (chckbxH.isSelected()){
					System.out.print("H ");
				}
				System.out.println();
			}
		});
		btnOk.setBounds(12, 149, 117, 25);
		contentPane.add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (chckbxA.isSelected()){
					chckbxA.setSelected(false);
				}
				if (chckbxB.isSelected()){
					chckbxB.setSelected(false);
				}
				if (chckbxC.isSelected()){
					chckbxC.setSelected(false);
				}
				if (chckbxD.isSelected()){
					chckbxD.setSelected(false);
				}
				if (chckbxE.isSelected()){
					chckbxE.setSelected(false);
				}
				if (chckbxF.isSelected()){
					chckbxF.setSelected(false);
				}
				if (chckbxG.isSelected()){
					chckbxG.setSelected(false);
				}
				if (chckbxH.isSelected()){
					chckbxH.setSelected(false);
				}
				System.out.println("Operación cancelada.");
			}
		});
		btnCancel.setBounds(170, 149, 117, 25);
		contentPane.add(btnCancel);
	}

}