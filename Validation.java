import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static void main(String[] args){

        String test = "321212";
        System.out.println(validatePin(test));
    }

    public static boolean validatePin(String pin){
        boolean isVal = false;
        if(pin.length() == 4 || pin.length() == 6){
            Pattern reg = Pattern.compile("[0-9]{4,6}");
            Matcher matcher = reg.matcher(pin);
            if(matcher.matches())
                isVal = true;
        }

        return isVal;
    }
}
