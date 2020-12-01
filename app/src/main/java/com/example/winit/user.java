package com.example.winit;

public class user {
    string username;
    string userfeedback;
    public user(String id, String names, String feedbacks){

    }

    public user(string username, string userfeedback) {
        this.username = username;
        this.userfeedback = userfeedback;
    }

    public string getUsername() {
        return username;
    }

    public string getUserfeedback() {
        return userfeedback;
    }
}
