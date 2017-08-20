package com.social.chaudhary.parcelabelexample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by CHAUDHARY on 20-Aug-17.
 */

public class Person implements Parcelable
{
    String firstName;

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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public static Creator<Parcelable> getCREATOR() {
        return CREATOR;
    }

    String lastName;
    String qualification;

    public Person()
    {
    }

    public Person(Parcel parcel)
    {
        this.firstName=parcel.readString();
        this.lastName=parcel.readString();
        this.qualification=parcel.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.qualification);
    }

    public static final Creator<Parcelable> CREATOR =new Creator<Parcelable>() {
        @Override
        public Parcelable createFromParcel(Parcel source) {
            return new Person(source);
        }

        @Override
        public Parcelable[] newArray(int i) {
            return new Parcelable[i];
        }
    };
}
