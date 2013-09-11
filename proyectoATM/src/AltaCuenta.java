import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AltaCuenta extends JFrame{
    public JLabel titulo;	
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JLabel banco;
	public JTextField bancoTexto;
	public JButton cheques;
	public String chequesTexto;
	public JButton ahorros;
	public String ahorroTexto;
	public JButton cancelar;
	public JButton continuar;
	
	public AltaCuenta() 
	{
		super("ATM");
		setSize( 800, 500 );
		imagen = new ImageIcon("mapa.jpg");
		fondoImagen = new JLabel(imagen);
		add(fondoImagen);
		
		titulo = new JLabel("ALTA CUENTA");
		titulo.setFont(new Font("Bold",Font.BOLD,20));
		titulo.setBounds(300, 50, 370, 30);
		titulo.setOpaque(false);
		fondoImagen.add(titulo);
		
		banco = new JLabel("Banco");
		banco.setFont(new Font("Bold",Font.BOLD,16));
		banco.setBounds(80,130,200,20);
		banco.setOpaque(false);
		fondoImagen.add(banco);
		
		bancoTexto = new JTextField(1);
		bancoTexto.setBounds(280,130,200,20);
		//nombreTexto.setOpaque(false);
		fondoImagen.add(bancoTexto);
		
		cheques = new JButton("Cheques");
		cheques.setBounds(200, 250, 130, 35);
		cheques.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				chequesTexto = new String("Cheques");
			}
		});		
		fondoImagen.add(cheques);
		
		ahorros = new JButton("Ahorros");
		ahorros.setBounds(450, 250, 130, 35);
		ahorros.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ahorroTexto = new String("Ahorros");
			}
		});		
		fondoImagen.add(ahorros);
		
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
		continuar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ContinuacionAltaClienteNIP nueva_ventana = new ContinuacionAltaClienteNIP(2);
				setVisible(false);
			}
		});
		
		fondoImagen.add(continuar);
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		setResizable(false);
        setVisible( true );
		toFront();
		
		
		
	}

	
}