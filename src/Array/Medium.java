package Array;

public class Medium {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,3,4,2,3}));
    }

    static int minJumps(int[] arr){
        int maxReachIndex = 0;
        int nextIndex = -1;
        int countStep = 0;
        int currentIndex = 0;

        if(arr.length<=1){
            return -1;
        }

        if(arr[0]==0){
            return -1;
        }

        for (currentIndex = 0; currentIndex < arr.length;) {
            System.out.println(arr[currentIndex]);
            int currentMaxReach = arr[currentIndex]+currentIndex;

            System.out.println("Max reach:-"+currentMaxReach);
            if(currentMaxReach>=arr.length-1) {
                countStep++;
                System.out.println("Breaking");
                break;
            }

            currentIndex = currentIndex+1;
            for(;currentIndex<=currentMaxReach;currentIndex++){
                if(currentIndex>=arr.length){
                    break;
                }else{
                    System.out.println("Comparing value:- "+arr[currentIndex]+
                            " MaxReach Value:- "+(arr[currentIndex] + currentIndex)+" maxReachIndex "+maxReachIndex);
                    if(maxReachIndex < arr[currentIndex] + currentIndex && arr[currentIndex]!=0){
                        System.out.println("--In--");
                        maxReachIndex = arr[currentIndex]+currentIndex;
                        nextIndex = currentIndex;
                    }
                }
            }

            if(maxReachIndex==0){
                return -1;
            }
            currentIndex = nextIndex;
            maxReachIndex = 0;
            countStep++;
        }
        return countStep;
    }

    public static int findDuplicate(int[] nums) {
        boolean found = false;

        for(int i = 0;i<nums.length;i++){
            int value = nums[i];
            for(int k =i; k<nums.length; k++){
                if(value==nums[k]){
                    if(found==true){
                        return value;
                    }
                    found = true;
                }
            }
            found = false;
        }
        return -1;
    }

}
