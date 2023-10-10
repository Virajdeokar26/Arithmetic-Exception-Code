class ArithmeticException_Demo
{
    public static void main(String args[])
    {
        try
        {
            int n1=20, n2=0;
            int answer = n1/n2;
            System.out.println("Result= "+answer);
        }
        catch(ArithmeticException e) {
            System.out.println("Can't divide a number by o");
        }
        
    }

}
