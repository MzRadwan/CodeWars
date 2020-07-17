public class MissingLetter {

    public static void main(String[] args){

        char [] array = {'C','D','F','H','I'};

        System.out.println(findMissingLetter(array));
        
    }
    
    public static char findMissingLetter(char[] array){
        char missingLetter = 0;
        int missing;
        for (int i = 0; i< array.length-1;i ++){
            int firstLetter = array[i];
            int secondLetter = array[i+1];
            int diff = secondLetter - firstLetter;
            if(diff == 2){
                 missing = secondLetter -1;
                missingLetter = (char)missing;
            }
        }

        return missingLetter;
    }
}
