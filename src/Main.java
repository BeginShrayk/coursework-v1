import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employees1 = new Employee("Илья", "Еремеев", "Вячеславович", 1, 220_000);
        Employee employees2 = new Employee("Иван", "Иванов", "Иванович", 3, 150_000);
        Employee employees3 = new Employee("Андрей", "Андреев", "Андреевич", 4, 70_000);
        Employee employees4 = new Employee("Мария", "Трикоз", "Сергеевна", 2, 90_000);
        Employee employees5 = new Employee("Игорь", "Антонов", "Игоревич", 4, 110_000);
        Employee employees6 = new Employee("Максим", "Марфутенко", "Олегович", 5, 30_000);
        Employee employees7 = new Employee("Мария", "Иванова", "Вячеславовична", 5, 240_000);
        Employee employees8 = new Employee("Юрий", "Малых", "Анатольевич", 5, 130_000);
        Employee employees9 = new Employee("Антон", "Дальний", "Максимович", 1, 80_000);
        Employee employees10 = new Employee("Илья", "Редькин", "Антонович", 3, 50_000);

        EmployeeBook.addEmployee(employees1);
        EmployeeBook.addEmployee(employees2);
        EmployeeBook.addEmployee(employees3);
        EmployeeBook.addEmployee(employees4);
        EmployeeBook.addEmployee(employees5);
        EmployeeBook.addEmployee(employees6);
        EmployeeBook.addEmployee(employees7);
        EmployeeBook.addEmployee(employees8);
        EmployeeBook.addEmployee(employees9);
        EmployeeBook.addEmployee(employees10);

        // Список всех сотрудников
        System.out.println("Список всех сотрудников: ");
        EmployeeBook.allEmployees();

        // Посчет суммы затрат на ЗП в месяц
        System.out.println();
        System.out.println("Сумма затрат на ЗП в месяц: " + EmployeeBook.sumSalaryAllEmployees() + " рублей.");

        // Находим сотрудника с минимальной зарплатой
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + EmployeeBook.minSalaryEmployees());

        // Находим сотрудника с максимальной зарплатой
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой: " + EmployeeBook.maxSalaryEmployees());

        // Среднее значение зарплат
        System.out.println();
        System.out.println("Среднее значение зарплат: " + EmployeeBook.averageSalaryEmployees());

        // Печатаем ФИО всех сотрудников
        System.out.println();
        EmployeeBook.nicknameEmployees();
    }
}