package com.haybankz.pinctestapp.models;

import com.google.gson.annotations.SerializedName;

public class Author {


    @SerializedName("present")
    private boolean present;

    @SerializedName("avatar_thumb")
    private String avatarThumb;

    @SerializedName("avatar_medium")
    private String avatarMedium;

    @SerializedName("name")
    private String name;

    @SerializedName("last_name")
    private String lastname;

    @SerializedName("nickname")
    private String nickname;




    public Author(boolean present, String avatarThumb, String avatarMedium, String name, String lastname,
                  String nickname) {
        this.present = present;
        this.avatarThumb = avatarThumb;
        this.avatarMedium = avatarMedium;
        this.name = name;
        this.lastname = lastname;
        this.nickname = nickname;

    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String getAvatarThumb() {
        return avatarThumb;
    }

    public void setAvatarThumb(String avatarThumb) {
        this.avatarThumb = avatarThumb;
    }

    public String getAvatarMedium() {
        return avatarMedium;
    }

    public void setAvatarMedium(String avatarMedium) {
        this.avatarMedium = avatarMedium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


}
