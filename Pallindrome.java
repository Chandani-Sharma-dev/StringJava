public class Pallindrome {
    public static void main(String[] args) {
        String s = "i am chandani sharma";
        int left = 0;
        int right = s.length() - 1;
        boolean pallindrome = true;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                pallindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(pallindrome);
    }
}



