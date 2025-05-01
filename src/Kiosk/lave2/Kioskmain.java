package Kiosk.lave2;

import java.awt.*;//리스트를 클래스타입으로 만들기전 선언
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kioskmain
{
    public static void main(String[] args) {
        List<MenuItem> menuItem = new ArrayList<>();

        menuItem.add(new MenuItem("1. ShackBurger | W " ,6.9 ,"| 토마토, 양상추, 쉑소스가 토핑된 치즈버거"));//선언된 클래스 타입 변수를 위 리스트에 담는방법
        menuItem.add(new MenuItem("2. SmokeShack | W", 8.9, "| 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItem.add(new MenuItem("3. Cheeseburger | W", 6.9 ,"| 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItem.add(new MenuItem("4. Hamburger | W", 5.4 ,"| 비프패티를 기반으로 야채가 들어간 기본버거"));

//        MenuItem menuItem0 = new MenuItem("Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");//생성한 객체 변수의 담는방법
//        menuItem.add(menuItem0); // 생성한 변수 리스트에 담는방법

        String Selectedmenu = ""; //스트링 초기화 방법

        Scanner order = new Scanner(System.in);

        while (true)//무한 수행을 원할때는 while문 사용 break;만나면 빠져나옴 종결조건이 true이면 무한루프
        {
            System.out.printf('\n'+"원하시는 메뉴를 골라주세요 : "+'\n');
            int orders = order.nextInt();

            if(1==orders) {
                System.out.printf("선택한 메뉴는 : "+menuItem.get(0).getBurgername()+menuItem.get(0).getBurgerprice()+menuItem.get(0).getBurgerDescription()+'\n');
            }else if(2==orders) {
                System.out.printf("선택한 메뉴는 : "+menuItem.get(1).getBurgername()+menuItem.get(1).getBurgerprice()+menuItem.get(1).getBurgerDescription()+'\n');
            }else if(3==orders) {
                System.out.printf("선택한 메뉴는 : "+menuItem.get(2).getBurgername()+menuItem.get(2).getBurgerprice()+menuItem.get(2).getBurgerDescription()+'\n');
            }else if(4==orders) {
                System.out.printf("선택한 메뉴는 : "+menuItem.get(3).getBurgername()+menuItem.get(3).getBurgerprice()+menuItem.get(3).getBurgerDescription()+'\n');
            }else if(0==orders) {
               System.out.printf("주문을 종료합니다. 이용해주셔서 감사합니다.");
               break;
            }else {
                System.out.printf("없는 메뉴를 입력하셨습니다 다시 입력해주세요"+'\n');
            }
        }
    }
}
