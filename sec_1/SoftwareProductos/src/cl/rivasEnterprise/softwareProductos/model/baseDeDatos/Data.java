package cl.rivasEnterprise.softwareProductos.model.baseDeDatos;

import cl.rivasEnterprise.softwareProductos.model.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private Conexion con;
    
    public Data() throws ClassNotFoundException, SQLException{
        con = new Conexion("bdSoftwareProducto");
    }
    
    // SELECT nombre, precio FROM producto WHERE precio < 3000;
    
    /**
     * 
     * @param precioTope
     * @return Lista de productos (Sólo el nombre y el precio)
     * @throws SQLException 
     */
    public List<Producto> getProductosOfertas(int precioTope) throws SQLException{
        List<Producto> lista = new ArrayList<>();
        
        String query = "SELECT nombre, precio FROM producto WHERE precio < "+precioTope;
        
        ResultSet rs = con.ejecutar(query);
        
        while(rs.next()){
            Producto pro = new Producto();
            
            pro.setNombre(rs.getString(1));
            pro.setPrecio(rs.getInt(2));
            
            lista.add(pro);
        }
        
        con.close();
        
        return lista;
    }
    
    // SELECT SUM(stock) FROM producto;
    public int getSumaStock() throws SQLException{
        int suma = 0;
        
        String query = "SELECT SUM(stock) FROM producto;";
        ResultSet rs = con.ejecutar(query);
        
        if(rs.next()){
            suma = rs.getInt(1);
        }
        
        con.close();
        
        return suma;
    }
    
    
    /*
    in  --> run, pass --> String run, String pass
    out --> nombre    --> String nombre
    */
    public String getNombreUsuario(String run, String pass) throws SQLException{
        String nombre = null;
        
        String query = "SELECT nombre FROM usuario "
                + "WHERE run = '"+run+"' AND pass = '"+pass+"';";
        
        ResultSet rs = con.ejecutar(query);
        
        if(rs.next()){
            nombre = rs.getString(1);
        }
        
        con.close();
        
        return nombre;
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
    public List<Producto> getProductos() throws SQLException{
        // Declarando e inicializando la lista
        List<Producto> lista = new ArrayList<>();
        
        // Declarando la consulta
        String query = "SELECT * FROM producto";
        
        // Ejecutando el select y dejo los datos en un ResultSet
        ResultSet rs = con.ejecutar(query);
        
        // Ciclo : Condición (Existe un siguiente registro?) --> Alex --> Hay frutas?
        while(rs.next()){
            // Alex sacó la bolsa y la abrió
            Producto pro = new Producto();
            
            // Alex: Vamos a poner las frutas en la bolsa
            pro.setId(rs.getInt(1));
            pro.setNombre(rs.getString(2));
            pro.setMarca(rs.getString(3));
            pro.setStock(rs.getInt(4));
            pro.setPrecio(rs.getInt(5));
            
            // Alex: Cierra la bolsa y lo coloca en otro bin
            lista.add(pro);
        }
        
        // Cierro la conexión
        con.close();
        
        // retorno la lista
        return lista;
    }
    
    /*5.- El usuario va a poder buscar un producto 
    por lo que sea (nombre o marca)*/
    /*
    in  --> String texto    --> filtro
    out --> Los productos   --> List<Producto>
    */
    
    public List<Producto> getProductos(String filtro) throws SQLException{
        List<Producto> lista = new ArrayList<>();
        
        String query = "SELECT * FROM producto WHERE nombre LIKE '%"+filtro+"%' "
                + "OR marca LIKE '%"+filtro+"%'";
        
        ResultSet rs = con.ejecutar(query);
        
        while(rs.next()){
            Producto pro = new Producto();
            
            pro.setId(rs.getInt(1));
            pro.setNombre(rs.getString(2));
            pro.setMarca(rs.getString(3));
            pro.setStock(rs.getInt(4));
            pro.setPrecio(rs.getInt(5));
            
            lista.add(pro);
        }
        
        con.close();
        
        return lista;
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
