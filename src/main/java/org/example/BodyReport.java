package org.example;

public class BodyReport implements Cloneable{
    private String detailedInformation;


    public BodyReport(String detailedInformation){
        this.detailedInformation = detailedInformation;
    }

    public String getDetailedInformation() {
        return detailedInformation;
    }

    public void setDetailedInformation(String detailedInformation) {
        this.detailedInformation = detailedInformation;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "BodyReport{" +
                "detailedInformation='" + detailedInformation + '\'' +
                '}';
    }
}
