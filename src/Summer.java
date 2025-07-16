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
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            int left = 1;
            int right = nums.length -1;
            while(left > right){
                if(nums[i] == nums[left]){

                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        List<List<Integer>> list = threeSum(arr);
        for (int i = 0; i < list.size() -1 ; i++) {
            List<Integer> list1 = list.get(i);
            for (int j = 0; j < list1.size(); j++) {
                if(j == list1.size()-1){
                    System.out.println();
                }
                System.out.print(list1.get(j) + " ");
            }
        }

    }
}