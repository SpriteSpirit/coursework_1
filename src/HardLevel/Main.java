package HardLevel;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(new Employee("Иванов Иван Иванович", 1, 50000));
        employeeBook.addEmployee(new Employee("Петров Петр Петрович", 2, 55000));
        employeeBook.addEmployee(new Employee("Синичкин Семен Викторович", 2, 65000));

        employeeBook.removeEmployee("Петров");
        employeeBook.removeEmployee(1);
        employeeBook.addEmployee(new Employee("Агутин Леонид", 2, 65000));
        employeeBook.addEmployee(new Employee("Киркоров Филипп", 3, 60000));
        employeeBook.addEmployee(new Employee("Владимир Пресняков", 1, 49000));
        employeeBook.removeEmployee("Киркоров", 2);
        employeeBook.addEmployee(new Employee("Пугачева Алла", 1, 45000));
        employeeBook.addEmployee(new Employee("Валерий Меладзе", 3, 50000));
        separator();
        employeeBook.printAllEmployees(employeeBook.getEmployees());
        separator();
        employeeBook.changeEmployee("Пугачева");
        separator();
        employeeBook.getFullNameAllEmployees(2);
        separator();
    }

    public static void separator(){
        System.out.println("**********************************************************");
    }
}
