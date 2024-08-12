import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class week2 {

    public static void printRecipe(String menu, String container, String[] recipe)
    {
        System.out.printf("[ %s으로 저장된 %s ]\n", menu);
        
        for(int i = 0; i < recipe.length; ++i)
        {
            System.out.printf("%d. %s\n", i + 1, recipe[i]);
        }
    }

    public static void useSet(Scanner sc, String menu)
    {
        String recipeInput;
        Set<String> recipeList = new LinkedHashSet();

        System.out.print("레시피 : ");
        while(true)
        {
            recipeInput = sc.nextLine();
            if(recipeInput.equals("끝"))
            {
                break;
            }

            recipeList.add(recipeInput);
        }

        printRecipe(menu, "Set", recipeList.toArray(String[]::new));
    }

    public static void useList(Scanner sc, String menu)
    {
        String recipeInput;
        List<String> recipeList = new ArrayList<String>();

        System.out.print("레시피 : ");
        while(true)
        {
            recipeInput = sc.nextLine();
            if(recipeInput.equals("끝"))
            {
                break;
            }
            recipeList.add(recipeInput);
        }

        printRecipe(menu, "List", recipeList.toArray(String[]::new));
    }

    public static void useMap(Scanner sc, String menu)
    {
        Map<Integer, String> recipeMap = new LinkedHashMap<Integer, String>();
        String recipeInput;
        int index = 0;

        while(true)
        {
            recipeInput = sc.nextLine();
            if(recipeInput.equals("끝"))
            {
                break;
            }
            recipeMap.put(index, recipeInput);
        }

        printRecipe(menu, "Map", recipeMap.values().toArray(String[]::new));
    }

    public static void main(String[] args) throws Exception {
        String menu, container;
        Scanner sc = new Scanner(System.in);

        System.out.print("자료구조 : ");
        container = sc.nextLine();

        System.out.print("메뉴 : ");
        menu = sc.nextLine();

        switch(container)
        {
            case "Set" :
                useSet(sc, menu);
            break;
            case "List" :
                useList(sc, menu);
            break;
            case "Map" :
                useList(sc, menu);
            break;
            default :
            System.out.print("자료구조를 확인해주세요.");
        }
       
    }
}