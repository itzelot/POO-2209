package vehiculo;

/**
 *
 * @author Itzel
 */
public class chasis {
    private String fabricante;
    private int VIN;
    private String modelo;
    
    public chasis (String fabricante, int VIN, String modelo){
        this.VIN = VIN;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
public void ensamblar(){
    System.out.println("Ensamblar Chasis");
}
}

