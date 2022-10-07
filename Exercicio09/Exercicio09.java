import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args)  throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com uma temperatura em graus Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        
        double celcius = 5 * ((fahrenheit-32)/ 9);
        System.out.println(fahrenheit + "graus fahrenheit, equivalem a " + celcius + "graus Celcius.");
    }
}