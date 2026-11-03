# Sample Credential Provider App (Java)

A Spring Boot example of a BigID TPA credential provider. It advertises a `vault` action and returns a fixed placeholder username/password only for the sample query `test`; it does not integrate with an actual credential vault.

## API

- `GET /manifest` returns the app manifest.
- `POST /execute` handles the `vault` action request.

## Run locally

Requires JDK 21 (see `pom.xml`). From the repository root:

```sh
./mvnw spring-boot:run
```

Spring Boot’s default port is **8080**. The sample is also packaged as a standard Spring Boot Maven application.

## Security and limitations

The implementation has no authentication or secure vault integration, and prints the lookup query. It is a teaching sample only; do not expose it publicly or use the placeholder response as a real credential source. Replace the lookup with a properly secured secret-manager integration before adapting it.

<!-- bigidsecure-community-guidance -->
## BigID Community

This repository is part of [BigID Community](https://github.com/bigidsecure), a place for community members to share code, integrations, examples, and projects with other BigID customers.

Project ownership and support vary by repository. Check the maintainers, license, prerequisites, and compatibility notes before use, and validate the project in your own environment. Unless this repository explicitly says otherwise, do not assume the project is officially supported or maintained by BigID.

Please do not commit credentials, customer data, or other confidential information. Check this repository’s contribution guidance before submitting changes.
