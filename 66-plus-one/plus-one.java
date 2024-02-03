class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        List<Integer> result = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        // If there is still a carry after processing all digits
        while (carry > 0) {
            result.add(carry % 10);
            carry /= 10;
        }

        // Reverse the list to get the correct order
        Collections.reverse(result);

        // Convert the list to an array
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        return arr;
    }
}