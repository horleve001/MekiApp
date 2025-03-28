
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Keszlet keszlet = new Keszlet();


        System.out.println("mi a neve?");
        String nev = scanner.nextLine();
        System.out.println("mi az ára?");
        int ar = scanner.nextInt();
        System.out.println("mi a kódja?");
        int kod = scanner.nextInt();
        System.out.println("mi a kiszerelése?");
        int kiszereles = scanner.nextInt();
        System.out.println("mi a csomagtartalma?");
        double csomagTartalom = scanner.nextDouble();
        System.out.println("mi a mértékegysége?");
        String mertekegyseg = scanner.next();

        keszlet.add(nev, ar, kod, kiszereles, csomagTartalom, mertekegyseg);
        keszlet.add("Alma", 100, 1, 1, 0.5, "kg");
        keszlet.add("Körte", 200, 2, 1, 0.5, "kg");
        
        
        System.out.println(keszlet);
        
        scanner.close();
    }
}

