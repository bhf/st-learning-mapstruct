<a id="top"></a>
[![StayTuned](https://img.shields.io/badge/~%24-StayTuned_-000000?style=flat&labelColor=000000&color=000000)](https://sanjeev.pages.dev)

# st-learning-mapstruct

Gradle (Kotlin DSL) Java project demonstrating various MapStruct patterns and recipes with JUnit5.

## Examples

### Basic

Simple mapping between `PersonEntity` and `PersonDTO` using MapStruct.

### Record Example

Mapping to a Java `record`-based DTO (`PersonDTO` is a `record`).

### Enum Example

Demonstrates mapping between different enum types (external -> domain).

### Source Property Example: 

Source object uses property-style accessors (`firstName()` / `firstName(String)`), target DTO uses standard getters/setters.

### Target Property Example
Source object uses standard getters/setters, target DTO uses property-style accessors (demonstrates `@AfterMapping` usage).

### Iterable Example

Source entity has an `Iterable<Item>` field where `Item` exposes property-style accessors; the DTO uses a `List<ItemDTO>` field. Demonstrates mapping from an `Iterable` source to a `List` target and element mapping.

## Running Tests

Build, run the sample applications, or run tests with the Gradle wrapper:

```bash
# Run the test suite
./gradlew test
```
