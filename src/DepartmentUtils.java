public class DepartmentUtils {
    public static Employee getEmployeeWithLowestSalaryByDept(Employee[] employees, int dept) {
        Employee result = null;
        float minSalary = Float.MAX_VALUE;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == dept && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee getEmployeeWithHighestSalaryByDept(Employee[] employees, int dept) {
        Employee result = null;
        float maxSalary = Float.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == dept && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float getTotalSalaryExpensesByDepartment(Employee[] employees, int dept) {
        float totalSalaryByDept = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == dept) {
                totalSalaryByDept += employee.getSalary();
            }
        }
        return totalSalaryByDept;
    }

    public static float getAverageSalaryByDepartment(Employee[] employees, int dept) {
        int count = 0;
        float totalSalary = 0;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == dept) {
                count++;
                totalSalary += employee.getSalary();
            }
        }

        return totalSalary/count;
    }

    public static void indexSalaryByDepartment(Employee[] employees, int dept, float percent) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == dept) {
                employee.setSalary(employee.getSalary() * (1 + percent/100));
            }
        }
    }

    public static void printAllEmployeesByDepartment(Employee[] employees, int dept) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == dept) {
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesWithSalaryLessThan(Employee[] employees, int num) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < num) {
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesWithSalaryMoreThan(Employee[] employees, int num) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= num) {
                System.out.println(employee);
            }
        }
    }
}
