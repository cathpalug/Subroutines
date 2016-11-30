/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subroutine.library;

/**
 *
 * @author CAL16830135
 */
public class SubroutineLibrary {
    
    public static String reverseString(String reverseStringInput) {
        char[] charArray;
        charArray = new char[reverseStringInput.length()];
        for (int index = 0; index < reverseStringInput.length(); index ++) {
            charArray[index] = reverseStringInput.charAt(index);
            System.out.println(charArray[index]);
        }
        return "";
    }
    
    public static String pigLatin(String pigLatin) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int pigLatinLength = pigLatin.length();
        char firstLetter = pigLatin.charAt(0);
        String newPigLatin = "";
        boolean contains = false;
        //System.out.println(pigLatin.charAt(0));
        for (char pigLatin1 : vowels) {
            if (pigLatin1 == pigLatin.charAt(0)) {
                contains = true;
                break;
            }
        }
        //System.out.println(contains);
            if (contains == true) {
                System.out.println(pigLatin);
            }
            else {
                newPigLatin = String.valueOf(pigLatin.substring(1));
            }
        //System.out.println(newPigLatin.length());
        if (pigLatinLength == newPigLatin.length()) {
        return "";
        }
        else if (pigLatinLength != newPigLatin.length()) {
            System.out.println(newPigLatin + firstLetter + "ay");
        }
        return "";
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String reverseStringInput = "Hello";
        reverseString(reverseStringInput);
        String pigLatin = "abus";
        pigLatin(pigLatin);
    }
    
}
