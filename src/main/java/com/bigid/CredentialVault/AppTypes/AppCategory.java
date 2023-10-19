package com.bigid.CredentialVault.AppTypes;

public enum AppCategory {
    UTILITY ("utility"),
    PRIVACY ("privacy"),
    PROTECTION ("protection"),
    PERSPECTIVE ("perspective");

    private String name;       

    private AppCategory(String s) {
        this.name = s;
    }
}