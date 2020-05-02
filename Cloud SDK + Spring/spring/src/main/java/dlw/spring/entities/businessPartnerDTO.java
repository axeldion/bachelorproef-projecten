package dlw.spring.entities;

public class businessPartnerDTO {

    private String businessPartner;
    private String creationDate;
    private String firstName;
    private String lastName;
    private boolean isFemale;
    private boolean isMale;

    public businessPartnerDTO(String businessPartner, String creationDate, String firstName, String lastName, boolean isFemale, boolean isMale) {
        this.businessPartner = businessPartner;
        this.creationDate = creationDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isFemale = isFemale;
        this.isMale = isMale;
    }

    public String getBusinessPartner() {
        return businessPartner;
    }

    public void setBusinessPartner(String businessPartner) {
        this.businessPartner = businessPartner;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
