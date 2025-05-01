/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package page_ian_proyectotienda;


import java.util.Scanner;
public class Page_Ian_ProyectoTienda {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       //Definir variables de producto:
       
       int Azucar = 1;
       int Avena = 2;
       int Trigo = 3;
       int Maiz = 4;
       
       String productoAzucar = ("Azucar");
       String productoAvena = ("Avena");
       String productoTrigo = ("Trigo");
       String productoMaiz = ("Maiz");
       
       double precioAzucar = 30;
       double precioAvena = 25;
       double precioTrigo = 32;
       double precioMaiz = 20;
       
       double precioCompraAzucar = 25;
       double precioCopraAvena = 20;
       double precioCompraTrigo = 30;
       double precioCommpraMaiz = 18;
       
       //Definir variables de caja y estadisticas de costos:
       
       double caja = 0.00;
       boolean cajaAbierta = false; //Determinar el estado de la caja 
       boolean diaActivo = true;
       int numeroVentas = 0;
       int numeroCompras = 0;
       int totalVentas = 0;
       int totalCopras = 0;
       double ventaMayorGanancia = 0;
       double compraMayorCosto = 0;
       int ventasAzucar = 0;
       int ventasAvena = 0;
       int ventasTrigo = 0;
       int ventasMaiz = 0;
       
       //Menu principal
       
       while (true){
           System.out.println("\n*** Menu Principal ***");
           System.out.println("1. Abrir caja");
           System.out.println("2. Ventas");
           System.out.println("3. Compras");
           System.out.println("4. Reportes");
           System.out.println("5. Cierre de Caja");
           System.out.println("6. Salir del Sistema");
           System.out.println("Seleccione una opcion: ");
           int opcion = scanner.nextInt();
           
            // Funcion de el menu principal
       
           if (opcion == 1){
               if (!diaActivo) {            //Abrir la caja 
                   cajaAbierta = true; 
                   diaActivo = true;
                                        //Establecer los datos en 0 a inicio de ventas
                   numeroVentas = 0;
                   numeroVentas = 0;
                   numeroCompras = 0;
                   totalVentas = 0;
                   totalCopras = 0;
                   ventaMayorGanancia = 0;
                   compraMayorCosto = 0;
                   ventasAzucar = 0;
                   ventasAvena = 0;
                   ventasTrigo = 0;
                   ventasMaiz = 0;
                   
                   // parte visual para el usuario
                   
                   System.out.println("Caja abierta para uso");
               } else {
                   System.out.println("Ingrese cantidad que desea añadir a la caja");
                   double cantidad = scanner.nextDouble();
                   if (cantidad > 0){
                       caja += cantidad;
                       System.out.println("Se añadieron "+ caja + "Lps a la caja");
                   } else {
                       System.out.println("Cantidad Invalida. No se agregaron los fondos.");
                   }
                
                   
               }
           
           }
           
           if (opcion == 2){
               if (!cajaAbierta || !diaActivo){
                   System.out.println("La caja esta cerada o el dia esta cerrado");
               }
           }
           
           // Variables para le siguiente venta
           
           double subtotalVenta = 0;
           boolean continuarVenta = true;
           
           while (continuarVenta){
               System.out.println("Ingrese tipo de cliente (A,B,C): ");
               String tipoCliente = scanner.next().toUpperCase(); //por si el usuario escribe en minuscula
               
               if (!tipoCliente.equals("A") && !tipoCliente.equals("B") && !tipoCliente.equals("C")){
                   System.out.println("Tipo de cliente invalido.");
               }
           }
           
           //Los Productos disponibles
           
           System.out.println("\nProductos disponibles:");
           System.out.println("1. "+ productoAzucar + " - Lps" + precioAzucar + "/kg");
           System.out.println("1. "+ productoAvena + " - Lps" + precioAzucar + "/kg");
           System.out.println("1. "+ productoTrigo + " - Lps" + precioAzucar + "/kg");
           System.out.println("1. "+ productoMaiz + " - Lps" + precioAzucar + "/kg");
           
           //Pedir el codigo del producto
           
           System.out.println("Ingrese el codigo del producto a vender: ");
           
           int codigoProducto = scanner.nextInt();
           
           //verificar el producto y el tipo de cliente
           
           boolean productoValido = false;
           String nombreProducto = "";
           double precioProducto = 0;
           
          
           
           
           
           
           
       
       }
               
       
       
       
       
    }
    
}
