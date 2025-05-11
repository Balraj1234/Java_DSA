// Find the second largest element in an array
// taking the larest value as 0th index value and second largest as 1th index value
// then iterating array and checking that if the a[i]>largest which is as a[0]>2 -> 2>2 false, then do nothing
// then next a[1]>largest 2>10 false, do nothing
// then next a[2]>largest 10>4 true, the assign secondLargest as largest( second larges=2) and update largest to arr[2]=10;
// now largest value is 10 and secondLargest is 2
// then check again until loop terminates....
// if arr[3](12) > 2 true, then again assign largest value to secondlargest which is (10) and a[3](12) to largest,
// the process will continue until loop terminates and at the end we will have our second largest number.
public class FindTheSecondLargestNumberInAnArray {
    public static int findSecondLargest(int[] arr){
        int largest = arr[0];
        int secondlargest = arr[1];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int[] arr = {2,10,4,12,15,21,4,8,5};
        int secondlargest = findSecondLargest(arr);
        System.out.print("Second Largest Element is: "+secondlargest);
    }
}
