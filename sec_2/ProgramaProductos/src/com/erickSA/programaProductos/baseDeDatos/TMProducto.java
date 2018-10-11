package com.erickSA.programaProductos.baseDeDatos;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TMProducto extends AbstractTableModel{
    
    private List<Producto> lista; // 

    public TMProducto(List<Producto> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3; // id(0), nombre(1), precio(2)
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto pro = lista.get(rowIndex);
        
        switch(columnIndex){
            case 0: // id
                return pro.getId();
            case 1: // nombre
                return pro.getNombre();
            default:
                return pro.getPrecio();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: // id
                return "ID";
            case 1: // nombre
                return "Nombre";
            default:
                return "Precio";
        }
    }
 
    
    
}
