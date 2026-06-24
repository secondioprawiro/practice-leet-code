class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        
        String output = "";
        List<StringBuilder> rows = new ArrayList<>();
        int currentRow = 0;
        boolean goingDown = true;

        

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        for (int i = 0; i < s.length(); i++){
            if (currentRow < numRows && goingDown == true){
                rows.get(currentRow).append(s.charAt(i));
                currentRow++;
                if (currentRow >= numRows && goingDown == true){
                    currentRow = numRows - 2;
                    goingDown = false;
                }
            }else{
                rows.get(currentRow).append(s.charAt(i));
                currentRow --;
                if (currentRow < 0 && goingDown == false){
                    currentRow = 1;
                    goingDown = true;
                }
            }
        }

        for (int i = 0; i < rows.size(); i++) {
            output += rows.get(i).toString();
        }

        return output;
    }
}