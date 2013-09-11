import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.String.*;
import ATM.banco.*;
import ATM.banco.cuenta.*;
import ATM.*;
public class AbonarCuenta extends JFrame{//Cuando ponen Otra Cantidad en la de opciones dinero
	public JLabel titulo = new JLabel();
	public JLabel fondoImagen;
	public ImageIcon imagen;
	public JTextField texto;
	public String textoS;
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
	
	public AbonarCuenta(final String cuenta)
	{
		super("ATM");
		imagen = new ImageIcon("mapa.jpg");
		fondoImagen = new JLabel(imagen);
		titulo.setFont(new Font("Bold",Font.BOLD,20));
		texto = new JTextField(23);
		textoS = new String("");
		
		uno = new JButton("1");
		uno.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textoS += "1";
				texto.setText(textoS);
			}
		});
		
		dos = new JButton("2");
		dos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textoS += "2";
				texto.setText(textoS);
			}
		});
		
		tres = new JButton("3");
		tres.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textoS += "3";
				texto.setText(textoS);
			}
		});
		
		cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textoS += "4";
				texto.setText(textoS);
			}
		});
		
		cinco = new JButton("5");
		cinco.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textoS += "5";
				texto.setText(textoS);
			}
		});
		
		seis = new JButton("6");
		seis.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textoS += "6";
				texto.setText(textoS);
			}
		});
		
		siete = new JButton("7");
		siete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textoS += "7";
				texto.setText(textoS);
			}
		});
		
		ocho = new JButton("8");
		ocho.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textoS += "8";
				texto.setText(textoS);
			}
		});
		
		nueve = new JButton("9");
		nueve.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textoS += "9";
				texto.setText(textoS);
			}
		});
		
		cero = new JButton("");
		
		ceroDoble = new JButton("0");
		ceroDoble.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textoS += "0";
				texto.setText(textoS);
			}
		});
		
		ceroTriple = new JButton("");

		cancelar =  new JButton("Cancelar");
		corregir = new JButton("Corregir");
		continuar = new JButton("Continuar");
		opciones = new JPanel();
		numeros = new JPanel();
		teclado = new JPanel();
		
		setSize( 800, 500 );
		add(fondoImagen);
		
		titulo.setBounds(230, 100, 350, 30);
		titulo.setText("DIGITE LA CANTIDAD A ABONAR");
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
		numeros.add(cero);
		numeros.add(ceroDoble);
		numeros.add(ceroTriple);
		
		opciones.setLayout(new GridLayout(3,1));
		cancelar.setBackground(Color.red);
		cancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				OpcionesCajero nueva_ventana = new OpcionesCajero(2);
				setVisible(false);
			}
		});		
		opciones.add(cancelar);
		
		corregir.setBackground(Color.yellow); 
		corregir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				texto.setText("");
				textoS = "";
			}
		});
		opciones.add(corregir);
		
		continuar.setBackground(Color.green); 
		continuar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String cantidad = texto.getText();
				ConfirmacionAbono nueva_ventana = new ConfirmacionAbono(cantidad,cuenta);
				setVisible(false);
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
		
		texto.setBounds(250, 150, 270, 30);
		fondoImagen.add(texto);
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
		setResizable(false);
        setVisible( true );
		toFront();
	}
}