import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ATM.banco.*;
public class AltaBanco extends JFrame{
    public JLabel titulo;	
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JLabel nombreBanco;
	public JTextField nombreBancoTexto;
	public JButton cancelar;
	public JButton aceptar;
	
	public AltaBanco() 
	{
		super("ATM");
		setSize( 800, 500 );
		imagen = new ImageIcon("mapa.jpg");
		fondoImagen = new JLabel(imagen);
		add(fondoImagen);
		
		titulo = new JLabel("ALTA BANCO");
		titulo.setFont(new Font("Bold",Font.BOLD,20));
		titulo.setBounds(300, 50, 370, 30);
		titulo.setOpaque(false);
		fondoImagen.add(titulo);
		
		nombreBanco = new JLabel("Nombre del Banco");
		nombreBanco.setFont(new Font("Bold",Font.BOLD,16));
		nombreBanco.setBounds(80,130,200,20);
		nombreBanco.setOpaque(false);
		fondoImagen.add(nombreBanco);
		
		nombreBancoTexto = new JTextField(1);
		nombreBancoTexto.setBounds(280,130,200,20);
		fondoImagen.add(nombreBancoTexto);
		
		
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
		
		aceptar = new JButton("ACEPTAR");
		aceptar.setBackground(Color.green);
		aceptar.setBounds(500, 400, 130, 35);
		aceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(nombreBancoTexto.getText().equals("")){
					nombreBanco.setForeground(Color.red);
					String outputStr = "NECESITA ESCRIBIR EL NOMBRE DEL BANCO";
				}
				else{
					Banco banco = new Banco(nombreBancoTexto.getText());
					String outputStr = "BANCO " + nombreBancoTexto.getText() +" DADO DE ALTA";
					JOptionPane.showMessageDialog(null,outputStr,"", JOptionPane.INFORMATION_MESSAGE);
					OpcionesBanco nuevo = new OpcionesBanco(banco);
					OpcionesClientes nueva_ventana = new OpcionesClientes();
					setVisible(false);
				}
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