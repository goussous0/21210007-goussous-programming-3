package salaryCalculator;

public class OverTimeSalary
{
    private int rate = 8;

    public void set_rate(int rate)
    {
        this.rate = rate;
    }
    public int get_rate()
    {
        return this.rate;
    }
    
    public int overtime_salary(int baseSalary, int overTimeHours)
    {
        return baseSalary+(overTimeHours*rate);
    }
}