Algarrythmia
============

* Packaged methods can be tested on variables set in the main method
* The main method creates a csv file in the local repo's root directory
* The csv file shows the time it took to run the method for various repetition counts
* The repetition counts are intervals of 5K between 5K and 100K

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
* Extract the JavaFX SDK contents somewhere and copy the path to the contained lib directory to clipboard
* In File > New select `Project`
* In JavaFX ensure you have the correct SDK selected and select `JavaFX Project`
* Press <kbd>⌘ cmd</kbd> + <kbd>,</kbd> to bring up preferences
* In Module select the Dependencies tab, click the `+` button
* In `2 Libraries` select `Java`
* Navigate to the lib directory of the JavaFX SDK and click `Open`
* Rename the library something like 'JavaFX'
* Click `Ok` twice to close both menus
* In Run > Edit Configurations > VM Options enter `--module-path="PWD" --add-modules=javafx.controls` replacing PWD with the path to the JavaFX SDK lib directory


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


