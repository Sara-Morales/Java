package Ejercicio_Dianostico;

import java.util.*;

public class EstudiantesPOO {

    static class Estudiante { //clase modelo identity

        public String nombre;
        public String cedula;
        public String materia;
        public float promedio;
        public boolean aprobado;
        Vector<Float> notas;

        public Estudiante(String cedula, String nombre, String materia, Vector<Float> notas) { //constructor
            this.nombre = nombre; //propiedades
            this.cedula = cedula;
            this.materia = materia;
            this.notas = notas;
            this.calcularPromedio(notas);
            this.aprobado = this.esAprobado();
        }

        boolean esAprobado() {
            return this.promedio > 3;
        }

        void calcularPromedio(Vector<Float> notas) { //metodo
            float promedio = 0;
            for (Float nota : notas) {
                promedio += nota;
            }
            promedio = promedio / notas.size();
            this.promedio = promedio;
        }
    }

    public static boolean chequearSiEstaRepetido(Vector<Estudiante> estudiantes, String nombreNuevoEstudiante) {
        Vector<String> nombres = new Vector<>();
        for (Estudiante estudiante : estudiantes) {
            nombres.add(estudiante.nombre);
        }
        boolean esRepetido = false;
        for (String nombre : nombres) {
            if (nombre.equals(nombreNuevoEstudiante)) {
                esRepetido = true;
            }
        }
        return esRepetido;
    }

    public static String convertirStr(int valor) {
        return String.valueOf(valor).getClass().getName();
    }

    public static void imprimaMsj(String mensaje) {
        System.out.println(mensaje);
    }

    public static String promptValue(String campo) {
        System.out.println(campo);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        System.out.println("Cuantos estudiantes");
        Scanner leernoEstudiantes = new Scanner(System.in);
        int noEstudiantes = Integer.parseInt(leernoEstudiantes.next());
        Vector<Estudiante> estudiantes = new Vector<>();
        for (int index = 0; index < noEstudiantes; index++) {
            imprimaMsj("estudiante " + convertirStr(index));

            String nombre = promptValue("nombre");
            String cedula = promptValue("cedula");
            String materia = promptValue("materia");

            Vector<Float> notas = new Vector<>();

            for (int index2 = 0; index2 < 5; index2++) {
                imprimaMsj("Nota no " + convertirStr(index2 + 1));
                Scanner scanner = new Scanner(System.in);
                float nota = scanner.nextFloat();
                notas.add(nota);
            }

            boolean esRepetido = chequearSiEstaRepetido(estudiantes, nombre);

            if (esRepetido) {
                continue;
            } else {
                Estudiante estudiante = new Estudiante(cedula, nombre, materia, notas); //instanciarla
                estudiantes.add(estudiante);
            }
        }
        imprimaMsj("los estudiantes ingresados son estos");
        System.out.println(estudiantes);
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.aprobado) {
                System.out.println(estudiante);
            }
        }
    }
}
