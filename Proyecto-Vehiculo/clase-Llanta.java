package vehiculo;

/**
 *
 * @author Itzel
 */
public class llanta {
    private float medida;
    private String tipo;
    private String marca;
    
    public llanta(float medida, String tipo, String marca){
        this.medida = medida;
        this.marca = marca;
        this.tipo = tipo;
    }

    public float getMedida() {
        return medida;
    }

    public void setMedida(float medida) {
        this.medida = medida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
public void rotar(){
    System.out.println("Rotar Llanta");
}

public void cambiar(){
    System.out.println("Cambiar Llanta");
}
}

