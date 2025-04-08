import java.sql.SQLOutput;
import java.util.*;

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
                System.out.print(symbolSquare + " ");
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
                    System.out.print(symbolDiagonal + " ");
                }
                else {
                    System.out.print(symbolSquare + " ");
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
            if (totalKazys >= matchWin || totalPetras >= matchWin) {
                break;
            }
        }
        if (totalKazys > totalPetras) {
            System.out.println("Žaidimą laimėjo Kazys surinkęs " + totalKazys + " taškus(-ų)!");
        }
        if (totalPetras > totalKazys) {
            System.out.println("Žaidimą laimėjo Petras surinkęs " + totalPetras + " taškus(-ų)!");
        }
        if (totalKazys == totalPetras) {
            System.out.println("Po atkaklios kokvos žaidimas baigėsi lygiosiomis!" +
                    " Abu žaidėjai surinko po " + totalKazys + "taškus(-ų)");
        }

        System.out.println("\n-------------------------- TASK 17 --------------------------\n");

        // 17. Reikia nupaišyti pilnavidurį rombą, taip pat, kaip ir pilnavidurį kvadratą,
        // kurio aukštis 21 eilutė.

        int rowsDiamond = 21;
        char symbolDiamond1 = '*';
        char symbolDiamond2 = ' ';

        for (int i = rowsDiamond; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(symbolDiamond2);
            }
            for (int k = 1; k <= rowsDiamond; k++) {
                System.out.print(symbolDiamond1 + " ");
            }
            System.out.println();
        }

        System.out.println("\n-------------------------- TASK 18 --------------------------\n");

        // 18. Sumodeliuokite vinies kalimą. Įkalimo gylį sumodeliuokite
        // pasinaudodami Math.random() funkcija. Vinies ilgis 8.5cm (pilnai
        // sulenda į lentą).
        // a) “Įkalkite” 5 vinis mažais smūgiais. Vienas smūgis vinį įkala 5-20
        // mm. Suskaičiuokite kiek reikia smūgių.

        /*
        int nailLength = 85;
        boolean isDrivenIn = false;
        int lightHitMin = 5;
        int lightHitMax = 20;
        int lightHitsCount1 = 0;
        int lightHitsCount2 = 0;
        int lightHitsCount3 = 0;
        int lightHitsCount4 = 0;
        int lightHitsCount5 = 0;
        int lightHitsTotal = 0;
        int nail1;
        int nail1Sum = 0;
        int nail2;
        int nail2Sum = 0;
        int nail3;
        int nail3Sum = 0;
        int nail4;
        int nail4Sum = 0;
        int nail5;
        int nail5Sum = 0;

        while (!isDrivenIn) {
            System.out.println("Atliekamas mažas smūgis");
            nail1 = lightHitMin + (int) Math.round(Math.random() * (lightHitMax - lightHitMin));
            nail2 = lightHitMin + (int) Math.round(Math.random() * (lightHitMax - lightHitMin));
            nail3 = lightHitMin + (int) Math.round(Math.random() * (lightHitMax - lightHitMin));
            nail4 = lightHitMin + (int) Math.round(Math.random() * (lightHitMax - lightHitMin));
            nail5 = lightHitMin + (int) Math.round(Math.random() * (lightHitMax - lightHitMin));

            if (nail1Sum < nailLength) {
                nail1Sum += nail1;
                lightHitsCount++;
                System.out.println("Pirmoji vinis įkalta " + nail1 + "mm");
            }
            if (nail2Sum < nailLength) {
                nail2Sum += nail2;
                lightHitsCount++;
                System.out.println("Antroji vinis įkalta " + nail2 + "mm");
            }
            if (nail3Sum < nailLength) {
                nail3Sum += nail3;
                lightHitsCount++;
                System.out.println("Trečioji vinis įkalta " + nail3 + "mm");
            }
            if (nail4Sum < nailLength) {
                nail4Sum += nail4;
                lightHitsCount++;
                System.out.println("Ketvirtoji vinis įkalta " + nail4 + "mm");
            }
            if (nail5Sum < nailLength) {
                nail5Sum += nail5;
                lightHitsCount++;
                System.out.println("Penktoji vinis įkalta " + nail5 + "mm");
            }
            if (nail1Sum >= nailLength && nail2Sum >= nailLength
                    && nail3Sum >= nailLength && nail4Sum >= nailLength && nail5Sum >= nailLength) {
                System.out.println("Prireikė " + lightHitsCount + "smūgių");
                isDrivenIn = true;
            }
        }

        System.out.println("\nPasiruošiama pirmosios vinies kalimui");
        while (nail1Sum < nailLength) {
            System.out.println("Atliekamas mažas smūgis");
            nail1 = lightHitMin + (int) Math.round(Math.random() * (lightHitMax - lightHitMin));

            if (nail1Sum < nailLength) {
                nail1Sum += nail1;
                lightHitsCount1++;
                System.out.println("Pirmoji vinis įkalta " + nail1Sum + "mm");
            }
            if (nail1Sum >= nailLength) {
                System.out.println("Prireikė " + lightHitsCount1 + " smūgių");
                break;
            }
        }

        System.out.println("\nPasiruošiama antrosios vinies kalimui");
        while (nail2Sum < nailLength) {
            System.out.println("Atliekamas mažas smūgis");
            nail2 = lightHitMin + (int) Math.round(Math.random() * (lightHitMax - lightHitMin));

            if (nail2Sum < nailLength) {
                nail2Sum += nail2;
                lightHitsCount2++;
                System.out.println("Pirmoji vinis įkalta " + nail2Sum + "mm");
            }
            if (nail2Sum >= nailLength) {
                System.out.println("Prireikė " + lightHitsCount2 + " smūgių");
                break;
            }
        }

        System.out.println("\nPasiruošiama trečiosios vinies kalimui");
        while (nail3Sum < nailLength) {
            System.out.println("Atliekamas mažas smūgis");
            nail3 = lightHitMin + (int) Math.round(Math.random() * (lightHitMax - lightHitMin));

            if (nail3Sum < nailLength) {
                nail3Sum += nail3;
                lightHitsCount3++;
                System.out.println("Pirmoji vinis įkalta " + nail3Sum + "mm");
            }
            if (nail3Sum >= nailLength) {
                System.out.println("Prireikė " + lightHitsCount3 + " smūgių");
                break;
            }
        }

        System.out.println("\nPasiruošiama ketvirtosios vinies kalimui");
        while (nail4Sum < nailLength) {
            System.out.println("Atliekamas mažas smūgis");
            nail4 = lightHitMin + (int) Math.round(Math.random() * (lightHitMax - lightHitMin));

            if (nail4Sum < nailLength) {
                nail4Sum += nail4;
                lightHitsCount4++;
                System.out.println("Pirmoji vinis įkalta " + nail4Sum + "mm");
            }
            if (nail4Sum >= nailLength) {
                System.out.println("Prireikė " + lightHitsCount4 + " smūgių");
                break;
            }
        }

        System.out.println("\nPasiruošiama penktosios vinies kalimui");
        while (nail5Sum < nailLength) {
            System.out.println("Atliekamas mažas smūgis");
            nail5 = lightHitMin + (int) Math.round(Math.random() * (lightHitMax - lightHitMin));

            if (nail5Sum < nailLength) {
                nail5Sum += nail5;
                lightHitsCount5++;
                System.out.println("Pirmoji vinis įkalta " + nail5Sum + "mm");
            }
            if (nail5Sum >= nailLength) {
                System.out.println("Prireikė " + lightHitsCount5 + " smūgių");
                break;
            }
        }

        lightHitsTotal = lightHitsCount1 + lightHitsCount2 + lightHitsCount3 + lightHitsCount4 + lightHitsCount5;
        System.out.println("\nIš viso prireikė " + lightHitsTotal + " smūgių(-io)");
         */

        // Vinies ilgis 8.5cm (pilnai sulenda į lentą).
        // b) “Įkalkite” 5 vinis dideliais smūgiais. Vienas smūgis vinį įkala 20-30
        // mm, bet yra 50% tikimybė (pasinaudokite Math.random()
        // funkcija tikimybei sumodeliuoti), kad smūgis nepataikys į vinį.
        // Suskaičiuokite kiek reikia smūgių.

        int nailLength = 85;
        int heavytHitMin = 20;
        int heavyHitMax = 30;
        int heavyHitsCount1 = 0;
        int heavyHitsCount2 = 0;
        int heavyHitsCount3 = 0;
        int heavyHitsCount4 = 0;
        int heavyHitsCount5 = 0;
        int heavyHitsTotal = 0;
        int nail1;
        int nail1Sum = 0;
        int nail2;
        int nail2Sum = 0;
        int nail3;
        int nail3Sum = 0;
        int nail4;
        int nail4Sum = 0;
        int nail5;
        int nail5Sum = 0;
        int hitOrMiss;

        System.out.println("\nPasiruošiama pirmosios vinies kalimui");
        while (nail1Sum < nailLength) {
            System.out.println("Atliekamas didelis smūgis");
            hitOrMiss = (int) Math.round(Math.random());
            nail1 = heavytHitMin + (int) Math.round(Math.random() * (heavyHitMax - heavytHitMin));

            if (nail1Sum < nailLength) {
                if (hitOrMiss == 0) {
                    System.out.println("Į vinį buvo nepataikyta");
                    nail1Sum += 0;
                    heavyHitsCount1++;

                }
            }
            if (nail1Sum < nailLength) {
                if (hitOrMiss == 1) {
                    nail1Sum += nail1;
                    heavyHitsCount1++;
                    System.out.println("Pirmoji vinis įkalta " + nail1Sum + "mm");
                }
            }
            if (nail1Sum >= nailLength) {
                System.out.println("Prireikė " + heavyHitsCount1 + " smūgių");
                break;
            }
        }

        System.out.println("\nPasiruošiama antrosios vinies kalimui");
        while (nail2Sum < nailLength) {
            System.out.println("Atliekamas didelis smūgis");
            hitOrMiss = (int) Math.round(Math.random());
            nail2 = heavytHitMin + (int) Math.round(Math.random() * (heavyHitMax - heavytHitMin));

            if (nail2Sum < nailLength) {
                if (hitOrMiss == 0) {
                    System.out.println("Į vinį buvo nepataikyta");
                    nail2Sum += 0;
                    heavyHitsCount2++;

                }
            }
            if (nail2Sum < nailLength) {
                if (hitOrMiss == 1) {
                    nail2Sum += nail2;
                    heavyHitsCount2++;
                    System.out.println("Antroji vinis įkalta " + nail2Sum + "mm");
                }
            }
            if (nail2Sum >= nailLength) {
                System.out.println("Prireikė " + heavyHitsCount2 + " smūgių");
                break;
            }
        }

        System.out.println("\nPasiruošiama trečiosios vinies kalimui");
        while (nail3Sum < nailLength) {
            System.out.println("Atliekamas didelis smūgis");
            hitOrMiss = (int) Math.round(Math.random());
            nail3 = heavytHitMin + (int) Math.round(Math.random() * (heavyHitMax - heavytHitMin));

            if (nail3Sum < nailLength) {
                if (hitOrMiss == 0) {
                    System.out.println("Į vinį buvo nepataikyta");
                    nail3Sum += 0;
                    heavyHitsCount3++;

                }
            }
            if (nail3Sum < nailLength) {
                if (hitOrMiss == 1) {
                    nail3Sum += nail3;
                    heavyHitsCount3++;
                    System.out.println("Trečioji vinis įkalta " + nail3Sum + "mm");
                }
            }
            if (nail3Sum >= nailLength) {
                System.out.println("Prireikė " + heavyHitsCount3 + " smūgių");
                break;
            }
        }

        System.out.println("\nPasiruošiama ketvirtosios vinies kalimui");
        while (nail4Sum < nailLength) {
            System.out.println("Atliekamas didelis smūgis");
            hitOrMiss = (int) Math.round(Math.random());
            nail4 = heavytHitMin + (int) Math.round(Math.random() * (heavyHitMax - heavytHitMin));

            if (nail4Sum < nailLength) {
                if (hitOrMiss == 0) {
                    System.out.println("Į vinį buvo nepataikyta");
                    nail4Sum += 0;
                    heavyHitsCount4++;

                }
            }
            if (nail4Sum < nailLength) {
                if (hitOrMiss == 1) {
                    nail4Sum += nail4;
                    heavyHitsCount4++;
                    System.out.println("Ketvirtoji vinis įkalta " + nail4Sum + "mm");
                }
            }
            if (nail4Sum >= nailLength) {
                System.out.println("Prireikė " + heavyHitsCount4 + " smūgių");
                break;
            }
        }

        System.out.println("\nPasiruošiama penktosios vinies kalimui");
        while (nail5Sum < nailLength) {
            System.out.println("Atliekamas didelis smūgis");
            hitOrMiss = (int) Math.round(Math.random());
            nail5 = heavytHitMin + (int) Math.round(Math.random() * (heavyHitMax - heavytHitMin));

            if (nail5Sum < nailLength) {
                if (hitOrMiss == 0) {
                    System.out.println("Į vinį buvo nepataikyta");
                    nail5Sum += 0;
                    heavyHitsCount5++;

                }
            }
            if (nail5Sum < nailLength) {
                if (hitOrMiss == 1) {
                    nail5Sum += nail5;
                    heavyHitsCount5++;
                    System.out.println("Penktoji vinis įkalta " + nail5Sum + "mm");
                }
            }
            if (nail5Sum >= nailLength) {
                System.out.println("Prireikė " + heavyHitsCount5 + " smūgių");
                break;
            }
        }

        heavyHitsTotal = heavyHitsCount1 + heavyHitsCount2 +
                heavyHitsCount3 + heavyHitsCount4 + heavyHitsCount5;
        System.out.println("\nIš viso prireikė " + heavyHitsTotal + " smūgių(-io)");

        System.out.println("\n-------------------------- TASK 19 --------------------------\n");

        // 19. Sugeneruokite stringą, kurį sudarytų 50 atsitiktinių skaičių nuo 1 iki 200,
        // atskirtų tarpais. Skaičiai turi būti unikalūs (t.y. nesikartoti).
        // Sugeneruokite antrą stringą, pasinaudodami pirmu, palikdami jame tik
        // pirminius skaičius (t.y tokius, kurie dalinasi be liekanos tik iš 1 ir patys
        // savęs). Skaičius stringe sudėliokite didėjimo tvarka, nuo mažiausio iki
        // didžiausio. (reikės split() funkcijos ir masyvų).

        int randomMin = 1;
        int randomMax = 200;

        /*for (int i = 1; i <= nums1.length; i++) {
            nums1[i] = randomMin + (int) Math.round(Math.random() * (randomMax - randomMin));
        }

        Random rndGenerator = new Random();
        int randomIndex;
        int randomValue;

        for (int i = 1; i <= nums1.length; i++) {
            randomIndex = rndGenerator.nextInt(1, 51);

            randomValue = nums1[randomIndex];
            nums1[randomIndex] = nums1[i];
            nums1[i] = randomValue;
        }

        for (int i = 1; i <= nums1.length; i++) {
            string1 += nums1[i] + " ";
        }
        System.out.println(string1);
         */
        int[] numbers = new int[50];
        int numCount = 0;

        while (numCount < 50) {
            int newNumber = randomMin + (int) Math.round(Math.random() * (randomMax - randomMin));
            boolean isUnique = true;

            for (int i = 0; i < numCount; i++) {
                if (numbers[i] == newNumber) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                numbers[numCount] = newNumber;
                numCount++;
            }
        }

        String firstString = "";
        for (int i = 0; i < numbers.length; i++) {
            firstString += numbers[i] + " ";
        }

        System.out.println("Pirmas string'as: " + firstString);

        String[] splitNumbers = firstString.trim().split(" ");
        int[] primes = new int[50];
        int primeCount = 0;

        for (int i = 0; i < splitNumbers.length; i++) {
            int number = Integer.parseInt(splitNumbers[i]);
            boolean isPrime = true;

            if (number < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= number / 2; j++) {
                    if (number % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primes[primeCount] = number;
                primeCount++;
            }
        }

        for (int i = 0; i < primeCount - 1; i++) {
            for (int j = i + 1; j < primeCount; j++) {
                if (primes[i] > primes[j]) {
                    int temp = primes[i];
                    primes[i] = primes[j];
                    primes[j] = temp;
                }
            }
        }

        String secondString = "";
        for (int i = 0; i < primeCount; i++) {
            secondString += primes[i] + " ";
        }

        System.out.println("Antras string'as: " + secondString);

        System.out.println("\n---------------------- ADDITIONAL TASK ----------------------");

        Scanner sc = new Scanner(System.in);

        ArrayList<String> products = new ArrayList<>();
        boolean isRunning = true;
        boolean isPositive = false;
        boolean isViable = false;

        while (isRunning) {
            System.out.println("\nPasirinkite vieną iš žemiau pateiktų variantų: ");
            System.out.println("1. Atvaizduoti Jūsų mėgstamų maisto produktų sąrašą");
            System.out.println("2. Į sąrašą įtraukti naują(-us) produktą(-us)");
            System.out.println("3. Redaguoti pasirinktą produktą");
            System.out.println("4. Ištrinti produktą iš sąrašo");
            System.out.println("5. Ištrinti visus produktus iš sąrašo");
            System.out.println("6. Išeiti iš programos");
            System.out.print("Jūsų pasirinkimas: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println();
                    for (int i = 0; i < products.size(); i++) {
                        System.out.print(i + 1 + ". " + products.get(i) + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    while (!isPositive) {
                        System.out.print("Kiek naujų produktų norite įtraukti į sąrašą?: ");
                        int numOfAdded = sc.nextInt();
                        sc.nextLine();
                        if (numOfAdded > 0) {
                            for (int i = 0; i < numOfAdded; i++) {
                                System.out.print("Įveskite naujo produkto pavadinimą: ");
                                products.add(sc.nextLine());
                            }
                            isPositive = true;
                        }
                        if (numOfAdded <= 0) {
                            System.out.println("Produktų skaičius turi būti didesnis nei 0");
                        }
                    }
                    break;
                case 3:
                    if (products.isEmpty()) {
                        System.out.println("Produktų sąrašas tuščias");
                    }
                    else {
                        while (!isViable) {
                            System.out.println("Nurodykite produkto eilės numerį: ");
                            int productNum = sc.nextInt() - 1;
                            sc.nextLine();
                            if (productNum >= 1 && productNum <= products.size()) {
                                System.out.println("Nurodykite naująjį produkto pavadinimą");
                                String name = sc.nextLine();
                                products.set(productNum, name);
                                isViable = true;
                            }
                            else {
                                System.out.println("Nurodytas produkto eilės numeris neegzistuoja." +
                                        "\nPasirinkite numerį nuo 1 iki " + products.size());
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nurodykite produkto kurį norite ištrinti eilės numerį: ");
                    products.remove(sc.nextInt() - 1);
                    break;
                case 5:
                    System.out.println("Ar tikrai norite ištrinti visus produktus iš sąrašo? (0 = Ne; 1 = Taip): ");
                    int yesOrNo = sc.nextInt();
                    if (yesOrNo == 0) {
                        System.out.println("Produktai nebuvo ištrinti");
                    }
                    else if (yesOrNo == 1) {
                        products.clear();
                    }
                    else {
                        System.out.println("❌ Toks pasirinkimas neegzistuoja");
                    }
                    break;
                case 6:
                    System.out.println("Ačiū, kad naudojatės mūsų paslaugomis. Sustabdome programą");
                    isRunning = false;
                    break;
                default:
                    System.out.println("❌ Toks pasirinkimas neegzistuoja");

            }
        }


























            // NETRINTI
    }
}