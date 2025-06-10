public class EmployeeBook {
    // Хранилище, для записей о сотрудниках
    public static Employee[] employees = new Employee[10];

    // Метод для добавления сотрудника
    public static boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {  // Нашли пустое место
                employees[i] = newEmployee;
                return true;  // Добавили
            }
        }
        return false;  // Массив переполнен
    }
    // Метод для вывода всех сотрудников
    public static void allEmployees() {
        for (Employee employee : employees){
            if (employee != null){ // проверяем не пустой ли массив
                System.out.println(employee);
            }
        }
    }

    // Метод для посчета суммы затрат на ЗП в месяц
    public static double sumSalaryAllEmployees() {
        double monthSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                monthSalary += employee.getSalary();
            }
        }
        return monthSalary;
    }

    // Метод для нахождения сотрудника с минимальной зарплатой
    public static Employee minSalaryEmployees() {
        Employee employeeMinSalary = null;
        double minSalary = -1;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null){
                double currentSalary = employee.getSalary();
                if (minSalary == -1) {
                    minSalary = currentSalary;
                    employeeMinSalary = employee;
                    continue;
                }
                if (minSalary > currentSalary){
                    minSalary = currentSalary;
                    employeeMinSalary = employee;
                }
            }
        }
        return employeeMinSalary;
    }

    // Метод для нахождения сотрудника с максимальной зарплатой
    public static Employee maxSalaryEmployees() {
        Employee employeeMaxSalary = null;
        double maxSalary = -1;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                double currentSalary = employee.getSalary();
                if (maxSalary == -1) {
                    maxSalary = currentSalary;
                    employeeMaxSalary = employee;
                    continue;
                }
                if (maxSalary < currentSalary) {
                    maxSalary = currentSalary;
                    employeeMaxSalary = employee;
                }
            }
        }
        return employeeMaxSalary;
    }

    // Подсчитать среднее значение зарплат
    public static double averageSalaryEmployees() {
        double monthSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                monthSalary += employee.getSalary();
            }
        }
        double averageSalary = monthSalary / employees.length;
        return averageSalary;
    }

    // Распечатать ФИО всех сотрудников
    public static void nicknameEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName() + " " + employee.getFamily() + " " + employee.getSurname());
            }
        }
    }

}
