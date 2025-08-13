package OOP.E_2022.Old;

public class SalaryPayer {

    public void payMontlySalary(Employee e) {

        if (e.getType() == Employee.EmployeeType.FULL_TIME) {
            System.out.printf("Hi %s\nThis is payment for your monthly salary: %f\n",
                    e.getFullName(), e.getMonthlySalary());

            if (e.getAccountType() == Employee.AccountType.VISA) {
                System.out.printf("Paying using Visa, account number: %s amount %f\n",
                        e.getAccountNumber(), e.getMonthlySalary());
            } else {
                System.out.printf("Paying using MasterCard, account number: %s amount %f\n",
                        e.getAccountNumber(), e.getMonthlySalary());
            }

        } else if (e.getType() == Employee.EmployeeType.HOURLY) {
            double salary = e.getHoursWorked() * e.getHourlySalary();
            System.out.printf("Hi %s\nThis is payment for your monthly salary: %f\n",
                    e.getFullName(), salary);

            if (e.getAccountType() == Employee.AccountType.VISA) {
                System.out.printf("Paying using Visa, account number: %s amount %f\n",
                        e.getAccountNumber(), salary);
            } else {
                System.out.printf("Paying using MasterCard, account number: %s amount %f\n",
                        e.getAccountNumber(), salary);
            }

        } else if (e.getType() == Employee.EmployeeType.VOLUNTEER) {
            System.out.printf("Hi %s\nThank you for volunteering.\n", e.getFullName());
        }
    }

    public void payYearlyBonus(Employee e) {

        float amount = e.getMonthlySalary();

        if (e.getDepartment() == Employee.Department.ENGINEERING) {
            amount = (float)1.3;
        } else if (e.getDepartment() == Employee.Department.BUSINESS_OPERATIONS) {
            amount = (float)1.2;
        }

        if (e.getType() == Employee.EmployeeType.FULL_TIME) {
            System.out.printf("Hi %s\nThis is payment for your yearly bonus: %f\n",
                    e.getFullName(), amount);

            if (e.getAccountType() == Employee.AccountType.VISA) {
                System.out.printf("Paying using Visa, account number: %s amount %f\n",
                        e.getAccountNumber(), amount);
            } else {
                System.out.printf("Paying using MasterCard, account number: %s amount %f\n",
                        e.getAccountNumber(), amount);
            }
        }
    }
}
