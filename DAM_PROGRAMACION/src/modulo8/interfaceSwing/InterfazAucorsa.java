package modulo8.interfaceSwing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.List;

public class InterfazAucorsa extends JFrame {

    private JTable tablaBuses;
    private DefaultTableModel modeloTabla;

    public InterfazAucorsa() {
        setTitle("Gestión de Autobuses - AUCORSA");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //  Panel superior con el título
        JLabel titulo = new JLabel("AUCORSA", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(titulo, BorderLayout.NORTH);

        //  Tabla en el centro
        modeloTabla = new DefaultTableModel(new String[]{"Registro", "Tipo", "Licencia"}, 0);
        tablaBuses = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaBuses);
        add(scrollPane, BorderLayout.CENTER);

        // Panel inferior con botones
        JPanel panelBotones = new JPanel(new FlowLayout());

        JButton btnActualizar = new JButton("Actualizar");
        JButton btnInsertar = new JButton("Insertar");
        JButton btnBorrar = new JButton("Borrar");

        panelBotones.add(btnActualizar);
        panelBotones.add(btnInsertar);
        panelBotones.add(btnBorrar);

        add(panelBotones, BorderLayout.SOUTH);

        // Acción de Actualizar (consulta y muestra datos)
        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cargarDatos();
            }
        });

        // Acción de Insertar (simplificada: datos fijos de ejemplo)
        btnInsertar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try (Connection conn = getConnection()) {
                    String sql = "INSERT INTO Bus (register, type, license) VALUES (?, ?, ?)";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, "B999");
                    ps.setString(2, "Prueba");
                    ps.setString(3, "LIC999");
                    ps.executeUpdate();
                    cargarDatos();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al insertar: " + ex.getMessage());
                }
            }
        });

        // Acción de Borrar (borra fila seleccionada)
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int fila = tablaBuses.getSelectedRow();
                if (fila >= 0) {
                    String registro = (String) modeloTabla.getValueAt(fila, 0);
                    try (Connection conn = getConnection()) {
                        PreparedStatement ps = conn.prepareStatement("DELETE FROM Bus WHERE register = ?");
                        ps.setString(1, registro);
                        ps.executeUpdate();
                        cargarDatos();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al borrar: " + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecciona una fila para borrar.");
                }
            }
        });

        // Cargar datos al inicio
        cargarDatos();
    }

    private void cargarDatos() {
        modeloTabla.setRowCount(0);
        try (Connection conn = getConnection()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Bus");
            while (rs.next()) {
                modeloTabla.addRow(new Object[]{
                    rs.getString("register"),
                    rs.getString("type"),
                    rs.getString("license")
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + ex.getMessage());
        }
    }
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/Aucorsa", "root", "12341234");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazAucorsa().setVisible(true));
    }
}
