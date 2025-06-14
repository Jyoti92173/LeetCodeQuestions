package string;

public class FindDifference {
    public char findTheDifference(String s1, String s2){
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0; i< s1.length(); i++){
            sum1 = sum1+s1.charAt(i);
        }
        for (int i =0; i<s2.length();i++){
            sum2 = sum2+s2.charAt(i);
        }
        return (char)(sum2-sum1);
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcde";
        FindDifference difference = new FindDifference();
        System.out.println(difference.findTheDifference(s1,s2));
    }
}
