package com.bigid.CredentialVault;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bigid.CredentialVault.AppTypes.ActionRequest;
import com.bigid.CredentialVault.AppTypes.AppCategory;
import com.bigid.CredentialVault.AppTypes.ExecutionResult;
import com.bigid.CredentialVault.AppTypes.ExecutionStatus;
import com.bigid.CredentialVault.AppTypes.LicenseType;
import com.bigid.CredentialVault.AppTypes.Manifest;
import com.bigid.CredentialVault.AppTypes.UserPassword;

@RestController
public class AppController {

    @GetMapping("/manifest")
    public Manifest manifest() {
        Manifest result = new Manifest();
        result.app_name = "Vault App";
        result.description = "This application provides data souce credentials from a user defined app";
        result.category = AppCategory.UTILITY;
        result.license_type = LicenseType.FREE;
        result.vendor = "BigID";
        result.is_interactive = false;
        return result;
    }

    @PostMapping("/execute")
    public ExecutionResult execute(@RequestBody ActionRequest body) {
        ExecutionResult result = new ExecutionResult();
        result.executionId = body.exectionId;

        String username = null;
        String password = null;

        // If the request is not a valid action, return an error
        if (body.actionName.equals("vault") == false) {
            result.statusEnum = ExecutionStatus.ERROR;
            result.progress = 0;
            result.message = "NO SUCH ACTION";
            return result;
        }

        // Get user defined query from BigID
        String query = body.actionParams.get(0).paramValue;
        System.out.println(query);

        // Peform whatever actions to get information from the vault here
        // This sample just expects the query to be set to "test"

        if (query.equals("test")) {
            username = "user";
            password = "password";
        }

        // If no user was found send an error back to BigID
        if (username == null) {
            result.statusEnum = ExecutionStatus.ERROR;
            result.progress = 0;
            result.message = "NO SUCH USER";
            return result;
        }

        result.statusEnum = ExecutionStatus.COMPLETED;
        result.progress = 1;
        result.message = "User found";
        result.additionalData = new UserPassword(username, password);

        return result;
    }

}
