public class Participant {
    private String name;
    private int age;
    private String streetAddress;

    public Participant(String name, int age, String streetAddress){
        this.name = name;
        this.age = age;
        this.streetAddress = streetAddress;
    }

    public boolean equals(Participant otherParticipant)
    {
        if((name.toLowerCase().equals(otherParticipant.name)) && (age == otherParticipant.age) && (streetAddress.toLowerCase().equals(otherParticipant.streetAddress)))
            return true;
        else
            return false;

    }


    public String toString()
    {
        return("\nName: " + name +
                "\nAge: " + age +
                "\nStreet Address: " + streetAddress);
    }
}
