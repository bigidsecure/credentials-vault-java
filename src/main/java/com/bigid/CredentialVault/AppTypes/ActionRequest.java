package com.bigid.CredentialVault.AppTypes;

import java.util.ArrayList;

public class ActionRequest {
    public String actionName;
    public String exectionId;
    public ArrayList<ActionRequestParam> actionParams;
    public ArrayList<ActionRequestParam> globalParams;
    public String bigidToken;
    public String updateResultCallback;
    public String bigidBaseUrl;
    public String tpaId;
}
