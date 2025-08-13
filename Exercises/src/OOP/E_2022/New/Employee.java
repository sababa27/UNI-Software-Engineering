package OOP.E_2022.New;

public abstract class Employee {
    private String fullName;

    public Employee(String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String information(){
        return paymentAmount() + paymentType();
    }

    public String paymentAmount(){
        return "Hi %s\nThank you for volunteering.\n" + getFullName();
    }

    public String paymentType(){
        return "";
    }
}