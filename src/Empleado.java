public class Empleado {
    int dni;
    String nombre;
    String apellido;
    double salario;

    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

//A su vez se requiere otro metodo que permita
//aumentar el salario dependiendo del porcentaje que se le pase por
//parámetro.

    public double aumento (double porcentaje) {
        return this.salario + (this.salario * porcentaje) /100;

    }

/// Considere crear un metodo que facilite imprimir por pantalla las
/// características del objeto de la siguiente forma: Empleado dni=?, nombre=?, apellido=?, salario=?

    public void mostrarEmpleado(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Dni: "+this.dni);
        System.out.println("Salario: "+this.salario);

    }
}
