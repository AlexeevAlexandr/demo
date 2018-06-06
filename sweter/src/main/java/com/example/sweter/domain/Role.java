package com.example.sweter.domain;

public enum Role implements GrantedAuthority{
    USER;
    @Override
    public String getAuthority(){return name();}
}
