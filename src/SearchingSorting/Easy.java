package SearchingSorting;

import java.util.ArrayList;

public class Easy {
    public static void main(String[] args) {
        long[] val = {1, 3, 5, 5, 5, 5, 67, 123, 125};

        ArrayList<Long> values = find(val,9,5);

        System.out.println(":-"+values.get(0));
        System.out.println(":-"+values.get(1));
    }

    public static ArrayList<Long> find(long[] arr, int n, int x)
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

    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<arr.length;i++){
            if(i+1==arr[i]){
                list.add(i+1);
            }
        }
        return list;
    }
    public int search(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }
}
