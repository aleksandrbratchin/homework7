public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        System.out.println("\nЗадача 1");
        int accumulatedAmount = 0;
        int income = 15_000;
        int intent = 2_459_000;
        int month = 0;
        while ((accumulatedAmount += income) < intent) {
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + accumulatedAmount + " рублей");
        }

    }

    private static void task2() {
        System.out.println("\nЗадача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("\nЗадача 3");
        int population = 10_000_000;
        int mortalityPer1000People = 8;
        int fertilityPer1000People = 17;
        int growthPerYear = population / 1000 * (fertilityPer1000People - mortalityPer1000People);
        int period = 10;
        for (int year = 1; year <= period; year++) {
            population += growthPerYear;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("\nЗадача 4");
        int capital = 15_000;
        int percentPerMonth = 7;
        int intent = 12_000_000;
        int month = 0;
        while (capital < intent) {
            capital += (capital / 100 * percentPerMonth);
            System.out.println("Месяц " + ++month + ", сумма накоплений равна " + capital + " рублей");
        }
        System.out.println("Чтобы собрать " + intent + " Василию потребуется " + month + " месяцев");
    }

    private static void task5() {
        System.out.println("\nЗадача 5");
        int capital = 15_000;
        int percentPerMonth = 7;
        int intent = 12_000_000;
        int month = 0;
        while (capital < intent) {
            capital += (capital / 100 * percentPerMonth);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + capital + " рублей");
            }
        }
        System.out.println("Чтобы собрать " + intent + " Василию потребуется " + month + " месяцев");
    }

    private static void task6() {
        System.out.println("\nЗадача 6");
        int capital = 15_000;
        int percentPerMonth = 7;
        int years = 9;
        int totalMonths = years * 12;
        int month = 0;
        while (month <= totalMonths) {
            capital += (capital / 100 * percentPerMonth);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + capital + " рублей");
            }
        }
        System.out.println("За " + years + " лет Василий накопит " + capital + " рублей");
    }

    private static void task7() {
        System.out.println("\nЗадача 7");
        int firstFridayOfTheMonth = 5;
        int daysInAMonth = 31;
        int daysInAWeek = 7;
        for (int day = firstFridayOfTheMonth, i = daysInAWeek; day <= daysInAMonth; day++, i++) {
            if (i == daysInAWeek) {
                System.out.println("Сегодня пятница, " + day + " -е число. Необходимо подготовить отчёт.");
                i = 0;
            }
        }
    }

    private static void task8() {
        System.out.println("\nЗадача 8");
        int year = 1975;
        int startYear = year - 200;
        int period = 79;
        int cometFlybyYear = startYear;
        for (; (cometFlybyYear % period) != 0; cometFlybyYear++) {
        }
        do {
            System.out.println(cometFlybyYear);
            cometFlybyYear = cometFlybyYear + period;
        } while (cometFlybyYear <= year + period);
    }

}