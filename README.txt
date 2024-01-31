# JavaEditor
Simple Java editor


This Program (JavaEditor) is still in beta

Create issues for bugs

 Codes
  Is a "Note" //Note: ***************
  Is a "Issue" //Issue: ***************

  Documentation:
    This program is a starter program like MS Notepad. It's similar but with the purpose
of helping people to learn Java and AWT lib. There are many comments designed to help you learn the purpose
of each line of Java code. It is recommended to read the Java wiki before continuing to the code part of this starter program.
There is no guarantee that this will work if modified. Use at your own risk. The Java version this program is built on is
Java 1.15.0_01 (15). That means you will have to get the JDK of Java 15 not the Java SE versions or the "Standard Edition".
The JDK is the Java Development Kit which will help you program your first Java programs. It is also recommended to use the
latest version of Java.

  This second part is about installation of this simple Notepad like program. Go to https://www.jetbrains.com/idea/download and
download the latest version of IntelliJ IDEA. At the time of writing the latest version is 2020.3.1. After you have installed IntelliJ
IDEA, select Create New Project. Select Java and click OK. Then click OK again and you will be directed to a page that you can setup your
project such as the name and directory. After you have chosen the appropriate settings click OK. Go to the project directory and
copy and paste this .java file is to the src folder. After you have done that go back into IntelliJ IDEA and you should see
JavaEditor.java in your src folder. Go and double click it and the file will open. That's all for this part!



    Java Docs:

    1. The Basics
        First you must understand what are Java classes. They are created by doing public class <class name> {********}. After you have created a Java class, there will be a built in Java library called java.*. Using the built in Java library
we can create basic Java programs that print words. First try creating a Java program with the following lines: 1. public class <your file name> 2. public static void main(String args[]) {} and inside the brackets type System.out.println("Hello World!").
Now build it using the build option on the top bar. Click "Build Project" and then wait for it to build. After it has done building click the green run button on the right hand side. You should see inside the console that the words Hello World!
has been printed. The System library is a built in library in the Java library. It contains stuff like print or other things that you can do in the console. Next we are going to learn about the AWT package which is much more complicated.
The AWT package needs to be imported unlike the System package. You can import it by typing these lines of code in your 1st line: import java.awt.*. The * symbol is there so we don't have to import every single class of the AWT package.
Next we are going to learn some of the AWT code. AWT has something called a Frame or another word for Window. You have to add this line to your import line which should look like this: public class <your file name> extends Frame. That creates a Frame.
A Frame is basically a Window in Java. You can program a Button into the Frame or a TextBox into the Frame as everything is in the Frame, which makes the Frame extremely important. There are many things in the AWT Graphics Package. You can create a
colorful background or some colored and beautiful buttons and objects in the Frame.

    2. The Swing Package
        The Swing package is a more modern version of the AWT Package. It has several more features and much more frame types and objects. One example is the Tab. I'm sure many of you have heard of a tab too. It's basically the same in Swing.
Although I don't know too much about Swing, you also need to import it with javax: import javax.swing.*. A Frame is called a Frame in AWT, but in the Swing library, it's called a JFrame. The button is also called a JButton too! It's the same thing
as in AWT. So it's JButton b = new JButton! Also you need to make it visible too and change it's x, y, z. Things are similar in Swing but just with different names. There are many more objects in Swing and AWT that this guide can't cover them alL!
There are more advanced version of these graphic APIs like DirectX 12 and OpenGL and OpenCL but they are much more harder to learn.





------------------------------------------------------------------------------------------------------------------------
|                                                                                                                      |
|                                                                                                                      |
|                    Swing Example Code:                                                                               |
|                                                                                                                      |
|                                                                                                                      |
|public class Example extends JFrame {                                                                                 |
|	private final JButton b = new JButton();                                                                           |
|                                                                                                                      |
|	public Sample() {                                                                                                  |
|		super();                                                                                                       |
|		this.setTitle("ExampleApp");                                                                                   |
|		this.getContentPane().setLayout(null);                                                                         |
|		this.setBounds(100,100, 180, 140);   //x,y  -- width, height                                                   |
|		this.add(makeButton());                                                                                        |
|		this.setVisible(true);       //Visible = true / false                                                          |
|		this.setDefaultCloseOperation(EXIT_ON_CLOSE);                                                                  |
|	}                                                                                                                  |
|                                                                                                                      |
|	private JButton makeButton() {                                                                                     |
|		b.setText("Click me!");                                                                                        |
|		b.setBounds(40, 40, 100, 30);                                                                                  |
|		b.addActionListener(new ActionListener() {                                                                     |
|			public void actionPerformed(ActionEvent e) {                                                               |
|				JOptionPane.showMessageDialog(b, "Hello World!");                                                      |
|			}                                                                                                          |
|		});                                                                                                            |
|		return b;                                                                                                      |
|	}                                                                                                                  |
|                                                                                                                      |
|	public static void main(String[] args) {                                                                           |
|		// Swing calls must be run by the event dispatching thread.                                                    |
|		SwingUtilities.invokeAndWait(() -> new Sample());                                                              |
|	}                                                                                                                  |
| }                                                                                                                    |
|                                                                                                                      |
------------------------------------------------------------------------------------------------------------------------


Extra Info:
Some info here is not correct so you should still read the AWT, Swing, and Java wikis

    -Tom Zhang


