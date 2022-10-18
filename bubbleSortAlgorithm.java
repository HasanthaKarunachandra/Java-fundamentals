/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algorithem;

import java.util.Arrays;

public class bubbleSortAlgorithm {
  static void bubbleShort(int array[]){
    int len=array.length;
for (int i=0; i<len; i++){
 for (int j=0; j<len-1-i; j++){
  if (array[j]>array[j+1]){
     int temp = array[j];
     array[j]=array[j+1];
     array[j+1]=temp;
}}}}
  
    public static void main(String[] args) {
        int[] list={5, 1, 4, 2, 8};
        bubbleSortAlgorithm.bubbleShort(list);
        System.out.print("According to the bubble short alogorithem, the List in in ascending order:");
        System.out.println(Arrays.toString(list));
    }
    
}
