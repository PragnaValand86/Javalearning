package OppsHomework;

public class Mobile {
    String Samsung;
    String Iphone;
    String Nokia;

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        Mobile obj3 = new Mobile();

        obj1.Samsung = "Samsung Galaxy S9" ;
        obj2.Iphone  = "Iphone 12 pro max";
        obj3.Nokia   = "Nokia x10";

        System.out.println(obj1.Samsung);
        System.out.println(obj2.Iphone );
        System.out.println(obj3.Nokia);
    }
}
