package MockDSA1Prepration;

public class BubbleSor {
    public static void main(String[] args) {
        int[] arr = {5,1,6,3,4};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}