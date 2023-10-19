package com.bigid.CredentialVault.AppTypes;

public enum LicenseType {
    FREE ("FREE"),
    PAID ("PAID");

    private String name;       

    private LicenseType(String s) {
        this.name = s;
    }
}