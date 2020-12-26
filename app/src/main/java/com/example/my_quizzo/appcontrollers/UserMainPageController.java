package com.example.my_quizzo.appcontrollers;

import com.example.my_quizzo.AppController;
import com.example.my_quizzo.QuizApp;
import com.example.my_quizzo.User;

public abstract class UserMainPageController extends AppController {

    public static final String SOCIAL_NETWORK_TAG = "com.quizapp.tollywood.loginscreen";
    protected boolean mSocialNetworkManagerInitialized = false;
    User user= null;
    private double currentQuizMaxTimeStamp;
    private int feedPreprocessedCount;
//    protected YesNoDialog updatesErrorDialog=null;
    public UserMainPageController(QuizApp quizApp){
        super(quizApp);
    }

    public void checkAndShowCategories(){

    }
}
