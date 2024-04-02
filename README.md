# Processing Bundle for macOS

This repository is a lightweight Processing bundle tailored for macOS. It contains Java source code utilizing the Processing framework, along with additional libraries like PeasyCam and JOGL (Java OpenGL). Processing is a flexible software sketchbook and a language for learning how to code within the context of the visual arts. For more information on Processing, visit the [official Processing GitHub repository](https://github.com/processing).

This setup is designed for those interested in extending the capabilities of Processing with external libraries such as PeasyCam for camera controls and JOGL for advanced OpenGL graphics functionalities.

## Dependencies

The project requires the following external JAR files for compilation and execution:

- `core.jar` (Processing core library)
- `peasycam.jar` (Camera library for Processing)
- `jogamp-fat.jar` (JOGL all-in-one jar)
- `jogl-all.jar` (Java OpenGL library)

These dependencies are essential for the project to function and provide a comprehensive environment for developing Processing-based applications.

## Getting Started

To get started with this Processing bundle:

1. **Clone the Repository**

   Clone this repository to your local machine using the following command:

   ```
   git clone https://github.com/ZanePearton/processing.git
   ```

2. **Navigate to the Cloned Directory**

   Change into the directory containing the project files:

   ```
   cd processing/src
   ```

3. **Manage Dependencies**

   Ensure that all dependencies are included in your Java `CLASSPATH`. If not, you can add them temporarily for your session or permanently by modifying your environment variables. Assuming your dependencies are located in the `libs` directory under `src`, you can set your `CLASSPATH` as follows (Unix-like systems):

   ```
   export CLASSPATH=$CLASSPATH:./libs/core.jar:./libs/peasycam.jar:./libs/jogamp-fat.jar:./libs/jogl-all.jar
   ```

   On Windows, you would adjust the `CLASSPATH` through the Environment Variables section in the System Properties.

## How to Compile and Run

After setting up the repository and managing the dependencies, follow these steps to compile and run your application:

1. **Compile Your Java Files**

   From the `src` directory, compile your Java files, specifying the classpath to include the `libs` directory. For example, to compile `App.java` in the `main` package:

   ```
   javac -cp ".:libs/core.jar:libs/peasycam.jar:libs/jogamp-fat.jar:libs/jogl-all.jar:libs/peasy-math.jar" main/App.java
   ```

2. **Run Your Application**

   Execute your application by specifying the same classpath used for compilation. If `App` is your main class:

   ```
   java -cp ".:libs/core.jar:libs/peasycam.jar:libs/jogamp-fat.jar:libs/jogl-all.jar:libs/peasy-math.jar" main.App
   ```

## Contribution

Contributions are welcome! If you're interested in contributing, please fork the repository and submit your changes via a Pull Request. We appreciate contributions of any size and thank you for your interest in enhancing this Processing bundle.
