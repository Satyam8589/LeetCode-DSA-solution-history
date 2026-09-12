class Solution {

    private void backtrack(
        String digits,
        int index,
        String current,
        String[] st,
        List<String> ans
    ) {
        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';

        String letters = st[digit];

        for (int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);

            backtrack(
                digits,
                index + 1,
                current + ch,
                st,
                ans
            );
        }
    }
    public List<String> letterCombinations(String digits) {

        String[] st = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        backtrack(digits, 0, "", st, ans);

        return ans;
    }
}