import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> cars = new ArrayList<>();
        int arrayLength = digits.length;
        int lastIndex = arrayLength - 1;
        int temp = 0;

        for (int i = lastIndex; i >= 0; i--){
            if (i == lastIndex){
                if (digits[i] > 8){
                    cars.add(0);
                    temp++;
                    if(arrayLength == 1){
                        cars.add(temp);
                        temp = 0;
                    }
                }else{
                    cars.add(digits[i] + 1);
                    temp = 0;
                }
            }else{
                if (digits[i] > 8){
                    if(i == 0 && temp != 0){
                        cars.add(0);
                        cars.add(1);
                    }else if (i == 0 && temp == 0 || i != 0 && temp == 0) {
                        cars.add(digits[i]);
                    }else{
                        cars.add(0);
                    }
                }else{
                    if(temp == 0){
                        cars.add(digits[i]);
                    }else{
                        cars.add(digits[i] + temp);
                        temp = 0;
                    }
                }
            }
        }

        Collections.reverse(cars);

        int[] result = new int[cars.size()];

        for (int i = 0; i < cars.size(); i++) {
            result[i] = cars.get(i);
        }

        return result;
    }
}