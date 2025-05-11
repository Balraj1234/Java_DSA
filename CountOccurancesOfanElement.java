//Count Occurances of an array element
// Here we have created the method countOccurance which takes two arguments first is an array and second is element of which ocuurances
// we want to count , then we have created a variable count whose value assigned 0 at first, then while iterating the loop we are checking
// that the ith element is equal to n(whose occurances we want to count), if i is equal to n then increment the count value by one(1) whenever
// the element equal to n occurs the count value will be increased ,at the last will have the occurances of n element.
public class CountOccurancesOfanElement {
    public static int countOccurance(int[] arr,int n){
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] == n){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,14,4,5,4,4,12};
        int occurances = countOccurance(arr,4);
        System.out.print("Occurances of element 4 in array is: "+occurances);
    }
}
// Time complexity: O(n)
// Space complexity: O(1)
