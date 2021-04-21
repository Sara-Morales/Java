
package Clase_5;


public class Persona {
    
    
    public int edad=17;
    public String nombre ="";
    public String comida="";
    public String comerComidaChatarra="";
    public Persona() {
        
    }
    
    public void comer(){
        System.out.println("La persona " +nombre+ "esta comiendo");
    }
    
    public void mostrarEdad(){
        System.out.println(nombre + " tiene " + edad );
}
    public void comerSano(String comidaParametro){ // parametro cuando metemos la variable dentro
       this.comida=comidaParametro;
        System.out.println(nombre + " esta comiendo" + comidaParametro);
        
    }
    public void comerComidaChatarra(String chatarra) {
         this.comerComidaChatarra=chatarra;
        System.out.println(nombre + "le encanta comer " + chatarra);
    }
   public void comidaGeneral (){
            System.out.println("A " +nombre + " de comida rapida le gusta las " +comerComidaChatarra+ " y de comida sana le gusta " + comida);
   }
   public void estudiandoConOtraPersona(String otraPersona){
       System.out.println(nombre + "esta estudiando con " + otraPersona );   
   }

    }
   
