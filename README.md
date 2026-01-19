# java-version-examples

A collection of concise and practical examples demonstrating features and changes across different Java (JDK) versions.

---

## 🎯 Project Goals

This project aims to:

- Demonstrate **new language features, JVM changes, and core API updates** introduced in different Java versions
- Provide **minimal, focused, runnable examples** instead of abstract descriptions
- Help developers quickly understand **what changed**, **how to use it**, and **what to watch out for** when upgrading JDK versions
- Serve as a long-term reference for Java version evolution (JDK 8 → latest LTS)

---

## 🧭 Target Audience

- Java developers upgrading JDK versions
- Backend / middleware / JVM engineers
- Developers interested in Java language & runtime evolution
- Anyone who prefers **code over slides** when learning

---

## 🗂 Project Structure

```text
java-version-examples
 ├── jdk8
 ├── jdk11
 ├── jdk17
 ├── jdk21
 ├── jdk25   (future)
 └── README.md
```

Each JDK module focuses only on **features introduced in that version**.

---

## 📦 Module Conventions

Each JDK module follows the same internal structure:

```text
jdkXX
 ├── pom.xml
 ├── src/main/java
 │   └── features
 │       ├── language     // language-level features
 │       ├── api          // new or changed standard APIs
 │       ├── jvm          // JVM / runtime behavior
 │       ├── concurrency  // concurrency & threading
 │       └── misc         // other notable changes
 └── README.md
```

---

## 🧪 Example Design Principles

All examples aim to be:

- ✅ **Minimal** – only essential code
- ✅ **Runnable** – can be executed directly
- ✅ **Version-specific** – no cross-version confusion
- ✅ **Commented** – explain *why*, not just *what*

Each example should answer at least one of:

- What problem does this feature solve?
- How is it different from previous versions?
- What are common pitfalls or limitations?

---

## ▶️ How to Run

### Requirements

- JDK matching the module version (e.g. JDK 21 for `jdk21`)
- Maven 3.9+

### Run an example

```bash
cd jdk21
mvn -q -DskipTests compile exec:java
```

Or run directly from your IDE using the corresponding JDK.

---

## 🧩 Covered Topics (Examples)

### Language Features
- `var`
- `record`
- `sealed classes`
- Pattern Matching
- Text Blocks

### JVM & Runtime
- JPMS (Modules)
- Class loading changes
- Strong encapsulation (JDK 16+)
- CDS / AppCDS

### Concurrency
- CompletableFuture enhancements
- Virtual Threads (Project Loom)
- Structured Concurrency

### APIs
- HTTP Client
- Date & Time improvements
- Foreign Function & Memory API

---

## 🚧 Non-Goals

This project intentionally does **not** focus on:

- Framework-specific features (Spring, etc.)
- Business logic examples
- Full applications or benchmarks

---

## 📌 Version Roadmap

- [x] JDK 8
- [x] JDK 11
- [x] JDK 17
- [ ] JDK 21 (in progress)
- [ ] JDK 25 (planned)

---

## 🤝 Contributing

Contributions are welcome.

Guidelines:
- One feature per example
- Keep examples small and focused
- Clearly document JDK version requirements

---

## 📄 License

MIT License

