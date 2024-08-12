import java.util.Scanner;

public class week1 {

    public static void printRecipe(String menu, double score, String[] recipe)
    {
        System.out.printf("[ %s ]\n", menu);
        System.out.printf("별점 : %d(%.1f%%)\n", (int)score, score / 5.0 * 100.0);

        for(int i = 0; i < recipe.length; ++i)
        {
            System.out.printf("%d. %s\n", i + 1, recipe[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        String menu;
        String[] recipe = new String[10];
        double score;

        Scanner sc = new Scanner(System.in);

        System.out.print("메뉴 : ");
        menu = sc.nextLine();

        System.out.print("점수 : ");
        score = sc.nextDouble();
        sc.nextLine();

        System.out.print("레시피 : ");
        for(int i = 0; i < 10; ++i)
        {
            recipe[i] = sc.nextLine();
        }

        printRecipe(menu, score, recipe);
    }
}