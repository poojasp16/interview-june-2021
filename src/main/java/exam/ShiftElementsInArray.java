package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    System.out.println("Original array: ");    
        for (int i = 0; i < arr.length; i++)    
            System.out.print(arr[i] + " ");     
            for(int i = 0; i < n; i++){    
            int j, last;     
            last = arr[arr.length-1];    
        }
            for(j = arr.length-1; j > 0; j--){    
                //Shift element of array by one    
                arr[j] = arr[j-1];    
            }      
            arr[0] = last;      
  } 
        System.out.println();  
  public static void main(String args[])
  {
    int [] arr = new int [] {1, 2, 3, 4, 5};  
      int n = 3; 
    ShiftElementsInArray shift = new ShiftElementsInArray();
    shift(arr);
    System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " "); 
        }
  }
