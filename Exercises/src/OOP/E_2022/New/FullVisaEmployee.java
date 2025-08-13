package OOP.E_2022.New;

public class FullVisaEmployee extends Employee{
    private String accountNumber;
    private float monthlySalary;

    public FullVisaEmployee(String fullName, String accountNumber, float monthlySalary){
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
        return "Paying using Visa, account number: %s amount %f\n" +
        accountNumber + paymentAmount();
    }
}
