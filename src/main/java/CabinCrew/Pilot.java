package CabinCrew;

public class Pilot extends CabinCrewMember {

    private String licenceNumber;

    public Pilot(String name, String licenceNumber){
        super(name, CabinCrewMemberRank.CAPTAIN);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return this.licenceNumber;
    }

    public String flyThePlane(){
        return "Cabin Crew prepare for take-off";
    }
}
