class Solution {
    public int evalRPN(String[] tokens) 
    {   
        int result=0;
        String operators ="+-*/";

        Stack <String> stack=new Stack<String>();
        for(String t :tokens)
        {
            if(!operators.contains(t))
            {
                stack.push(t);
            }
            else
            {
                int a=Integer.valueOf(stack.pop());
                int b=Integer.valueOf(stack.pop());

                switch(t)
                {
                    case "+" :
                        
                        stack.push(String.valueOf(a+b));
                        break;
                    
                    case "-":
                        stack.push(String.valueOf(b-a));
                        break;

                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                    
                    case "/":
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }
        result=Integer.valueOf(stack.pop());
        return result;
    }
}