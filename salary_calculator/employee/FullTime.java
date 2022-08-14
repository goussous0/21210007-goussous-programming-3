package employee;

public class FullTime
{
    private int hour;
    private int rate = 10; 
    
    public FullTime(){}
    public FullTime(int hour , int rate)
    {
        this.rate = rate;
        this.hour = hour;
    }
    public void set_hour(int hour)
    {
        this.hour = hour;
    }
    public int get_hour(){ return this.hour;}

    public void set_rate(int rate)
    {
        this.rate = rate;
    }
    public int get_rate(){ return this.rate;}
}