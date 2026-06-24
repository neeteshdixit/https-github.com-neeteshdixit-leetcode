class Solution {
    public boolean isHappy(int n) {
        HashSet hs = new HashSet<>();
        while(n!=1){
            if(hs.contains(n)){
                return false;
            }

            hs.add(n);

            n = getNext(n);
        }

        return true;
    }

    public int getNext(int n){
         int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum += digit * digit;

            n /= 10;
        }

        return sum;
    }
}