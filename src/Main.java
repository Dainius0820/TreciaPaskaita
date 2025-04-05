import java.sql.SQLOutput;
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
        // paskutinio, ir baigiant pirmuoju (atvirkščias ciklas).

        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }

        System.out.println("\n-------------------------- TASK 6 --------------------------\n");

        // 6. Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius).

        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0){
                System.out.print(i + "; ");
            }
        }

        System.out.println("\n\n-------------------------- TASK 7 --------------------------\n");

        // 7. Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius) Jei
        // skaičius dalinasi iš 10 be liekanos jo nespausdinkite. ( naudokite
        // continue.) (atspausdinti visus porinus skaičius, išskyrus tuos kurie
        // dalinasi iš 10 be liekanos).

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
        // kartų kintamasis i turėjo porinę reikšmę.

        int count = 0;

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Kintamasis i " + count + " kartų turėjo porinę reikšmę");

        System.out.println("\n-------------------------- TASK 9 --------------------------\n");

        // 9. Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių
        // nei 5 simboliai, ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai).

        String[] plants1 = {"Afelandra", "Agapantas", "Akacija", "Akebija", "Anksta",
                "Driados", "Dygfinikis", "Agurotis", "Alyvos", "Apynys"};
        int shorterCount = 0;
        int longerCount = 0;

        for (String plant : plants1) {
            if (plant.length() < 5) {
                shorterCount++;
                // System.out.println("<5");
            }
            if (plant.length() > 7) {
                // System.out.println(">7");
                longerCount++;
            }
        }
        System.out.println("Trumpesnių nei 5 simboliai žodžių skaičius: " + shorterCount);
        System.out.println("Ilgesnių nei 7 simboliai žodžių skaičius: " + longerCount);

        System.out.println("\n-------------------------- TASK 10 --------------------------\n");

        // 10. Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei
        // 5 simboliai bet trumpesnių  nei 10 simboliai. (tarp 5 ir 10 simbolių
        // ilgio)

        int countInterval = 0;

        for (String plant : plants1) {
            if (plant.length() > 5 && plant.length() < 10) {
                countInterval++;
            }
        }
        System.out.println("Masyve yra " + countInterval +
                " žodžių(-iai), kurių ilgis siekis tarp 5 ir 10 simbolių");

        System.out.println("\n-------------------------- TASK 11 --------------------------\n");

        // 11. Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos
        // atskirtus tarpais ir suskaičiuokite kiek tarp jų yra didesnių už 150.
        // Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.

        int counter = 0;

        for (int i = 0; i <= 19; i++) {
            String row = "";
            for (int x = 0; x <= 14; x++) {
                int rndNumber = (int) Math.round( Math.random() * 300 );
                if (rndNumber > 150) {
                    counter++;
                }
                if (rndNumber > 275) {
                   row += "[" + rndNumber + "] ";
                }else{
                    row += rndNumber + " ";
                }
            }
            System.out.println(row);
        }
        System.out.println("\nSkaičių didesnių nei 150 kiekis: " + counter);

        System.out.println("\n-------------------------- TASK 12 --------------------------\n");

        // 12. Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi
        // iš 77 be liekanos. Skaičius atskirkite kableliais. Po paskutinio skaičiaus
        // kablelio neturi būti.

        String list = "";

        for (int i = 1; i <= 3000; i++) {
            if (i % 77 == 0) {
                list += i + ", ";
            }
        }
        System.out.println(list.replaceAll(", $", ""));

        System.out.println("\n-------------------------- TASK 13 --------------------------\n");

        // 13. Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”.

        /*for (int i = 1; i <= 25; i++) {
            String rows = "* ";
            for (int x = 1; x <= 25; x++) {
                String columns = "* ";
                System.out.print(columns);
            }
            System.out.println(rows);
        }
         */

        char symbolSquare = '*';
        int rows = 25;
        int columns = 25;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbolSquare);
            }
            System.out.println();
        }

        System.out.println("\n-------------------------- TASK 14 --------------------------\n");

        // 14. Prieš tai nupieštam kvadratui nupieškite istrižaines zvaigzdutę
        // pakeisdami kitu simboliu.

        char symbolDiagonal = '@';

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j || i + j == columns - 1) {
                    System.out.print(symbolDiagonal);
                }
                else {
                    System.out.print(symbolSquare);
                }
            }
            System.out.println();
        }

        System.out.println("\n-------------------------- TASK 15 --------------------------\n");

        // 15. Metam monetą. Monetos kritimo rezultatą imituojam Math.random()
        // funkcija, kur 0 yra herbas, o 1 - skaičius. Monetos metimo rezultatus
        // išvedame į ekraną atskiroje eilutėje: “S” jeigu iškrito skaičius ir “H” jeigu
        // herbas. Suprogramuokite tris skirtingus scenarijus kai monetos metimą
        // stabdome:
        // a) Iškritus herbui;
        // b) Tris kartus iškritus herbui;
        // c) Tris kartus iš eilės iškritus herbui;

        // a)

        int coin;
        int countH = 0;
        boolean isHerbas = false;

