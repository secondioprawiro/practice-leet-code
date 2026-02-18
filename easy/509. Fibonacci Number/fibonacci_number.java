class Solution {
    public int fib(int n) {
        int fibo0 = 0;
        int fibo1 = 1;
        int result = 0;

        if (n > 1){
            for (int i = 1; i < n; i++){
                result = fibo0 + fibo1;
                fibo0 = fibo1;
                fibo1 = result;
            }
        }else if (n == 1){
            return fibo1;
        }else{
            return fibo0;
        }
        
        return result;
    }
}