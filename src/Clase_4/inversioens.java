package Clase_4;


public class inversioens {

    public static void main(String[] args) {


//Ruta para el otro archivo// nombre el archivo, nombre que queramos poner puede sel el mismo pero con un numeor y luego el new
        Temperatura temperatura1 = new Temperatura();

        String choose = "e";

        if (choose.equals("a")) {
            double k = 1;
            double c = temperatura1.kelvinCelsius(k);
            System.out.println("La conversion es: " + c);
        }
        
        if (choose.equals("b")) {
            double c = 1;
            double k = temperatura1.celsiusKelvin(c);
            System.out.println("La conversion es: " + k);
        }    
        
        if (choose.equals("c")) {
            double k = 1;
            double f = temperatura1.kelvinFahrenheit(k);
            System.out.println("La conversion es: " + f);
        } 
        
         if (choose.equals("d")) {
            double f = 1;
            double k = temperatura1.fahrenheitKelvin(f);
            System.out.println("La conversion es: " + k);
        } 
         
         if (choose.equals("e")) {
            double f = 1;
            double c = temperatura1.fahrenheitCelsius(f);
            System.out.println("La conversion es: " + c);
        } 
        
        
        
        
        
 //        contagradosKelvin kelvinCentigrados
//        farenheirCentigrados 
//        centigradosFarenheit
//        kelvinFarenheit
//                
//        int seleccion = 2;
//        if (seleccion == 1) {
//            System.out.println("contagradosKelvin ");
//        } else if (seleccion == 2) {
//            System.out.println("kelvinCentigrados");
//        }
//        else if (seleccion ==3) {
//            System.out.println("farenheirCentigrados ");
//        }
//        else if (seleccion==4) {
//            System.out.println("centigradosFarenheit");
//        }
//        else if (seleccion ==5) {
//            System.out.println("kelvinFarenheit");
//        }
//        else{
//            System.out.println("No existe la opcion");
//        }       
        
      
    }

}
