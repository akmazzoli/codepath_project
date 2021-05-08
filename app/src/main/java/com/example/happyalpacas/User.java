package com.example.happyalpacas;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("User")
public class User extends ParseObject{
    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PROFILEPIC = "profilePic";
    public static final String KEY_CREATEDAT = "createdAt";
    public static final String KEY_CLUBSFOLLOWED = "clubsFollowed";
    public static final String KEY_BIO = "bio";

    public String getUsername(){
        return getString(KEY_USERNAME);
    }

    public void setUsername(String username){
        put(KEY_USERNAME, username);
    }

    public ParseFile getProfilePic(){
        return getParseFile(KEY_PROFILEPIC);
    }

    public void setProfilePic(ParseFile parseFile){
        put(KEY_PROFILEPIC, parseFile);
    }

    public String getPassword(){
        return getString(KEY_PASSWORD);
    }

    public void setPassword(String password){
        put(KEY_PASSWORD, password);
    }

    public String clubsFollowed(){
        return getString(KEY_CLUBSFOLLOWED);
    }

    public void setClubsFollowed(String clubsFollowed){
        put(KEY_CLUBSFOLLOWED, clubsFollowed);
    }

    public String getCreatedAt(){
        return getString(KEY_CREATEDAT);
    }

    public void setCreatedAt(String createdAt){
        put(KEY_CREATEDAT, createdAt);
    }

    public String getBio(){
        return getString(KEY_BIO);
    }

    public void setBio(String bio){
        put(KEY_BIO, bio);
    }

}
