//Se importa la clase Scanner
import java.util.Scanner;

//Se crea la clase Reto_5
public class Reto_5 {

        //Metodo main para ejecutar las instrucciones, inicio del programa
        public static void main(String[] args) {
        
        //Declaracion de variables
        int cantidadProductos = 0;
        String nombreClie, nombreCajero;
        double total = 0;;
        int j, idenClie, idenEmplea,opcion,consulPrecio, rol;
        int valor = 0;
        double costo = 0;
        double precio = 0;
        double Iva = 0;

        //Clase Scanner para capturar los datos
        Scanner Entrada = new Scanner(System.in);
        //Se muestra una lista de productos
        System.out.println("Lista de productos");
        System.out.println("Arroz: 1");
        System.out.println("Leche: 2");
        System.out.println("Lentejas: 3");
        System.out.println("Frijoles: 4");
        System.out.println("Carne: 5");
        System.out.println("Huevos: 6");
        System.out.println("Pollo: 7");
        System.out.println("Pescado: 8");

        //se solicitan datos
        System.out.println("Cual es su rol: "); 
        System.out.println("Cliente: 1 ");
        System.out.println("Empleado: 2 ");
        System.out.print("Rol: "); rol = Integer.parseInt(Entrada.nextLine());

        //Entra en el rol del cliente
        if(rol == 1){

            //Se le permite consultar el precio
            System.out.println("Consultar Precio: "); consulPrecio = Integer.parseInt(Entrada.nextLine());

            //Condicional switch que evalua el valor del precio ingresado a consultar
            switch(consulPrecio){

                case 1:

                    System.out.println("Arroz: 1000");

                break;

                case 2:

                    System.out.println("Leche: 2000");

                break;
                case 3:

                    System.out.println("Lentejas: 3000");

                break;
                case 4:

                    System.out.println("Frijoles: 4000");

                break;
                case 5:

                    System.out.println("Carne: 5000");

                break;
                case 6:

                    System.out.println("Huevos: 6000");

                break;
                case 7:

                    System.out.println("Pollo: 7000");

                break;
                case 8:

                    System.out.println("Pescado: 8000");

                break;

            }

            //Rol empleado
        }else if(rol == 2){

            //Solicita los datos del empleado
            System.out.println("ingrese su nombre e identificacion: ");

            System.out.print("Identificacion: "); idenEmplea = Integer.parseInt(Entrada.nextLine());
            System.out.print("Nombre: "); nombreCajero = Entrada.nextLine();

                //muestra un mini menu de las acciones que puede realizar el usuario
                System.out.println("Acciones");
                System.out.println("Registrar compra: 1");
                System.out.println("Salir: 2");
                System.out.println("Accion: "); opcion = Integer.parseInt(Entrada.nextLine());
                
                //Si elije la opcion 1, da la opcion de registrar una compra
                if(opcion == 1){

                    //Solicita datos
                System.out.println("Favor Ingrese la siguiente informacion ");
                System.out.print("Nombre: "); nombreClie = Entrada.nextLine();
                System.out.print("identificacion: "); idenClie = Integer.parseInt(Entrada.nextLine());
                System.out.print("Cantidad de productos: "); cantidadProductos = Integer.parseInt(Entrada.nextLine());

                    //Ciclo for el cual permite registrar los productos
                    for (j = 0; j < cantidadProductos; j++){

                        //Contador para saber que producto se esta ingresando
                        valor = valor + 1;

                        //se solicita el costo del producto
                        System.out.println("Ingrese el costo del producto "+valor);

                        //Se solicita el costro del producto
                         precio = Double.parseDouble(Entrada.nextLine());

                            //Se menciona el precio del prodcuto
                            System.out.println("El precio del producto "+valor+" es "+precio);

                            //Se almacenan los totales de todos los productos
                            total = total + precio;

            }

            //Se saca el valor del iva del total de los productos
            Iva = total * 0.19;

            //Se suma el iva al total de la compra
            total = total + Iva;

            //Muestra el mensaje final del programa con todos los datos correspondientes
            System.out.println("Usted a sido atendido por: "+nombreCajero+", su nombre es: "+nombreClie+" y se identifica como "+idenClie+", el total a comprar por sus productos incluido el iva es de "+total+" pesos");
        }

    }

    //Cierra el buffer
    Entrada.close();
}

}

                
    
            

    
    

