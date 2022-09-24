public class Address {
    private String doorNumber;
    private String area;
    private String landmark;
    private Integer pincode;
    private String state;
    private String district;
    public Address(String doorNumber,String area,String landmark,String district,String state,Integer pincode)
    {
        this.doorNumber=doorNumber;
        this.area=area;
        this.landmark=landmark;
        this.district=district;
        this.state=state;
        this.pincode=pincode;
    }
    @Override
    public String toString()
    {
        return "Building details: "+this.doorNumber+"\nArea: "+this.area+"\nLandmark: "+this.landmark+"\ndistrict: "+this.district+"\nstate: "+this.state+"\nPincode: "+this.pincode;
    }
    public String getDistrict(){return this.district;}
    public String getState(){return this.state;}
    public Integer getPincode(){return this.pincode;}
    public String getArea(){return this.area;}
    public String getDoorNumber(){return this.doorNumber;}
    public String getLandmark(){return this.landmark;}
    public void setDoorNumber(String doorNumber){this.doorNumber=doorNumber;}
    public void setArea(String area){this.area=area;}
    public void setLandmark(String landmark){this.landmark=landmark;}
    public void setPincode(Integer pincode){this.pincode=pincode;}
    public void setState(String state){this.state=state;}
    public void setDistrict(String district){this.district=district;}
}
