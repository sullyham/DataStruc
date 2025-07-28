

public class Summer {
    public static int maxArea(int[] nums) {
        int distance = 0;
        int max = 0;
        for (int i = 0; i < nums.length -1 ; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                int small = Math.min(nums[i],nums[j]);
                distance = small * (j - i);
                if(distance > max){
                    max = distance;
                }
            }
        }
        return max;
    }
        public static void main(String[] args) {
        int[] area = {1,8,6,2,5,4,8,3,7};
       System.out.println(maxArea(area));




    }
}