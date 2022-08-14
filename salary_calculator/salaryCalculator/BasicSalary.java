package salaryCalculator;

public class BasicSalary
{
    public int CalculateSalary(int hour, int rate)
    {
        return hour*rate;
    }

    public int CalculateSalary(int hour, int rate, boolean overtime, int overTimeCount)
    {
        OverTimeSalary ots = new OverTimeSalary();
        if (overtime)
        {
            return CalculateSalary(hour, rate) + (overTimeCount*ots.get_rate());
        }
        else
        {
            return hour*rate;
        }
    }    
}