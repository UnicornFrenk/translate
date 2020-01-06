package javaRush;

public class Jarvis {

    public void sayHi(String...names) { //Запись (String...names) переданная в качестве
        // параметра позволяет нам указать, что в метод передается какое-то количество строк.
        // Мы не оговариваем заранее, сколько их должно быть, поэтому работа нашего метода
        // становится теперь намного более гибкой:
        for (String name : names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }
        public static void main (String[] args){
            Jarvis jarvis = new Jarvis();
            jarvis.sayHi("Тони Старк", "Капитан Америка");
        }
    }
