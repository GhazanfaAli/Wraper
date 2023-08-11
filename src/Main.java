import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public String name1;
    public int num1;

    Main(String name1, int num1){
        this.name1 = name1;
        this.num1 = num1;
    }

    public static void main(String[] args) {

        Main obj1 = new Main("ali", 33);
        Main obj2 = new Main("akram", 11);
        Main obj3 = new Main("aslam", 22);

        ArrayList<Main> list1 = new ArrayList<>();
        list1.add(obj1);
        list1.add(obj2);
        list1.add(obj3);


        for(Main objects: list1){
            System.out.println(objects.name1 +" "+ objects.num1);
        }


    }
}