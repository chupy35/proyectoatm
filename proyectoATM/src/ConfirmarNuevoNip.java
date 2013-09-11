import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.String.*;

public class ConfirmarNuevoNip extends JFrame{  //JFrame que pide contraseña
	public JLabel titulo = new JLabel();
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JPasswordField contrasena;
	public JButton uno;
	public JButton dos;
	public JButton tres;
	public JButton cuatro;
	public JButton cinco;
	public JButton seis;
	public JButton siete;
	public JButton ocho;
	public JButton nueve;
	public JButton cero;
	public JButton ceroDoble;
	public JButton ceroTriple;
	public JButton cancelar;
	public JButton corregir;
	public JButton continuar;
	public JPanel numeros;
	public JPanel opciones;
	public JPanel teclado;
	public String textPass;

	public ConfirmarNuevoNip(final String confirmarNip)
	{
		super("ATM");
		imagen = new ImageIcon("mapa.jpg");
		titulo.setFont(new Font("Bold",Font.BOLD,20));
		fondoImagen = new JLabel(imagen);
		contrasena = new JPasswordField(23);
		textPass = new String("");
		
		uno = new JButton("1");
		uno.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textPass += "1";
				contrasena.setText(textPass);
			}
		});
		
		dos = new JButton("2");
		dos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textPass += "2";
				contrasena.setText(textPass);
			}
		});
		
		tres = new JButton("3");
		tres.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textPass += "3";
				contrasena.setText(textPass);
			}
		});
		
		cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textPass += "4";
				contrasena.setText(textPass);
			}
		});
		
		cinco = new JButton("5");
		cinco.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textPass += "5";
				contrasena.setText(textPass);
			}
		});
		
		seis = new JButton("6");
		seis.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textPass += "6";
				contrasena.setText(textPass);
			}
		});
		
		siete = new JButton("7");
		siete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textPass += "7";
				contrasena.setText(textPass);
			}
		});
		
		ocho = new JButton("8");
		ocho.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textPass += "8";
				contrasena.setText(textPass);
			}
		});
		
		nueve = new JButton("9");
		nueve.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textPass += "9";
				contrasena.setText(textPass);
			}
		});
		
		cero = new JButton("0");
		cero.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textPass += "0";
				contrasena.setText(textPass);
			}
		});
		
		ceroDoble = new JButton("");
		ceroTriple = new JButton("");
		cancelar =  new JButton("Cancelar");
		corregir = new JButton("Corregir");
		continuar = new JButton("Continuar");
		opciones = new JPanel();
		numeros = new JPanel();
		teclado = new JPanel();
		
		setSize( 800, 500 );
		add(fondoImagen);
		
		titulo.setText("DIGITE NUEVAMENTE SU NUEVO NIP");
		titulo.setBounds(210, 100, 370, 30);
		titulo.setOpaque(false);
		fondoImagen.add(titulo);
		
		numeros.setLayout(new GridLayout(4,3));
		numeros.add(uno);
		numeros.add(dos);
		numeros.add(tres);
		numeros.add(cuatro);
		numeros.add(cinco);
		numeros.add(seis);
		numeros.add(siete);
		numeros.add(ocho);
		numeros.add(nueve);
		numeros.add(ceroDoble);
		numeros.add(cero);
		numeros.add(ceroTriple);
		
		opciones.setLayout(new GridLayout(3,1));
		cancelar.setBackground(Color.red); 
		cancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				OpcionesCajero nueva_ventana = new OpcionesCajero(1);
				setVisible(false);
			}
		});
		opciones.add(cancelar);
		
		corregir.setBackground(Color.yellow); 
		corregir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				contrasena.setText("");
				textPass = "";
			}
		});
		opciones.add(corregir);
		
		continuar.setBackground(Color.green); 
		continuar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(textPass.equals(confirmarNip)){
					String outputStr = "SU NIP HA SIDO CAMBIADO EXITOSAMENTE";
					JOptionPane.showMessageDialog(null,outputStr,"", JOptionPane.INFORMATION_MESSAGE);
					OpcionesCajero nueva_ventana = new OpcionesCajero(1);
					setVisible(false);
					
				}
				else{
					String outputStr = "	NIP INCORRECTO\n	VUELVA A INTENTAR";
					JOptionPane.showMessageDialog(null,outputStr,"", JOptionPane.INFORMATION_MESSAGE);
					contrasena.setText("");
					textPass = "";
				}
			}
		});
		opciones.add(continuar);
		
		numeros.setOpaque(false);
		teclado.add(numeros,BorderLayout.CENTER);
		opciones.setOpaque(false);
		teclado.add(opciones,BorderLayout.NORTH);
		
		teclado.setBounds(250,250,270,115);
		teclado.setOpaque(false);
		fondoImagen.add(teclado);
		
		contrasena.setBounds(250, 150, 270, 30);
		fondoImagen.add(contrasena);
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		setResizable(false);
        setVisible( true );
		toFront();
	}
}