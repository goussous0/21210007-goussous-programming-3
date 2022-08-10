package mobile;

public class Mobile
{
    private String brand;
    private String color;
    private int RAM;
    private String CPU;
    private int price;
    private int yearOfProduction;

    public Mobile(){}
    public Mobile(String brand, String color, int yearOfProduction, int RAM, String CPU, int price)
    {
        this.brand = brand;
        this.color = color;
        this.RAM = RAM;
        this.CPU = CPU;
        this.price = price;
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
    public void set_RAM(int RAM){this.RAM = RAM;}
    public void set_CPU(String CPU){this.CPU = CPU;}
    public void set_price(int price){this.price = price;}
    public void set_price(float price){this.price = (int)price;}
    public void set_yearofproduction(int yearOfProduction){this.yearOfProduction=yearOfProduction;}

    public String get_brand(){return brand;}
    public String get_color(){return color;}
    public int get_RAM(){return RAM;}
    public String get_CPU(){return CPU;}
    public int get_price(){return price;}
    public int get_yearOfProduction(){return yearOfProduction;}



    public void view_specs()
    {
        System.out.println("Brand: "+brand);
        System.out.println("Color: "+color);
        System.out.println("RAM: "+RAM);
        System.out.println("CPU: "+CPU);
        System.out.println("price: "+price+" $");
        System.out.println("Year of production: "+yearOfProduction);
    }

    public static float dollar_to_dinar(int dollars)
    {
        return dollars*0.7f;
    }


}