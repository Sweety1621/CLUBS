package com.example.my_dash.models;

import android.os.Parcel;
import android.os.Parcelable;

public class CClubs implements Parcelable {

    private String name,overview,photo,description;

    public CClubs() {
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected CClubs(Parcel in) {
        name = in.readString();
        overview = in.readString();
        photo = in.readString();
        description = in.readString();
    }

    public static final Creator<CClubs> CREATOR = new Creator<CClubs>() {
        @Override
        public CClubs createFromParcel(Parcel in) {
            return new CClubs(in);
        }

        @Override
        public CClubs[] newArray(int size) {
            return new CClubs[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(overview);
        dest.writeString(photo);
        dest.writeString(description);
    }
}
