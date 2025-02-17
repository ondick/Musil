import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Úkol a
        String [] pole = {"Kuba", "Štěpán", "Michal", "Jirka","Tomáš"};
        for(int i=0; i<pole.length; i++){
            System.out.print(pole[i]+"-");
        }
        //úkol b

        int N;
        double[] znamky;
        System.out.print("Napiš kolik čísel bude v poli: ");
        N = sc.nextInt();
        sc.nextLine();
        znamky = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Zadej " + (i + 1) + " číslo");
            znamky[i] = sc.nextDouble();
        }
        System.out.println("Kolikátou známku bys chtěl znát?");
        int cislo = sc.nextInt();
        sc.nextLine();
        if (cislo >0 && cislo <= N) {
            System.out.print("Známka je: ");
            System.out.print(znamky[cislo - 1]);
        }
        else {
            System.out.println("Číslo musí být mezi 1-"+N);
        }

        //úkol c
        Kamarad [] kamos = new Kamarad[3];
        for (int i = 0; i < kamos.length; i++) {
            System.out.println("Napiš jméno: ");
            String jmeno = sc.nextLine();
            System.out.println("Napiš rok narození: ");
            int rok = sc.nextInt();
            sc.nextLine();
            kamos[i] = new Kamarad(jmeno,rok);
        }
        double min = Double.MAX_VALUE;


    }
}