class Solution {
    public boolean isAnagram(String s, String t) {
            char[] sh = s.toCharArray();
            char[] th = t.toCharArray();
            Arrays.sort(sh);
            Arrays.sort(th);

            if(Arrays.equals(sh,th)){
                return true;
            }
        return false;
    }
}
