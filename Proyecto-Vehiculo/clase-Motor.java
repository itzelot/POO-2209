package vehiculo;

/**
 *
 * @author Itzel
 */
public class motor {
    private int cilindros;
    private String tipo;
    private String tamanio;
    
    public motor(int cilindros, String tipo, String tamanio){
        this.cilindros = cilindros;
        this.tamanio = tamanio;
        this.tipo = tipo;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

public void encender(){
    System.out.println("Encender Motor");
}

public void apagar(){
    System.out.println("Apagar Motor");
}
}

