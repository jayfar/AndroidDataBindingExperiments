package com.example.databinder;

import android.databinding.DataBindingUtil;
import android.os.Binder;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.databinder.databinding.FragmentMainBinding;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MainViewModel vm = new MainViewModel();
        vm.setFirstName("Hank");
        vm.setLastName("Williams");

        // Use this when setting up an activity with DataBinding.
        //ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.fragment_main);
        //binding.setUser(vm);

        FragmentMainBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main,container,true); //Binder.inflateView(this.getActivity(), R.layout.fragment_main, null, false);
        binding.setVm(vm);
        View view = binding.getRoot();
        return view;

        // Original Fragment Return without databinding
        //return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
