import java.util.Arrays;
public class remove1 {
    public static void main(String args[]) {
        String str = "apple ";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1){
                result = result + ch;
        }
    }
    char[]arr=result.toCharArray();
    Arrays.sort(arr);
    result=new String(arr);
                System.out.println(result);
            }
        }


