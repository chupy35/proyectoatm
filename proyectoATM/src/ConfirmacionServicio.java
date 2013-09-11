import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConfirmacionServicio extends JFrame{//Preguntar si quieren retirar la cantidad elegida
	public JLabel titulo = new JLabel();
	public JLabel titulo2 = new JLabel();
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JLabel cantidad;
	public JLabel cuenta;
	public JButton cancelar;
	public JButton aceptar;
		
	public ConfirmacionServicio(String numero, String numeroCuenta) 
	{	
		super("ATM");
		imagen = new ImageIcon("mapa.jpg");
		fondoImagen = new JLabel(imagen);
		titulo.setFont(new Font("Bold",Font.BOLD,20));
		cantidad = new JLabel(numero +"$");
		titulo2.setFont(new Font("Bold",Font.BOLD,20));
		cuenta = new JLabel(numeroCuenta);
		cancelar = new JButton("CANCELAR");
		aceptar = new JButton("ACEPTAR");
	
		setBackground(Color.black);
		
		setSize( 800, 500 );
		add(fondoImagen);
		
		titulo.setBounds(220, 70, 390, 30);
		titulo.setText("ESTA SEGURO QUE QUIERE PAGAR:");
		titulo.setOpaque(false);
		fondoImagen.add(titulo);
		
		cantidad.setFont(new Font("Bold",Font.BOLD,40));
		cantidad.setBackground(Color.black);
		cantidad.setBounds(330, 110, 320, 40);
		fondoImagen.add(cantidad);
		
		titulo2.setBounds(320, 180, 390, 30);
		titulo2.setText("A LA CUENTA:");
		titulo2.setOpaque(false);
		fondoImagen.add(titulo2);
		
		cuenta.setFont(new Font("Bold",Font.BOLD,40));
		cuenta.setBackground(Color.black);
		cuenta.setBounds(280, 220, 320, 40);
		fondoImagen.add(cuenta);
		
		cancelar.setBackground(Color.red); 
		cancelar.setBounds(100, 350, 100, 35);
		cancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				OpcionesCajero nueva_ventana = new OpcionesCajero(2);
				setVisible(false);
			}
		});		
		fondoImagen.add(cancelar);
		
		aceptar.setBackground(Color.green);
		aceptar.setBounds(600, 350, 100, 35);
		aceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					String outputStr = "SU PAGO SE REALIZO EXITOSAMENTE";
					JOptionPane.showMessageDialog(null,outputStr,"", JOptionPane.INFORMATION_MESSAGE);
					OpcionesCajero nueva_ventana = new OpcionesCajero(2);
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