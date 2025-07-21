import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Summer {
    public static int factorial(int number){
        if(number == 1){
            return 1;
        }
        else {
            System.out.println(number + " * factorial(" + (number-1) + ") ");
            return number * factorial(number - 1);
        }
    }
    public static int sumtoone(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + sumtoone(n -1);
        }
    }

    /**
     *
     * @param depth how deep you want the recursion to be
     */
    public static void deep(int depth){
        if(depth == 0){
        }
        else{

            deep(depth -1);
            for (int i = 0; i < depth; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *
     * @param arr the array
     * @param index the starting index
     * @return returns, max
     */
    public static int sumarray(int[] arr, int index){
        int start = index;
        if(index >= arr.length - 1){
            return arr[index];
        }
        return arr[index] + sumarray(arr, index + 1);
    }
    public static int max(int[] arr, int index){
        if(index == arr.length -1){

        }
        else if(arr[index] > max(arr, index +1)){
            return arr[index];
        }
        else{
            return max(arr, index + 1);
        }
        return 0;
    }
    public static String reverse(String str){

        if(str.isEmpty()){
            return "";
        }
        return str.substring(str.length() -1) + reverse(str.substring(0, str.length() - 1));
    }
    public static Boolean palindrome(String str){
        if(str.length() == 1 || str.isEmpty()){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length() -1 )){
            return false;
        }
        return palindrome(str.substring(1, str.length() -1 ));

    }
    public static void print(Printable thing) {
        thing.print();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.DisplayList();



    }
}