public class Charfunction {
    public static void main(String[] args) {
     System.out.println(toooUpperCase('m'));
    }
    public static boolean issLetter(char ch) {
        int ascii = (char) ch;
        if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
            return true;
        } else {
            return false;
        }
    }
    public static char toooUpperCase(char ch) {
        if(issLetter(ch)) {
            ch=(char)(ch-32);
            return ch;
        }
        else {
            return ch;
        }
    }

}
