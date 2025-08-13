package OOP.E_2022.New;

public class FullEmployee extends Employee{
    private String accountNumber;
    private float monthlySalary;

    public FullEmployee(String fullName, String accountNumber, float monthlySalary){
        super(fullName);

        this.accountNumber = accountNumber;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String paymentAmount(){
        return "Hi %s\nThis is payment for your monthly salary: %f\n" +
                getFullName() + paymentAmount();
    }

    @Override
    public String paymentType(){
        return "Paying using MasterCard, account number: %s amount %f\n" +
        accountNumber + paymentAmount();
    }
}