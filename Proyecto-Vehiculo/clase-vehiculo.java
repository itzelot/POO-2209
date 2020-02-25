package vehiculo;

public class Vehiculo {
   private String marca;
   private String modelo;
   private float precio;
   private int año;
   private chasis soporte;
   private motor funcionamiento;
   private llanta neumatico1;
   private llanta neumatico2;
   private llanta neumatico3;
   private llanta neumatico4;
   
   public Vehiculo(String marca, String modelo, float precio, int año, chasis soporte, motor funcionamiento, llanta neumatico1, llanta neumatico2, llanta neumatico3, llanta neumatico4){
       this.año = año;
       this.funcionamiento = funcionamiento;
       this.marca = marca;
       this.modelo = modelo;
       this.precio = precio;
       this.soporte = soporte;
       this.neumatico1 = neumatico1;
       this.neumatico2 = neumatico2;
       this.neumatico3 = neumatico3;
       this.neumatico4 = neumatico4;
      
   }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public chasis getSoporte() {
        return soporte;
    }

    public void setSoporte(chasis soporte) {
        this.soporte = soporte;
    }

    public motor getFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(motor funcionamiento) {
        this.funcionamiento = funcionamiento;
    }

    public llanta getNeumatico1() {
        return neumatico1;
    }

    public void setNeumatico1(llanta neumatico1) {
        this.neumatico1 = neumatico1;
    }

    public llanta getNeumatico2() {
        return neumatico2;
    }

    public void setNeumatico2(llanta neumatico2) {
        this.neumatico2 = neumatico2;
    }

    public llanta getNeumatico3() {
        return neumatico3;
    }

    public void setNeumatico3(llanta neumatico3) {
        this.neumatico3 = neumatico3;
    }

    public llanta getNeumatico4() {
        return neumatico4;
    }

    public void setNeumatico4(llanta neumatico4) {
        this.neumatico4 = neumatico4;
    }

public void encender(){
    System.out.println("Encender Vehiculo");
}

public void arrancar(){
    System.out.println("Arrancar Vehiculo");
}

public void apagar(){
    System.out.println("Apagar Vehiculo");
}

}

