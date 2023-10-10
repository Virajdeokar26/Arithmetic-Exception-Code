class ArithmeticException_Demo
{
    public static void main(String args[])
    {
        try
        {
            int num1=20, num2=0;
            int answer = num1/num2;
            System.out.println("Result= "+answer);
        }
        catch(ArithmeticException e) {
            System.out.println("Can't divide a number by o");
        }
        
    }

}