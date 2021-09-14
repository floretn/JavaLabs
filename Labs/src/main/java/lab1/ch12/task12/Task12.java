package lab1.ch12.task12;

import java.util.Scanner;

public class Task12 {

    private static String[] producePermutations(String input) {
        if (input.length() == countChars(input, 0, 1))
            return new String[]{input};

        if (input.length() == countChars(input, 0, 2)) {
            int c0 = Character.codePointAt(input, 0);
            int c1 = Character.codePointAt(input, Character.charCount(c0));
            if (getClass(c1) == getClass(c0)) {
                return new String[]{input};
            }
            String[] result = new String[2];
            result[0] = input;
            StringBuilder sb = new StringBuilder(2);
            sb.appendCodePoint(c1);
            sb.appendCodePoint(c0);
            result[1] = sb.toString();
            return result;
        }

        int length = 1;
        int nCodePoints = countCodePoints(input);
        for (int x = 1; x < nCodePoints; x++)
            length = length * (x + 1);

        String[] temp = new String[length];

        int combClass[] = new int[nCodePoints];
        for (int x = 0, i = 0; x < nCodePoints; x++) {
            int c = Character.codePointAt(input, i);
            combClass[x] = getClass(c);
            i += Character.charCount(c);
        }

        // For each char, take it out and add the permutations
        // of the remaining chars
        int index = 0;
        int len;
        // offset maintains the index in code units.
        //ВНИМАНИЕ СЮДА!!!!!
        //ВНИМАНИЕ СЮДА!!!!!
        //ВНИМАНИЕ СЮДА!!!!!
        //ВНИМАНИЕ СЮДА!!!!!
        //ВНИМАНИЕ СЮДА!!!!!
        //ВНИМАНИЕ СЮДА!!!!!
        //ВНИМАНИЕ СЮДА!!!!!
        //ВНИМАНИЕ СЮДА!!!!!
        //ВНИМАНИЕ СЮДА!!!!!
        //Так было до изменения:
        /*
        loop: for (int x = 0, offset = 0; x < nCodePoints; x++, offset += len) {
                    len = countChars(input, offset, 1);
                    boolean skip = false;
                    for (int y = x - 1; y >= 0; y--) {
                        if (combClass[y] == combClass[x]) {
                            continue loop;
                        }
                    }
                    StringBuilder sb = new StringBuilder(input);
                    String otherChars = sb.delete(offset, offset + len).toString();
                    String[] subResult = producePermutations(otherChars);

                    String prefix = input.substring(offset, offset + len);
                    for (int y = 0; y < subResult.length; y++) {
                        temp[index++] = prefix + subResult[y];
                    }
        }
        */

        //Так сделал я:
        for (int x = 0, offset = 0; x < nCodePoints; x++, offset += len) {
            len = countChars(input, offset, 1);
            boolean skip = false;
            int l = 0;
            for (int y = x - 1; y >= 0; y--) {
                if (combClass[y] == combClass[x]) {
                    l++;
                }
            }
            if(l == 0) {
                StringBuilder sb = new StringBuilder(input);
                String otherChars = sb.delete(offset, offset + len).toString();
                String[] subResult = producePermutations(otherChars);

                String prefix = input.substring(offset, offset + len);
                for (int y = 0; y < subResult.length; y++) {
                    temp[index++] = prefix + subResult[y];
                }
            }
        }

        String[] result = new String[index];
        for (int x = 0; x < index; x++)
            result[x] = temp[x];
        return result;
    }

    private static final int countChars(CharSequence seq, int index,
                                        int lengthInCodePoints) {
        // optimization
        if (lengthInCodePoints == 1 && !Character.isHighSurrogate(seq.charAt(index))) {
            assert (index >= 0 && index < seq.length());
            return 1;
        }
        int length = seq.length();
        int x = index;
        if (lengthInCodePoints >= 0) {
            assert (index >= 0 && index < length);
        }
            for (int i = 0; x < length && i < lengthInCodePoints; i++) {
                if (Character.isHighSurrogate(seq.charAt(x++))) {
                    if (x < length && Character.isLowSurrogate(seq.charAt(x))) {
                        x++;
                    }
                }
            }
            return x - index;
        }

    private static final int countCodePoints(CharSequence seq) {
        int length = seq.length();
        int n = 0;
        for (int i = 0; i < length; ) {
            n++;
            if (Character.isHighSurrogate(seq.charAt(i++))) {
                if (i < length && Character.isLowSurrogate(seq.charAt(i))) {
                    i++;
                }
            }
        }
        return n;
    }

    private static int getClass(int c) {
        return sun.text.Normalizer.getCombiningClass(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.print("Введите строку: ");
        str = sc.nextLine();
        String[] str2 = producePermutations(str);
    }
}

