public class CuentaBancaria {

    int id = 0;
    String nombre;
    float deposito;

    public CuentaBancaria(String nombre, int id, float deposito) {
        this.nombre = nombre;
        this.id = id;
        this.deposito = deposito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public float credito(float deposito){
        return this.deposito = this.deposito + deposito;

    }

    public void  debito (float sustraccion){

        if (this.deposito >= sustraccion){
            this.deposito = this.deposito - sustraccion;
            System.out.println("El monto total despues del retiro es: "+ this.deposito);
        } else{
            System.out.println("no tenes tanto dinero");
        }
    }

    public String toString (){
        return "Nombre: "+nombre+ ", Deposito: "+deposito+ ". Id: " +id;

    }

}

