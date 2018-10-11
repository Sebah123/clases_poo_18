package cl.rivasEnterprise.softwareProductos.model.tableModel;

// Finalidad de colocar los datos (Productos) en la tabla

import cl.rivasEnterprise.softwareProductos.model.Producto;
import java.util.List; // no java.awt.List
import javax.swing.table.AbstractTableModel;

public class TMProducto extends AbstractTableModel{
    private List<Producto> lista; // necesita si o si

    public TMProducto(List<Producto> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3; // id, nombre, precio
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto pro = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0: 
                return pro.getId();
            case 1:
                return pro.getNombre();
            default:
                return pro.getPrecio();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: 
                return "ID";
            case 1:
                return "Nombre";
            default:
                return "Precio";
        }
    }
}
