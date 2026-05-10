class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        int lastSpace = trimmed.lastIndexOf(' ');
        return trimmed.length() - lastSpace - 1;
    }
}
