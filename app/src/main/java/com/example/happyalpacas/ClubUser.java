package com.example.happyalpacas;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("ClubUser")
public class ClubUser extends ParseObject{

    public static final String KEY_CLUBNAME = "clubName";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PROFILEPIC = "profilePic";
    public static final String KEY_CREATEDAT = "createdAt";
    public static final String KEY_FOLLOWERS = "followers";
    public static final String KEY_DESCRIPTION = "description";

    public String getClubName(){
        return getString(KEY_CLUBNAME);
    }

    public void setClubName(String clubName){
        put(KEY_CLUBNAME, clubName);
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

    public String getFollowers(){
        return getString(KEY_FOLLOWERS);
    }

    public void setFollowers(String followers){
        put(KEY_FOLLOWERS, followers);
    }

    public String getCreatedAt(){
        return getString(KEY_CREATEDAT);
    }

    public void setCreatedAt(String createdAt){
        put(KEY_CREATEDAT, createdAt);
    }

    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }

    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }

}
