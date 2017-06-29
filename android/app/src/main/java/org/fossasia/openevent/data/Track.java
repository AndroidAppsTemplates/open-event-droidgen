package org.fossasia.openevent.data;

import com.fasterxml.jackson.annotation.JsonSetter;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;

public class Track extends RealmObject {

    @PrimaryKey
    private int id;
    @Index
    private String name;
    private String description;
    private String color;
    private String fontColor;
    private RealmList<Session> sessions;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFontColor() {
        return fontColor;
    }

    @JsonSetter("font_color")
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    @JsonSetter("font-color")
    public void setFontColorForNewModel(String fontColor) {
        this.fontColor = fontColor;
    }

    public RealmList<Session> getSessions() {
        return sessions;
    }

    public void setSessions(RealmList<Session> sessions) {
        this.sessions = sessions;
    }
}