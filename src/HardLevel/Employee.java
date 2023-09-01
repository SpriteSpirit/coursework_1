package HardLevel;

public class Employee {
    private String fullName;            // Ф. И. О сотрудника
    private int department;             // отдел (от 1 до 5)
    private float salary;              // зарплата
    private int id;                     // id сотрудника
   // private static int counter = 0;       // статическая переменная-счетчик


    public Employee(String fullName, int department, float salary) {
        this.id = 0;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSurname() {
        String[] splitFullName = getFullName().split(" ");
        String surname = null;

        surname = splitFullName[0];
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("id: %d | Dept.: %d | Full name: %s | Salary: %.2f |", this.id, this.department, this.fullName, this.salary);
    }


} // class
