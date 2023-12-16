package main; //________________________________ don't mind it _________________________________________________
/*
Replace users from chenx to your name LINE 25, 191, 174
README:
This Program (JavaEditor)
Is still in ALPHA/BETA

Bugs are uncommon but not seen a lot
since this program is so simple

 Codes
  Is a "Note" //Note: ***************
  Is a "Issue" //Issue: ***************

  Note: Read the comments they are helpful

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




 */

import java.awt.*; //import line
import java.awt.event.*; //import line
import java.io.*; //import line
import java.util.Scanner; //import line

/*
Import Lines are extremely important because they get packages!!!
-----------------------------------------------------------------


PPS:

If you want to force close things do this:
//Force "Close"
            System.exit(0);
            System.out.println("Did not Stop? Trying 1/8"); //try 1
            System.exit(0);
            System.out.println("Did not Stop? Trying 2/8"); //try 2
            System.exit(0);
            System.out.println("Did not Stop? Trying 3/8"); //try 3
            System.exit(0);
            System.out.println("Did not Stop? Trying 4/8"); //try 4
            System.exit(0);
            System.out.println("Did not Stop? Trying 5/8"); //try 5
            System.exit(0);
            System.out.println("Did not Stop? Trying 6/8"); //try 6
            System.exit(0);
            System.out.println("Did not Stop? Trying 7/8"); //try 7
            System.exit(0);
            System.out.println("Error with Stopping! Try 8/8"); //final try 8/8 === ERROR WITH SHUTDOWN
            System.out.println("Stopping Debug");
            //End//

-----------------------------------------------------------------

 */
class OtherExt extends Frame {

    OtherExt() {
        System.out.println("Error3");
        System.out.println("Error2");
        setTitle("DEBUG");
        setSize(100, 100);
        setVisible(true);
        TextArea sct = new TextArea("Error");
        sct.setBounds(50, 100, 150, 30);

    }
}


class TEXT {

    TEXT() {
        System.out.println("Execute IF Needed");
        /*
        This is just a log maker if
        you a simple log like for what
        is on the screen and debug stuff
        etc.
         */
        System.out.println(getClass());
        System.out.println("null");
        Boolean v = Boolean.TRUE;


    }

}


class NewDebugTab extends Frame implements WindowListener {
    public TextArea xxx;

    NewDebugTab() {
        System.out.println("Setting Working +++++");
        setTitle("JavaEditor(Safe Mode)");
        setSize(400, 400);
        setVisible(true);
        TextArea xxx = new TextArea("SAFE|MODE");
        xxx.setBounds(50, 100, 150, 30);
        setBackground(Color.BLUE);
        add(xxx);
        addWindowListener(this);
        Menu men = new Menu("TOOL");
        MenuBar mbx = new MenuBar();
        MenuItem i1 = new MenuItem("PRINT TEXT");
        men.add(i1);

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
        //closed
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}


class Setting extends Frame implements WindowListener, ActionListener, ComponentListener {
    public TextArea text;

    Setting() {
        System.out.println("Setting Working +++++");
        setTitle("Settings");
        setSize(400, 400);
        setVisible(true);
        addWindowListener(this);
        addComponentListener(this);
        Button b = new Button("Select Save Destination");
        b.setBounds(50, 100, 150, 30);
        add(b);
        setLayout(null);
        TextArea text = new TextArea("Input Destination");
        add(text);
        text.setBounds(20, 50, 250, 50);
        b.addActionListener(this);
        Button bb = new Button("SAFE MODE");
        bb.setBounds(20, 70, 150, 30);
        bb.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Select Save Destination") {
            System.out.println("select save clicked");


        }
    }


