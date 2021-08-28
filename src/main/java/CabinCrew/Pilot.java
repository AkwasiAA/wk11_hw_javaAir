package CabinCrew;

public class Pilot extends CabinCrewMember {

    private String licenceNumber;

    public Pilot(String name, String licenceNumber){
        super(name, CabinCrewMemberRank.CAPTAIN);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
}
