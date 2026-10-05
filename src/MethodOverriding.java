public class MethodOverriding {
    public static void main(String[] args) {
        Base b = new Base();
        b.a1(3);
        Child c = new Child();
        c.a1(2);
        H a = new H();
//        a.h();
        a.o();
    }
}
class Base
{
    public void a1(int a)
    {
        System.out.println("method a ");
    }
}
class Child extends Base
{
    public void a1(int n)
    {
        System.out.println("method of child ");
    }
}
class G
{
   static void h()
    {
        System.out.println("h");
    }
    void o()
    {
        System.out.println("oo");
    }
}
class H extends G
{
    static void h()    // STATIC ,FINAL AND CONSTRUCTOR DOES NOT OVERRIDEN
    {
        System.out.println("ha");
    }
    void o()  // Overriding
    {
        super.o();
        System.out.println("new o");
    }
}