package graphics;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.KeyStroke;

public class Test {

	public static void main(String[] args) {

		String test = KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, InputEvent.SHIFT_DOWN_MASK, true).toString();
		System.out.println(test);
		System.out.println(KeyStroke.getKeyStroke("pressed PLUS"));
		System.out.println(KeyStroke.getKeyStroke("pressed +"));
		System.out.println(KeyStroke.getKeyStroke("pressed -"));
		System.out.println(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH, 0, false));
	}

}
