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

        System.out.println("\n-------------------------- TASK 5 --------------------------\n");

        // 5. Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo
        // paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).

        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }

        System.out.println("\n-------------------------- TASK 6 --------------------------\n");

        // 6. Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius);

        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0){
                System.out.print(i + "; ");
            }
        }

        System.out.println("\n\n-------------------------- TASK 7 --------------------------\n");

        // 7. Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius) Jei
        // skaičius dalinasi iš 10 be liekanos jo nespausdinkite. ( naudokite
        // continue.) (atspausdinti visus porinus skaičius, išskyrus tuos kurie
        // dalinasi iš 10 be liekanos)

        for (int i = 10; i <= 50; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (i % 2 == 0){
                System.out.print(i + "; ");
            }
        }

        System.out.println("\n\n-------------------------- TASK 8 --------------------------\n");

        // 8. Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite, kiek
        // kartų kintamasis i turėjo porinę reikšmę;

        int count = 0;

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Kintamasis i " + count + " kartų turėjo porinę reikšmę");











    // NETRINTI
    }
}