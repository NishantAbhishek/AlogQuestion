package SearchingSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Easy {
    public static void main(String[] args) {
        System.out.println(middle(12,9,8));
    }

    private static ArrayList<Long> find(long[] arr, int n, int x)
    {
        ArrayList<Long> list = new ArrayList<>();
        list.add(0,(long)-1);
        list.add(1,(long)-1);

        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println(i);
                if(list.get(0)==-1){
                    list.add(0,(long)i);
                    list.add(1,(long)i);
                }else{
                    list.add(1,(long)i);
                }
            }
        }
        return list;
    }

    private ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<arr.length;i++){
            if(i+1==arr[i]){
                list.add(i+1);
            }
        }
        return list;
    }
    private int search(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }

    private static int countSquares(int N) {
        if(N==0||N==1){
            return 0;
        }

        for(int i = 0;i<N/2;i++){
            if(i*i>=N){
                return i-1;
            }
        }
        return 0;
    }

    static int middle(int A, int B, int C){
        int[] arr = new int[3];
        arr[0] = A;
        arr[1] = B;
        arr[2] = C;

        Arrays.sort(arr);
        return arr[1];
    }

}
