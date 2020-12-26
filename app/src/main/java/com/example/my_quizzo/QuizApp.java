package com.example.my_quizzo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;

import com.example.my_quizzo.configuration.Config;
import com.example.my_quizzo.databaseutils.DatabaseHelper;
import com.example.my_quizzo.datalisteners.DataInputListener;
import com.example.my_quizzo.gameutils.BadgeEvaluator;
import com.example.my_quizzo.gameutils.GameUtils;
import com.example.my_quizzo.popups.StaticPopUpDialogBoxes;
import com.example.my_quizzo.serverutils.ServerCalls;
import com.example.my_quizzo.uiutils.UiUtils;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class QuizApp extends Fragment implements Animation.AnimationListener {

    private FrameLayout mainFrame;

    static final boolean FROM_LEFT = false;
    static final boolean FROM_RIGHT = true;
    static final boolean TO_LEFT = true;
    static final boolean TO_RIGHT = false;

    public static final int MENU_HOME = 1;
    public static final int MENU_BADGES = 2;
    public static final int MENU_ALL_QUIZZES = 3;
    public static final int MENU_FRIENDS = 4;
    public static final int MENU_MESSAGES=5;
    private static final int MENU_CHATS = 6;
    private static final int MENU_PROFILE = 7;
    public static final int MENU_SHARE_WITH_FRIENDS = 8;
    private static final int SEND_FEEDBACK = 9;
    private static final int COPY_RIGHTS = 10;

    private User currentUser;
    private AppController currentAppController;
    private UserDeviceManager userDeviceManager;
    private UiUtils uiUtils;
    private ServerCalls serverCalls;
    private DatabaseHelper dbHelper;
    private StaticPopUpDialogBoxes staticPopUpDialogBoxes;
    private boolean initializeDb;
    private Config config;
    private ArrayList<Screen> disposeScreen;

    private View loadingView;
    private boolean initialized = false;
    private MainActivity ref = null;

    private GameUtils gameUtils;

    private BadgeEvaluator badgeEvaluator;


    public void setMainActivity(MainActivity mainActivity) {
        ref = mainActivity;
    }
    public MainActivity getMainActivity() {
        return ref;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainFrame = (FrameLayout)getActivity().getLayoutInflater().inflate(R.layout.quizapp_layout,null);
        mainFrame.addView(loadingView);
        return mainFrame;
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
