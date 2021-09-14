package lab2.ch3.task3;

import java.util.Scanner;

public class Task3 {

    String name;
    int salary;

    //Модифицирующий метод, возвращающий значение повышенной зарплаты
    public int raiseSalary(int byPercent) {
        int raise = this.salary * byPercent / 100;
        this.salary = this.salary + raise;
        return this.salary;
    }
    
    //Метод доступа, ничего не возвращающий
    public void getName(String[] a, int i) {
        a[i] = name;

    }

    //Метод доступа, ничего не возвращающий
    public void getSalary(int[] a, int i){
        a[i] = salary;
    }

    //Конструктор
    public Task3(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        int salary;
        System.out.print("Введите зарплату: ");
        salary = sc.nextInt();
        Task3 emploee = new Task3(name, salary);
        int newSalary = emploee.raiseSalary(5);
        System.out.println("Возвращённое значение модифицирующего метода:");
        System.out.println(newSalary);
        int a[];
        a = new int[1];
        emploee.getSalary(a, 0);
        System.out.println("Извлечённое значение зарплаты из метода доступа, ничего не возвращающего:");
        System.out.println(a[0]);
        String b[];
        b = new String[1];
        emploee.getName(b, 0);
        System.out.println("Извлечённое значение имени из метода доступа, ничего не возвращающего:");
        System.out.println(b[0]);
    }
}

