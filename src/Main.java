import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-------------------------- TASK 1 --------------------------\n");

        // 1. Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.

        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }

        System.out.println("\n-------------------------- TASK 2 --------------------------\n");

        // 2. Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n-------------------------- TASK 3 --------------------------\n");

        // 3. Sukurkite masyvą iš dešimties augalų pavadinimų.

        String[] plants = {"Afelandra", "Agapantas", "Akacija", "Akebija", "Anksta",
                               "Driados", "Dygfinikis", "Agurotis", "Alyvos", "Apynys"};

        System.out.println(Arrays.toString(plants) + "\n");

        for (int i = 0; i < plants.length; i++) {
            System.out.print(plants[i] + ", ");
        }

        System.out.println("\n\n-------------------------- TASK 4 --------------------------\n");

        // 4. Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.

        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i]);
        }






















    // NETRINTI
    }
}