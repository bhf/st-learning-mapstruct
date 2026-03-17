<a id="top"></a>
[![StayTuned](https://img.shields.io/badge/~%24-StayTuned_-000000?style=flat&labelColor=000000&color=000000)](https://sanjeev.pages.dev)

# st-learning-mapstruct

Gradle (Kotlin DSL) Java project demonstrating various MapStruct patterns with JUnit5.

## Examples

- basic: simple mapping between `PersonEntity` and `PersonDTO` using MapStruct.
- recordexample: mapping to a Java `record`-based DTO (`PersonDTO` is a `record`).
- enumexample: demonstrates mapping between different enum types (external -> domain).
- sourcepropertyexample: source object uses property-style accessors (`firstName()` / `firstName(String)`), target DTO uses standard getters/setters.
- targetpropertyexample: source object uses standard getters/setters, target DTO uses property-style accessors (demonstrates `@AfterMapping` usage).

## Running Tests

Build, run the sample applications, or run tests with the Gradle wrapper (recommended):

```bash
# Run the test suite
./gradlew test
```
