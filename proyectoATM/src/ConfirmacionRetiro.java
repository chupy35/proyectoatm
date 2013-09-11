import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConfirmacionRetiro extends JFrame{//Preguntar si quieren retirar la cantidad elegida
	public JLabel titulo = new JLabel();
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JLabel cantidad;
	public JButton cancelar;
	public JButton aceptar;
		
	public ConfirmacionRetiro(String numero) 
	{	
		super("ATM");
		imagen = new ImageIcon("mapa.jpg");
		fondoImagen = new JLabel(imagen);
		titulo.setFont(new Font("Bold",Font.BOLD,20));
		cantidad = new JLabel(numero); //ESTE ES SOLO PARA VER QUE SIRVE!!!
		cancelar = new JButton("CANCELAR");
		aceptar = new JButton("ACEPTAR");
	
		setBackground(Color.black);
		
		setSize( 800, 500 );
		add(fondoImagen);
		
		titulo.setBounds(220, 100, 390, 30);
		titulo.setText("ESTA SEGURO QUE QUIERE RETIRAR:");
		titulo.setOpaque(false);
		fondoImagen.add(titulo);
		
		cantidad.setFont(new Font("Bold",Font.BOLD,40));
		cantidad.setBackground(Color.black);
		cantidad.setBounds(330, 200, 320, 40);
		fondoImagen.add(cantidad);
		
		cancelar.setBackground(Color.red); 
		cancelar.setBounds(100, 350, 100, 35);
		cancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				OpcionesDinero nueva_ventana = new OpcionesDinero();
				setVisible(false);
			}
		});		
		fondoImagen.add(cancelar);
		
		aceptar.setBackground(Color.green);
		aceptar.setBounds(600, 350, 100, 35);
		aceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				TomeDinero nueva_ventana = new TomeDinero();
				setVisible(false);
			}
		});
		fondoImagen.add(aceptar);
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		setResizable(false);
        setVisible( true );
		toFront();
		
	}
}