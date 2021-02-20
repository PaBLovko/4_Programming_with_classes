package by.epam.tasks.classes.third;

/*      Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
        из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
        номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

import java.util.Arrays;

public class Student {
    private final String surname;
    private final String initials;
    private final int groupNumber;
    private final int[] progress;

    public Student(String name, String initials, int groupNumber, int[] progress) {
        this.surname = name;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Петров", "В.И.", 15, new int[]{7, 6, 8, 7, 9});
        students[1] = new Student("Иванов",  "С.Н.", 20, new int[]{9, 8, 8, 10, 9});
        students[2] = new Student("Сидоров","В.М.", 15, new int[]{4, 5, 7, 10, 6});
        students[3] = new Student("Козлов","К.Г.", 24, new int[]{10, 10, 10, 10, 10});
        students[4] = new Student("Григорьев","С.В.", 20, new int[]{7, 6, 8, 7, 9});
        students[5] = new Student("Политов","Н.Г.", 24, new int[]{9, 9, 10, 10, 9});
        students[6] = new Student("Варшков","Д.Т.", 21, new int[]{9, 9, 8, 10, 9});
        students[7] = new Student("Романов","Р.П.", 15, new int[]{3, 6, 5, 7, 4});
        students[8] = new Student("Волков","А.Н.", 15, new int[]{7, 9, 8, 7, 9});
        students[9] = new Student("Зайцев","П.А.", 15, new int[]{10, 9, 9, 10, 9});
        printExcellentStudent(students);
    }

    private static void printExcellentStudent(Student[] students) {
        for (Student student: students){
            Arrays.sort(student.progress);
            if (student.progress[0] >= 9)
                System.out.printf("Smart student: %s, from group %d. %n", student.surname, student.groupNumber);
        }
    }
}
