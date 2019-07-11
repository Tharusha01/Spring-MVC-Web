package com.mkyong.web.repository;

public class Tutorial {
    private String tutID;
    private String tutName;
    private String tutorName;
    private String tutDes;
    private String tutURL;

    public Tutorial(){

    }

    public Tutorial(String tutID, String tutName, String tutorName, String tutDes, String tutURL) {
        this.tutID = tutID;
        this.tutName = tutName;
        this.tutorName = tutorName;
        this.tutDes = tutDes;
        this.tutURL = tutURL;
    }

    public String getTutID() {
        return tutID;
    }

    public void setTutID(String tutID) {
        this.tutID = tutID;
    }

    public String getTutName() {
        return tutName;
    }

    public void setTutName(String tutName) {
        this.tutName = tutName;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }

    public String getTutDes() {
        return tutDes;
    }

    public void setTutDes(String tutDes) {
        this.tutDes = tutDes;
    }

    public String getTutURL() {
        return tutURL;
    }

    public void setTutURL(String tutURL) {
        this.tutURL = tutURL;
    }
}
