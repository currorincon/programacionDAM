package modulo7.accesoDatos.ejemplosClase;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal {

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
		
		comboBoxBuses.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(comboBoxBuses.getSelectedItem());
				System.out.println(e.getActionCommand());
			}
		});
		
		etiquetaConductor.setText(nombreTipo);
		etiquetaConductor.setBounds(0, 0, 50, 50);
		jframe.setBounds(350, 350, 200, 200);

		jframe.add(etiquetaConductor);
		jframe.add(comboBoxBuses);
		

		jframe.setBackground(Color.CYAN);
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		System.out.println(comboBoxBuses.getSelectedItem());
		
        //jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jframe.setVisible(true);

		//Ejemplo BorderLayout
		JFrame frame = new JFrame("BorderLayout");
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("NORTE"), BorderLayout.NORTH);
        frame.add(new JButton("SUR"), BorderLayout.SOUTH);
        frame.add(new JButton("OESTE"), BorderLayout.WEST);
        frame.add(new JButton("ESTE"), BorderLayout.EAST);
        frame.add(new JButton("CENTRO"), BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
		
//        //Ejemplo Grid
//        jpanel.setLayout(new GridLayout(2, 2)); // 2 filas, 2 columnas
//        jpanel.add(new JButton("1"));
//        jpanel.add(new JButton("2"));
//        jpanel.add(new JButton("3"));
//        jpanel.add(new JButton("4"));
//        
//        //Ejemplo Flow De izquierda a derecha, como si fuera un párrafo. Salta de línea si no cabe.
//        jpanel.setLayout(new FlowLayout());
//        jpanel.add(new JButton("Botón 1"));
//        jpanel.add(new JButton("Botón 2"));
//        
        
        JFrame frame1 = new JFrame("Ejemplo con Paneles y Layouts");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(400, 300);
        frame1.setLayout(new BorderLayout()); // Layout principal

        // Panel superior (título) con FlowLayout
        JPanel panelSuperior = new JPanel(new FlowLayout());
        JLabel titulo = new JLabel("Formulario de Registro de Buses");
        panelSuperior.add(titulo);

        // Panel central con GridLayout (formulario)
        JPanel panelCentral = new JPanel(new GridLayout(3, 2, 10, 10)); // 3 filas, 2 columnas
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelCentral.add(new JLabel("Registro:"));
        panelCentral.add(new JTextField(10));
        panelCentral.add(new JLabel("Tipo:"));
        panelCentral.add(new JTextField(10));
        panelCentral.add(new JLabel("Licencia:"));
        panelCentral.add(new JTextField(10));
        panelCentral.setBackground(Color.ORANGE);


        // Panel inferior (botones) con FlowLayout
        JPanel panelInferior = new JPanel(new FlowLayout());
        panelInferior.add(new JButton("Guardar"));
        panelInferior.add(new JButton("Cancelar"));
        panelInferior.add(new JButton("Añadir"));

        // Añadir paneles al JFrame
        frame1.add(panelSuperior, BorderLayout.NORTH);
        frame1.add(panelCentral, BorderLayout.CENTER);
        frame1.add(panelInferior, BorderLayout.SOUTH);

        frame1.setVisible(true);
        
//       MOSTRAR VENTANAS EMERGENTES  
//        JDialog dialog = new JDialog(parentFrame, "Título", true); // true = modal
//        
//        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
//        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro?");
		
	}

}
