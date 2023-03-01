class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        
        if(numRows == 0) return triangle;
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        for(int i=1; i<numRows; i++){
            List<Integer> preRow = triangle.get(i-1);
            List<Integer> currRow = new ArrayList<>();
            
            currRow.add(1);
            for(int j=1; j<i; j++){
                currRow.add(preRow.get(j-1)+preRow.get(j));
            }
            currRow.add(1);
            triangle.add(currRow);
        }
        return triangle;
    }
}