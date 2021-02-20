package by.epam.tasks.classes.fifth;

/*  Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
    на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
    произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
    позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
* */

public class Counter {

    private int decimalCounter;

    public Counter() {
        decimalCounter = 0;
    }

    public Counter(int decimalCounter) {
        if(decimalCounter > 99 || decimalCounter <0) decimalCounter = 0;
        this.decimalCounter = decimalCounter;
    }

    public void increaseCounter(){
        if (decimalCounter < 99) decimalCounter++;
        else decimalCounter = 0;
    }

    public void decreaseCounter(){
        if ((decimalCounter != 0))
            decimalCounter--;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "decimalCounter=" + decimalCounter +
                '}';
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.toString());
        counter = new Counter(100);
        System.out.println(counter.toString());
        counter.increaseCounter();
        System.out.println(counter.toString());
        counter.decreaseCounter();
        counter.decreaseCounter();
        System.out.println(counter.toString());
    }
}
