import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ATM.banco.*;
import ATM.*;
public class NipCambiado extends JFrame{//Mensaje de Tomar dinero
	public JLabel titulo = new JLabel();
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JButton aceptar;
	
	public NipCambiado()
	{
		super("ATM");
		imagen = new ImageIcon("mapa.jpg");
		fondoImagen = new JLabel(imagen);
		titulo.setFont(new Font("Bold",Font.BOLD,30));
		aceptar = new JButton("ACEPTAR");
		aceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				OpcionesCajero nueva_ventana = new OpcionesCajero();
				setVisible(false);
			}
		});
		
		setSize( 800, 500 );
		add(fondoImagen);
				
		titulo.setBounds(50, 200, 700, 30);
		titulo.setText("SU NIP HA SIDO CAMBIADO EXITOSAMENTE");
		titulo.setOpaque(false);
		fondoImagen.add(titulo);
		
		aceptar.setBackground(Color.green);
		aceptar.setBounds(600, 350, 100, 35);
		fondoImagen.add(aceptar);
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		setResizable(false);
        setVisible( true );
		toFront();
	}
}