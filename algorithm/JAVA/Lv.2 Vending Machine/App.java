import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
  
        VendingMachine vm = new VendingMachine();
        HashMap<String, Integer> menu = new HashMap<>() {
            {
                put("사이다", 1700);
                put("콜라", 1900);
                put("식혜", 2500);
                put("솔의눈", 3000);
            }
        };

        vm.initaillize(menu);
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. 구매 2. 충전 3. 반환하고 종료");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1 : 
                    vm.showMenu();
                    vm.buy(sc);
                break;

                case 2:
                    vm.insertMoney(sc);
                break;

                case 3:
                    vm.endShopping();
                return;
                
                default :
                    System.out.println("유효하지 않은 항목입니다.");
                break;
            }
        }
    }
}
