package by.epam.tasks.classes.first;

/*  Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
    переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
    наибольшее значение из этих двух переменных.
 */

public class Test1 {
    private int a = 0;
    private int b = 0;

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.setA(1);
        test.setB(2);
        test.show();
        System.out.print("Change numbers: ");
        test.changeNumber(4, 5);

        System.out.println("sum of numbers " + test.sumNumber());
        System.out.println("biggest number " + test.whatIsMore());
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    private void show() {
        System.out.println(a +" "+ b);
    }

    private void changeNumber(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a + " " + b);
    }

    private int sumNumber() {
        return a+b;
    }

    private int whatIsMore() {
        return Math.max(a, b);
    }
}
