package simpletest;

public class Pythagoras {
    public int triangle(int a, int b){
        if (a < 0 || b < 0){
            return -1;
        }
        return (int) Math.hypot(a, b);
    }
}
