public class Main {

    public boolean checkIfTwoStringsAreNecklace(String first, String second){

        if(first.equals(second)){
            return true;
        }
        String currentString;
        for (int i = 0; i < second.length(); i++) {
            currentString="";
            for (int x = 0; x < second.length(); x++) {
                currentString=currentString + second.charAt((x+i)%second.length());
            }
            if(currentString.equals(first)){
                return true;
            }
        }
        return false;
    }

    public Integer countingIfTwoStringsAreNecklace(String str){

        int amountOfRepeats=1;
        String currentString;

        for (int i = 1; i < str.length(); i++) {
            currentString="";
            for (int x = 0; x < str.length(); x++) {
                currentString=currentString + str.charAt((x+i)%str.length());
            }
            if(currentString.equals(str)){
                amountOfRepeats++;
            }
        }
        return amountOfRepeats;
    }



}