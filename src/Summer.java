import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    public static void main(String[] args) {

            System.out.println(factorial(4));
            System.out.println(sumtoone(2));



    }
}