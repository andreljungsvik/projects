import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(6);
        nums.add(10);

        Collections.sort(nums);
        Collections.reverse(nums);
        
        System.out.println(nums);
    }
}