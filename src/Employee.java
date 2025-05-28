import java.util.Objects;

public class Employee {

    // данные сотрудника
    private String name;  // имя сотрудника
    private String family;  // фамилия сотрудника
    private String surname;  // отчество сотрудника
    private int department;  // отдел сотрудника
    private int salary;// зарплата сотрудника

    // static id
    private static int idEmployee = 0;
    private int id;

    public Employee() {
        this.id = ++idEmployee; // Добавляем поле, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
    }

    // конструктор
    public Employee(String name, String family, String surname, int department, int salary) {
        this.name = name;
        this.family = family;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    // геттеры
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
    public int getSalary() {
        return salary;
    }
    public static int getIdEmployee() {
        return idEmployee;
    }

    // сеттеры
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // equals && hashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(name, employee.name) && Objects.equals(family, employee.family) && Objects.equals(surname, employee.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, family, surname, department, salary, id);
    }

    @Override
    public String toString() {
        return "ФИО: " + name + " " + family + " " + surname + " отдел: " + department + " Зарплата: " + salary;
    }
}
