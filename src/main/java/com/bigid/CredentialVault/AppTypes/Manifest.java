package com.bigid.CredentialVault.AppTypes;

import java.util.ArrayList;

public class Manifest {
    public String app_name;
    public String description;
    public AppCategory category;
    public LicenseType license_type;
    public String vendor;
    public boolean is_interactive;
    public ArrayList<Action> actions = new ArrayList<Action>();
    public ArrayList<ActionParam> global_params = new ArrayList<ActionParam>();
}
