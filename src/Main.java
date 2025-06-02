import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Хранилище, для записей о сотрудниках
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Илья", "Еремеев", "Вячеславович", 1, 220_000);
        employees[1] = new Employee("Иван", "Иванов", "Иванович", 3, 150_000);
        employees[2] = new Employee("Андрей", "Андреев", "Андреевич", 4, 70_000);
        employees[3] = new Employee("Мария", "Трикоз", "Сергеевна", 2, 90_000);
        employees[4] = new Employee("Игорь", "Антонов", "Игоревич", 4, 110_000);
        employees[5] = new Employee("Максим", "Марфутенко", "Олегович", 5, 30_000);
        employees[6] = new Employee("Мария", "Иванова", "Вячеславовична", 5, 240_000);
        employees[7] = new Employee("Юрий", "Малых", "Анатольевич", 5, 160_000);
        employees[8] = new Employee("Антон", "Дальний", "Максимович", 1, 80_000);
        employees[9] = new Employee("Илья", "Редькин", "Антонович", 3, 50_000);

        // Список всех сотрудников
        System.out.println("Список всех сотрудников");
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i].toString());
        }
        System.out.println();

        // Считаем сумму затрат на ЗП в месяц;
        System.out.println("Считаем сумму затрат на ЗП в месяц");
        int sum = 0;
        for (int i = 0; i < employees.length; i++){
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на ЗП в месяц: " + sum + " рублей.");
        System.out.println();

        // Находим сотрудника с минимальной ЗП;
        System.out.println("Находим сотрудника с минимальной ЗП");
        double minSalary = employees[0].getSalary();
        String employeeName = employees[0].getName();
        String employeeFamily = employees[0].getFamily();
        String employeeSurname = employees[0].getSurname();
        for(int i = 0; i < employees.length; i++){
            if (minSalary > employees[i].getSalary()){
                minSalary = employees[i].getSalary();
                employeeName = employees[i].getName();
                employeeFamily = employees[i].getFamily();
                employeeSurname = employees[i].getSurname();
            }
        }
        System.out.println("Сотрудник с самой маленькой ЗП: " + employeeName + " " + employeeFamily + " " + employeeSurname + ". Зарплата: " + minSalary);
        System.out.println();

        // Находим сотрудника с максимальной ЗП;
        System.out.println("Находим сотрудника с максимальной ЗП");
        double maxSalary = employees[0].getSalary();
        employeeName = employees[0].getName();
        employeeFamily = employees[0].getFamily();
        employeeSurname = employees[0].getSurname();
        for(int i = 0; i < employees.length; i++){
            if (maxSalary < employees[i].getSalary()){
                maxSalary = employees[i].getSalary();
                employeeName = employees[i].getName();
                employeeFamily = employees[i].getFamily();
                employeeSurname = employees[i].getSurname();
            }
        }
        System.out.println("Сотрудник с самой максимальной ЗП: " + employeeName + " " + employeeFamily + " " + employeeSurname + ". Зарплата: " + maxSalary);
        System.out.println();

        // Подсчитать среднее значение зарплат
        System.out.println("Подсчитать среднее значение зарплат");
        int averageSalary = sum / employees.length;
        System.out.println("Среднее значение зарплат: " + averageSalary);
        System.out.println();

        // Распечатать ФИО всех сотрудников
        System.out.println("Распечатать ФИО всех сотрудников");
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getName() + " " + employees[i].getFamily() + " " + employees[i].getSurname());
        }
    }
}