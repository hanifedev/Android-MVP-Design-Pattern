package com.twinstech.mvpdesignpattern.util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

//model sınıfıdır. Presenter’ın ihtiyaç duyduğu tarih bilgisini sağlar.
// Ama nasıl sağlayacağına bu sınıf kendi karar verir. Yani iş mantığını bu sınıf yönetir.
public class DateCalculationManager {
    public String calculateDate(){
        return DateFormat.getDateTimeInstance().format(new Date(Calendar.getInstance().getTimeInMillis()));
    }
}
