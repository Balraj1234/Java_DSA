
// Reverse an array
public class ReverseAnArray {
    public static void reverse(int[] arr){
//        running loop unitil mid of array
            for(int i=0;i<arr.length/2;i++){
//                swaping the first element with last and second with second last and so on...
                int temp = arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1] = temp;
            }
            for (int val : arr){
                System.out.print(val+" ");
            }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,9,6,6,8,5};

//        Approch one: start printing array elements from the last index of array and print in decreasing order.
//        for(int i=arr.length-1;i>=0;i--) {
//            System.out.print(arr[i]+" ");
//        }

    //        Approch Two: divide the array elements into two equal parts and then swap first element with last similarly second element with
    //        second last and so on until all the elements are swaped with its corresponding elements.
    //        In this approach we have realy converted the array elements in reverse order but in first approch not reversing the order just
    //        printing in reverse order
        reverse(arr);

    }
}
