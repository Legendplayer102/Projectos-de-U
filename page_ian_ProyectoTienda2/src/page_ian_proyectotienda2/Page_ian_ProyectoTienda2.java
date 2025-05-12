/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package page_ian_proyectotienda2;

import java.util.Scanner;
public class Page_ian_ProyectoTienda2 {
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
           
           //Ventas
           
           if (opcion == 2){ 
               if (!cajaAbierta || !diaActivo){
                   System.out.println("La caja esta cerada o el dia esta cerrado");
               }
           
           
                // Variables para le siguiente venta

                double subtotalVenta = 0;
                boolean continuarVenta = true;

                while (continuarVenta){
                    System.out.println("Ingrese tipo de cliente (A,B,C): ");
                    String tipoCliente = scanner.next().toUpperCase(); //por si el usuario escribe en minuscula

                    if (!tipoCliente.equals("A") && !tipoCliente.equals("B") && !tipoCliente.equals("C")){
                        System.out.println("Tipo de cliente invalido.");
                    } else {



                     //Los Productos disponibles

                     System.out.println("\nProductos disponibles:");
                     System.out.println("1. "+ productoAzucar + " - Lps" + precioAzucar + "/kg");
                     System.out.println("2. "+ productoAvena + " - Lps" + precioAvena + "/kg");
                     System.out.println("3. "+ productoTrigo + " - Lps" + precioTrigo + "/kg");
                     System.out.println("4. "+ productoMaiz + " - Lps" + precioMaiz + "/kg");

                        //Pedir el codigo del producto

                        System.out.println("Ingrese el codigo del producto a vender: ");
                        int codigoProducto = scanner.nextInt();

                        //verificar el producto y el tipo de cliente

                        boolean productoValido = false;
                        String nombreProducto = "";
                        double precioProducto = 0;

                       if (codigoProducto == 1){     //Azucar
                           if(tipoCliente.equals("A") || tipoCliente.equals("B")){
                               productoValido = true;
                               nombreProducto = productoAzucar;
                               precioProducto = precioAzucar;
                           }
                       } else if (codigoProducto == 2){
                           if(tipoCliente.equals("A") || tipoCliente.equals("B")){
                               productoValido = true;
                               nombreProducto = productoAvena;
                               precioProducto = precioAvena;
                            }  
                       } else if (codigoProducto == 3){
                           if(tipoCliente.equals("A") || tipoCliente.equals("B")){
                               productoValido = true;
                               nombreProducto = productoTrigo;
                               precioProducto = precioTrigo;
                            }
                       } else if (codigoProducto == 4){
                           if(tipoCliente.equals("A") || tipoCliente.equals("C")){
                               productoValido = true;
                               nombreProducto = productoMaiz;
                               precioProducto = precioMaiz;
                           }
                       } else {
                           System.out.println("Codigo de producto no valido.");
                       }
                       if (!productoValido){
                           System.out.println("Este cliente No puede comprar dicho producto.");
                       } else {
                           //Cantidad de kg
                           System.out.println("Ingrese la cantidad de kilogramos a vender: ");
                           double kg = scanner.nextDouble();
                           
                           if (kg > 0){
                               double monto = kg * precioProducto;
                               subtotalVenta += monto;
                               
                               //Actualizar productos vendidos
                               
                              if (codigoProducto == 1){
                                  ventasAzucar += kg;
                              } else if (codigoProducto == 2){
                                  ventasAvena += kg;
                              } else if (codigoProducto == 3){
                                  ventasTrigo += kg;
                              } else if (codigoProducto == 4){
                                  ventasMaiz += kg;
                              }
                              System.out.println("Vendido: " + kg + "kg de" + nombreProducto + monto);
                              
                           } else {
                               System.out.println("Cantidad no valida.");
                           }
                           
                       }
                       //Preguntar si desea comprar otro producto
                        System.out.println("Desea comprar otro producto? (S/N): ");
                        String respuesta = scanner.next().toUpperCase();
                        if (!respuesta.equals("S")){
                            continuarVenta = false; 
                        }
                    }
                    
                    //factura
                    
                    if (subtotalVenta > 0){   
                        System.out.println("\n=== FACTURA ===");
                        System.out.println("Subtotal: "+ subtotalVenta + "Lps");
                        
                        // Calculo de descuento
                        double descuento = 0;
                        if (subtotalVenta >= 5000){
                            descuento = subtotalVenta * 0.10;
                            System.out.println("Descuento (10%): "+ descuento + "Lps");
                        } else if (subtotalVenta >= 1000){
                            descuento = subtotalVenta * 0.05;
                            System.out.println("Descuento (5%): "+ descuento + "Lps");
                        }
                        
                        // Calcular Impuestos
                        double impuesto = (subtotalVenta - descuento) *0.07;
                        System.out.println("Impuesto (7%): " +impuesto+ "Lps");
                        
                        //Calcular el total
                        double total = subtotalVenta - descuento + impuesto;
                        System.out.println("Total a pagar: " +total+ "Lps");
                        
                        // Actializar contadores y la caja
                        
                        caja += total;
                        numeroVentas++;
                        totalVentas += total;
                        
                        // Calcular la ganancia de la venta
                        
                        double gananciaVenta = 0;
                        gananciaVenta = total * 0.2;
                        if (gananciaVenta > ventaMayorGanancia){
                            ventaMayorGanancia = gananciaVenta;
                        }
                    }
                }                
            }
           
           //compras
           
           if (opcion == 3){
               if (!cajaAbierta || !diaActivo){
                   System.out.println("La caja no esta abieta o el dia esta cerrado");
               }
             
               //tipo de proveedor
               System.out.println("Ingrese tipo de proveedor (A, B, C): ");
               String tipoProveedor = scanner.next().toUpperCase();
               
               // verificar proveedor
               
               if (!tipoProveedor.equals("A") && !tipoProveedor.equals("B") && !tipoProveedor.equals("C")){
                   System.out.println("Tipo de proveedor no valido");
               }
               
               // Tipo de productos disponibles dependiento del proveedor
               
               System.out.println("\nproductos disponibles para este proveedor:");
               if (tipoProveedor.equals("A")){
                   System.out.println("1. " + productoAzucar);
                   System.out.println("4. " + productoMaiz);
               } else if (tipoProveedor.equals("B")){
                   System.out.println("2. " + productoAvena);
                   System.out.println("3. " + productoTrigo);
               } else {
                   System.out.println("2. " + productoAvena);
               }
               
               //pedir el codigo del producto
               
               System.out.println("Ingrese el codigo del producto a comprar:");
               int codigoCompra = scanner.nextInt();
           }
           
           
          }
           
           
           
           
           
       
       }
               
       
       
       
       
}