package com.twinstech.mvpdesignpattern;

import com.twinstech.mvpdesignpattern.util.DateCalculationManager;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mView;
    private DateCalculationManager mDateCalculationManager;

    public MainActivityPresenter(DateCalculationManager dateCalculationManager){
        this.mDateCalculationManager = dateCalculationManager;
    }


    @Override
    public void setView(MainActivityContract.View view) {
        this.mView = view;
    }

    @Override
    public void created() {
        this.mView.bindViews();
        this.mView.initClickListeners();
    }

    @Override
    public void onShowDateButtonClick() {
        String currentDate = this.mDateCalculationManager.calculateDate();
        this.mView.showDate(currentDate);
    }
}
