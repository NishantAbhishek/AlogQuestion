package Array;

public class Medium {
    public static void main(String[] args) {
        System.out.println(minJumps(new int[]{1, 4, 3, 2, 6,2,3,1,2,7,3,4,5,2}));
    }
    static int minJumps(int[] arr){
        boolean reached = false;
        int countStep = 0;
        int index = 0;
        int indexToMove = 0;
        int moveStep = 0;
        while (!reached){
            moveStep = arr[index];
            int nextStep = -1;
            System.out.println(arr[index]);
            for(int i = index+1;i<=index+moveStep;i++){
                if(i>=arr.length){
                    break;
                }else{
                    if(arr[i]!=0 && arr[i]>nextStep){
                        nextStep = arr[i];
                        indexToMove = i;
                    }
                }
            }
            index = indexToMove;
            countStep++;
            if(index>=arr.length-1){
                reached = true;
            }
        }
        return countStep;
    }
}
