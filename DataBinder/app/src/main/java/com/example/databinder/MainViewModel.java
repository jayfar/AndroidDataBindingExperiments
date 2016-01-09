package com.example.databinder;



    import android.databinding.BaseObservable;
    import android.databinding.Bindable;
    import android.view.View;

    import com.example.databinder.BR;

public class MainViewModel extends BaseObservable {
    private String firstName;
    private String lastName;
    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
    @Bindable
    public String getLastName() {
        return this.lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }


    public void onClickHandler(View view) {
        setFirstName("John");
        setLastName("Smith");
    }

}