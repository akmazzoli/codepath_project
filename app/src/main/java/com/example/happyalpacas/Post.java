package com.example.happyalpacas;

import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("Post")
public class Post extends ParseObject{
    public static final String KEY_OBJECTID = "objectId";
    public static final String KEY_AUTHOR = "author";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_CAPTION = "caption";
    public static final String KEY_LIKESCOUNT = "likesCount";
    public static final String KEY_CREATEDAT = "createdAt";
    public static final String KEY_UPDATEDAT = "updatedAt";

    public String getObjectId(){
        return getString(KEY_OBJECTID);
    }

    public void setObjectId(String objectId){
        put(KEY_OBJECTID, objectId);
    }

    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }

    public void setImage(ParseFile parseFile){
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getAuthor(){
        return getParseUser(KEY_AUTHOR);
    }

    public void setAuthor(ParseUser author){
        put(KEY_AUTHOR, author);
    }

    public String getCaption(){
        return getString(KEY_CAPTION);
    }

    public void setCaption(String caption){
        put(KEY_OBJECTID, caption);
    }

    public String getLikesCount(){
        return getString(KEY_LIKESCOUNT);
    }

    public void setLikesCount(String likesCount){
        put(KEY_LIKESCOUNT, likeCount);
    }

    public String getCreatedAt(){
        return getString(KEY_CREATEDAT);
    }

    public void setCreatedAt(String createdAt){
        put(KEY_CREATEDAT, createdAt);
    }

    public String getUpdatedAt(){
        return getString(KEY_UPDATEDAT);
    }

    public void setUpdatedAt(String updatedAt){
        put(KEY_UPDATEDAT, updatedAt);
    }

}
