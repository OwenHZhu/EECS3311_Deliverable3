# EECS3311 Deliverable 2 - Lab Equipment Reservation System

## Prerequisites
- Java JDK installed (so `javac` and `java` work).

## Compile and run (Swing GUI)
From the project root:

```bash
cd "EECS3311_Deliverable2" \
  && rm -rf out \
  && mkdir -p out \
  && javac -d out src/main/Main.java src/main/enums/*.java src/main/models/*.java \
  && mkdir -p out/main \
  && cp -R src/main/Pics out/main/ \
  && java -cp out main.models.Login
```

## Notes
- The GUI’s image resources are loaded from the classpath. That’s why `src/main/Pics` is copied into `out/main/`.
- `src/main/Main.java` only prints a message; the actual entrypoint for the app UI is `main.models.Login`.

