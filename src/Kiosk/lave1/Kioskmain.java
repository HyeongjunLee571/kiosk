package Kiosk.lave1;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Kioskmain {
    public static void main(String[] args)
    {
       Scanner order = new Scanner(System.in);


       for(int i = 0 ; i < 100 ; i++) {
           System.out.print('\n'+"[SHAKESHACK MENU]" + '\n');
           System.out.print("1번 메뉴 ShackBurger" + '\n');
           System.out.print("2번 메뉴 SmokeShack" + '\n');
           System.out.print("3번 메뉴 Cheeseburger" + '\n');
           System.out.print("4번 메뉴 Hamburger" + '\n');
           System.out.print("0번 주문종료" + '\n');

           System.out.print('\n' + "메뉴를 주문하시겠습니까?"+'\n' );
           String orders = order.nextLine();

           if("1".equals(orders)) {
               System.out.printf("ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거"+'\n');
           }else if("2".equals(orders)){
               System.out.printf("SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"+'\n');
           }else if("3".equals(orders)) {
               System.out.printf("Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"+'\n');
           }else if("4".equals(orders)) {
               System.out.printf("Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거"+'\n');
           }else if("0".equals(orders)){
               System.out.printf("주문 프로그램을 종료합니다.");
               break;
           }
       }
    }
}