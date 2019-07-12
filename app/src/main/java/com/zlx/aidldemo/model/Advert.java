package com.zlx.aidldemo.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @date: 2019\7\12 0012
 * @author: zlx
 * @email: 1170762202@qq.com
 * @description:
 */
public class Advert implements Parcelable {
    //职位
    private String position;
    //薪资
    private int salary;
    //具体内容
    private String content;

    public Advert(String position, int salary, String content) {
        this.position = position;
        this.salary = salary;
        this.content = content;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.position);
        dest.writeInt(this.salary);
        dest.writeString(this.content);
    }

    protected Advert(Parcel in) {
        this.position = in.readString();
        this.salary = in.readInt();
        this.content = in.readString();
    }

    public static final Parcelable.Creator<Advert> CREATOR = new Parcelable.Creator<Advert>() {
        @Override
        public Advert createFromParcel(Parcel source) {
            return new Advert(source);
        }

        @Override
        public Advert[] newArray(int size) {
            return new Advert[size];
        }
    };
}