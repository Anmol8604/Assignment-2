import java.util.ArrayList;
import java.util.List;

// Question. Write a program in java to join two arraylists into one arraylist
class Question3{
     public static void main(String[] args) {
          List<Integer> list1 = new ArrayList<>();
          list1.add(10);
          list1.add(20);
          list1.add(30);
          list1.add(40);
          list1.add(50);

          List<Integer> list2 = new ArrayList<>();
          list2.add(60);
          list2.add(70);
          list2.add(80);
          list2.add(90);
          list2.add(100);

          // Adding all the elements of list2 in list1.
          list1.addAll(list2);
          System.out.println("List 1, when list joins : " + list1);
     }
}
