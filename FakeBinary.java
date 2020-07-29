public class FakeBinary {

    public static void main (String[] args){
        String digits = "35775545554121210";
        System.out.println(replace(digits));
    }

    public static String replace(String digits){
        String binary = "";
        for(int i = 0; i<digits.length(); i++){
            String d = digits.substring(i,i+1);
            int digit = Integer.valueOf(d);
            if(digit < 5 )
                binary += "0";
            else
                binary += "1";
        }
        return binary;
    }
}
