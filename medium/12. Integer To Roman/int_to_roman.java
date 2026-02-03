class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> roman = new HashMap<>();
        roman.put(1,"I");
        roman.put(4,"IV");
        roman.put(5,"V");
        roman.put(9,"IX");
        roman.put(10, "X");
        roman.put(40,"XL");
        roman.put(50, "L");
        roman.put(90, "XC");
        roman.put(100, "C");
        roman.put(400,"CD");
        roman.put(500, "D");
        roman.put(900, "CM");
        roman.put(1000, "M");
        int temp = num;
        String result = "";
        
        while (temp != 0){
            if (temp >= 1000){
                temp -= 1000;
                result += roman.get(1000);
            }else if (temp >= 900){
                temp -= 900;
                result += roman.get(900);
            }else if (temp < 900 && temp >= 500){
                temp -= 500;
                result += roman.get(500);
            }else if(temp >= 400){
                temp -= 400;
                result += roman.get(400);
            }else if (temp < 400 && temp >= 100){
                temp -= 100;
                result += roman.get(100);
            }else if (temp >= 90){
                temp -= 90;
                result += roman.get(90);
            }else if (temp < 90 && temp >= 50){
                temp -= 50;
                result += roman.get(50);
            }else if (temp >= 40){
                temp -= 40;
                result += roman.get(40);
            }else if (temp < 40 && temp >= 10){
                temp -= 10;
                result += roman.get(10);
            }else if (temp >= 9){
                temp -= 9;
                result += roman.get(9);
            }else if (temp < 9 && temp >= 5){
                temp -= 5;
                result += roman.get(5);
            }else if (temp == 4){
                temp -= 4;
                result += roman.get(4);
            }else {
                temp -= 1;
                result += roman.get(1);
            }
        }

        return result;
    }
}