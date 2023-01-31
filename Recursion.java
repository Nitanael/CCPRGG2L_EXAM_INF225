public class Recursion {

    public static void main(String[] args) {
        

        String fullName = "abi nathanael amador";

        removeLetter(fullName);
    }

    static void removeLetter(String str) {
        if (str.length() == 0) {
            return;
        }
        char c = str.charAt(0);
        if (c != 'b' && c != 'c' && c != 'd' && c != 'f' && c != 'g' && c != 'h' && c != 'j' && c != 'k' && c != 'l' && c != 'm' && c != 'n' && c != 'p' && c != 'q' && c != 'r' && c != 's' && c != 't' && c != 'v' && c != 'w' && c != 'x' && c != 'y' && c != 'z') {
            System.out.print(c);
        }
        removeLetter(str.substring(1));
    }
}