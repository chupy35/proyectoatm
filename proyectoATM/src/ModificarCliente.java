import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ATM.banco.*;
import ATM.*;
public class ModificarCliente extends JFrame{
    public JLabel titulo;	
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JLabel nombre;
	public JTextField nombreTexto;
	public JLabel apellidoPaterno;	
	public JTextField apellidoPaternoTexto;
	public JLabel apellidoMaterno;
	public JTextField apellidoMaternoTexto;
	public JLabel fechaNacimiento;
	public JTextField diaTexto;
	public JTextField mesTexto;
	public JTextField anioTexto;
	public JLabel edad;
	public JTextField edadTexto;
	public JButton cancelar;
	public JButton continuar;
	
	public ModificarCliente() 
	{
		super("ATM");
		setSize( 800, 500 );
		imagen = new ImageIcon("mapa.jpg");
		fondoImagen = new JLabel(imagen);
		add(fondoImagen);
		
		titulo = new JLabel("MODIFICAR CLIENTE");
		titulo.setFont(new Font("Bold",Font.BOLD,20));
		titulo.setBounds(300, 50, 370, 30);
		titulo.setOpaque(false);
		fondoImagen.add(titulo);
		
		nombre = new JLabel("Nombre");
		nombre.setFont(new Font("Bold",Font.BOLD,16));
		nombre.setBounds(80,130,200,20);
		nombre.setOpaque(false);
		fondoImagen.add(nombre);
		
		nombreTexto = new JTextField(1);
		nombreTexto.setText(//nombre);
		nombreTexto.setBounds(280,130,200,20);
		//nombreTexto.setOpaque(false);
		fondoImagen.add(nombreTexto);
		
		apellidoPaterno = new JLabel("Apellido Paterno");
		apellidoPaterno.setFont(new Font("Bold",Font.BOLD,16));
		apellidoPaterno.setBounds(80,170,200,20);
		apellidoPaterno.setOpaque(false);
		fondoImagen.add(apellidoPaterno);
		
		apellidoPaternoTexto = new JTextField(1);
		apellidoPaternoTexto.setText(//ap_paterno);
		apellidoPaternoTexto.setBounds(280,170,200,20);
		//apellidoPaternoTexto.setOpaque(false);
		fondoImagen.add(apellidoPaternoTexto);
		
		apellidoMaterno = new JLabel("Apellido Materno");
		apellidoMaterno.setFont(new Font("Bold",Font.BOLD,16));
		apellidoMaterno.setBounds(80,210,200,20);
		apellidoMaterno.setOpaque(false);
		fondoImagen.add(apellidoMaterno);
		
		apellidoMaternoTexto = new JTextField(1);
		apellidoMaternoTexto.serText(//ap_materno);
		apellidoMaternoTexto.setBounds(280,210,200,20);
		//apellidoMaternoTexto.setOpaque(false);
		fondoImagen.add(apellidoMaternoTexto);
		
		fechaNacimiento = new JLabel("Fecha Nacimiento");
		fechaNacimiento.setFont(new Font("Bold",Font.BOLD,16));
		fechaNacimiento.setBounds(80,250,200,20);
		fechaNacimiento.setOpaque(false);
		fondoImagen.add(fechaNacimiento);
		
		diaTexto = new JTextField(1);
		diaTexto.setText(//dia);
		diaTexto.setBounds(280,250,35,20);
		//diaTexto.setOpaque(false);
		fondoImagen.add(diaTexto);
		mesTexto = new JTextField(1);
		mesTexto.setText(//mes);
		mesTexto.setBounds(330,250,35,20);
		//mesTexto.setOpaque(false);
		fondoImagen.add(mesTexto);	
		anioTexto = new JTextField(1);
		anioTexto.setText();
		anioTexto.setBounds(380,250,35,20);
		//anioTexto.setOpaque(false);
		fondoImagen.add(anioTexto);
		
		edad = new JLabel("Edad");
		edad.setFont(new Font("Bold",Font.BOLD,16));
		edad.setBounds(80,290,200,20);
		edad.setOpaque(false);
		fondoImagen.add(edad);
		
		edadTexto = new JTextField(1);
		edadTexto.setText(//edad);
		edadTexto.setBounds(280,290,30,20);
		//edadTexto.setOpaque(false);
		fondoImagen.add(edadTexto);
		
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
				if(nombreTexto.getText().equals("")){
					nombre.setForeground(Color.red);
				}
				else{
					nombre.setForeground(Color.black);
				}
					
				if (apellidoPaternoTexto.getText().equals("")){
					apellidoPaterno.setForeground(Color.red);
				}
				else{
					apellidoPaterno.setForeground(Color.black);
				}
					
				if (apellidoMaternoTexto.getText().equals("")){
					apellidoMaterno.setForeground(Color.red);
				}
				else{
					apellidoMaterno.setForeground(Color.black);
				}	
					
				if ((diaTexto.getText().equals(""))||(mesTexto.getText().equals(""))||(anioTexto.getText().equals(""))){
					fechaNacimiento.setForeground(Color.red);
				}
				else{
					fechaNacimiento.setForeground(Color.black);
				}
					
				if (edadTexto.getText().equals("")){
					edad.setForeground(Color.red);
				}
				else{
					edad.setForeground(Color.black);
				}
				
				if ((nombreTexto.getText().equals(""))||(apellidoPaternoTexto.getText().equals(""))||(apellidoMaternoTexto.getText().equals(""))||(diaTexto.getText().equals(""))||(mesTexto.getText().equals(""))||(anioTexto.getText().equals(""))||(edadTexto.getText().equals(""))){
					String outputStr = "NECESITA LLENAR TODOS LOS CAMPOS";
					JOptionPane.showMessageDialog(null,outputStr,"", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					ContinuacionModificarCliente nueva_ventana = new ContinuacionModificarCliente();
					setVisible(false);
				}
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