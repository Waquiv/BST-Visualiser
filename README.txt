BST VISUALIZATION PROGRAM USING JAVA
_____________________________________________
CONTENTS:-
1. BST.class file
2. TreeNode.class file
3. Vis.class file
4. BSTVisualizer.class file
5. Icon.png file
6. README.txt file
7. Separate ".java" files for every ".class" file
__________________________________________________

BUILD DETAILS:-

Built using java programming language and Microsoft's build of Open JDK 17.0.7
(download link- https://learn.microsoft.com/en-us/java/openjdk/download).
Visual Studio Code and IntelliJ IDEA used for writing and testing the code. Java swing and awt libraries
used for graphical support.
____________________________________________________
BASIC OVERVIEW

Binary Search Tree Visualization program made using JAVA and native libraries. The main UI handling user input is
Command Line Interface based and can be used from console, while the graphical representaion is achieved using the
swing and awt libraries of JAVA.

The 4 classes are:-
TreeNode(public)- Has the basic structure of the BST node used.
BST(public)- Contains various methods() used for altering/modyfying different nodes/BSTs.
BSTVisualizer(Default/Package Private)- Child of the JPanel class with methods and attributes for drawing BST.
Vis(public)- Contains the main() and various other static methods for visualizing BST as well as handling I/O.
______________________________________________________
INSTRUCTIONS TO RUN:-
- download and setup of JDK version 17 or above (download link in the "BUILD DETAILS" section)

- Use the command "java Vis" to start the program.

- A menu arrives with the options:  "1) Create new BST" and "2) EXIT". Enter the number cooresponding to the option
  and press "enter" to select the option. Can Create a new BST or exit the program. Following the creation of BST a
  value for the "root" node is asked, enter the value and press "enter" to proceed.

- Following the creation of a new BST another menu appears with options "1) insert node(single)","2) insert node(multiple)",
  "3) delete node","4) show BST","5) search node", and"6) EXIT". Entering the number cooresponding to the option will select
  option. 
  The "insert" and "delete" options ask for a value to insert or delete from the BST. 
  The "search" option displays a JFrame showing the "root node" and path traversed to get to the "key" node. 
  The "show BST" option displays the current instance of teh BST on a JFrame.
  The "EXIT" option terminates the program.