import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    static final int MAXIMUM_COUNT = 4;

    //                      전체 항목           당첨 개수       각 확률     random 객체
    public static int dice(int totalCount, int winningCount, int[] rate, Random engine)
    {
        int normalCount = totalCount - winningCount;   // 일반 닉네임 개수 = 전체 개수 - 당첨 개수
        
        // 당첨이 존재할 경우
        if(winningCount > 0)   
        {
            // 0 ~ 99사이의 난수 생성
            int randNum = engine.nextInt(100);
            int accumulate = 0;

            // 당첨 항목 별로 구간을 생성하여 난수가 해당 범위에 존재할 경우 당첨!
            for(int i = 0; i < rate.length; ++i)
            {
                accumulate += rate[i];

                if(randNum < accumulate)
                {
                    return normalCount + i;
                }
            }
        }
        return engine.nextInt(normalCount);
    }
    public static void main(String[] args) throws Exception {

        long ll = 50000000000000l;

        Math.sqrt(ll);

        List<String> firstModifier = Arrays.asList(new String[]{"기절초풍 ", "멋있는 ", "재미있는 ", "코딩을 잘하는 "}) ;
        List<String> secondModifier = Arrays.asList(new String[]{"도전적인 ", "노란색의 ", "바보같은 ", "논리적인 "}) ;
        List<String> nickName = Arrays.asList(new String[]{"돌고래", "개발자", "오랑우탄", "코린이"});

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        int reroll = 3;

        // 첫 무작위 닉네임 결과 
        int firstIndex = dice(MAXIMUM_COUNT, 1, new int[]{ 1 }, rand);
        int secondIndex = dice(MAXIMUM_COUNT, 1, new int[]{ 10 }, rand);
        int ninkNameIndex = dice(MAXIMUM_COUNT, 1, new int[]{ 20 }, rand);

        // 
        while(reroll > 0) {
            System.out.println(firstModifier.get(firstIndex) + secondModifier.get(secondIndex) + nickName.get(ninkNameIndex));
            System.out.println(String.format("남은 재설정 횟수 : %d", reroll));
            System.out.println("1. 재설정 2. 확정");

            int command = sc.nextInt();

            if(command == 1)
            {
                System.out.println("1. 1번만 변환 2. 2번만 변환 3. 3번만 변환 4. 전체 변환 그외. 취소");

                int nextCommand = sc.nextInt();
                switch(nextCommand)
                {
                    case 1:     
                        firstIndex = dice(MAXIMUM_COUNT, 1, new int[]{ 1 }, rand);
                        --reroll;
                        break;
                        
                    case 2:
                        secondIndex = dice(MAXIMUM_COUNT, 1, new int[]{ 10 }, rand);
                        --reroll;
                        break;

                    case 3:
                        ninkNameIndex = dice(MAXIMUM_COUNT, 1, new int[]{ 20 }, rand);
                        --reroll;
                        break;

                    case 4:
                        firstIndex = dice(MAXIMUM_COUNT, 1, new int[]{ 1 }, rand);
                        secondIndex = dice(MAXIMUM_COUNT, 1, new int[]{ 10 }, rand);
                        ninkNameIndex = dice(MAXIMUM_COUNT, 1, new int[]{ 20 }, rand);
                        reroll -= 3;
                        break;
                }
            }
            else if(command == 2)
            {
                break;
            }
            else
            {
                System.out.println("숫자를 다시 한 번 확인해 주세요.");
            }
        }

        System.out.println("\n최종 닉네임 : " + firstModifier.get(firstIndex) + secondModifier.get(secondIndex) + nickName.get(ninkNameIndex));
    }
}