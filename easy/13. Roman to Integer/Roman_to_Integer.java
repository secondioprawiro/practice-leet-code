class Solution {
    public int romanToInt(String s) {
        int output = 0;
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for(int i = 0; i < s.length(); i++){
            int curr = roman.get(s.charAt(i));

            if (i + 1 < s.length()){
                int next = roman.get(s.charAt(i + 1));

                if(curr < next){
                    output -= curr;
                }else{
                    output += curr;
                }
            }else{
                output += curr;
            }
        }

        return output;
    }
}