public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        // create employees
        employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 60000);
        employees[2] = new Employee("Сидоров Сидор Сидорович", 3, 55000);
        employees[3] = new Employee("Алексеев Алексей Алексеевич", 4, 65000);
        employees[4] = new Employee("Николаев Николай Николаевич", 5, 70000);
        employees[5] = new Employee("Андреев Андрей Андреевич", 1, 45000);
        employees[6] = new Employee("Дмитриев Дмитрий Дмитриевич", 2, 55000);
        employees[7] = new Employee("Сергеев Сергей Сергеевич", 3, 60000);
        employees[8] = new Employee("Антонов Антон Антонович", 4, 50000);
        employees[9] = new Employee("Владимиров Владимир Владимирович", 5, 55000);

        //indexSalary(employees, 5);
        DepartmentUtils.indexSalaryByDepartment(employees, 1, 5);
        getAllEmployees(employees);
        separator();

        System.out.printf("Employee with min salary by department:%n%s%n%n", DepartmentUtils.getEmployeeWithLowestSalaryByDept(employees, 1));
        System.out.printf("Employee with max salary by department:%n%s%n%n", DepartmentUtils.getEmployeeWithHighestSalaryByDept(employees, 1));
        System.out.printf("Total Salary Expenses By Department:%n%s%n%n", DepartmentUtils.getTotalSalaryExpensesByDepartment(employees, 1));
        System.out.printf("Average Salary By Department:%n%s%n%n", DepartmentUtils.getAverageSalaryByDepartment(employees, 1));

        separator();
        DepartmentUtils.printAllEmployeesByDepartment(employees, 1);
        separator();
        DepartmentUtils.printEmployeesWithSalaryLessThan(employees, 55000);
        separator();
        DepartmentUtils.printEmployeesWithSalaryMoreThan(employees, 60000);
        separator();
    } //main

    public static void getAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void indexSalary(Employee[] employees, float percent) {
        for (Employee employee : employees) {
            if (employee != null) {
               employee.setSalary(employee.getSalary() * (1 + percent/100));
            }
        }
    }

    public static void separator(){
        System.out.println("------------------------------------------------------------------");
    }
} // class