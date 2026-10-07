public class ExceptionHandling {
    public static void main(String[] args) {

        int x = 2;
        int y = 0;
        try {       // we are give to statement to try block where at chances to come exception
            System.out.println(x / y);
            System.out.println("hi "); // not print
        } catch (
                NullPointerException e)  // optional block that are use to handle exception  and we are use multiple catch block
        {
            System.out.println("null handle ");
        } catch (ArithmeticException e) {
            System.out.println("handle exception");
        } finally // finally block is optional and always execute
        {
            System.out.println("always print ");
        }


        int a = 9;
        int b = 0;
//        System.out.println(a/b);
//        b1(3,0);
        System.out.println("1 ");
        try {
            a1(a, b);
        } catch (Exception e) {
//            System.out.println("arithmetic exception ");
            System.out.println(e.getMessage());
//            e.printStackTrace() ;
        }
        System.out.println("hii");
    }

    public static void a1(int a, int b) {
        b1(a, b);
    }

    public static void b1(int a, int b) {
        System.out.println(a / b);
//        try{
//        System.out.println(a/b);}
//        catch(ArithmeticException e)
//        {
        System.out.println("handle exception d");


        // NESTED try catch block    == do avoid

        try{
            System.out.println(2/0);
            try{
                System.out.println(9/0);
            }
//            finally{
//                System.out.println("finally");
//            }
            catch(ArithmeticException e)
            {
                System.out.println("inner catch ");
            }
        }
    catch(ArithmeticException e)
    {
        System.out.println("outer catch ");

    try{
        System.out.println(3/0);}
    catch(ArithmeticException e1)
    {
        System.out.println("handle exception ");
    }
    }
    }
}
