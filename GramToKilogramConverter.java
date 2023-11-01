import java.util.Scanner;


public class GramToKilogramConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat dalam gram: ");
        double beratGram = input.nextDouble();

        double beratKilogram = beratGram / 1000;

        System.out.println("Berat dalam kilogram: " + beratKilogram + " kg");

        input.close();
    }
}

