/*
 * @Descripttion: 
 * @version: 
 * @Author: Tang Ziqing
 * @Date: 2023-09-24 12:29:55
 * @LastEditors: Tang Ziqing
 * @LastEditTime: 2023-09-24 14:59:27
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListArray {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 11_000_000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        System.out.println("\nFETCHING DATA\n");

        long start = System.currentTimeMillis();
        linkedList.get(4_500_000);
        System.out.println("LinkedLinst: " + (System.currentTimeMillis() - start) + "ms");

        
        start = System.currentTimeMillis();
        arrayList.get(4_500_000);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

        // add
        start = System.currentTimeMillis();
        linkedList.add(5, 121); // insert 121 at  index 5
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.add(5, 12); //time for shifting
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        // remove
        start = System.currentTimeMillis();
        linkedList.remove(5); // insert 121 at  index 5
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.remove(5); //time for shifting
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        // set 
         start = System.currentTimeMillis();
        linkedList.set(4_500_000, 121); // insert 121 at  index 5
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.set(4_500_000, 12); //time for shifting
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

    }
}
