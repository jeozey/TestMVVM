//package com.rj.testmvvm;
//
//import android.databinding.BaseObservable;
//import android.databinding.Bindable;
//
///**
// * Created by Administrator on 2017/9/11.
// */
//
//public class User2 extends BaseObservable {
//    private String name;
//    private String pass;
//
//    public User2(String name, String pass) {
//        this.name = name;
//        this.pass = pass;
//    }
//
//    @Bindable
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//        notifyPropertyChanged(BR.name);
//    }
//    @Bindable
//    public String getPass() {
//        return pass;
//    }
//
//    public void setPass(String pass) {
//        this.pass = pass;
//        notifyPropertyChanged(BR.pass);
//    }
//}
