package com.twinstech.mvpdesignpattern;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.twinstech.mvpdesignpattern.util.DateCalculationManager;

//MainActivityContract.View interface'i implement edilir. Presenter'ın ihtiyacı olan model sınıfları burada
//üretilerek Presenter'a verilir.
//Ayrıca kullanıcı etkileşimleri için ilgili Presenter fonksiyonları çağrılarak Presenter uyarılır.

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private TextView tvDate;
    private Button btnShowDate;
    private MainActivityPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DateCalculationManager dateCalculationManager = new DateCalculationManager();
        mPresenter = new MainActivityPresenter(dateCalculationManager);
        mPresenter.setView(this);
        mPresenter.created();
    }

    @Override
    public void bindViews() {
        tvDate = (TextView)findViewById(R.id.tv_date);
        btnShowDate = (Button)findViewById(R.id.btn_show_date);
    }

    @Override
    public void initClickListeners() {
        btnShowDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.onShowDateButtonClick();
            }
        });
    }

    @Override
    public void showDate(String date) {
        tvDate.setText(date);
    }
}
