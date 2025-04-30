package modulo7.accesoDatos.ejemplosClase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends JFrame{
	
	private JButton bnt = new JButton();
	
	Principal(){
		super("Mi primera ventana");
		setSize(getMaximumSize());
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

		try {
            // Cambiar a Nimbus Look & Feel
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Mac".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("No se pudo aplicar Nimbus");
        }
		
		JFrame jframe = new JFrame();
		String nombreTipo = "vacio";
		JLabel etiquetaConductor = new JLabel();
		
		JComboBox<String> comboBoxBuses = new JComboBox<String>();

		ArrayList<String> listaBuses = new ArrayList<String>();
		

		
		try {
			Aucorsa aucorsa = new Aucorsa();
			
			listaBuses = aucorsa.mostrarDatosAutobuses();
			nombreTipo = aucorsa.mostrarDatosAutobusesPorLicencia("LIC0001");
			//aucorsa.insertarDatosAutobuses("PR999","RUrbano","RLIC999");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		for (String registros : listaBuses) {
			
			comboBoxBuses.addItem(registros);
			
		}
		
		JButton bntEliminar = new JButton("Eliminar");
		JButton bntEliminar2 = new JButton("Eliminar2");

		
		bntEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Pulsado: " + bntEliminar.getText());
				//System.out.println("Pulsado: " + e.getActionCommand());
				
				JFrame frameAnadirConductor = new JFrame();
				frameAnadirConductor.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				frameAnadirConductor.setBounds(50, 50, 200, 200);
				frameAnadirConductor.setLayout(new FlowLayout());
				
				frameAnadirConductor.add(new JLabel("Conductor: "));
				frameAnadirConductor.add(new JTextField());
				
				frameAnadirConductor.add(new JButton("Añadir"));
				frameAnadirConductor.add(new JButton("Cancelar"));

				
				frameAnadirConductor.setVisible(true);
				
			}
			
		});
		
		
		
		
		bntEliminar.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Eveneto: " + e.getStateChange());

				if(e.getStateChange() == ItemEvent.DESELECTED)
		
				System.out.println(bntEliminar.getText());

				
			}
			
		});
		
		jframe.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				//System.out.println(e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				if(e.getKeyCode() == 79) {
					
					//JDialog dialog = new JDialog(jframe, "Título", true); // true = modal
					
					String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
			        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro?");
					System.out.println("Opcion: " + opcion);
			        
				}
			}
		});
		
		comboBoxBuses.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBoxBuses.getSelectedItem());
				System.out.println(e.getActionCommand());
			}
		});
		
		etiquetaConductor.setText(nombreTipo);
		etiquetaConductor.setBounds(0, 0, 50, 50);
		jframe.setBounds(350, 350, 500, 500);
		
		jframe.setLayout(new FlowLayout());

		jframe.add(etiquetaConductor);
		jframe.add(comboBoxBuses);
		jframe.add(bntEliminar);
		jframe.add(bntEliminar2);


		jframe.setBackground(Color.CYAN);
		
		jframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		jframe.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {

				int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro?");
				
				
				if(opcion == 0) 
					System.exit(0);
				
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		
		System.out.println(comboBoxBuses.getSelectedItem());
		
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jframe.setVisible(true);

		//Ejemplo BorderLayout
		JFrame frame = new JFrame("BorderLayout");
//        frame.setLayout(new BorderLayout());
//
//        frame.add(new JButton("NORTE"), BorderLayout.NORTH);
//        frame.add(new JButton("NORTE2"), BorderLayout.NORTH);
//
//        frame.add(new JButton("SUR"), BorderLayout.SOUTH);
//        frame.add(new JButton("OESTE"), BorderLayout.WEST);
//        frame.add(new JButton("ESTE"), BorderLayout.EAST);
//        frame.add(new JButton("CENTRO"), BorderLayout.CENTER);

        frame.setSize(400, 300);
      
		
        //Ejemplo Grid
        JPanel panelGRID = new JPanel();
        panelGRID.setLayout(new GridLayout(2, 2)); // 2 filas, 2 columnas
        panelGRID.add(new JButton("1"));
        panelGRID.add(new JButton("2"));
        panelGRID.add(new JButton("3"));
        panelGRID.add(new JButton("4"));
        frame.add(panelGRID);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setVisible(true);
        
//        //Ejemplo Flow De izquierda a derecha, como si fuera un párrafo. Salta de línea si no cabe.
//        jpanel.setLayout(new FlowLayout());
//        jpanel.add(new JButton("Botón 1"));
//        jpanel.add(new JButton("Botón 2"));
//        
        
        JFrame frame1 = new JFrame("Gestión de Aucorsa");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setBounds(50, 200, 800, 300);

        frame1.setLayout(new BorderLayout()); // Layout principal

        // Panel superior (título) con FlowLayout
        JPanel panelSuperior = new JPanel(new FlowLayout());
        JLabel titulo = new JLabel("Formulario de Registro de Buses");
        panelSuperior.add(titulo);
        panelSuperior.setBackground(Color.ORANGE);


        // Panel central con GridLayout (formulario)
        JPanel panelCentral = new JPanel(new GridLayout(3, 2)); // 3 filas, 2 columnas
        //panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelCentral.add(new JLabel("Registro:"));
        panelCentral.add(new JTextField(10));
        panelCentral.add(new JLabel("Tipo:"));
        panelCentral.add(new JTextField(10));
        panelCentral.add(new JLabel("Licencia:"));
        
        JTextField cuadroTexto = new JTextField(10);
        cuadroTexto.setBackground(Color.PINK);
        cuadroTexto.setSize(20, 20);
        panelCentral.add(cuadroTexto);
        panelCentral.setBackground(Color.ORANGE);


        // Panel inferior (botones) con FlowLayout
        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.add(new JButton("Guardar"));
        panelInferior.add(new JButton("Cancelar"));
        
        JButton btnAnadir = new JButton("Añadir");
        
        panelInferior.add(btnAnadir);
        panelInferior.add(new JButton("No guardar"));
        panelInferior.add(new JButton("Explotar"));

        // Añadir paneles al JFrame
        frame1.add(panelSuperior, BorderLayout.NORTH);
        frame1.add(panelCentral, BorderLayout.CENTER);
        frame1.add(panelInferior, BorderLayout.SOUTH);

        //frame1.setVisible(true);
        
//    	frame1.addWindowListener (new WindowAdapter() {
//			public void windowClosing (WindowEvent e) {
//				String posiblesRespuestas[] = {"S�","No"};
//				// En esta opci�n se utiliza un showOptionDialog en el que personalizo el icono mostrado
//				int opcionElegida = JOptionPane.showOptionDialog(null, "�Realmente desea cerrar la aplicaci�n?", "Sweug", 
//				        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, posiblesRespuestas, posiblesRespuestas[1]);
//			    if(opcionElegida == 0) {
//			      System.exit(0);          
//			    }
//			}
//		});
//        
//       MOSTRAR VENTANAS EMERGENTES  
//        JDialog dialog = new JDialog(parentFrame, "Título", true); // true = modal
//        
//        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
//        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro?");
		
	}

}
