package Kiosk.Challengelevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Kiosk {
    Scanner order = new Scanner(System.in);
    private String menu = null;
    private String menuName = null;
    private int menuOrder = 0;
    private int OrderMenuItems = 0;
    private int MenuShoppingcart = 0;
    private int OrderComplete = 0;
    private int discount = 0;
    private Double menuPrice = 0.0;
    private double DiscountCompleted = 0.0;
    private Double MenuPriceList = 0.0;
    private List<String> shoppingCart = new ArrayList<>();
    private List<Menu> menus = new ArrayList<>();
    private List<Double> MenuPrices = new ArrayList<>();
    user personOfnatioNalmerit = user.personOfnatioNalmerit;
    user soldier = user.soldier;
    user student = user.student;
    user common = user.common;

    double personOfnatioNalmeritLim = personOfnatioNalmerit.getDiscountrate();
    double soldierLim = soldier.getDiscountrate();
    double studentLim = student.getDiscountrate();
    double commontLim = common.getDiscountrate();


    void start(Menu MenuItemList){//

            while (true){

                menus.add(new Menu("\n[ MAIN MENU ] \n1. Burgers \n2. Drinks \n3. Desserts"));
                menus.add(new Menu("[ BURGERS MENU ]"));
                menus.add(new Menu("[ DRINK MENU ]"));
                menus.add(new Menu("[ DESSERTSMENU MENU ]"));
                menus.add(new Menu("0. 뒤로가기"));
                menus.add(new Menu("0. 종료하기"));
                menus.add(new Menu("4. Orders"));
                menus.add(new Menu("5. Cancel"));
                menus.add(new Menu("\n[ORDER MENU] \n4. Orders \n5. Cancel"));
                menus.add(new Menu("[Orders]"));
                menus.add(new Menu("[Total]"));
                menus.add(new Menu("1. 국가유공자 : 10%\n2. 군인 : 5%\n3. 학생 : 3% \n4. 일반 : 0%"));

                System.out.println(menus.get(0).getMenu());
                System.out.println(menus.get(5).getMenu());

                if(!shoppingCart.isEmpty()) {
                    System.out.println(menus.get(8).getMenu());
                }
                System.out.println("\n메뉴를 선택해주세요 : ");
                menuOrder = order.nextInt();

                if (1 == menuOrder) {
                    System.out.println(menus.get(1).getMenu());
                    MenuItemList.BurgerListReturn();//값 가지고 있는 변수에게 기능을 통해 명을 내린다 "너 버거 리스트값을 순회 후 출력시켜"라고
                    System.out.println(menus.get(4).getMenu());

                    System.out.println("햄버거 세트를 선택해주세요 : ");
                    OrderMenuItems = order.nextInt();

                    if(1 == OrderMenuItems) {
                        BurgersOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    }else if(2 == OrderMenuItems) {
                        BurgersOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    }else if(3 == OrderMenuItems) {
                        BurgersOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    }else if(4 == OrderMenuItems) {
                        BurgersOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    } else if(0 == OrderMenuItems) {
                        System.out.println("\n주문을 다시 시작합니다.");
                    }
                } else if(2 == menuOrder) {
                    System.out.println(menus.get(2).getMenu());
                    MenuItemList.drinkListReturn();
                    System.out.println(menus.get(4).getMenu());

                    System.out.println("\n음료수를 선택해주세요 : ");
                    OrderMenuItems = order.nextInt();

                    if(1 == OrderMenuItems) {
                        DrinksOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    }else if(2 == OrderMenuItems) {
                        DrinksOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    }else if(3 == OrderMenuItems) {
                        DrinksOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    }else if(4 == OrderMenuItems) {
                        DrinksOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    }else if(0 == OrderMenuItems) {
                        System.out.println("주문을 다시 시작합니다.");
                    }else{
                        System.out.println("잘못 입력하셨습니다.");
                    }
                } else if(3 == menuOrder) {
                    System.out.println(menus.get(3).getMenu());
                    MenuItemList.dessertListReturn();
                    System.out.println(menus.get(4).getMenu());

                    System.out.println("디저트를 선택해주세요 : ");
                    OrderMenuItems = order.nextInt();

                    if(1 == OrderMenuItems) {
                        DessertorderOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    }else if(2 == OrderMenuItems) {
                        DessertorderOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    }else if(3 == OrderMenuItems) {
                        DessertorderOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    }else if(4 == OrderMenuItems) {
                        DessertorderOrders(MenuItemList);
                        Addmenu();
                        AddandDelete();
                    }else if(0 == OrderMenuItems) {
                        System.out.println("주문을 다시 시작합니다.");
                    }
                }else if(4 == menuOrder && !shoppingCart.isEmpty()) {
                    OrderProgress();
                }else if (5 == menuOrder &&!shoppingCart.isEmpty()) {
                    System.out.println("주문중인 주문을 취소합니다.");
                }else if(4 == menuOrder && shoppingCart.isEmpty()){
                    System.out.println("장바구니에 메뉴가 없습니다.");
                }else if(5 == menuOrder && shoppingCart.isEmpty()){
                    System.out.println("장바구니에 메뉴가 없습니다.");
                }else if(0 == menuOrder) {
                    System.out.println("주문을 종료합니다.");
                    break;
                }else{
                    System.out.println("잘못 입력하셨습니다.");
                }
            }//반복문을 나오면 담긴값이 모두 초기회됨 > 그러기에 밖으로 빼고 관리해야함

    }
    void Addmenu(){
        System.out.println("선택한 메뉴는 : "+menu+'\n');

        System.out.println(menu);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까? : ");
        System.out.println("1.확인         2. 취소");
        MenuShoppingcart = order.nextInt();
    }

    void AddandDelete()
    {

        if (1 == MenuShoppingcart) {
            MenuPrices.add(menuPrice);
            MenuPriceList = MenuPrices.stream()
                    .mapToDouble(Double::doubleValue)
                    .sum();
            shoppingCart.add(menu);
            System.out.println(menuName+" 이 장바구니에 추가하였습니다.");
            System.out.println("\n아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        }else if (2 == MenuShoppingcart) {
            System.out.println("장바구니에 추가하지 않았습니다.");
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }
    }
    void BurgersOrders(Menu MenuItemLists){
              OrderMenuItems -=1;
              menu = MenuItemLists.getBurgerMenus().get(OrderMenuItems).getMenuname()+MenuItemLists.getBurgerMenus().get(OrderMenuItems).getMenuprice()+
                      MenuItemLists.getBurgerMenus().get(OrderMenuItems).getMenudescription();
              menuName = MenuItemLists.getBurgername().get(OrderMenuItems).getName();
              menuPrice = MenuItemLists.getBurgerMenus().get(OrderMenuItems).getMenuprice();
    }

    void DrinksOrders(Menu MenuItemLists) {
        OrderMenuItems -=1;
        menu = MenuItemLists.getDrinkmenus().get(OrderMenuItems).getdrink()+MenuItemLists.getDrinkmenus().get(OrderMenuItems).getdrinkprice();
        menuName = MenuItemLists.getDrinkname().get(OrderMenuItems).getName();
        menuPrice = MenuItemLists.getDrinkmenus().get(OrderMenuItems).getdrinkprice();
    }

    void DessertorderOrders(Menu MenuItemLists) {
        OrderMenuItems -=1;
        menu = MenuItemLists.getDessertmenus().get(OrderMenuItems).getMenuname()+MenuItemLists.getDessertmenus().get(OrderMenuItems).getMenuprice()+
                MenuItemLists.getDessertmenus().get(OrderMenuItems).getMenudescription();
        menuName = MenuItemLists.getDrinkname().get(OrderMenuItems).getName();
        menuPrice = MenuItemLists.getDrinkmenus().get(OrderMenuItems).getdrinkprice();
    }

    void OrderProgress() {
        List<String> shoppingCarts =shoppingCart.stream()
                .filter(m ->!m.contains("SmokeShack"))
                .toList();//특정 메뉴 빼기 기능 람다식으로//SmokeShack 아닌 값만 리스트 타입으로 변수에 담는다는 내용
        System.out.println("\n아래와 같이 주문 하시겠습니까?\n");
        System.out.println(menus.get(9).getMenu());
        String RemoveParenthesesBasket =String.join(", \n",shoppingCarts);
        System.out.println(RemoveParenthesesBasket);
        //shoppingCart.forEach(System.out ::println);
        System.out.println('\n'+menus.get(10).getMenu());
        System.out.println(String.format("W "+"%.1f",MenuPriceList));

        System.out.println("\n1. 주문            2. 메뉴판");
        OrderComplete= order.nextInt();

        if(1 == OrderComplete) {
            System.out.println("\n할인 정보를 입력해주세요.");
            System.out.println(menus.get(11).getMenu());
            discount = order.nextInt();
            if(1 == discount) {
                DiscountCompleted = MenuPriceList-personOfnatioNalmeritLim;
                System.out.println("주문이 완료되었습니다. 금액은 " + "w " +String.format("%.2f",DiscountCompleted)+" 입니다.");
                shoppingCart.clear();
                System.exit(0);
            }else if(2 == discount) {
                DiscountCompleted = MenuPriceList-soldierLim;
                System.out.println("주문이 완료되었습니다. 금액은 " + "w " +String.format("%.2f",DiscountCompleted)+ " 입니다.");
                shoppingCart.clear();
                System.exit(0);
            }else if(3 == discount) {
                DiscountCompleted = MenuPriceList-studentLim;
                System.out.println("주문이 완료되었습니다. 금액은 " + "w " +String.format("%.2f",DiscountCompleted)+ " 입니다.");
                shoppingCart.clear();
                System.exit(0);
            }else if(4 == discount) {
                DiscountCompleted = MenuPriceList-commontLim;
                System.out.println("주문이 완료되었습니다. 금액은 " + "w " +String.format("%.1f",DiscountCompleted)+ " 입니다.");
                shoppingCart.clear();
                System.exit(0);
            } else if(2 == OrderComplete) {
                System.out.println("메뉴로 돌아갑니다.");
            }
        }
    }


}

