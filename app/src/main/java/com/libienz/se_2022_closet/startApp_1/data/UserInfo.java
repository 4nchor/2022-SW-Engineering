package com.libienz.se_2022_closet.startApp_1.data;

public class UserInfo {

    public UserInfo(String email,String password, String nickname, String gender) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.gender = gender;
    }
    private String email;
    private String password;
    private String nickname;
    private String gender;

    @Override
    public String toString() {
        return email + "/" + password + "/" + nickname + "/" + gender;
    }
}
