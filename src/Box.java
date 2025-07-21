public class Box<stuff> implements Printable{
    stuff stuff;
    public Box(stuff stuff){
        this.stuff = stuff;
    }
    @Override
    public void print() {
        System.out.println("This box contains " + stuff);
    }
}
