
package provemax34;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.List;
import provemax34.AccesoData.CompraData;
import provemax34.AccesoData.DetalleCompraData;
import provemax34.AccesoData.ProductoData;
import provemax34.AccesoData.ProveedorData;
import provemax34.Entidades.Compra;
import provemax34.Entidades.DetalleCompra;
import provemax34.Entidades.Producto;
import provemax34.Entidades.Proveedor;


public class ProveMax34 {

    
    public static void main(String[] args) {
        ProductoData prodD=new ProductoData();
//       Producto prod=new Producto("Heladera","Electrolux catA",150000, 5, true);
//        
       Producto prod= new Producto(4,"Lavarropas","Whirlpool",180000, 5, true);
        // prodD.guardarProducto(prod);
       //prodD.modificarProducto(prod);
        //prodD.eliminarProducto(prod.getIdProducto());
         // ProveedorData provD= new ProveedorData();
//          String result= provD.buscarProveedor(1)+"";
//          System.out.println(result);
//          List <Producto> listaP=prodD.listarProductosMasComprados(LocalDate.of(2023, 10, 1),LocalDate.of(2023, 10, 28));
//          System.out.println(listaP);
          Proveedor prov=new Proveedor("Marolio","domicilio1",123123 ,true);
          ProveedorData provD=new ProveedorData();
//          provD.guardarProveedor(prov);
          provD.modificarProveedor(prov);
//          provD.eliminarProveedor(2);
          Compra comp=new Compra(2,prov,(LocalDate.of(2023, 10, 5)));
          CompraData compD=new CompraData();
          //compD.guardarCompra(comp);
          //compD.modificarCompra(comp);
          //compD.borrarCompra(1);
          //compD.listarProductoPorFecha(LocalDate.of(2023,10,5));
          DetalleCompra dc= new DetalleCompra(1,5, 15000, comp, prod);
          DetalleCompraData dcd= new DetalleCompraData();
          //dcd.guardarDetalleCompra(dc);
          //dcd.modificarDetalleCompra(dc);
          //dcd.borrarDetalleCompra(1);
    }
    
}
