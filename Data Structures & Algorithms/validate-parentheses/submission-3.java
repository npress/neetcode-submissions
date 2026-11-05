class Solution {
    public boolean isValid(String s) {
        byte[] bytes = s.getBytes();
        byte[] stack = new byte[bytes.length];
        int i = 0;
        for(byte b : bytes){
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
