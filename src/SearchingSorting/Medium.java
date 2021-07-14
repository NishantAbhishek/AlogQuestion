package SearchingSorting;

import java.util.HashMap;

public class Medium {
    public static void main(String[] args) {
        int[] a = findTwoElement(new int[]{13,33,43,16,25,19,23,31,29,35,10,2,32,11,47,15,34,46,30,26,41,18,5,17,37,39,6,4,20,27,9,3,8,40,24,44,14,36,7,38,12,1,42,12,28,22,45},3);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    static int[] findTwoElement(int arr[], int n) {
        int[] arrb = new int[arr.length+1];
        int repeatedValue = Integer.MAX_VALUE;
        int notFound = -1;

        for(int i = 0;i<arr.length;i++){
            int arrValue = arr[i];
            if(arrb[arrValue]==0){
                arrb[arrValue] = arrValue;
            }else{
                repeatedValue = arrValue;
            }
        }

        for(int i = 1;i<arrb.length;i++){
            if(arrb[i]==0){
                notFound = i;
            }
        }
        return new int[]{repeatedValue,notFound};
    }

    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> count =new HashMap<Integer,Integer>();

        for(int i = 0;i<a.length;i++){
            int value = a[i];
            if(count.containsKey(value)){
                count.put(value,count.get(a[i])+1);
            }else{
                count.put(value,1);
            }
        }

        int maxFound = -1;

        for (Integer value : count.keySet()){
            int noOfValue = count.get(value);
            if(noOfValue>maxFound && noOfValue>a.length/2){
                maxFound = value;
            }
        }
        return maxFound;
    }
}
