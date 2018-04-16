public class UpperCase_and_LowerCase {
    public static void main (String args[]){
            String value = "UpPeR";
        StringBuilder sb = new StringBuilder(value);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            } else {
                sb.setCharAt(i, Character.toLowerCase(c));
            }
        }
        String s = sb.toString();
        System.out.println(s);

    }
}
