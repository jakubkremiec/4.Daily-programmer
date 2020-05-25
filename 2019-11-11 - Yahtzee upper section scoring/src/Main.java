import java.util.*;

public class Main {

    public int rollDice(){      //roll dice, returns value 1-6
        Random random = new Random();
        return random.nextInt(5)+1;
    }

    public int calculatePointForEverySideOfRoll(int first, int second, int third, int fourth, int fifth){      //method takes 5 variables

        int[] tab = {first,second,third,fourth,fifth};      //tab is array of provided variables
        int[] arrayOfPoints = {0,0,0,0,0,0};                //declaring empty array

        for (int i = 0; i < 5; i++) {
            arrayOfPoints[tab[i]-1]=arrayOfPoints[tab[i]-1]+tab[i]; //adding number to its array id
        }

        return Arrays.stream(arrayOfPoints).max().getAsInt(); //returning max of points array
    }





}
