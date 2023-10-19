Sample Credential Provider App

This application shows a sample implementation of a BigID app that supplies credentials from a credential vault.

This sample application does not implement any security and should not be exposed to the wider internet
Setup

run the application by running:

./mvnw spring-boot:run

The application will then be accessible on port 8080.
Customization

By default this application will provide the username password combination user:pass when passed the query "test" from BigID.

Edit line 54 of src/java/com/bigid/CredentialVault/AppController.java to change that behavior.