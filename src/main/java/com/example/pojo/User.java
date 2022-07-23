package com.example.pojo;

public class User {
    public Integer id ;
    public String avatar ;
    public String nickname ;
    public String username ;
    public String password ;


    public void setId(Integer id)
    {
        this.id=id;
    }
    public Integer getId()
    {
        return this.id;
    }
    public void setAvatar(String avatar)
    {
        this.avatar=avatar;
    }
    public String getAvatar()
    {
        return this.avatar;
    }
    public void setNickname(String nickname)
    {
        this.nickname=nickname;
    }
    public String getNickname()
    {
        return this.nickname;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public String getUsername()
    {
        return this.username;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getPassword()
    {
        return this.password;
    }
}
