import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Summer {
    public static void main(String[] args) {

            School one = new School(Mood.BAD,49,"MET");
            School two = new School(Mood.BAD,48,"HazleDale");
        School three = new School(Mood.BAD,999,"Silent Hill");
            List<School> list = new ArrayList<>();
            list.add(one);
            list.add(two);
            list.add(three);
            Collections.sort(list);
            System.out.println("Our list of schools, ranked by cost :)");
            for(School school: list){
                System.out.println(school.name);
            }



    }
}