class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        //store results of multiplication 
        int[] result = new int[n1 + n2];
        //perform multiplication
        for (int i = n1 - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                int mul = d1 * d2;
                int pos1 = i + j;
                int pos2 = i + j + 1;
                //handling carry-over
                int sum = mul + result[pos2];
                result[pos2] = sum % 10;
                //add carry forward to next position
                result[pos1] += sum / 10; 
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int digit : result) {
            if (!(ans.length() == 0 && digit == 0)) {
                ans.append(digit);
            }
        }
        //edge case where result is 0
        if (ans.length() == 0) {
            return "0";
        }

        return ans.toString();
    }
}
