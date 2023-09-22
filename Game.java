import java.util.Scanner;

public class Game {
    private double money = 20.00;
    private int nLemons;
    private int nCups;
    private int nSugar;
    private int nIce;
    private double price;

    private String weatherStatus;
    private double weatherNumber;

    public void dayBegins(int day){
        System.out.println("Welcome. Today is day " + day);


    }

    public void buyPhase(){
        Scanner buyScan = new Scanner(System.in);
        int nLemonsAdd;
        int nCupsAdd;
        int nSugarAdd;
        int nIceAdd;

        System.out.println("How many lemons would you like to buy? $0.03 each");
        do nLemonsAdd = buyScan.nextInt(); while (money - 0.03*nLemonsAdd < 0);
        nLemons += nLemonsAdd;
        money -= 0.03*nLemonsAdd;

        System.out.println("How many cups would you like to buy? $0.05 each");
        do nCupsAdd = buyScan.nextInt(); while (money - 0.05*nCupsAdd < 0);
        nCups += nCupsAdd;
        money -= 0.05*nCupsAdd;

        System.out.println("How many sugar cubes would you like to buy? $0.10 each");
        do nSugarAdd = buyScan.nextInt(); while (money - 0.10*nSugarAdd < 0);
        nSugar += nSugarAdd;
        money -= 0.10*nSugarAdd;

        System.out.println("How many ice cubes would you like to buy? $0.06 each");
        do nIceAdd = buyScan.nextInt(); while (money - 0.06*nIceAdd < 0);
        nIce += nIceAdd;
        money -= 0.06*nIceAdd;
    }

    public void determineWeather() {

    }
}
