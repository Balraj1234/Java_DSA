
// Find the largest element in array
// Here we will use int Max = Integer.MIN_VALUE to compare with all the array elements
// after this comperison we will get the largest array element, Because Max will be the minimum value of integer and
// one by one comparison with array elements will replace the Max whenever the largest one from previous will occur ,
// and at the last the largest Element will remain.
public class findLargestArrayElement {
    public static void main(String[] args) {
        int arr[] = {23,43,12,54,5,32,31};
//      Printing normal Array
        System.out.print("Array Elements: ");
        for(int val : arr){
            System.out.print(val+" ");
        }

//        Max as minimum
        int Max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max = arr[i];
            }
        }
        System.out.print("\n Largest Element of Array is : "+Max);
     }
}
