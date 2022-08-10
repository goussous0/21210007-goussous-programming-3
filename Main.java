import mobile.Mobile;

public class Main
{
    public static void main(String[] agrs)
    {
        //  brand,  color,  yearOfProduction,  RAM,  CPU, price
        Mobile iphone = new Mobile("Apple","black", 2018, 64, "A12", 450);

        iphone.view_specs();

        iphone.set_price(1000);

        // used dollar_to_dinar to convert the iphone dollar price to dinars
        iphone.set_price(Mobile.dollar_to_dinar(iphone.get_price()));

        System.out.println("Phone price: "+iphone.get_price()+ " JDs");

    }
}