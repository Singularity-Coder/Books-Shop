package com.singularitycoder.brhatmrdanga.helpers;

import com.singularitycoder.brhatmrdanga.auth.Users;

// Using this class we will do forget Password and Rmemeber me features. Contains common data of the users.
public class Constants {

    private static Users currentOnlineUsers;

    // Add 2 string vars that wills store user phone no which is unique key for every user. Under taht key all user info exists
    public static final String userPhoneKey = "UserPhone";
    public static final String userPasswordKey = "Userpassword";

}
