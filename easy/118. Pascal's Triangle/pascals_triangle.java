class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++){
            List<Integer> currentRow = new ArrayList<>();

            if (i == 0){
                currentRow.add(1);
                result.add(currentRow);
                continue;
            }else{
                List<Integer> previousRow = result.get(i - 1);
                currentRow.add(1);

                if (previousRow.size() < 2){
                    currentRow.add(1);
                    result.add(currentRow); 
                    continue;               
                }else{
                    
                    for (int j = 0; j < previousRow.size() - 1; j++) {

                        int first = previousRow.get(j);
                        int second = previousRow.get(j + 1);

                        int curResult = first + second;

                        currentRow.add(curResult);
                    }
                }
            }
            currentRow.add(1);

            result.add(currentRow);
        }

        return result;
    }
}