import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ATM.banco.*;
import ATM.*;
public class FondoPrincipal extends JFrame{
	public JLabel titulo = new JLabel();
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JButton sistemaBanco;
	public JButton cajeroAutomatico;
	public JButton salir;
	public JPanel panelBotones;
	
	public FondoPrincipal() //Menu Principal
	{
		super("ATM");
		imagen = new ImageIcon("mapa.jpg");
		fondoImagen = new JLabel(imagen);
		titulo.setFont(new Font("Bold",Font.BOLD,20));
		
		sistemaBanco = new JButton("Sistema Banco: Administracion Clientes");
		sistemaBanco.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Contrasena nueva_ventana = new Contrasena(1);
				setVisible(false);
			}
		});
		
	    cajeroAutomatico = new JButton("Cajero Automatico");
		cajeroAutomatico.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Contrasena nueva_ventana = new Contrasena(2);
				setVisible(false);
			}
		});
		
		salir = new JButton("Salir");
		salir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				OpcionesBanco nueva_ventana = new OpcionesBanco();
				setVisible(false);
			}
		});
		
		panelBotones = new JPanel();
		
		setSize( 800, 500 );
		add(fondoImagen);
		
		titulo.setBounds(250, 100, 270, 30);
		titulo.setText("SELECCIONE UNA OPCION");
		titulo.setOpaque(false);
		fondoImagen.add(titulo);
		
		panelBotones.setLayout(new GridLayout(3,1));
		panelBotones.add(sistemaBanco);
		panelBotones.add(cajeroAutomatico);
		panelBotones.add(salir);
		panelBotones.setBounds(250,150,270,115);
		fondoImagen.add(panelBotones);
		
		fondoImagen.setOpaque(false);		
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible( true );
	}

	
}