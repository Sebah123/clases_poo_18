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
        return 2;// id, nombre
    }

    @Override
    public Object getValueAt(int row, int column) {
        Alumno a = lista.get(row);
        
        if(column == 0){
            return a.getId();
        }else{
            return a.getNombre();
        }
    }

    @Override
    public String getColumnName(int col) {
        if(col == 0){
            return "ID";
        }else {
            return "Nombre";
        }
    }
    
    
}
