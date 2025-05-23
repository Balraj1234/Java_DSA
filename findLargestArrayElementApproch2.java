
// Find largest element in an array
// Here we will not use MIN_VALUE for comparison
// We will take first element as large and compare with second if second is large then we'll replace large element with second and so on
// with all other left behind elements, at last we will find the largest elements of and array
public class findLargestArrayElementApproch2 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,7,3,23,63,13,3,5,8,6};
        int largest = arr[0];
        int temp;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                temp = largest;
                largest = arr[i];
                arr[i] = temp;
            }
        }
        System.out.print("Largest Element is : "+largest);
    }
}
