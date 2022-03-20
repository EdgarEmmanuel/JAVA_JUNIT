package com.example.test_java_fx.userInterface;

import com.example.test_java_fx.domain.SnackMachine;

public class MainViewModel {

    public MainViewModel(){
        SnackMachineViewModel snackVM = new SnackMachineViewModel(new SnackMachine());

    }
}
