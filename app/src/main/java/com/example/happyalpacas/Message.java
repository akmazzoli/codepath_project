package com.example.happyalpacas;
import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("Message")
public class Message extends ParseObject{

    public static final String KEY_OBJECTID = "objectId";
    public static final String KEY_SENDER = "sender";
    public static final String KEY_RECIPIENT = "recipient";
    public static final String KEY_CONTENT = "content";
    public static final String KEY_SENTAT = "sentAt";
    public static final String KEY_READ = "read";

    public String getObjectId(){
        return getString(KEY_OBJECTID);
    }

    public void setObjectId(String objectId){
        put(KEY_OBJECTID, objectId);
    }

    public ParseUser getSender(){
        return getParseUser(KEY_SENDER);
    }

    public void setSender(ParseUser sender){
        put(KEY_SENDER, sender);
    }

    public ParseUser getRecipient(){
        return getParseUser(KEY_RECIPIENT);
    }

    public void setRecipient(ParseUser recipient){
        put(KEY_RECIPIENT, recipient);
    }

    public String getContent(){
        return getString(KEY_CONTENT);
    }

    public void setContent(String content){
        put(KEY_CONTENT, content);
    }

    public String getSentAt(){
        return getString(KEY_SENTAT);
    }

    public void setSentAt(String sentAt){
        put(KEY_SENTAT, sentAt);
    }

    public String getRead(){
        return getString(KEY_READ);
    }

    public void setRead(String read){
        put(KEY_READ, read);
    }
}
