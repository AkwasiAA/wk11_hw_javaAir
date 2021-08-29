package CabinCrew;

public abstract class CabinCrewMember {

    private String name;
    private CabinCrewMemberRank crewMemberRank;

    public CabinCrewMember(String name, CabinCrewMemberRank crewMemberRank){
        this.name = name;
        this.crewMemberRank = crewMemberRank;
    }

    public String getName() {
        return this.name;
    }

    public CabinCrewMemberRank getCrewMemberRank() {
        return this.crewMemberRank;
    }

    public String relayMessages(String messages){
        return messages;
    }

}
