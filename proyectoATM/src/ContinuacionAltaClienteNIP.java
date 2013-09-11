import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.String.*;

public class ContinuacionAltaClienteNIP extends JFrame{
    public JLabel titulo;	
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JLabel nip;	
	public JPasswordField nipTexto;
	public JLabel nipVerficacion;
	public JPasswordField nipVerficacionTexto;

	public JButton cancelar;
	public JButton aceptar;
	
	public ContinuacionAltaClienteNIP(final int opcion) 
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
		
		nip = new JLabel("NIP");
		nip.setFont(new Font("Bold",Font.BOLD,16));
		nip.setBounds(100,140,200,20);
		nip.setOpaque(false);
		fondoImagen.add(nip);
		
		nipTexto = new JPasswordField(1);
		nipTexto.setBounds(220,140,200,20);
		fondoImagen.add(nipTexto);
		
		nipVerficacion = new JLabel("NIP");
		nipVerficacion.setFont(new Font("Bold",Font.BOLD,16));
		nipVerficacion.setBounds(100,180,200,20);
		nipVerficacion.setOpaque(false);
		fondoImagen.add(nipVerficacion);
		
		nipVerficacionTexto = new JPasswordField(1);
		nipVerficacionTexto.setBounds(220,180,200,20);
		//coloniaTexto.setOpaque(false);
		fondoImagen.add(nipVerficacionTexto);
	
		
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
		
		aceptar = new JButton("CONTINUAR");
		aceptar.setBackground(Color.green);
		aceptar.setBounds(500, 400, 130, 35);
		aceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String pass = new String(nipTexto.getPassword());
				String passver = new String(nipVerficacionTexto.getPassword());
				
				if (pass.equals(passver)){
					if(opcion == 1){
						String outputStr = "EL CLIENTE SE DIO DE ALTA";
						JOptionPane.showMessageDialog(null,outputStr,"", JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						String outputStr = "LA CUENTA SE DIO DE ALTA";
						JOptionPane.showMessageDialog(null,outputStr,"", JOptionPane.INFORMATION_MESSAGE);
					}
					OpcionesClientes nueva_ventana = new OpcionesClientes();
					setVisible(false);
				}
				else{
					String outputStr = "CONTRASEÑA NO CONCUERDA\nINGRESE NUEVAMENTE EL NIP";
					JOptionPane.showMessageDialog(null,outputStr,"", JOptionPane.INFORMATION_MESSAGE);
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