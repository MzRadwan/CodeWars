import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public static void main(String []args){
       List<Integer> cleanList = new ArrayList<>();
        Integer[] tab = {2,5,2,1,3,3,1,4,5};
        for (Integer el : tab){
            boolean isDuplicate = false;
            for (Integer var : cleanList){
                if(var == el)
                    isDuplicate = true;
            }
            if(!isDuplicate)
                cleanList.add(el);
        }

        for (Integer var : cleanList) {
            System.out.println(var);
        }
    }
}
