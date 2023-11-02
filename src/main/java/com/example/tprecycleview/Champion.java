package com.example.tprecycleview;

public class Champion {
    private String firstname;
    private String lastname;
    int image;

    public Champion(String firstname, String lastname, int image) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.image = image;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Champion{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", image=" + image +
                '}';
    }
}
