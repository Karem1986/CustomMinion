import java.util.Scanner;
import java.io.Serializable;

public class KaremMinion implements Serializable {
    String n;
    String h;
    private String color;
    private static long serialVersionUID = 1L;
    KaremMinion(String name, String hobby, String color) { //Constructor we create a minion with defined characteristics
        n= name;
        h = hobby;
        this.color = color;
    }
    //Return a friendly text message instead of an address in memory with toString method:
    public String toString() { //method to avoid printing the reference to the object in memory
        return  "My alias is: " +  n + " my hobby is " + h + " color " + color;
    }
    
    public static void main(String... args) {
        //Create an example minion:
        //KaremMinion minionExample = new KaremMinion(" Minion alias is Yoyo", " to eat tart!", "blue");
        //Give a name to your minion
        Scanner name = new Scanner(System.in);
        System.out.println("Give a name to the minion: ");
        String giveName = name.next();
        System.out.println("Minion name is: " + giveName);
        System.out.println("Give a hobby to your minion: ");
        Scanner hh = new Scanner(System.in);
        String givehobby = hh.next();
        System.out.println("Give a color to the minion: ");
        Scanner col = new Scanner(System.in);
        String giveColor = col.next();
     
        System.out.println("Your minion name is " + giveName + " , " + " his hobby is " + givehobby + " your minion's color : " + giveColor);
        //Give an age to your minion:
        Scanner age = new Scanner(System.in);
        System.out.println("How old is your minion? ");
        int ag = age.nextInt();
        System.out.println("Minion age is: " + ag);
        //if minion age is <= 10, he can have up to 15 snacks per day
        if(ag <= 10) {
            int maxSnacks = 15;
            int snacksGiven = maxSnacks; //we start with a limit of 15 snacks 
            System.out.println("How many snacks do you give to your minion? ");
            int sum = 0;
            while(snacksGiven <= maxSnacks) {
                Scanner giveSnacks = new Scanner(System.in);
                sum =  sum + giveSnacks.nextInt(); //updates the total nmr of snacks given
                snacksGiven = snacksGiven - 1; //updates the amount allowed to be given
                if(sum < maxSnacks) {
                    System.out.println("nmr snacks given: " + sum);
                    System.out.println("You can give more snacks " );
                } else if(sum == maxSnacks) {
                    System.out.println(maxSnacks + " is enough!");
                }
                else {
                    System.out.println("Not more than " + maxSnacks + " snacks a day is allowed!");
                }
            }
        } else if (ag <= 33){
            System.out.println("Less than 33");
        }
        else {
            System.out.println("Minion is more than 10 years old!");
        }
    }
}
