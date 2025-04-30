package modulo8.interfaceSwing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class InterfazAucorsaTab extends JFrame {

    private DefaultTableModel modeloBuses, modeloDrivers, modeloPlaces;

    public InterfazAucorsaTab() {
       
    	setTitle("Gestión de Autobuses - AUCORSA");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();

        // TAB 1 - Autobuses
        modeloBuses = new DefaultTableModel(new String[]{"Registro", "Tipo", "Licencia"}, 0);
        JTable tablaBuses = new JTable(modeloBuses);
        JScrollPane scrollBuses = new JScrollPane(tablaBuses);
        
        JPanel panelBuses = crearPanelConBotones("Bus", modeloBuses, tablaBuses);
        
        
        panelBuses.add(scrollBuses, BorderLayout.CENTER);
       
        
        tabs.add("Autobuses", panelBuses);

        // TAB 2 - Conductores
        modeloDrivers = new DefaultTableModel(new String[]{"DNI", "Nombre", "Teléfono"}, 0);
        JTable tablaDrivers = new JTable(modeloDrivers);
        JScrollPane scrollDrivers = new JScrollPane(tablaDrivers);
        JPanel panelDrivers = crearPanelConBotones("Driver", modeloDrivers, tablaDrivers);
        panelDrivers.add(scrollDrivers, BorderLayout.CENTER);
        tabs.add("Conductores", panelDrivers);

        // TAB 3 - Lugares
        modeloPlaces = new DefaultTableModel(new String[]{"Código", "Nombre"}, 0);
        JTable tablaPlaces = new JTable(modeloPlaces);
        JScrollPane scrollPlaces = new JScrollPane(tablaPlaces);
        JPanel panelPlaces = crearPanelConBotones("Place", modeloPlaces, tablaPlaces);
        panelPlaces.add(scrollPlaces, BorderLayout.CENTER);
        tabs.add("Lugares", panelPlaces);

        add(tabs);
        cargarDatos("Bus", modeloBuses);
        cargarDatos("Driver", modeloDrivers);
        cargarDatos("Place", modeloPlaces);
    }

    private JPanel crearPanelConBotones(String tabla, DefaultTableModel modelo, JTable tablaSwing) {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel botones = new JPanel();

        JButton btnActualizar = new JButton("Actualizar");
        JButton btnInsertar = new JButton("Insertar");
        JButton btnBorrar = new JButton("Borrar");

        
        // e -> cargarDatos(tabla, modelo) Is the same that the code down
        
//        btnActualizar.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                cargarDatos(tabla, modelo);
//            }
//        });
//        
        
        btnActualizar.addActionListener(e -> cargarDatos(tabla, modelo));
        btnInsertar.addActionListener(e -> mostrarVentanaInsertar(tabla, modelo));
        btnBorrar.addActionListener(e -> borrarFila(tabla, modelo, tablaSwing));

        botones.add(btnActualizar);
        botones.add(btnInsertar);
        botones.add(btnBorrar);
        panel.add(botones, BorderLayout.SOUTH);
        return panel;
    }

    private void mostrarVentanaInsertar(String tabla, DefaultTableModel modelo) {
        JFrame ventana = new JFrame("Insertar en " + tabla);
        ventana.setSize(300, 200);
        ventana.setLocationRelativeTo(this);
        ventana.setLayout(new GridLayout(0, 2));

        JTextField[] campos;
        if (tabla.equals("Bus")) {
            campos = new JTextField[]{new JTextField(), new JTextField(), new JTextField()};
            ventana.add(new JLabel("Registro:")); ventana.add(campos[0]);
            ventana.add(new JLabel("Tipo:")); ventana.add(campos[1]);
            ventana.add(new JLabel("Licencia:")); ventana.add(campos[2]);
        } else if (tabla.equals("Driver")) {
            campos = new JTextField[]{new JTextField(), new JTextField(), new JTextField()};
            ventana.add(new JLabel("DNI:")); ventana.add(campos[0]);
            ventana.add(new JLabel("Nombre:")); ventana.add(campos[1]);
            ventana.add(new JLabel("Teléfono:")); ventana.add(campos[2]);
        } else {
            campos = new JTextField[]{new JTextField(), new JTextField()};
            ventana.add(new JLabel("Código:")); ventana.add(campos[0]);
            ventana.add(new JLabel("Nombre:")); ventana.add(campos[1]);
        }

        JButton btnInsertar = new JButton("Insertar");
        btnInsertar.addActionListener(e -> {
            try (Connection conn = getConnection()) {
                String sql;
                if (tabla.equals("Bus")) {
                    sql = "INSERT INTO Bus VALUES (?, ?, ?)";
                } else if (tabla.equals("Driver")) {
                    sql = "INSERT INTO Driver VALUES (?, ?, ?)";
                } else {
                    sql = "INSERT INTO Place VALUES (?, ?)";
                }
                PreparedStatement ps = conn.prepareStatement(sql);
                for (int i = 0; i < campos.length; i++) {
                    ps.setString(i + 1, campos[i].getText());
                }
                ps.executeUpdate();
                cargarDatos(tabla, modelo);
                ventana.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al insertar: " + ex.getMessage());
            }
        });
        ventana.add(btnInsertar);
        ventana.setVisible(true);
    }

    private void borrarFila(String tabla, DefaultTableModel modelo, JTable tablaSwing) {
        int fila = tablaSwing.getSelectedRow();
        if (fila >= 0) {
            String clave = (String) modelo.getValueAt(fila, 0);
            try (Connection conn = getConnection()) {
                String sql = "DELETE FROM " + tabla + " WHERE " + (tabla.equals("Place") ? "code" : "register") + " = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, clave);
                ps.executeUpdate();
                cargarDatos(tabla, modelo);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al borrar: " + ex.getMessage());
            }
        }
    }

    private void cargarDatos(String tabla, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        try (Connection conn = getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + tabla);
            int columnas = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getString(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + ex.getMessage());
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/Aucorsa", "root", "12341234");
    }

    public static void main(String[] args) {
        new InterfazAucorsaTab().setVisible(true);
    }
}