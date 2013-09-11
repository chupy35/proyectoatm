import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContinuacionModificarCliente extends JFrame{
    public JLabel titulo;	
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JLabel direccion;
	public JLabel calle;	
	public JTextField calleTexto;
	public JLabel numero;
	public JTextField numeroTexto;
	public JLabel colonia;
	public JTextField coloniaTexto;
	public JLabel delegacion;
	public JTextField delegacionTexto;
	public JLabel ciudad;
	public JTextField ciudadTexto;
	public JLabel estado;
	public JTextField estadoTexto;
	public JLabel pais;
	public JTextField paisTexto;
	public JButton cancelar;
	public JButton aceptar;
	
	public ContinuacionAltaCliente() 
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
		
		direccion = new JLabel("Direccion");
		direccion.setFont(new Font("Bold",Font.BOLD,16));
		direccion.setBounds(80,100,200,20);
		direccion.setOpaque(false);
		fondoImagen.add(direccion);
		
		calle = new JLabel("Calle");
		calle.setFont(new Font("Bold",Font.BOLD,16));
		calle.setBounds(100,140,200,20);
		calle.setOpaque(false);
		fondoImagen.add(calle);
		
		calleTexto = new JTextField(1);
		calleTexto.setText(//calle);
		calleTexto.setBounds(220,140,200,20);
		//calleTexto.setOpaque(false);
		fondoImagen.add(calleTexto);
		
		numero = new JLabel("Numero");
		numero.setFont(new Font("Bold",Font.BOLD,16));
		numero.setBounds(460,140,200,20);
		numero.setOpaque(false);
		fondoImagen.add(numero);
		
		numeroTexto = new JTextField(1);
		numeroTexto.Text(//numero);
		numeroTexto.setBounds(560,140,40,20);
		//numeroTexto.setOpaque(false);
		fondoImagen.add(numeroTexto);
		
		colonia = new JLabel("Colonia");
		colonia.setFont(new Font("Bold",Font.BOLD,16));
		colonia.setBounds(100,180,200,20);
		colonia.setOpaque(false);
		fondoImagen.add(colonia);
		
		coloniaTexto = new JTextField(1);
		coloniaTexto.setText(//colonia);
		coloniaTexto.setBounds(220,180,200,20);
		//coloniaTexto.setOpaque(false);
		fondoImagen.add(coloniaTexto);
		
		delegacion = new JLabel("Delegación");
		delegacion.setFont(new Font("Bold",Font.BOLD,16));
		delegacion.setBounds(100,220,200,20);
		delegacion.setOpaque(false);
		fondoImagen.add(delegacion);
		
		delegacionTexto = new JTextField(1);
		delegacionTexto.Text(//delegacion);
		delegacionTexto.setBounds(220,220,200,20);
		//delegacionTexto.setOpaque(false);
		fondoImagen.add(delegacionTexto);
		
		ciudad = new JLabel("Ciudad");
		ciudad.setFont(new Font("Bold",Font.BOLD,16));
		ciudad.setBounds(100,260,200,20);
		ciudad.setOpaque(false);
		fondoImagen.add(ciudad);
		
		ciudadTexto = new JTextField(1);
		ciudadTexto.setText(//ciudad);
		ciudadTexto.setBounds(220,260,200,20);
		//ciudadTexto.setOpaque(false);
		fondoImagen.add(ciudadTexto);
		
		estado = new JLabel("Estado");
		estado.setFont(new Font("Bold",Font.BOLD,16));
		estado.setBounds(100,310,200,20);
		estado.setOpaque(false);
		fondoImagen.add(estado);
		
		estadoTexto = new JTextField(1);
		estadoText.setText(//estado);
		estadoTexto.setBounds(220,310,200,20);
		//estadoTexto.setOpaque(false);
		fondoImagen.add(estadoTexto);
		
		pais = new JLabel("Pais");
		pais.setFont(new Font("Bold",Font.BOLD,16));
		pais.setBounds(100,350,200,20);
		pais.setOpaque(false);
		fondoImagen.add(pais);
		
		paisTexto = new JTextField(1);
		paisTexto.setText(//pais);
		paisTexto.setBounds(220,350,200,20);
		//paisTexto.setOpaque(false);
		fondoImagen.add(paisTexto);
		
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
				int band=0;
				if(calleTexto.getText().equals("")){
					calle.setForeground(Color.red);
				}
				else{
					calle.setForeground(Color.black);
				}
					
				if (numeroTexto.getText().equals("")){
					numero.setForeground(Color.red);
				}
				else{
					numero.setForeground(Color.black);
				}
					
				if (coloniaTexto.getText().equals("")){
					colonia.setForeground(Color.red);
				}
				else{
					colonia.setForeground(Color.black);
				}	
					
				if (delegacionTexto.getText().equals("")){
					delegacion.setForeground(Color.red);
				}
				else{
					delegacion.setForeground(Color.black);
				}
					
				if (ciudadTexto.getText().equals("")){
					ciudad.setForeground(Color.red);
				}
				else{
					ciudad.setForeground(Color.black);
				}
				if (estadoTexto.getText().equals("")){;
					estado.setForeground(Color.red);
				}
				else{
					estado.setForeground(Color.black);
				}
				if (paisTexto.getText().equals("")){
					pais.setForeground(Color.red);
				}
				else{
					pais.setForeground(Color.black);
				}
				
				if ((calleTexto.getText().equals(""))||(numeroTexto.getText().equals(""))||(coloniaTexto.getText().equals(""))||(delegacionTexto.getText().equals(""))||(ciudadTexto.getText().equals(""))||(estadoTexto.getText().equals(""))||(paisTexto.getText().equals(""))){
					String outputStr = "NECESITA LLENAR TODOS LOS CAMPOS";
					JOptionPane.showMessageDialog(null,outputStr,"", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
				
					ContinuacionAltaClienteNIP nueva_ventana = new ContinuacionAltaClienteNIP(1);
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