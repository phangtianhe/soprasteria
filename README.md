# soprasteria

# Run the program
```
Run Program : java -jar soprasteria.jar

Command                             Description
Q                                   Quit and close the application
X 3                                 Print X character with size of 3 (Allowed Size input = Odd number from 3 to 21 inclusive
Y 7                                 Print Y character with size of 7 (Allowed Size input = Odd number from 3 to 21 inclusive
Z 21                                 Print Z character with size of 21 (Allowed Size input = Odd number from 3 to 21 inclusive
A 7                                 Print A character with size of 7 (Allowed Size input = Odd number from 3 to 21 inclusive
U 7                                 Print U character with size of 7 (Allowed Size input = Odd number from 3 to 21 inclusive
```

# Approach & Assumptions
```
Size is the height of the printed alphabet, which is not always equal to the width, but for X Y Z height == width
Since given example of X Y Z is height == width, that is preserved

For X the approach is to draw a diagonal and then another of it mirrored
For Y the approach is to take the top and middle part of how x is draw and then just continue down the middle dot
For Z the approach is to take the mirrored diagonal of X approach and then draw a line at first and last line


For alphabet A,U to preserve the shape of the alphabet, the width will not be same size at height
Width for A will be height*2-1
Width for U will be height+2

For A the approach is to draw 2 diagonal that starts from midpoint of the horizontal axes to the bottom left and right with the middle
section of vertical to be drawn as long as it is within the inner portion of the diagonals

For U the approach is to draw 2 straight line down at far left and right of verticals, omitting the bottom left right corner and also draw a horizontal line at the last line

```

# Compile the program
```
Intellij:
File -> Project Structure -> Artifacts -> Add (+ Sign) -> JAR -> From modules with dependencies -> Select Main(console) as main class -> Ok -> Tick include in project build -> Ok
Jar will then will be built at user specified out folder as project builds or manually build the artifact via Build -> Build Artifacts..
```