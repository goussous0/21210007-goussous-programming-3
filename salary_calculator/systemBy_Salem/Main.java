package systemBy_Salem;
import employee.*;
import salaryCalculator.*;

public class Main
{
    public static void main(String[] args)
    {
        FullTime  worker1 = new FullTime();
        worker1.set_hour(7);
        System.out.println("Worker1 hours : "+worker1.get_hour());
        BasicSalary worker1_salary = new BasicSalary();
        int base_salary = worker1_salary.CalculateSalary(worker1.get_hour(), worker1.get_rate());
        System.out.println("Worker1 Base salary : "+ base_salary);

        PartTime worker2 = new PartTime(10 , 10);
        worker2.set_hour(9);
        System.out.println("Worker2 hours : "+worker2.get_hour());
        BasicSalary worker2_salary = new BasicSalary();
        worker2_salary.CalculateSalary(worker2.get_hour(), worker2.get_rate());


        OverTimeSalary ots = new OverTimeSalary();
        int total = ots.overtime_salary(base_salary, 10);
        System.out.println("Base+Overtime salary : "+total);
    }

    
}