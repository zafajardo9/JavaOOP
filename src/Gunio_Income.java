import java.util.*;

public class Gunio_Income {
    //overtime pay = overtime rate multiplied by the number of overtime hours
    //should the employee input his/her overtime hours or no?
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String employeeName, user;
        double hourlyRate, hoursWorked, overtimeHours, overtimeRate = 0;

        System.out.println("Enter your name");
        employeeName = input.nextLine();
        System.out.println("Are you a Part-time or Full-time Employee?");
        //Ful-time or part-time
        System.out.println("Write Part-time / Full-time");
        user = input.next();
        //Hours Worked
        System.out.println("How many Hours did you work?");
        hoursWorked = input.nextDouble();
        //Hourly Rate
        System.out.println("What is your Hourly Rate?");
        hourlyRate = input.nextDouble();
        if(user.equals("Full-time")) {
            System.out.println("What is your Overtime rate?");
            overtimeRate = input.nextDouble();
        }

        Employee employee = new Employee(employeeName, hourlyRate, hoursWorked, overtimeRate);

        if(user.equals("Part-time")) {
            System.out.println("Income of " + employee.getName() + " as Part-time Employee: " + employee.getPartTime());

        }else if(user.equals("Full-time")) {
            System.out.println("Overtime Hours: " + employee.setOvertimeHours());
            System.out.println("Overtime Pay: " + employee.getOvertimePay());
            System.out.println("Income of " + employee.getName() + " as Full-time Employee: " + employee.getFullTime());
        }else {
            System.out.println("Invalid Input");
        }
    }
}

abstract class Income {
    private String employeeName;
    private double hourlyRate, hoursWorked, overtimeRate;

    public Income(String employeeName, double hourlyRate, double hoursWorked, double overtimeRate) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimeRate = overtimeRate;
        this.employeeName = employeeName;
    }

    public String getName() {
        return employeeName;
    }
    public void setName(String employeeName) {
        this.employeeName = employeeName;
    }

    //get and set Hourly Rate
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    //get and set Hours of Work
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //get and set Overtime Rate
    public double getOvertimeRate() {
        return overtimeRate;
    }
    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }


}

class Employee extends Income{

    double standardHours = 40;
    public Employee(String employeeName, double hourlyRate, double hoursWorked, double overtimeRate) {
        super(employeeName, hourlyRate, hoursWorked, overtimeRate);
    }

    double setOvertimeHours() {
        return getHoursWorked() - standardHours;
    }

    double getOvertimePay() {
        return getOvertimeRate() * setOvertimeHours();
    }

    double getPartTime() { return getHourlyRate() * getHoursWorked(); }
    double getFullTime() { return getHourlyRate() * getHoursWorked() + getOvertimePay(); }
}