class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        if(rowIndex==0)
            return triangle.get(rowIndex); 
        
         for(int i=1; i<=rowIndex; i++){
            List<Integer> preRow = triangle.get(i-1);
            List<Integer> currRow = new ArrayList<>();
            
            currRow.add(1);
            for(int j=1; j<i; j++){
                currRow.add(preRow.get(j-1)+preRow.get(j));
            }
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle.get(rowIndex);
    }
}