package Clase_4;

public class Temperatura {

    public double kelvinCelsius(double kelvin) {
        double c = kelvin - 273.15;
        System.out.println("Kelvin a Celsius");
        return c;
    }

    public double celsiusKelvin(double celsius) {
        double k = celsius + 273.15;
        System.out.println("Celsius a Kelvin");
        return k;
    }

    public double kelvinFahrenheit(double kelvin) {
        double f = 9 * (kelvin - 273.15) / 5 + 32;
        System.out.println("Kelvin a Fahrenheit");
        return f;
    }

    public double fahrenheitKelvin(double fahrenheit) {
        double k = 9 * (fahrenheit - 32) / 9 + 273.15;
        System.out.println("Fahrenheit a  Kelvin ");
        return k;
    }
    
    public double celsiusFahrenheit(double celsius) {
        double f = 9*(celsius /5 )+32;
        System.out.println(" Celsisu a Fahrenheit ");
        return f;
    }
    
    public double fahrenheitCelsius(double fahrenheit) {
        double c = 5*(fahrenheit - 32)/9;
        System.out.println("Fahrenheit a celcius ");
        return c;
    }
    
    
    
    


//    //subrutina
//    public void farenheitCelcius(double farenheitCelcius){
//        double celcius= 5*(farenheitCelcius-32)/9;
//        System.out.println("celcius"+celcius);
//    }


}
