import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int opcion;

    Scanner teclado = new Scanner(System.in);
    System.out.println("ingrese el ejercicio que quiere ver: ");
    opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                ejercicio1();
                break;
                case 2:
                    ejercicio2();
                    break;
                    case 3:
                        ejecicio3();
                        break;

        }
    }


    public static void ejercicio1 (){
        Empleado empleado1 = new Empleado(44619305, "Tomas", "Spina", 100000);
        Empleado empleado2 = new Empleado(20567439, "Nicolas", "Spina", 200000);



        System.out.println("Datos del Empleado: ");
        empleado1.mostrarEmpleado();

        System.out.println("El salario aumentado es: "+empleado1.aumento( 50));

    }

    public static void ejercicio2(){

        int ingreso;
        int retiro;

        CuentaBancaria cliente1 = new CuentaBancaria("Tomas", 123, 10);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero que desea ingresar ");
        ingreso = teclado.nextInt();

        System.out.println("El dinero que te queda en cuenta es: " +cliente1.credito(ingreso));

        System.out.println("Ingrese el monto que quiere retirar: ");
        retiro = teclado.nextInt();


        cliente1.debito(retiro);

        System.out.println(cliente1);
    }


    public static void ejecicio3(){
        int cantidadVentas;
        int copias;

        Scanner teclado = new Scanner(System.in);

        Libro libro1 = new Libro(10, 500, "Miguel de Cervantes", "Elquijote");
        Libro libro2 = new Libro(5, 700, "Gabriel Garcia marquez", "Cien años de soledad");

        System.out.println("Ingrese la cantidad de copias que desea vender: ");
        cantidadVentas = teclado.nextInt();

        libro1.Venderlibro(cantidadVentas);

        System.out.println(". La cantidad de libros luego de vender: " +libro1.getCantidad());

        System.out.println(". Ingrese la cantidad de copias que desea adquirir: ");
        copias = teclado.nextInt();

        libro1.IncrementarCopias(copias);

        System.out.println(". Cantidad de libros luego de comprar: " +libro1.getCantidad());
        System.out.println("");

        libro1.Mostrarlibros();

    }
}


