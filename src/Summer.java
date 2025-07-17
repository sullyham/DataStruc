import java.util.ArrayList;
import java.util.Arrays;
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
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                // This is to prevent further looping for no reason, as we only want things that sum to zero so anything positive gtfo
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]){
                // We don't want duplicate numbers, so ignore it, if {0,1,1,2} and i = 2
                // we skip it because it is equal to i - 1! so no duplicates, works cuz its sorted!
                continue;
            }

            int left = i + 1; // this is where two sum starts as we already have our first digit
            int right = nums.length - 1; // end of array
            while (left < right) { // As long as there is no cross over
                int sum = nums[i] + nums[left] + nums[right]; //total sum
                if (sum > 0) { // cuz we want smaller numbers
                    right--;
                } else if (sum < 0) { // cuz we want bigger numbers
                    left++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));// add all three numbers
                    left++;//move on
                    right--;//move on
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;// then just keeps updating the left until there are no more duplicates
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        Arrays.sort(arr);
        List<List<Integer>> list = threeSum(arr);
        System.out.println(list.size());

    }
}