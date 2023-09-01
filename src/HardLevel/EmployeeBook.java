package HardLevel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeBook {
    private Employee[] employees;
    private int[] ids;

    public EmployeeBook() {
        this.employees = new Employee[100];
        this.ids = new int[100];
        for (int i = 0; i < ids.length; i++) {
            ids[i] = i + 1;
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                employee.setId(ids[i]);
                break;
            }
        }
    }

    public void removeEmployee(String surname) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSurname().equals(surname)) {
                employees[i] = null;
                break;
            }
        }
    }
    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }
    public void removeEmployee(String surname, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id && employees[i].getSurname().equals(surname)) {
                employees[i] = null;
                break;
            }
        }
    }
    public void printAllEmployees(Employee[] employees) {
        Arrays.sort(employees, Comparator.nullsLast(Comparator.comparingInt(Employee::getId)));
        for (Employee employee : employees) {
            if (employee != null)  System.out.println(employee.toString());
        }
        //System.out.println(Arrays.toString(ids));
    }

    public void changeEmployee(String surname) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && Objects.equals(employees[i].getSurname(), surname)) {
                System.out.printf("Что вы хотите изменить у сотрудника %s?%n", employees[i].getFullName());
                System.out.println("1 - изменить ЗП || 2 - изменить отдел");
                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();

                if (answer == 1) {
                    System.out.println("Введите новую ЗП:");
                    employees[i].setSalary(scanner.nextFloat());
                } else if (answer == 2) {
                    System.out.println("Введите новый отдел:");
                    employees[i].setDepartment(scanner.nextInt());
                    System.out.printf("У сотрудника %s новый отдел: %d%n", employees[i].getFullName(), employees[i].getDepartment());
                } else {
                    System.out.println("Такого действия не существует");
                }
            }
        }
    }

    public void getFullNameAllEmployees(int dept) {

        System.out.printf("Сотрудники %d отдела:%n", dept);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == dept) {
                System.out.println(employees[i].getFullName());
            }
        }
    }
}
