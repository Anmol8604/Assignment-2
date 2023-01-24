import java.util.ArrayList;   
import java.util.List;        

/*
     Write a Java program that takes an integer array as input and converts it into an ArrayList.    The program should have a method called convertArrayToList that takes in the array as a parameter and returns the converted ArrayList.
     The input for the program is an array {1, 2, 3, 4, 5} 

     The output of the program should be the ArrayList

      [1, 2, 3, 4, 5] after the conversion."
 */
class Question1{
     public static void main(String[] args) {

          int[] arr = {1, 2, 3, 4, 5}; //The input for the program is an array {1, 2, 3, 4, 5} 

          System.out.println(convert_Array_to_ArrayList(arr)); // [1, 2, 3, 4, 5] after the conversion.
     }

     static List<Integer> convert_Array_to_ArrayList(int[] arr) {
          List <Integer> list = new ArrayList<>();     // Creating new ArrayList.

          for(int i : arr) {
               list.add(i);   // Adding Element of Array in ArrayList.
          }

          return list;   // Returning List.
     }
}