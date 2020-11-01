# spring-boot-native-image-demo
Spring Boot with GraalVM Native Image Demo

## Require
- [GraalVM 20.2](https://www.graalvm.org/downloads/) (Tested with Java 11 version)
- After install GraalVM and add GraalVM installation to `JAVA_HOME` and `PATH`. Install Native Image plugin
```
gu install native-image
```
- Install Tools/Library for Native Image depends on your OS https://www.graalvm.org/reference-manual/native-image/#prerequisites

## Build
- In Windows, you must install the Visual Studio Build Tools 2010 (Java 8 version) or Build Tools 2017 or above (Java 11 version), then open the `x64 Native Tools Command Prompt` (Native Image only supports x64 cmd)
- In Linux/macOS, open your terminal then type
```
mvn -Pnative clean package
```

## Run
- Windows
```
target\com.sakadream.nativeimage.application.exe
```
- Linux/macOS
```
target\com.sakadream.nativeimage.application
```