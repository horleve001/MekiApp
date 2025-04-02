import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        KeszTermek keszTermek = new KeszTermek("sajt", 1000, 2);
        KeszTermek keszTermek2 = new KeszTermek("Alma", 100, 1);
        KeszTermek keszTermek3 = new KeszTermek("Körte", 200, 3);
        List <KeszTermek> keszTermekList = new ArrayList<>();
        keszTermekList.add(keszTermek);
        keszTermekList.add(keszTermek2);
        keszTermekList.add(keszTermek3);

        Rendeles rendeles = new Rendeles();
        rendeles.addRendeltArucikk(1, 2, keszTermekList);
        rendeles.addRendeltArucikk(2, 3, keszTermekList);
        rendeles.addRendeltArucikk(3, 4, keszTermekList);
        System.out.println(rendeles.toString(keszTermekList));

        
        scanner.close();
    }
}

