package Kiosk.Challengelevel2;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        MenuItem burgermenuListA = new MenuItem("1. ShackBurger | W ",6.9," 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem burgermenuListB = new MenuItem("2. SmokeShack  | W ",8.9," 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem burgermenuListC = new MenuItem("3. Cheeseburger | W ",6.9," 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem burgermenuListD = new MenuItem("4. Hamburger  | W ",5.4," 비프패티를 기반으로 야채가 들어간 기본버거");
        MenuItem burgermenuA = new MenuItem("ShackBurger | W ",6.9," 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem burgermenuB = new MenuItem("SmokeShack  | W ",8.9 ," 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem burgermenuC = new MenuItem("Cheeseburger | W ",6.9 ," 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem burgermenuD = new MenuItem("Hamburger  | W ", 5.4, " 비프패티를 기반으로 야채가 들어간 기본버거");
        MenuItem burgernameA = new MenuItem("ShackBurger");
        MenuItem burgernameB = new MenuItem("SmokeShack");
        MenuItem burgernameC = new MenuItem("Cheeseburger");
        MenuItem burgernameD = new MenuItem("Hamburger");


        List<MenuItem> burgermenuList = new ArrayList<>();

        burgermenuList.add(burgermenuListA);
        burgermenuList.add(burgermenuListB);
        burgermenuList.add(burgermenuListC);
        burgermenuList.add(burgermenuListD);

        List<MenuItem> burgermenus = new ArrayList<>();
        burgermenus.add(burgermenuA);
        burgermenus.add(burgermenuB);
        burgermenus.add(burgermenuC);
        burgermenus.add(burgermenuD);

        List<MenuItem> burgername = new ArrayList<>();
        burgername.add(burgernameA);
        burgername.add(burgernameB);
        burgername.add(burgernameC);
        burgername.add(burgernameD);


        MenuItem drinkmenuListA = new MenuItem("1. 콜라 | W ",90.3);
        MenuItem drinkmenuListB = new MenuItem("2. 사이다 | W ",95.0);
        MenuItem drinkmenuListC = new MenuItem("3. 제로콜라 | W ",93.0);
        MenuItem drinkmenuListD = new MenuItem("4. 제로이다 | W ",95.0);
        MenuItem drinkmenuA = new MenuItem("콜라 | W ",90.3 );
        MenuItem drinkmenuB = new MenuItem("사이다 | W ", 95.0 );
        MenuItem drinkmenuC = new MenuItem("제로콜라 | W ", 93.0 );
        MenuItem drinkmenuD = new MenuItem("제로이다 | W ",95.0 );
        MenuItem drinknameA = new MenuItem("콜라");
        MenuItem drinknameB = new MenuItem("사이다");
        MenuItem drinknameC = new MenuItem("제로콜라");
        MenuItem drinknameD = new MenuItem("제로이다");

        List<MenuItem> drinkmenuList = new ArrayList<>();
        drinkmenuList.add(drinkmenuListA);
        drinkmenuList.add(drinkmenuListB);
        drinkmenuList.add(drinkmenuListC);
        drinkmenuList.add(drinkmenuListD);

        List<MenuItem> drinkmenus= new ArrayList<>();
        drinkmenus.add(drinkmenuA);
        drinkmenus.add(drinkmenuB);
        drinkmenus.add(drinkmenuC);
        drinkmenus.add(drinkmenuD);

        List<MenuItem> drinkname= new ArrayList<>();
        drinkname.add(drinknameA);
        drinkname.add(drinknameB);
        drinkname.add(drinknameC);
        drinkname.add(drinknameD);



        MenuItem dessertmenuListA = new MenuItem("1. 감자튀김 | W ",16.9," 한정 감자튀김");
        MenuItem dessertmenuListB = new MenuItem("2. 치즈스틱 | W ",26.9," 한정 치즈스틱");
        MenuItem dessertmenuListC = new MenuItem("3. 치즈볼 | W ",20.9," 한정 치즈볼");
        MenuItem dessertmenuListD = new MenuItem("4. 양념감자 | W ",10.9," 한정 양념감자");
        MenuItem dessertmenuA = new MenuItem("감자튀김 | W ", 16.9," 한정 감자튀김");
        MenuItem dessertmenuB = new MenuItem("치즈스틱 | W ", 26.9," 한정 치즈스틱");
        MenuItem dessertmenuC = new MenuItem("치즈볼 | W " ,20.9," 한정 치즈볼");
        MenuItem dessertmenuD = new MenuItem("양념감자 | W ",10.9 ," 한정 양념감자");
        MenuItem dessertnameA = new MenuItem("감자튀김");
        MenuItem dessertnameB = new MenuItem("치즈스틱");
        MenuItem dessertnameC = new MenuItem("치즈볼");
        MenuItem dessertnameD = new MenuItem("양념감자");


        List<MenuItem> dessertsmenuList = new ArrayList<>();
        dessertsmenuList.add(dessertmenuListA);
        dessertsmenuList.add(dessertmenuListB);
        dessertsmenuList.add(dessertmenuListC);
        dessertsmenuList.add(dessertmenuListD);

        List<MenuItem> dessertmenus = new ArrayList<>();
        dessertmenus.add(dessertmenuA);
        dessertmenus.add(dessertmenuB);
        dessertmenus.add(dessertmenuC);
        dessertmenus.add(dessertmenuD);

        List<MenuItem> dessertname = new ArrayList<>();
        dessertname.add(dessertnameA);
        dessertname.add(dessertnameB);
        dessertname.add(dessertnameC);
        dessertname.add(dessertnameD);

        Menu MenuItemList = new Menu(burgermenuList,burgermenus,burgername,drinkmenuList,drinkmenus,
                drinkname,dessertsmenuList,dessertmenus,dessertname);//생성자를 통해 값을 변수에 대입함 > 다른 클래스에서 생성시 Menu타입으로 선언하는것이 옳은방법이다.

        Kiosk kiosk = new Kiosk();
        kiosk.start(MenuItemList);
    }
}
