import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContinuacionAltaClienteBanco extends JFrame{
    public JLabel titulo;	
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JComboBox bancosLista;
	public JButton cancelar;
	public JButton continuar;
	public String[] nombreBancos = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
	public int numBancos = 0;
	
	public ContinuacionAltaClienteBanco() 
	{
		super("ATM");
		setSize( 800, 500 );
		imagen = new ImageIcon("mapa.jpg");
		fondoImagen = new JLabel(imagen);
		add(fondoImagen);
		
		titulo = new JLabel("ALTA CLIENTE");
		titulo.setFont(new Font("Bold",Font.BOLD,20));
		titulo.setBounds(300, 50, 370, 30);
		titulo.setOpaque(false);
		fondoImagen.add(titulo);
		
		
		bancosLista = new JComboBox();
		bancosLista.setBounds(250, 150, 300, 50);
		fondoImagen.add(bancosLista);

		cancelar = new JButton("CANCELAR");
		cancelar.setBackground(Color.red); 
		cancelar.setBounds(200, 400, 130, 35);
		cancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				OpcionesClientes nueva_ventana = new OpcionesClientes();
				setVisible(false);
			}
		});		
		fondoImagen.add(cancelar);
		
		continuar = new JButton("CONTINUAR");
		continuar.setBackground(Color.green);
		continuar.setBounds(500, 400, 130, 35);
		/*continuar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			}
		});*/
		
		fondoImagen.add(continuar);
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		setResizable(false);
        setVisible( true );
		toFront();
		
		
		
	}
	
}