
package provemax34;

import provemax34.AccesoData.ProductoData;
import provemax34.Entidades.Producto;


public class ProveMax34 {

    
    public static void main(String[] args) {
        ProductoData prodD=new ProductoData();
//        Producto prod=new Producto("Heladera","Electrolux catA",150000, 5, true);
//        prodD.guardarProducto(prod);
       Producto prod= new Producto(6,"Heladera","Whirpool catA",180000, 5, true);
        prodD.modificarProducto(prod);
        prodD.eliminarProducto(prod.getIdProducto());
    }
    
}
