package com.erickSA.programaProductos.baseDeDatos;

import java.sql.SQLException;
import java.util.List;

public class Data {
    private Conexion con;

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("bdProgramaProductos");
    }
    
    // iniciar Sesión
    public String getNombre(String rut, String password){
        return null;
    }
    
    public void crearProducto(Producto p) throws SQLException{
        String insert = "INSERT INTO producto VALUES(NULL, '"+p.getNombre()+"','"+p.getMarca()+"','"+p.getPrecio()+"','"+p.getStock()+"');";
        con.ejecutar(insert);
    }
    
    public List<Producto> getProductos(){
        return null;
    }
    
    public List<Producto> getProductos(String texto){
        return null;
    }
    
    public void eliminarProducto(int id) throws SQLException{
        String delete = "DELETE FROM producto WHERE id = '"+id+"'";
        
        con.ejecutar(delete);
    }
    
    public void actualizarProducto(Producto p) throws SQLException{
        String update = "UPDATE " +
                        "    producto " +
                        "SET" +
                        "    precio = '"+p.getPrecio()+"'," +
                        "    stock = '"+p.getStock()+"'" +
                        "WHERE " +
                        "    id = '"+p.getId()+"';";
        con.ejecutar(update);
    }
}
