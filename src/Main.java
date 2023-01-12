public class Main {
    public static void main(String[] args) {
//        // вариант решения №1 (не очень красивый код, но работает по условию задачи правильно)
//        int initialBalance = 100;
//        int sumDebited = 1200;
//        boolean okForBonus = sumDebited > 1000;
//        int bonus = sumDebited / 100;
//        int finalBalance = initialBalance + sumDebited + bonus;
//        int finalBalanceAdd = initialBalance + sumDebited;
//
//        if (okForBonus) {
//            System.out.println(finalBalance);
//        } else {
//            System.out.println(finalBalanceAdd);
//        }
//    }

//        // вариант решения №2 (код более красивый, работает также корректно)
//        int initialBalance = 100;
//        int sumDebited = 1200;
//        int finalBalance;
//
//        if (sumDebited > 1000) {
//            finalBalance = sumDebited / 100 + initialBalance + sumDebited;
//        } else {
//            finalBalance = initialBalance + sumDebited;
//        }
//        System.out.println(finalBalance);
//    }

        // вариант решения №3 (с тернарным условным оператором)
        int initialBalance = 100;
        int sumDebited = 1200;
        int finalBalance = sumDebited > 1000 ? sumDebited / 100 + initialBalance + sumDebited : initialBalance + sumDebited;
        System.out.println(finalBalance);
    }
}