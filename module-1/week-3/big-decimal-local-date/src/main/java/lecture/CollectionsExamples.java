package lecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {

    public static void main(String[] args) {
        new CollectionsExamples().run();
    }

    public void run(){
        collectionsExamples();
    }

    public void collectionsExamples(){

        List<Integer> myList = Arrays.asList(-11, 22, 874378, 0, 94, 42);
        System.out.println(myList);

        /*
         * Get the min/max in a collection
         *  Collections.min()
         *  Collections.max()
         */
        Integer minInt = Collections.min(myList);
        Integer maxInt = Collections.max(myList);
        System.out.println("minimum value is: " + minInt);
        System.out.println("maximum value is: " + maxInt);

        /*
         * Sort, Reverse, Shuffle
         *  Collections.sort()
         *  Collections.reverse()
         *  Collections.shuffle()
         */
        Collections.sort(myList);
        System.out.println(myList);
        Collections.reverse(myList);
        System.out.println(myList);
        Collections.shuffle(myList);
        System.out.println(myList);
    }
}
