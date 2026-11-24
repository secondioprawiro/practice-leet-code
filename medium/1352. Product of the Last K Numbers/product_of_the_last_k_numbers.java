import java.util.List;
import java.util.ArrayList;

class ProductOfNumbers {
    List<Integer> prefix = new ArrayList<>();

    public ProductOfNumbers() {
        prefix.add(1);
    }
    
    public void add(int num) {
        if (num == 0){
            prefix.clear();
            prefix.add(1);
        }else{
            int last = prefix.get(prefix.size() - 1) * num;
            prefix.add(last);
        }
    }
    
    public int getProduct(int k) {
        int result = 0;

        if(prefix.size() <= k){
            return 0;
        }else{
            int lastPref = prefix.get(prefix.size() - 1);
            int divideBy = prefix.get(prefix.size() - k - 1);

            result = lastPref/divideBy;
        }

        return result;
    }
} 