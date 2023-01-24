import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
     Question. Write a program in java make a arraylist and do certain operation 
               1. reverse the arraylist
               2. sort the arraylist.
               3. remove elements of arraylist.
 */
class Question4 {
     public static void main(String[] args) {
          List<Integer> list = new ArrayList<>();
          list.add(10);
          list.add(30);
          list.add(30);
          list.add(90);
          list.add(0);

          System.out.println("ArrayList : " + list);

          // 1. reverse the arraylist
          System.out.println("ArrayList after reversing elements : " + reverseList(list));

          // 2. sort the arraylist.
          System.out.println("ArrayList after sorting elements : " + sort_Arraylist(list));

          // 3. remove elements of arraylist.
          list.remove(1);
          list.remove(0);
          System.out.println("ArrayList after removing elements : " + list);

     }     

     static List<Integer> reverseList(List<Integer>list) {
          List<Integer> list_reverse = new ArrayList<>(list);
          Collections.reverse(list_reverse);
          return list_reverse;
     }

     static List<Integer> sort_Arraylist(List<Integer>list) {
          List<Integer> list_sort = new ArrayList<>(list);
          Collections.sort(list_sort);
          return list_sort;
     }
}
