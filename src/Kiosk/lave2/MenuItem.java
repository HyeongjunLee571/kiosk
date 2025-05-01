package Kiosk.lave2;

public class MenuItem
{
    private String Burgername;
    private double Burgerprice;
    private String BurgerDescription;

    public MenuItem (String burgername,double burgerprice,String burgerDescription)
    {
        this.Burgername = burgername;
        this.Burgerprice = burgerprice;
        this.BurgerDescription = burgerDescription;
    }

    public double getBurgerprice() {
        return Burgerprice;
    }

    public String getBurgername(){
        return Burgername;
    }
    public String getBurgerDescription(){
        return BurgerDescription;
    }


}
