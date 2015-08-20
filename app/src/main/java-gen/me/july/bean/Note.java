package me.july.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Entity mapped to table "NOTE".
 */
public class Note implements Parcelable {

    private Long id;
    /** Not-null value. */
    private String title;
    private String content;
    private String date;

    public Note() {
    }
    public Note(Parcel source){
         id=source.readLong();
        title=source.readString();
        content=source.readString();
        date=source.readString();

    }

    public Note(Long id) {
        this.id = id;
    }

    public Note(Long id, String title, String content, String date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getTitle() {
        return title;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
dest.writeLong(id);
        dest.writeString(title);
        dest.writeString(content);
        dest.writeString(date);
    }

    public final static Parcelable.Creator<Note> CREATOR=new Creator<Note>() {
        @Override
        public Note createFromParcel(Parcel source) {
            return new Note(source);
        }

        @Override
        public Note[] newArray(int size) {
            return new Note[size];
        }
    };
}
