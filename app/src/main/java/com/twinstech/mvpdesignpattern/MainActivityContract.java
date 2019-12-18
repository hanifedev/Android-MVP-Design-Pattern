package com.twinstech.mvpdesignpattern;

public interface MainActivityContract {

    interface View{
        void showDate(String date);
        void bindViews();
        void initClickListeners();
    }

    interface Presenter{
        void setView(View view);
        void created();
        void onShowDateButtonClick();
    }
}
