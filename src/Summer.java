

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
    public static int MAXAREA(int[] heights){
        int distance = 0;
        int max = 0;
        int left = 0;
        int right = heights.length - 1;
        int small = 0;
        while(left < right){
            small = Math.min(heights[left],heights[right]);
            distance = small *(right - left);
            if(distance > max){
                max = distance;
            }
            if(heights[left] > heights[right]){
                right--;
            }
            else{
                left++;
            }

        }
        return max;
    }
    public static void trap(int height[]){
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if(i == 0){
                leftmax[0] = max;
            }
            else{
                leftmax[i] = max;
                if(height[i] > max){
                    max = height[i];
                }

            }

        }
        max = 0;
        for (int i = height.length -1; i >= 0; i--) {
            if(i == height.length){
                rightmax[height.length - 1] = 0;
                max = height[height.length-1];
            }
            else{
                rightmax[i] = max;
            }
                if(height[i] > max){
                    max = height[i];
                }


        }
        System.out.println("LEFTMAX:");
        for(int numbers: leftmax){
            System.out.print(numbers + " ");
        }
        System.out.println();
        System.out.println("RIGHTMAX:");
        for(int numbers: rightmax){
            System.out.print(numbers + " ");
        }


    }
        public static void main(String[] args) {
        int[] area = {0,1,0,2,1,0,1,3,2,1,2,1};
       trap(area);
       System.out.println();
       System.out.println("OG ARRAY:");
       for(int numbers: area){
           System.out.print(numbers + " ");
       }



    }
}