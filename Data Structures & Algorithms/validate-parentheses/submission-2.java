class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        char[] stack = new char[chars.length];
        int i = 0;
        for(char b : chars){
            if(b == '(' || b == '{' || b == '['){
                stack[i++] = b;
            }
            else if(b == ')'){
                if(i == 0 || stack[--i] != '('){
                    return false;
                }
            }
            else if(b == ']'){
                if(i == 0 || stack[--i] != '['){
                    return false;
                }
            }
            else if(i == 0 || stack[--i] != '{'){
                    return false;
            }

        }

        return i == 0;
    }
}
