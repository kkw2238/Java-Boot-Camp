import java.util.HashMap;
import java.util.Scanner;

public class VendingMachine {
    public HashMap<String, Integer> menu;
    int nowMoney;

    public void initaillize(HashMap<String, Integer> newMenu) {
        menu = new HashMap<>(newMenu);
        nowMoney = 0;
    }

    // 메뉴 보여주는 함수
    public void showMenu() {
        int[] index = {1};

        menu.forEach((name, price) -> {
            System.out.print(index[0] + ". " + name + " " + price + " ");
            ++index[0];
        });

        System.out.print("\n\n");
    }

    // 음료수 구매
    public void buy(Scanner sc) {
        int[] index = {1};

        System.out.println("구매 가능한 음료 : ");

        // Lambda에서 지역변수를 참조하는 것이 불가능 하여, Array나 객체로 변환해야 한다.
        menu.forEach((name, price) -> {
            if(price < nowMoney)
            {
                System.out.print(index[0] + ". " + name + " " + price + " ");
                ++index[0];
            }
        });

        System.out.println("\n구매할 음료를 입력해 주세요 : ");
        // buffer 비우기
        sc.nextLine();

        String answer = sc.nextLine();

        if(menu.containsKey(answer))
        {
            if(menu.get(answer) < nowMoney)
            {
                System.out.println(answer + "을/를 구매했습니다.");
                
                nowMoney -= menu.get(answer);
                System.out.println("남은 소지 금액 : " + nowMoney);
            }
            else
            {
                System.out.println(answer + "을/를 구매하지 못했습니다.( 소지 금액 부족 )");
                System.out.println("현재 소지 금액 : " + nowMoney);
            }   
        }
        else 
        {
            System.out.println("존재하지 않는 음료입니다.");
        }
    }

    public void insertMoney(Scanner sc) {
        System.out.println("투입할 금액을 입력해 주세요 : ");
        int insertMoney = sc.nextInt();

        if(insertMoney <= 0)
        {
            System.out.println("0 이하의 숫자는 입력할 수 없습니다.");
        }
        else
        {
            System.out.println(insertMoney + "원을 충전 했습니다.");
            nowMoney += insertMoney;
            System.out.println("현재 잔액 : " + nowMoney);
        }
    }

    public void endShopping()
    {
        System.out.println(nowMoney + "원이 반환 되었습니다.");
        System.out.println("이용해 주셔서 감사합니다");

        nowMoney = 0;
    }
}
