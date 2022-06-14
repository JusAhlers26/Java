import java.util.ArrayList;

public class practice {
    // while and for loop basics. Need to keep this in my head!
    public static void main(String[] args){
        int i = 0;
        while(i <12)
        {
            System.out.println("Sheep");
            i++;
        }
        for (int i1 = 0; i1 < 7; i1++){
            System.out.println("Pig");
        }
        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        for (int i2 = 0; i2 < dynamicArray.size(); i2++){
        System.out.println(dynamicArray.get(i2));
        }
    }
}
