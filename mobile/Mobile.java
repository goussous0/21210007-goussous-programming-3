package mobile;



public class Mobile
{
    private String brand;
    private String color;
    private int yearOfProduction;

    public Mobile(String brand, String color, int yearOfProduction)
    {
        this.brand = brand;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }


    public void dailNumber(String phoneNumber)
    {
        System.out.println("Calling "+phoneNumber);
    }

    public void getCall(String callerName)
    {
        System.out.println(callerName+ " is calling you");
    }

    public void answerCall(boolean answer)
    {
        if (answer)
            System.out.println("Answered");
        else
            System.out.println("Not answered");
    }

    public void set_brand(String brand){ this.brand = brand;}
    public void set_color(String color){ this.color = color;}
    public void set_yearofproduction(int yearOfProduction){this.yearOfProduction=yearOfProduction;}

    public String get_brand(){return brand;}
    public String get_color(){return color;}
    public int get_yearOfProduction(){return yearOfProduction;}


}