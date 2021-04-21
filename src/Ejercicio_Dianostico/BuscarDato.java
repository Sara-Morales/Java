package Ejercicio_Dianostico;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarDato {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        class Student {

            public String name;
            public String id;

            public void salude() {
                System.out.println("hola soy " + this.name);
            }

            public Student(String name, String id) {
                this.name = name;
                this.id = id;
            }
        }

        Scanner leer = new Scanner(System.in);

        Student scristian = new Student("cristian", "123");
        Student ssara = new Student("sara", "78787");
        Student strosky = new Student("trosky", "454564");
        System.out.println("es cris igual a sara");
        System.out.println(scristian.equals(ssara));

        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(scristian);
        studentsList.add(ssara);
        studentsList.add(strosky);

        System.out.println("Escriba el id que quiere buscar");
        String idabuscar = leer.next();

        System.out.println("Escriba el nombre que quiere buscar");
        String nombreabuscar = leer.next();

        Student studentaBuscar = new Student(nombreabuscar, idabuscar);
        //java 8
        /*Student estudianteEncontrado = studentsList.stream()
                .filter(student -> student.name.equals(studentaBuscar.name) && student.id.equals(studentaBuscar.id)  )
                .findAny()
                .orElse(null);
        if (estudianteEncontrado != null){
            System.out.println("el estudiante encontrado se llama");
            System.out.println(estudianteEncontrado.name);
            System.out.println("el estudiante tiene el id "+estudianteEncontrado.id);
        } else {
            System.out.println("estudiante no encontrado");
        }*/

        for (Student student : studentsList) {
            if (student.id.equals(studentaBuscar.id) && student.name.equals(studentaBuscar.name)) {
                System.out.println(student.name + " ha sido encontrado");
                break;
            }
        }
    }
}
