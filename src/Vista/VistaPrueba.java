package Vista;

import Modelo.ModeloTableModelEmpleado;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

public class VistaPrueba extends JFrame {


    private JPanel p1;
    private JTable table1;

    public VistaPrueba(ModeloTableModelEmpleado m) throws HeadlessException {
        super("tabla");
        p1= new JPanel();
        //recordar colocar la tabla en un scroll para que se vean la cabecera
        table1 = new JTable(m);
        p1.add(new JScrollPane(table1));
        this.setContentPane(p1);

        this.setSize(new Dimension(600,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