//        while (!isHerbas) {
//            coin = (int) Math.round( Math.random() * 2 );
//            System.out.println("Metu monetą");
//            if (coin == 0) {
//                System.out.println("Rezultatas: herbas");
//                isHerbas = true;
//            }
//            else {
//                System.out.println("Rezultatas: skaičius");
//            }
//
//        }

        // b)

//        while (!isHerbas) {
//            coin = (int) Math.round( Math.random() * 2 );
//            System.out.println("Metu monetą");
//            if (coin == 0) {
//                System.out.println("Rezultatas: herbas");
//                countH++;
//                if (countH == 3) {
//                    isHerbas = true;
//                }
//            }
//            else {
//                System.out.println("Rezultatas: skaičius");
//            }
//
//        }
//        System.out.println("Herbas iškrito tris kartus");

        // c)

        while (countH < 3) {
            coin = (int) Math.round( Math.random() * 2 );
            System.out.println("Metu monetą");
           if (coin == 0) {
               System.out.println("Rezultatas: herbas");
               countH++;
               continue;
           }
           else {
                System.out.println("Rezultatas: skaičius");
                countH = 0;
            }

        }
        System.out.println("Herbas iškrito tris kartus iš eilės");

        System.out.println("\n-------------------------- TASK 16 --------------------------\n");

        // 16. Kazys ir Petras žaidžia šaškėm. Petras surenka taškų kiekį nuo 10 iki 20,
        // Kazys surenka taškų kiekį nuo 5 iki 25. Vienoje eilutėje išvesti žaidėjų
        // vardus su taškų kiekiu ir “Partiją laimėjo: laimėtojo vardas”. Taškų kiekį
        // generuokite funkcija Math.random(). Žaidimą laimi tas, kas greičiau
        // surenka 222 taškus. Partijas kartoti tol, kol kažkuris žaidėjas pirmas
        // surenka 222 arba daugiau taškų.

        int matchWin = 222;
        int totalKazys = 0;
        int totalPetras = 0;
        int minKazys = 5;
        int maxKazys = 25;
        int minPetras = 10;
        int maxPetras = 20;

        while (true) {
            int pointsKazys = minKazys + (int) Math.round(Math.random() * (maxKazys - minKazys));
            int pointsPetras = minPetras + (int) Math.round(Math.random() * (maxPetras - minPetras));
            if (pointsKazys > pointsPetras) {
                System.out.println("Kazys surinko " + pointsKazys + " taškus(-ų). "
                        + "Petras surinko " + pointsPetras + " taškus(-ų). " + "Partiją laimėjo: Kazys!");
                totalKazys += pointsKazys;
                totalPetras += pointsPetras;
            }
            if (pointsPetras > pointsKazys) {
                System.out.println("Kazys surinko " + pointsKazys + " taškus(-ų). "
                        + "Petras surinko " + pointsPetras + " taškus(-ų). " + "Partiją laimėjo: Petras!");
                totalKazys += pointsKazys;
                totalPetras += pointsPetras;
            }
            if (pointsKazys == pointsPetras) {
                System.out.println("Kazys surinko " + pointsKazys + " taškus(-ų). "
                        + "Petras surinko " + pointsPetras + " taškus(-ų). " + "Partija pasibaigė lygiosiomis!");
                totalKazys += pointsKazys;
                totalPetras += pointsPetras;
            }
            if (totalKazys >= matchWin) {
                System.out.println("Žaidimą laimėjo Kazys surinkęs " + totalKazys + " taškus!");
                break;
            }
            if (totalPetras >= matchWin) {
                System.out.println("Žaidimą laimėjo Petras " + totalPetras + " taškus!");
                break;
            }
        }

        System.out.println("\n-------------------------- TASK 17 --------------------------\n");

        // 17. Reikia nupaišyti pilnavidurį rombą, taip pat, kaip ir pilnavidurį kvadratą,
        // kurio aukštis 21 eilutė.

        /*int rowsDiamond = 21;
        char symbolDiamond = '*';

        for (int i = 0; i < rowsDiamond; i++) {
            for (int j = 0; j <; j++) {

            }
        }

         */































            // NETRINTI
    }
}