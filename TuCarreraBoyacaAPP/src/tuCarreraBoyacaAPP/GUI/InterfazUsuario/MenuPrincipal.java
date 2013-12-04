/**
 * 
 */
package tuCarreraBoyacaAPP.GUI.InterfazUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import tuCarreraBoyacaAPP.logica.GestionInstitucionesEducacionSuperior;

/**
 * @author JUDIT
 *
 */

public class MenuPrincipal extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 552);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		JLabel lbl_Titulo = new JLabel("TEST VOCACIONAL");
		lbl_Titulo.setForeground(new Color(25, 25, 112));
		lbl_Titulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lbl_Titulo.setBounds(40, 138, 165, 14);
		contentPane.add(lbl_Titulo);
		
		JLabel lbl_SubTitulo = new JLabel("Men\u00FA Principal");
		lbl_SubTitulo.setForeground(new Color(25, 25, 112));
		lbl_SubTitulo.setFont(new Font("Berlin Sans FB", Font.BOLD, 18));
		lbl_SubTitulo.setBounds(60, 162, 133, 14);
		contentPane.add(lbl_SubTitulo);
		
		JLabel lbl_Logo = new JLabel("");
		lbl_Logo.setIcon(new ImageIcon(this.getClass().getResource("Images/Logo_TCBAPP.png")));
		lbl_Logo.setBounds(71, 187, 154, 111);
		contentPane.add(lbl_Logo);
			
		JButton btn_ComoIniciar = new JButton("");
		btn_ComoIniciar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_comoIniciar.png")));
		btn_ComoIniciar.setBounds(156, 297, 79, 75);
		contentPane.add(btn_ComoIniciar);
		
		JButton btn_Sonido = new JButton("");
		btn_Sonido.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Sonido.png")));
		btn_Sonido.setBounds(67, 297, 79, 75);
		contentPane.add(btn_Sonido);
		
		JLabel lbl_ImagenVocacional = new JLabel("");
		lbl_ImagenVocacional.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_opcion.png")));
		lbl_ImagenVocacional.setBounds(215, 138, 46, 38);
		contentPane.add(lbl_ImagenVocacional);
		
		JLabel lbl_ImagenNina = new JLabel("");
		lbl_ImagenNina.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_estMujer.png")));
		lbl_ImagenNina.setBounds(40, 189, 54, 32);
		contentPane.add(lbl_ImagenNina);
		
		JLabel label_ImagenNino = new JLabel("");
		label_ImagenNino.setIcon(new ImageIcon(this.getClass().getResource("Images/imagen_estHombre.png")));
		label_ImagenNino.setBounds(206, 253, 54, 45);
		contentPane.add(label_ImagenNino);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(this.getClass().getResource("Images/celularfondo.png")));
		label.setBounds(-6, -26, 305, 583);
		contentPane.add(label);
		
		JLabel lbl_TituloPrincipal = new JLabel("");
		lbl_TituloPrincipal.setIcon(new ImageIcon(this.getClass().getResource("Images/TituloPrincipal.png")));
		lbl_TituloPrincipal.setBounds(0, 50, 295, 75);
		contentPane.add(lbl_TituloPrincipal);
		
		JButton btn_Salir = new JButton("");
		btn_Salir.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_salir.png")));
		btn_Salir.setBounds(0, 430, 297, 41);
		contentPane.add(btn_Salir);
		btn_Salir.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				System.exit (0);			
			}
			});
		contentPane.add(btn_Salir);
		
		JButton btn_Ingresar = new JButton("");
		btn_Ingresar.setIcon(new ImageIcon(this.getClass().getResource("Images/btn_Ingresar.png")));
		btn_Ingresar.setBounds(10, 383, 277, 41);
		contentPane.add(btn_Ingresar);
		btn_Ingresar.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				InicioTest.main(null);				
			}
			});
		contentPane.add(btn_Ingresar);

	}
}