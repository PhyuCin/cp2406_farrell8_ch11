import java.util.ArrayList;
import java.util.Scanner;

public class TwoEventParticipants {

    static Participant[] miniMarathon= new Participant[3];
    static Participant[] diving= new Participant[3];
    static ArrayList<Participant> sameParticipants = new ArrayList<>();

    public static void main(String[] args){
        System.out.println("\nPlease enter information of participants in the mini marathon");
        buildArray(miniMarathon);

        System.out.println("\nPlease enter information of participants in the diving competition");
        buildArray(diving);

        System.out.println("\nParticipants in the mini marathon");
        displayArray(miniMarathon);

        System.out.println("\nParticipants in the diving competition");
        displayArray(diving);

        for(int i = 0; i < miniMarathon.length; ++i){
            for(int p = 0; p < diving.length; ++p){
                if (miniMarathon[i].equals(diving[p])){
                    sameParticipants.add(miniMarathon[i]);
                }
            }
        }

        displayArrayList(sameParticipants);

    }

    public static void buildArray(Participant[] participantArray)
    {
        Scanner input = new Scanner(System.in);

        String name;
        int age;
        String streetAddress;

        for(int x = 0; x < participantArray.length; ++x) {
            System.out.println("\nEnter name: ");
            name = input.nextLine();

            System.out.println("Enter age: ");
            age = Integer.parseInt(input.nextLine());

            System.out.println("Enter street address: ");
            streetAddress = input.nextLine();

            participantArray[x] = new Participant(name, age, streetAddress);

        }



    }

    public static void displayArray(Participant[] participantArray)
    {
        //increment x in for loop
        for(int x = 0; x < participantArray.length; ++x)
            System.out.println("\nParticipant #" + (x  + 1) +
                    participantArray[x].toString());
    }

    public static void displayArrayList(ArrayList<Participant> participantArrayList)
    {
        //increment x in for loop
        for(int x = 0; x < participantArrayList.size(); ++x)
            System.out.println("\nSame participants #" + (x  + 1) +
                    participantArrayList.get(x).toString());
    }
}
