import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighAndLow {

    public static void main(String []args){
    //example String for testing
        String givenString = "121 -5 56 -1 -5";

        System.out.println(highAndLow(givenString));
    }


    public static String highAndLow(String givenString){

        List<Integer> spacesLocation = new ArrayList<>();
        for (int i = 0 ; i < givenString.length(); i++){
            String var = givenString.substring(i, i+1);
            if (var.equals(" ")){
                spacesLocation.add(i);
            }
        }
        spacesLocation.add(givenString.length());

        List<Integer> list = new ArrayList<>();
        int beginIndex = 0;
        int endIndex = 0;
        for (int i = 0; i<spacesLocation.size(); i++){
            endIndex = spacesLocation.get(i);
            String var = givenString.substring(beginIndex, endIndex);
            list.add(Integer.valueOf(var));
            beginIndex = spacesLocation.get(i)+1;
        }

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        String solution = Integer.toString(max) + " " + Integer.toString(min);
        return solution;

    }

//first attempt works only on single digit numbers
    public static String highAndLow1(String givenString){
        List<Integer> list = new ArrayList<>();

        for (int i = 0 ; i < givenString.length(); i++ ){
         String var = givenString.substring(i, i+1);
         if (var.equals(" ")){
             //do nothing and go to next iteration
         }
         else if(var.equals("-")){
             i++;
             var += givenString.substring(i,i+1);
             list.add(Integer.valueOf(var));
         }
         else{
                 list.add(Integer.valueOf(var));
            }
        }

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        String solution = Integer.toString(max) + " " + Integer.toString(min);
        return solution;
    }
}
