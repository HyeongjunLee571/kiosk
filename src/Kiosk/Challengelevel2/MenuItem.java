package Kiosk.Challengelevel2;

public class MenuItem
{
    private String Menuname;
    private double Menuprice;
    private String Menudescription;
    private String drink;
    private double drinkprice;
    private String name;

    public MenuItem (String Menuname,double Menuprice,String Menudescription) {
        this.Menuname = Menuname;
        this.Menuprice = Menuprice;
        this.Menudescription = Menudescription;
    }

    public MenuItem (String drink,double drinkprice)
    {
        this.drink = drink;
        this.drinkprice = drinkprice;
    }

    public MenuItem(String name)
    {
        this.name = name;
    }

    public String getMenuname(){
        return Menuname;
    }

    public double getMenuprice(){
         return Menuprice;
    }

    public String getdrink(){
        return drink;
    }

    public double getdrinkprice(){
        return drinkprice;
    }

   public String getMenudescription(){
        return Menudescription;
    }

    public String getName() {
        return name;
    }
}
