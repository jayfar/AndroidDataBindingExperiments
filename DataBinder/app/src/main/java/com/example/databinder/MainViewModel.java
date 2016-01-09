package com.example.databinder;



    import android.databinding.BaseObservable;
    import android.databinding.Bindable;
    import android.databinding.ObservableField;
    import android.view.View;

    import com.example.databinder.BR;

public class MainViewModel extends BaseObservable {

    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();


    public void onClickHandler(View view) {
        firstName.set("John");
        lastName.set("Smith");
    }

}