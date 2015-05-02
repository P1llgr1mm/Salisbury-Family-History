package frame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import main.Main;

/**
 * Class for showing a window that will communicate results to the user
 * @author Map
 *
 */
public class UserFrame {

	JFrame frame; // java UI component
	Dimension windowSize = new Dimension(320, 400); // size is in pixels
	Dimension textAreaSize = new Dimension(300, 300); // size is in pixels
	Dimension buttonSize = new Dimension(300, 25); // size is in pixels
	
	String title = "Character Builder";
	
	// widgets go here
	JTextArea textArea;
	JButton buttonRerun;
	JButton buttonClear;
	
	/**
	 * Constructor of the frame
	 */
	public UserFrame() {
		frame = new JFrame();
		
		// set the title of the frame
		frame.setTitle(title);
		// set the size of the frame
		frame.setPreferredSize(windowSize);
		// align the contents of the frame with a layout
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// setup the text area
		textArea = new JTextArea();
		textArea.setPreferredSize(textAreaSize);
		
		// setup the button
		buttonRerun = new JButton("Run again");
		buttonRerun.setPreferredSize(buttonSize);
		// add an action to the button
		buttonRerun.addActionListener(new ActionListener() {
			// THIS IS AUTO-GENERATED - IGNORE IT
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.runProgram(); // this is what I wrote
			}
		});
		
		// setup the button
		buttonClear = new JButton("Clear Text");
		buttonClear.setPreferredSize(buttonSize);
		// add an action to the button
		buttonClear.addActionListener(new ActionListener() {
			// THIS IS AUTO-GENERATED - IGNORE IT
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText(""); // this is what I wrote
			}
		});
		
		// add the widgets to the frame
		frame.add(textArea);
		frame.add(buttonRerun);
		frame.add(buttonClear);
		
		// show it to the user
		frame.pack();
		frame.setVisible(true);
		
		// exit the program when the frame closes - avoids memory leak of the frame
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	/**
	 * This will be used by Main to send messages to the frame
	 * @param message String
	 */
	public void sendMessageToFrame(String message) {
		textArea.append(message);
		textArea.append(System.getProperty("line.separator")); // this is a OS independent line separator
	}
	
}
