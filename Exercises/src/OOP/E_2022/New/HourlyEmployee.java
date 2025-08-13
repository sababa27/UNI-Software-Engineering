package OOP.E_2022.New;

public class HourlyEmployee extends Employee{
    private String accountNumber;
    private float hourlySalary;
    private int hoursWorked;

    public HourlyEmployee(String fullName, String accountNumber, float hourlySalary, int hoursWorked){
        super(fullName);

        this.accountNumber = accountNumber;
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
    }

    private double salary(){
        double sal = hoursWorked * hourlySalary;
        return sal;
    }

    @Override
    public String paymentAmount(){
        return "Hi %s\nThis is payment for your monthly salary: %f\n" +
                getFullName() + salary();
    }

    @Override
    public String paymentType(){
        return "Paying using MasterCard, account number: %s amount %f\n" +
                accountNumber + salary();
    }
}
