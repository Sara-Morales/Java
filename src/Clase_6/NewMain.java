
package Clase_6;

public class NewMain {

    
    public static void main(String[] args) {
       Perro perro=new Perro ();
       Perro perro1=new Perro ();
       Perro perro2=new Perro ();
       perro.color="negro";
       perro.raza="Mastin";
       perro.edad=5;
       perro.tamaño="Grande";
       
        perro1.color="blanco";
       perro1.raza="Maltés";
       perro1.edad=2;
       perro1.tamaño="Pequeño";
       
       perro2.color="marron";
       perro2.raza="chow chows";
       perro2.edad=3;
       perro2.tamaño="mediano";
       
       perro.comer();
       perro1.correr();
       perro2.sentarse();
       
        System.out.println("El perro " + perro.raza+ " es un perro " + perro.tamaño);
        System.out.println("El perro " + perro1.raza+ " es un perro " + perro.tamaño);
        
        if (perro.edad > perro1.edad) {
            System.out.println("El perro " + perro2.raza+ " es mas viejo que el " +perro1.raza);
            
            
        }else{
            System.out.println("El perro " +perro1.raza + " es mas viejo que el perro " + perro2.raza);
        }
    }
    
}
