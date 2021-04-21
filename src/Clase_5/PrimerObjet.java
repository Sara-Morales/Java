package Clase_5;

public class PrimerObjet {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Persona persona1 = new Persona();
        persona.edad = 17;
        persona.nombre = "Sergio ";
        persona.comer();
        persona.mostrarEdad();
        persona.comerSano(" Manzanas");
        persona.comerComidaChatarra("alitas, hamburguesas, salchipapas ");
        persona.comidaGeneral();
        persona.estudiandoConOtraPersona("otra persona");
        persona.nombre="Sara";
        System.out.println(persona.nombre +" estudia con " + persona1);
    }
    

}

