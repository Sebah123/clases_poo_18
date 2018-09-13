package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMAlumno extends AbstractTableModel{
    
    private List<Alumno> lista;

    public TMAlumno(List<Alumno> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumno a = lista.get(rowIndex);
        
        if(columnIndex == 0){
            return a.getNombre();
        }else {
            return a.getEdad();
        }
    }

    @Override
    public String getColumnName(int column) {
        if(column == 0){
            return "Nombre";
        }else {
            return "Edad";
        }
    }
    
}
