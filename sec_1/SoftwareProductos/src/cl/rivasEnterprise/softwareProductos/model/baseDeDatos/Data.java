package cl.rivasEnterprise.softwareProductos.model.baseDeDatos;

import cl.rivasEnterprise.softwareProductos.model.Producto;
import java.sql.SQLException;
import java.util.List;

public class Data {
    private Conexion con;
    
    public Data() throws ClassNotFoundException, SQLException{
        con = new Conexion("bdSoftwareProducto");
    }
    
    /*
    in  --> run, pass --> String run, String pass
    out --> nombre    --> String nombre
    */
    public String getNombreUsuario(String run, String pass){
        return null;
    }
    
    /*2.- El usuario va a poder crear un producto*/
    /*
    in  --> * atributos del Producto (EX ---> id) --> Producto p
    out --> nada --> void
    */
    public void crearProducto(Producto p) throws SQLException{
        String insert =  "INSERT INTO producto "
                + "VALUES(NULL, '"+p.getNombre()+"',"
                + "'"+p.getMarca()+"',"
                + "'"+p.getStock()+"',"
                + "'"+p.getPrecio()+"')";
        
        con.ejecutar(insert);
    }
    
    /*3.- El usuario va a poder eliminar un producto a través de su id*/
    /*
    in  --> id --> int id
    out --> vacío --> void
    */
    public void eliminarProducto(int id) throws SQLException{
        String delete = "DELETE FROM producto WHERE id = "+id;
        con.ejecutar(delete);
    }
    
    /*4.- El usuario va a poder ver una lista con los productos*/
    /*4.4 Todos los productos*/
    /*
    in  --> nada --> ()
    out --> Los productos --> List<Producto>
    */
    public List<Producto> getProductos(){
        return null;
    }
    
    /*5.- El usuario va a poder buscar un producto 
    por lo que sea (nombre o marca)*/
    /*
    in  --> String texto    --> filtro
    out --> Los productos   --> List<Producto>
    */
    
    public List<Producto> getProductos(String filtro){
        return null;
    }
    
    /*6.- El usuario va a poder actualizar un 
    producto (precio y el stock) por id */
    /*
    in  --> id, precio, stock --> Producto p --> modificados
    out --> void 
    */
    public void setProducto(Producto p) throws SQLException{
        String update = "UPDATE producto "
                + "SET precio = '"+p.getPrecio()+"', "
                + "stock = '"+p.getStock()+"' "
                + "WHERE id = '"+p.getId()+"'";
        
        con.ejecutar(update);
    }
}
