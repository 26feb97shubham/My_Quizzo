package com.example.my_quizzo;

import com.j256.ormlite.field.DatabaseField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class User {
    @DatabaseField(id = true, index = true, unique = true)
    public String uid;
    @DatabaseField
    private String name;
    public String deviceId;
    public String emailId;
    @DatabaseField
    public String pictureUrl;
    @DatabaseField
    public String coverUrl;
    @DatabaseField
    public String gender;
    @DatabaseField
    public double birthday;
    @DatabaseField
    public String place;
    public boolean isActivated = false;
    public double createdAt;
    public String country;
    @DatabaseField
    private String status;
    public String googlePlus;
    public String facebook;
    private ArrayList<String> badges;
    public HashMap<String, Integer> stats;
    public HashMap<String, Integer[]> winsLosses;
    private int userType = 0;
    @DatabaseField
    private String jsonDump;
    @DatabaseField
    public String gPlusUid;
    @DatabaseField
    public String fbUid;
    private Set<String> subscribers;//uids
    private Set<String> subscribedTo;

    public String fbFriends;
    public String gPlusFriends;
    public boolean isFriend = true;
    public ArrayList<String> gPlusFriendUids = new ArrayList<String>();
    public ArrayList<String> fbFriendUids = new ArrayList<String>();


    public User() {
    }

    public String getFacebookAuthToken() {
        return facebook;
    }

    public String getGooglePlusAuthToken() {
        return googlePlus;
    }
}
