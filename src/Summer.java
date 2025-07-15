import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Summer {
    public static void Sum(int target, int[] arr){
        int index1 = 0;
        int index2 = arr.length -1;
        int left = arr[index1];
        int right = arr[index2];
        Boolean truth = true;
        while(left + right != target){
           if(index1 >= index2){
               System.out.println("There is no pair that adds up to target.");
               truth = false;
               break;
           }
           else if(left + right > target){
                index2--;
                right = arr[index2];
           }
           else if(left + right < target){
               index1++;
               left = arr[index1];
           }

        }
        if(truth) {
            System.out.println(arr[index1] + " + " + arr[index2] + " == " + target);
        }
    }
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {-10, -5, -3, 0, 0, 3, 3, 5, 7, 9, 15};
        Arrays.sort(arr);
        Sum(0, arr);

    }
}