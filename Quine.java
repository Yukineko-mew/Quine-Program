package Quine;
//@author Yukineko

public class Quine {
    public static void main(String [] args) {
        char space = 32;
        char wQuote = 34;
        char comma = 44;
        char semiColon = 59;
        char brace = 125;
        for(String line : src) {
            System.out.println( line );
        }
        for(String line : src) {
            for( int j=0; j<8; j++ ) { System.out.print(space); }
            System.out.println(wQuote + line + wQuote + comma);
        }
        for( int i=0; i<8;i++ ) { System.out.print(space); }
        System.out.print(brace);
        System.out.println(semiColon);
        System.out.println(brace);
    }
    static String src [] = {
        "package Quine;",
        "//@author Yukineko",
        "",
        "public class Quine {",
        "    public static void main(String [] args) {",
        "        char space = 32;",
        "        char wQuote = 34;",
        "        char comma = 44;",
        "        char semiColon = 59;",
        "        char brace = 125;",
        "        for(String line : src) {",
        "            System.out.println( line );",
        "        }",
        "        for(String line : src) {",
        "            for( int j=0; j<8; j++ ) { System.out.print(space); }",
        "            System.out.println(wQuote + line + wQuote + comma);",
        "        }",
        "        for( int i=0; i<8;i++ ) { System.out.print(space); }",
        "        System.out.print(brace);",
        "        System.out.println(semiColon);",
        "        System.out.println(brace);",
        "    }",
        "    static String src [] = {",
        };
}