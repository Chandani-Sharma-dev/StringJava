public class removeduplicate {
    public static void main(String[] args){
        String s="chandani";
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            freq[index]++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>1){
                System.out.println((char)('a'+i));
            }
        }
    }
}
