package com.example.martin.trialnotes;

import java.io.File;

/**
 * Created by martin on 11/13/2017.
 */

public class Note {
    private String title;
    private File picture;
    private String notes;

    public Note(String title, File picture, String notes) {
        this.title = title;
        this.notes = notes;
        this.picture = picture;
    }
    public Note(String title, String notes) {
        this.title = title;
        this.notes = notes;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return notes;
    }

    public void setNote(String notes) {
        this.notes = notes;
    }
    public File getFile(){
        return picture;
    }
    public void setPicture(File picture){
        this.picture = picture;
    }
}
