package Mentor;

public class CharacterMirrorCheck {

    public static boolean isMirror(char c) {
        // Define characters that are mirrors of themselves
        char[] mirrorChars = {'A', 'H', 'I', 'M', 'O', 'T', 'U', 'V', 'W', 'X', 'Y'};
        for (char mirrorChar : mirrorChars) {
            if (c == mirrorChar) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] testChars = {'A', 'B', 'C', 'D', 'H', 'I', 'O'};
        for (char c : testChars) {
            System.out.println("Is " + c + " a mirror character? " + isMirror(c));
        }
    }
}
