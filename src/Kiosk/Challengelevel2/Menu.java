package Kiosk.Challengelevel2;

import java.util.*;

public class Menu {
    private List<MenuItem> burgermenuList = new ArrayList<>();
    private List<MenuItem> drinkmenuList = new ArrayList<>();
    private List<MenuItem> dessertsmenuList = new ArrayList<>();
    private List<MenuItem> burgerMenus = new ArrayList<>();
    private List<MenuItem> drinkmenus = new ArrayList<>();
    private List<MenuItem> dessertmenus = new ArrayList<>();
    private List<MenuItem> burgername = new ArrayList<>();
    private List<MenuItem> drinkname = new ArrayList<>();
    private List<MenuItem> dessertname = new ArrayList<>();
    private String name;
    Scanner order = new Scanner(System.in);

    public Menu(List<MenuItem> burgermenuList, List<MenuItem> burgerMenus, List<MenuItem> burgername,
                List<MenuItem> drinkmenuList,List<MenuItem> drinkmenus,List<MenuItem> drinkname,List<MenuItem> dessertsmenuList,
                List<MenuItem> dessertmenus,List<MenuItem> dessertname) {
        this.burgermenuList = burgermenuList;
        this.burgerMenus = burgerMenus;
        this.burgername = burgername;
        this.drinkmenuList = drinkmenuList;
        this.drinkmenus = drinkmenus;
        this.drinkname = drinkname;
        this.dessertsmenuList = dessertsmenuList;
        this.dessertmenus =dessertmenus;
        this.dessertname = dessertname;
    }

    public Menu(String name) {
        this.name = name;
    }

    public String getMenu() {
        return name;
    }

    public void BurgerListReturn() {
        for (MenuItem burgermenuList  : burgermenuList)
        {
            System.out.println(burgermenuList.getMenuname()+burgermenuList.getMenuprice()+burgermenuList.getMenudescription());
        }
    }

    public void drinkListReturn() {
        for (MenuItem drinkmenuList  : drinkmenuList)
        {
            System.out.println(drinkmenuList.getdrink()+drinkmenuList.getdrinkprice());
        }
    }

    public void dessertListReturn() {
        for (MenuItem dessertsmenuList  : dessertsmenuList)
        {
            System.out.println(dessertsmenuList.getMenuname()+dessertsmenuList.getMenuprice()+dessertsmenuList.getMenudescription());
        }
    }//리스트 별로 진행됨

    public List<MenuItem> getBurgermenuList(){
        return burgermenuList;
    }

    public List<MenuItem> getDrinkmenuList(){
        return drinkmenuList;
    }

    public List<MenuItem> getDessertsmenuList(){
        return dessertsmenuList;
    }// 리스트별로 진행 됨

    public List<MenuItem> getBurgerMenus() {
        return burgerMenus;
    }

    public List<MenuItem> getBurgername()
    {
        return burgername;
    }

    public List<MenuItem> getDrinkmenus()
    {
        return drinkmenus;
    }
    public List<MenuItem> getDrinkname()
    {
        return drinkname;
    }

    public List<MenuItem> getDessertmenus()
    {
        return dessertmenus;
    }

    public List<MenuItem> getDessertname()
    {
        return dessertname;
    }

}
