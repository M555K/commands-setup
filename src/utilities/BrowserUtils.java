package utilities;

public class BrowserUtils {
    public static String reverse(String str){
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
    public static String fixFormat(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }


    public static String camelCase(String str){

        String[] allWords = str.split(" ");

        String camelCase = allWords[0].toLowerCase();

        for(int i = 1; i < allWords.length; i++){ // I'm starting from index 1 because I already used the first word
            camelCase += fixFormat(allWords[i]);
        }

        return camelCase;

    }

}
