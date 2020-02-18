package ico.fes.poo;

public class Reloj {
    
    private int hora;
    private int minuto;
    private int segundo;
    private boolean contador=true;
 
// CONSTRUCTOR     
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

// GETTER AND SETTER    
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    public int getSegundo(){
        return segundo;
    }
    
    public void setSegundo(){
        this.segundo = segundo;
    }
    
// **TERMINA** GETTER AND SETTER 
    

// METODO mostrarHora NOS SIRVE PARA MOSTRAR LA HORA    
    public void mostrarhora(){
        
        while(contador=true);
        
            if(hora<10){ 

                System.out.print("0");

            }       
            System.out.print(this.hora + ":"); // Imprime el valor de hora


            if(minuto<10){ 

                System.out.print("0");

            }        
            System.out.print(this.minuto + ":");


            if(segundo<10){ 

                System.out.print("0");

            }
            System.out.println(this.segundo);
            
            
            incrementarSegundo();  
            
   
            try { 
                Thread.sleep(1000);
               }
            catch(InterruptedException e) {
            }
            
        }
        
    }
    
    
// METODO incrementarSegundo     
    public void incrementarSegundo(){
    
        segundo++;
        if(segundo>59){ // Si segundo es mayor a 59 regresa a 0 y llamamos al metodo incrementarMinuto
            segundo=0;
            incrementarMinuto();         
        }
    
    }
    
// METODO incrementarMinuto     
    public void incrementarMinuto(){
    
        minuto++;
        if(minuto>59){ 
            minuto=0;
            incrementarHora(); 
        }
    
    }
    
// METODO incrementarHora
    public void incrementarHora(){
        
        hora++;
        if(hora>23) { 
            reset();
        }
        
    }
    
// METODO reset PARA REINICIAR HORA    
    public void reset(){
        
        segundo=0;
        minuto=0;
        hora=0;
        
    }
    
    
}

