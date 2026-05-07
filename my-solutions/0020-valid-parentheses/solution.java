class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Nếu là dấu mở → push vào stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // Nếu stack rỗng mà gặp dấu đóng → false
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Kiểm tra có khớp cặp không
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }

        // Stack rỗng → tất cả đã khớp
        return stack.isEmpty();
    }
}
