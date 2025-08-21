public class Libro {

    int id;
    String titulo;
    String autor;
    double precio;
    int cantidad;
    static int contador = 1;

    public Libro(int cantidad, double precio, String autor, String titulo) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.autor = autor;
        this.titulo = titulo;
        this.id = this.id + contador ++;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    /*public String toString() {
        return "ID: "+ID+ ". Titulo: "+titulo+". Autor: "+autor+". Precio: "+precio+". Cantidad: "+this.Cantidad;

    }*/


    public void Venderlibro(int cantidadVentas){
        if (this.cantidad>cantidadVentas){
            this.cantidad = this.cantidad - cantidadVentas;
        }else {
            System.out.printf("No es posible vender tantos libros ");
        }
    }

    public void IncrementarCopias(int copias){
        this.cantidad = this.cantidad + copias;
    }

    public void Mostrarlibros(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Precio: "+this.precio);
        System.out.println("Cantidad: "+this.cantidad);
        System.out.println("id: "+this.id);
    }
}
