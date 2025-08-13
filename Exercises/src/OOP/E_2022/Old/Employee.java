package OOP.E_2022.Old;

public class Employee {

    public enum EmployeeType {FULL_TIME, HOURLY, VOLUNTEER}

    public enum AccountType {VISA, MASTERCARD}

    public enum Department {ENGINEERING, BUSINESS_OPERATIONS, HR}

    private String fullName;
    private String accountNumber;
    private EmployeeType type;
    private AccountType accountType;
    private Department department;
    private float monthlySalary;
    private float hourlySalary;
    private int hoursWorked;

    // Constructor
    public Employee(String fullName, String accountNumber, EmployeeType type,
                    AccountType accountType, Department department,
                    float monthlySalary, float hourlySalary, int hoursWorked) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountType = accountType;
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public EmployeeType getType() {
        return type;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public Department getDepartment() {
        return department;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public float getHourlySalary() {
        return hourlySalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}