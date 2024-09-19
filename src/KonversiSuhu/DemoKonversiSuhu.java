package KonversiSuhu;

public class DemoKonversiSuhu {

    public static void main(String[] args) {
        KonversiSuhu2 KonversiSuhu2 = new KonversiSuhu2();
        double celsius = 25.0;
        double fahrenheit = KonversiSuhu2.celciusToFahrenheit(celsius);
        double reamur = KonversiSuhu2.celciusToReamur(celsius);
        double fahrenheitToReamur = KonversiSuhu2.fahrenheitToReamur(fahrenheit);

        System.out.println("Celsius ke Fahrenheit : " + fahrenheit);
        System.out.println("Celsius ke Reamur : " + reamur);
        System.out.println("Fahrenheit ke Reamur : " + fahrenheitToReamur);
    }
}

