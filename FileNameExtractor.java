public class Extractor {

public static void main(String [] args){

    System.out.println(extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION"));
}
public static String extractFileName(String dirtyFileName){
    int i = 0;
    String var = "";
    while (!var.equals("_")){
        var = dirtyFileName.substring(i,i+1);
        i++;
    }
    String extract1 = dirtyFileName.substring(i);
    i = extract1.length();
    var = "";
    while (!var.equals(".")){
        var = extract1.substring(i-1,i);
        i--;
    }
    String finalExtract = extract1.substring(0,i);
    return finalExtract;
}
}
