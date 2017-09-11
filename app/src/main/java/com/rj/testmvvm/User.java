package com.rj.testmvvm;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

/**
 * Created by Administrator on 2017/9/11.
 */

public class User extends BaseObservable {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> pass = new ObservableField<>();
    public final ObservableField<String> now = new ObservableField<>();

    public User() {
    }

    public User(String name, String pass) {
        this.name.set(name);
        this.pass.set(pass);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name.get() + '\'' +
                ", pass='" + pass.get() + '\'' +
                '}';
    }
}
