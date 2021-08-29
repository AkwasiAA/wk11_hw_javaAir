package CabinCrew;

public class FirstOfficer extends CabinCrewMember{

    private String licenceNumber;

    public FirstOfficer(String name, String licenceNumber){
        super(name, CabinCrewMemberRank.FIRSTOFFICER);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return this.licenceNumber;
    }

    public String performPreflightChecks(){
        return "Pre flight checks complete, ready to taxi";
    }
}
