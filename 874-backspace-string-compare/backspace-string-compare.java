class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss = new Stack<>();
        Stack<Character> tt = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '#'){
                if(!ss.isEmpty()){
                    ss.pop();
                }
            }
            else{
                ss.push(ch);
            }
        }
        for(char ch: t.toCharArray()){
            if(ch == '#'){
                if(!tt.isEmpty()){
                    tt.pop();
                }
            }
            else{
                tt.push(ch);
            }
        }
        return ss.equals(tt);
    }
}