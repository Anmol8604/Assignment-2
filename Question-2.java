import java.util.ArrayList;
import java.util.HashSet;

// Question. Write a program to Print all the elements of a collection in Java.
class Question2 {
     public static void main(String[] args) {
          // ArrayList
          ArrayList <Integer> list = new ArrayList<>();
          list.add(10);
          list.add(20);
          list.add(30);
          list.add(40);
          list.add(50);
          // Printing all the elements of list.
          System.out.println(list);


          // HashSet
          HashSet<Integer> set = new HashSet<>();
          set.add(10);
          set.add(20);
          set.add(30);
          set.add(40);
          set.add(50);
          // Printing all the elements of Set.
          System.out.println(set);
     }
}
