package model;

public class Client {

    private int id;

    private Long identityCardNumber;
    private Long personalNumericalCode;
    private String address;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(Long identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public Long getPersonalNumericalCode() {
        return personalNumericalCode;
    }

    public void setPersonalNumericalCode(Long personalNumericalCode) {
        this.personalNumericalCode = personalNumericalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
