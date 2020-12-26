package com.example.my_quizzo.appcontrollers;

import com.example.my_quizzo.AppController;
import com.example.my_quizzo.QuizApp;
import com.example.my_quizzo.databaseutils.Badge;
import com.example.my_quizzo.screens.BadgeScreen;

public class BadgeScreenController extends AppController {
    public BadgeScreenController(QuizApp quizApp) {
        super(quizApp);
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub

    }

    public void onBadgeClick(Badge badge){
        //quizApp.getStaticPopupDialogBoxes().showUnlockedBadge(badge, true, null);
    }

    public void showBadgeScreen() {
        clearScreen();
   //     BadgeScreen badgeScreen = new BadgeScreen(this);
     //   insertScreen(badgeScreen);
    }
}
