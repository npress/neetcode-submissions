class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String s : tokens){
            char c = s.charAt(0);
            int length = s.length();
            if(length == 1 && (c == '+' || c == '-' || c == '*' || c == '/')){
                int second = stack.pop();
                int first = stack.pop();
                switch(c){
                    case '+' -> stack.push(first + second);
                    case '-' -> stack.push(first - second);
                    case '*' -> stack.push(first * second);
                    case '/' -> stack.push(first / second);
                }
            }
            else{
                int i;
                if(c == '-'){
                    i = 1;
                }
                else{
                    i = 0;
                }
                int val = 0;
                while(i < length){
                    val = 10 * val + (s.charAt(i) - '0');
                    i++;
                }
                if(c == '-'){
                    val = -val;
                }
                stack.push(val);
            }
            

        }
        return stack.pop();
    }
}
