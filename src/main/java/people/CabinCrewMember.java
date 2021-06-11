package people;

public class CabinCrewMember extends Person{

    private String rank;

    public CabinCrewMember(String name, String rank) {
        super(name);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
