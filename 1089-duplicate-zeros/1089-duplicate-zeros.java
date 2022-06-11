class Solution {
    public void duplicateZeros(int[] arr) {
        int totalZero = 0;
        for (int i=0; i< arr.length; i++){
            if(arr[i] == 0)
                totalZero++;
        }
        
        int i = arr.length -1;
        int j = arr.length + totalZero -1;
        
        while (i < j) {
            insert(arr, i, j--);
            if(arr[i]==0){
                insert(arr, i, j--);
            }
            i--;
        }
    }
    
    public void insert(int[] arr, int i, int j){
        if( j < arr.length){
            arr[j] = arr[i];
        }
    }
}