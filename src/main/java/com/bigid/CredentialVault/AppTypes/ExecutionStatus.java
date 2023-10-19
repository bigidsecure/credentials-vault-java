package com.bigid.CredentialVault.AppTypes;

public enum ExecutionStatus {
    COMPLETED ("COMPLETED"),
    ERROR ("ERROR"),
    IN_PROGRESS ("IN_PROGRESS");

    private String name;       

    private ExecutionStatus(String s) {
        this.name = s;
    }
}
