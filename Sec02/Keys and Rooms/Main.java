import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> input1 = List.of(
            List.of(1),
            List.of(2),
            List.of(3),
            new ArrayList<>()
        );
        List<List<Integer>> input2 = List.of(
            List.of(1, 3),
            List.of(3, 0, 1),
            List.of(2),
            List.of(0)
        );

        System.out.println(new Solution01().canVisitAllRooms(input1));  
        System.out.println(new Solution01().canVisitAllRooms(input2));        

        System.out.println();
        System.out.println();

        System.out.println(new Solution02().canVisitAllRooms(input1));  
        System.out.println(new Solution02().canVisitAllRooms(input2)); 
    }
}
