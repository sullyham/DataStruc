enum Mood{
    GOOD,BAD,NEUTRAL
}

public class School implements Building, Comparable<School>{
    int cost;
    Mood mood;
    String name;
    School(Mood mood, int cost,String name){
        this.mood = mood;
        this.cost = cost;
        this.name = name;
    }
    @Override
    public void Description() {
        if(mood == Mood.GOOD){
            System.out.println("THIS SHIT IS GOOD!");
        } else if (mood == Mood.BAD) {
            System.out.println("THIS SUCKS!");
        }
        else{
            System.out.println("It's fine...");
        }
    }
    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int compareTo(School other) {
        return other.cost - this.cost;
    }
}
