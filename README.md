Algarrythmia
============

## Setup

Setup in IntelliJ with Java version 11.0.2

#### JavaFX

```
Does not work
```

* Press <kbd>⌘ cmd</kbd> + <kbd>,</kbd> to bring up preferences
* Select `Plugins`
* Ensure that the JavaFX plugin is enabled
* Download JavaFX11 SDK from https://openjfx.io
* Download Scene Builder while you're there
* Make a copy of your JDK and rename it jdk-11.0.2.jfx.jdk
* Extract the JavaFX SDK contents and merge legal and lib into your JDK's Home directory

#### Timing Utilities

* Download Apache Commons Lang utilities from https://commons.apache.org/proper/commons-lang/
* In your workspace select Project Structure in the File tab
* Under Project Settings select Module
* In the dependencies tab click <kbd>+</kbd> and select `1 JARs or directories`
* Navigate to the location in which you have extracted the lang utilities
* Add the directory named commons-lang3-3.8.1

#### JUnit

```
May be unnecessary
```

* Select any class with Test in its name and press <kbd>F2</kbd> to navigate to the text `@Test`
* Press <kbd>⌥ alt</kbd> + <kbd>⏎ return</kbd>
* Select `Add 'JUnit 5.3' to classpath`


