package CabinCrew;

public class FirstOfficer extends CabinCrewMember{

    private String licenceNumber;

    public FirstOfficer(String name, String licenceNumber){
        super(name, CabinCrewMemberRank.FIRSTOFFICER);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
}
