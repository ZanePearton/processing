# Sketch Processor

Welcome to the Sketch Processor Repository. This repository houses code written in Java for processing sketches.

## Dependencies

This project relies on the following JAR files:
- `processing - core.jar`
- `gluegen-rt.jar`
- `jogamp-fat.jar`
- `jogl-all.jar`

Please ensure these dependencies are correctly installed and included in your Java CLASSPATH.

## Getting Started

1. **Clone the repository**
  ```
  git clone https://github.com/yourGithubUsername/processing.git
  ```
2. **Navigate to the cloned directory**
  ```
  cd sketch-processor
  ```
3. **Ensure the dependencies are in your Java CLASSPATH**

   If the dependencies are not in your CLASSPATH, you can add them. Replace `path_to_jar` with the path to the directory containing the jar files and run:
   ```
   export CLASSPATH=$CLASSPATH:path_to_jar/core.jar:path_to_jar/gluegen-rt.jar:path_to_jar/jogamp-fat.jar:path_to_jar/jogl-all.jar
   ```
  Note: This command is for Unix-like systems. For Windows, use the appropriate command to update the CLASSPATH.

## How to Run

After you have cloned the repository and managed the dependencies, you can compile and run the Java code.

1. **Compile the Java files**
  ```
  javac *.java
  ```
2. **Run the application**
   ```
   java Main
   ```
Note: Replace `Main` with the name of your main class if it's different.

## Contribution

If you would like to contribute to this project, please fork this repository and propose your changes via a Pull Request. All contributions, big or small, are very much appreciated!
