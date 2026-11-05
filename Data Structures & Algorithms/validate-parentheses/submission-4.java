class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] stack = new char[n];
        int i = 0;
        for(int j = 0; j < n; j++){
            char b = s.charAt(j);
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
