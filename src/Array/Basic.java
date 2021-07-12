package Array;

import java.util.HashMap;

public class Basic {
    public static void main(String[] args) {
//        sort012(new int[]{0,1,1,0,1,2,2,1,0,1},4);
//        rotate(new int[]{1,2,3,4,5},5);
    }

    public static void reverseArray(int[] a){


        int start = 0;
        int end = a.length-1;

        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void minAndMax(int[] a){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
            if(min>a[i]){
                min = a[i];
            }
        }
        System.out.println(min+" "+max);
    }

    public static void nthSmallest(int[] a,int nth){
        int prevMin = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int counter = 0;
        for(int i = 0 ;i<a.length;i++){
            minValue = Integer.MAX_VALUE;
            for(int k = 0 ;k<a.length;k++){
                if(a[k]<minValue && prevMin<a[k]){
                    minValue = a[k];
                }
            }
            prevMin = minValue;
            counter++;
            if(counter==nth){
                break;
            }
        }
    }

    public static void nthSmallestWithHash(int[] a,int nth){

    }

    public static void sort012(int a[], int n)
    {
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for(int i = 0;i<a.length;i++){
            switch (a[i]){
                case 0:
                    count_0++;
                    break;
                case 1:
                    count_1++;
                    break;
                case 2:
                    count_2++;
                    break;
            }
        }

        for(int i = 0 ;i<a.length;i++){
            if(i<count_0){
                a[i] = 0;
            }else if(i<count_0+count_1){
                a[i] =1;
            }else if(i>=count_0+count_1){
                a[i]=2;
            }
        }
        Helper.printArray(a);
    }

    public static int doUnion(int a[], int n, int b[], int m)
    {
        int count = 0;
        HashMap<Integer,Integer> unique = new HashMap<>();
        for(int i = 0;i<a.length;i++){
            if(!unique.containsKey(a[i])){
                unique.put(a[i],a[i]);
                count++;
            }
        }

        for(int i = 0;i<b.length;i++){
            if(!unique.containsKey(b[i])){
                unique.put(b[i],b[i]);
                count++;
            }
        }

        return count;
    }

    public static void rotate(int arr[], int n)
    {
        for(int i = 0;i<arr.length-1;i++){
            int tempa = arr[i+1];
            arr[i+1] = arr[0];
            arr[0] = tempa;
        }
    }


    int maxSubarraySum(int arr[], int n){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }

}



