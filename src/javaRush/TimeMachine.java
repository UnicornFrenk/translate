package javaRush;

public class TimeMachine {

    //!!!!!!!!!!примитивы в Java передаются в методы по значению.!!!!!!!!
    //Когда мы вызываем метод goToPast(), и передаем туда нашу переменную
    // int currentYear = 2018, в метод попадает не сама переменная currentYear, а ее копия.
    //
    //Значение этой копии, конечно, тоже равно 2018,
    // но все изменения, которые происходят с копией,
    // никак не влияют на нашу изначальную переменную currentYear!

        public void goToFuture(int currentYear) {

            currentYear = currentYear+10;
        }

        public void goToPast(int currentYear) {

            currentYear = currentYear-10;
        }

        public static void main(String[] args) {

            TimeMachine timeMachine = new TimeMachine();
            int currentYear = 2018;

            System.out.println("Какой сейчас год?");
            System.out.println(currentYear);

            timeMachine.goToPast(currentYear);
            System.out.println("А сейчас?");
            System.out.println(currentYear);
        }
    }
