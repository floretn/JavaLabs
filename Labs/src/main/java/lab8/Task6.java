package lab8;

public class Task6 {

    private static final String[] words = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
            "class", "const", "continue", "default", "do", "else", "enum", "extends", "final", "finally", "float", "for", 
            "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", 
            "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", 
            "this", "throw", "transient", "try", "void", "volatile", "while", "false", "true", "null"};
    private static final String[] figures = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static boolean consistsOnlyOfLetters(String s) {
        if (s.equals("")) return false;
        return s.codePoints().allMatch(Character::isAlphabetic);
    }

    public static boolean isIdentifier(String s) {

        for (String string : words) {
            if (s.equals(string)) return false;
        }

        if (!(s.startsWith("$") || s.startsWith("_") || consistsOnlyOfLetters(s.substring(0, 1))))
            return false;


        int[] codePoints = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 36, 95};
        return s.codePoints().allMatch(i -> {
            for (int j : codePoints) {
                if (i == j) return true;
            }
            return Character.isAlphabetic(i);
        });
    }

    public static void main(String[] args) {
        System.out.println(consistsOnlyOfLetters("grke"));
        System.out.println(consistsOnlyOfLetters("gkre.few"));
        System.out.println(consistsOnlyOfLetters("mfkerl fmrekl"));
        System.out.println(consistsOnlyOfLetters("gnre432rkel"));
        System.out.println(consistsOnlyOfLetters("gnre$rkel"));
        System.out.println(consistsOnlyOfLetters("gnre_rkel"));
        System.out.println("***************************************************");
        System.out.println(isIdentifier("1gner"));
        System.out.println(isIdentifier("$gkrel"));
        System.out.println(isIdentifier("rgrme_32"));
        System.out.println(isIdentifier("fre%gre"));
    }
}
