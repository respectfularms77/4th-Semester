import java.util.*;
public class P16_Anonymous_Class_Example {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>(
            Arrays.asList(1,3,5,2,4)
        );
        Comparator<Integer> comparetor = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2){
                return o1-o2;
            }
        };
        list.sort(comparetor);
        System.out.println(Arrays.toString(list.toArray()));
    }
}