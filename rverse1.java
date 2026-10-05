public class rverse1 {
    public static void main(String[] args) {
        String s = "peep";

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        if (s.equals(sb.toString())) {
            System.out.println("pallindrome");

        } else {
            System.out.println("Not pallindrome");
        }

    }
}