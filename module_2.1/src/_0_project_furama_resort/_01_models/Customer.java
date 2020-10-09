package _0_project_furama_resort._01_models;

public class Customer {

    private String nameCustomer;
    private String birthdayCustomer;
    private String gender;
    private String idcardCustomer;
    private String numberPhone;
    private String emailCustomer;
    private String typeCustomer;
    private String addressCustomer;
    private Services services;

    public Customer() {
    }

    public Customer(String nameCustomer, String birthdayCustomer, String gender, String idcardCustomer, String numberPhone,
                    String emailCustomer, String typeCustomer, String addressCustomer, Services services) {
        this.nameCustomer = nameCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.gender = gender;
        this.idcardCustomer = idcardCustomer;
        this.numberPhone = numberPhone;
        this.emailCustomer = emailCustomer;
        this.typeCustomer = typeCustomer;
        this.addressCustomer = addressCustomer;
        this.services = services;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(String birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdcardCustomer() {
        return idcardCustomer;
    }

    public void setIdcardCustomer(String idcardCustomer) {
        this.idcardCustomer = idcardCustomer;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String showInfo(){
        return "nameCustomer='" + nameCustomer + '\'' +
                ", birthdayCustomer='" + birthdayCustomer + '\'' +
                ", gender='" + gender + '\'' +
                ", idcardCustomer='" + idcardCustomer + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                ", services=" + services ;
    }
}
