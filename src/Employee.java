import java.util.Objects;

public class Employee {
    // данные сотрудника
    private final int id; // Ставим его на первое место, так как уникален и неизменяем.

    private String name;  // имя сотрудника
    private String family;  // фамилия сотрудника
    private String surname;  // отчество сотрудника

    private int department;  // отдел сотрудника

    private double salary;// зарплата сотрудника
    private static int idEmployee; // private так как тоже не должен меняться вне Класса.

    // конструктор (нужен для того чтобы объекты не могли быть созданы некорректно)
    public Employee(String name,
                    String family,
                    String surname,
                    int department,
                    double salary
    ) {
        this.name = name;
        this.family = family;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        // Увеличиваем айди, чтобы они не повторялись при повторном вызове конструктора
        this.id = ++idEmployee; // добавляем уникальный айди для сотрудника
    }

    // геттеры (Нужны для того чтобы дать пользователю возможность доступ на чтение)
    public String getName() {
        return name;
    }
    public String getFamily() {
        return family;
    }
    public String getSurname() {
        return surname;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public static int getIdEmployee() {
        return idEmployee;
    }

    // сеттеры (Нужны для того, чтобы пользователь мог менять их)
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // equals && hashCode
    @Override
    public boolean equals(Object o) { // Нужен для того, чтобы считать объекты равными если данные, которые указаны совпадают
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                department == employee.department
                && salary == employee.salary
                && Objects.equals(name, employee.name)
                && Objects.equals(family, employee.family)
                && Objects.equals(surname, employee.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, family, surname, department, salary, id);
    }
    //  hashCode превращает объект в число, для проверки. Если объекты равны, хеш-коды обязательно равные.
    // Если объекты не равны, хеш-коды не обязательно должны быть разные.
    // Если хеш-коды разные, объекты точно не будут равны.

    @Override
    public String toString() { // Нужен для того чтобы приводить наш объект в строковый вид
        return "ФИО: " + name + " " + family + " " + surname + " отдел: " + department + " Зарплата: " + salary;
    }
}
