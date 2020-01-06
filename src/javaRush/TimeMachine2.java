package javaRush;

public class TimeMachine2 {
    public void goToFuture(int currentYear) {

        currentYear = currentYear+10;
    }

    public void goToPast(int currentYear) {

        System.out.println("Метод goToPast начал работу!");

        System.out.println("Значение currentYear внутри метода goToPast (в начале) = " + currentYear);
        currentYear = currentYear-10;
        System.out.println("Значение currentYear внутри метода goToPast (в конце) = " + currentYear);
    }

    public static void main(String[] args) {

        TimeMachine2 timeMachine2 = new TimeMachine2();
        int currentYear = 2018;

        System.out.println("Какой год в самом начале работы программы?");
        System.out.println(currentYear);

        timeMachine2.goToPast(currentYear);
        System.out.println("А сейчас какой год?");
        System.out.println(currentYear);
    }
}
