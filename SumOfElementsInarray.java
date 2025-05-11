
// Sum of elements in an array
// Here we have used temp variable as storage area for result of previous value + next value
// first temp is 0 when temp+arr[i] operation is performed the temp current value (0) and arr[i] in first iteration is [5] means temp = 0+5
// now temp will be the 5, then in next iteration arr[i] will be next index value which is in our case (15) the addition of previous temp
// value and next index value will be again stored in temp which is temp = 5+15; at this point temp will be 20 and again until loop iterates
// over array the value of arr[i] will be changed and will also be added into temp until loop terminates;
// when the loop terminates the final result (sum of array elements) will be in temp variable and we will return temp;
public class SumOfElementsInarray {
    public static int sumOfArray(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            temp = temp + arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {5,15,10,20,50,25};
        int result = sumOfArray(arr);
        System.out.println("Sum of array elements : "+result);
    }
}

// time complexity : O(n)
// space complexit : O(1)