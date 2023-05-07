/* bubble sort algorithm theory : 
https://github.com/HasanthaKarunachandra/Python-fundamentals/blob/main/Algorithms/Bubble%20sort%20algorithem.ipynb
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