    @Override
    public void componentResized(ComponentEvent e) {

    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose(); //close line
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

public class JavaEditor extends Frame implements WindowListener, ComponentListener, ActionListener {
    public TextArea area;

    JavaEditor() {
        System.out.println("Started");
        File theDir = new File("c:/users/chenx/Downloads/javaeditor");
        if (!theDir.exists()) {
            theDir.mkdirs();
        }
        setTitle("JavaEditor");
        addWindowListener(this);
        addComponentListener(this);
        setSize(1600, 1000); //setting window size using setSize from java.awt.*
        setLayout(null); //null = no layout
        setVisible(true); //true/false bool      ---    toggle
        /*
        setBackground(Color.null);
        Set the background
         */
        System.out.println("Debug x0002- Status Good-MODE 4"); //debug
        area = new TextArea(""); //replace with wat u want when u start, not recommended as can interfere with other classes/functions
        add(area); // Add Large TextArea AWT
        System.out.println("Debug x0003"); //debug
        MenuBar mb = new MenuBar();
        Menu menu = new Menu("File"); //menu bar --- def: the bar at the top
        //Menu Config
        //add some more menu items if needed
        MenuItem i1 = new MenuItem("Debug"); //Menu ITEM
        MenuItem i2 = new MenuItem("New Window"); //Menu ITEM
        MenuItem i3 = new MenuItem("Open"); //Menu ITEM                     //Menu items from java.awt
        MenuItem i4 = new MenuItem("Save"); //Menu ITEM
        MenuItem i5 = new MenuItem("Force Close"); //Menu ITEM
        MenuItem i6 = new MenuItem("Settings");//Menu ITEM
        MenuItem i7 = new MenuItem("Safe Mode");//Menu ITEM
        System.out.println("Debug Message, Harmless--Code 253"); //debug
        menu.add(i1); //add menu ITEM1
        menu.add(i2); //add menu ITEM2
        menu.add(i3); //add menu ITEM3
        menu.add(i4); //add menu ITEM4
        menu.add(i5); //add menu ITEM5
        menu.add(i6); //add menu ITEM6
        menu.add(i7); //add menu ITEM7
        mb.add(menu);
        setMenuBar(mb);
        /*
        Menu Listeners
        example= i?.addActionListener(??? or THIS)

         */
        i4.addActionListener(this); //import listener
        i3.addActionListener(this); //import listener
        i2.addActionListener(this); //import listener
        i5.addActionListener(this); //import listener
        i6.addActionListener(this); //import listener
        i7.addActionListener(this); //import listener
        i1.addActionListener(this); //import listener
        System.out.println("Debug x0004");
        //DEBUG DEBUG DEBUG


    }


    public static void main(String args[]) {
        JavaEditor e = new JavaEditor();    //some e int //new instance
        //MAIN CLASS
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Opened");           //a function == windowClosed == event Function
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Working Close"); //Ignore
        dispose();      //CLOSE
        //System.out.println("ERROR WITH CLOSEING"); //Ignore
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println(area.getText());             //print all text, remove if u don't want the text to be printed
        System.out.println("Working Function");         //just a debug line

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Working Function"); //debug line
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //Some Function or etc.
        System.out.println("Working Function"); //debug line
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Working Function"); //debug line
        //Some Function or etc.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Working Function"); //debug line
    }

    @Override
    public void componentResized(ComponentEvent e) {
        area.setBounds(10, 50, getWidth() - 20, getHeight() - 80); //Size and XY of dynamic resizing
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        //debug line
    }

    @Override
    public void componentShown(ComponentEvent e) {
        System.out.println("Working Function"); //debug line
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        System.out.println("Working Function"); //debug line
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "Settings") {
            Setting newins = new Setting(); //new instance of this program aka new tab
        }
        if (e.getActionCommand() == "Debug") {
            System.out.println("Need to be running in IDE Debug Mode otherwise debug won't work");
            System.out.println(area.getText());
            System.out.println("All Debug Codes");
            System.out.println("624");
            System.out.println("253");
            System.out.println("962");
            System.out.println("END");
            System.out.println("debug getGraphicsConfiguration " + getGraphicsConfiguration());
            System.out.println("debug getFrame " + getFrames());
            System.out.println("debug getHeight " + getHeight());
            System.out.println("debug getBackground " + getBackground());
            System.out.println("debug getFont " + getFont());
            System.out.println("debug getX " + getX());
            System.out.println("debug getY " + getY());
            System.out.println("debug getColorModel " + getColorModel());

        }
        if (e.getActionCommand() == "Force Close") {
            //Force "Close"
            System.exit(0);
            System.out.println("Did not Stop? Trying 1/8"); //try 1
            System.exit(0);
            System.out.println("Did not Stop? Trying 2/8"); //try 2
            System.exit(0);
            System.out.println("Did not Stop? Trying 3/8"); //try 3
            System.exit(0);
            System.out.println("Did not Stop? Trying 4/8"); //try 4
            System.exit(0);
            System.out.println("Did not Stop? Trying 5/8"); //try 5
            System.exit(0);
            System.out.println("Did not Stop? Trying 6/8"); //try 6
            System.exit(0);
            System.out.println("Did not Stop? Trying 7/8"); //try 7
            System.exit(0);
            System.out.println("Error with Stopping! Try 8/8"); //final try 8/8 === ERROR SHUTDOWN
            System.out.println("Stopping Debug");
            //End//
        }
        if (e.getActionCommand() == "Safe Mode") {
            NewDebugTab newin = new NewDebugTab(); //new instance of this program aka new tab

        }
        if (e.getActionCommand() == "New Window") {
            JavaEditor newins = new JavaEditor(); //new instance of this program aka new tab

        }

        if (e.getActionCommand() == "Open") {
            //lol test alpha --

            //Scanner object for File "(Java)Class "READ"
            try {
                File myObj = new File("c:/users/chenx/Downloads/javaeditor/tom_file.txt"); //create a new file at this path
                Scanner myReader = new Scanner(myObj); //create a scanner object
                String filetext = ""; //leave this empty otherwise file wont save
                while (myReader.hasNextLine()) {
                    filetext = filetext + myReader.nextLine() + "\n"; //keep putting spaces after reading the lines of the file
                }
                area.setText(filetext); //loads the text in memory
                myReader.close(); //close reader
            } catch (FileNotFoundException ed) {
                System.out.println("An error occurred."); //can't read file so outputs a ERROR
                //Error
            }
        }

        if (e.getActionCommand() == "Save") {
            // save file
            try {
                File myObj = new File("c:/users/chenx/Downloads/javaeditor/tom_file.txt"); //creates a new file in memory
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName()); //some line to tell u it worked
                } else {
                    System.out.println("File already exists."); //the file is still there
                }
                FileWriter myWriter = new FileWriter(myObj.getPath()); //writing to the file
                myWriter.write(area.getText()); //gets the text
                myWriter.close(); //closes
                System.out.println("Successfully wrote to the file."); //write successful
            } catch (IOException ex) {
                System.out.println("An error occurred."); //error in writing process

            }
        }

    }
}
