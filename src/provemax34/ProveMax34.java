
package provemax34;

import provemax34.AccesoData.ProductoData;
import provemax34.AccesoData.ProveedorData;
import provemax34.Entidades.Producto;


public class ProveMax34 {

    
    public static void main(String[] args) {
//        ProductoData prodD=new ProductoData();
//        Producto prod=new Producto("Heladera","Electrolux catA",150000, 5, true);
//        
//       Producto prod= new Producto(1,"Heladera","Patrick catA",180000, 5, true);
//         prodD.guardarProducto(prod);
//        prodD.modificarProducto(prod);
//        prodD.eliminarProducto(prod.getIdProducto());
          ProveedorData provD= new ProveedorData();
          String result= provD.buscarProveedor(1)+"";
          System.out.println(result);
    }
    
}
