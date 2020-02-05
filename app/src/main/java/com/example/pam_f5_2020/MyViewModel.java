package com.example.pam_f5_2020;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MyViewModel extends ViewModel {
    private List<User> users;

    public List<User> getUsers() {


        if (users == null) {
            users = new ArrayList<User>();
            users.add(new User("blabla", "bloblo"));
            users.add(new User("blablaBis", "blobloBis"));
            loadUsers();
        }
        return users;
    }

    private void loadUsers() {
        // Do an asynchronous operation to fetch users.
    }
}
