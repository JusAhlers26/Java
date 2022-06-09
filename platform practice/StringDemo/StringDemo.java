public class StringDemo {
    public static void main(String[] args) {
        String ninja = "Coding Dojo is Better Advertised than Real!";
        int length = ninja.length();
        System.out.println( "String length is : " + length );
        String string1 = "My name is ";
        String string2 = "Justin";
        String string3 = string1.concat(string2);
        System.out.println(string3);
        String ninja2 = String.format("Hello %s, you owe me $%.2f or %s" , "Vy", 25.0, "cuddles!");
        System.out.println(ninja2);
        String ninja3 = "Welcome to Coding Dojo!";
        int a = ninja3.indexOf("Coding");
        int b = ninja3.indexOf("co");
        int c = ninja3.indexOf("pizza");
        System.out.println(ninja3);
        String sentence = "    Spaces everywhere!   ";
        System.out.println(sentence.trim());
        String a1 = "HELLO";
        String b1 = "world";
        System.out.println(a1.toLowerCase());
        System.out.println(b1.toUpperCase());
        String a2 = "same string";
        String b2 = "same string";
        System.out.println(a2 == b2);
        a2 = new String("same letters");
        b2 = new String("same letters");
        System.out.println(a2 == b2);
        System.out.println(a2.equals(b2));
    }
}
