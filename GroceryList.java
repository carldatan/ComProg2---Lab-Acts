import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

public class GroceryList {
	public static void main(String Args[]) {
		Frame frame = new Frame();
		Panel panel = new Panel();
		Label label = new Label();

		Checkbox check = new Checkbox("Milk");
		Checkbox check1 = new Checkbox("Eggs");
		Checkbox check2 = new Checkbox("Maple Syrup");

		frame.setTitle("Grocery List");
		frame.setLayout(new FlowLayout());
		frame.setSize(250, 250);
		frame.setVisible(true);
		frame.setBackground(Color.PINK);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setPreferredSize(new Dimension(150, 200));

		label.setText("Grocery Items");

		frame.add(panel);
		panel.add(label);
		panel.add(check);
		panel.add(check1);
		panel.add(check2);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		ItemListener strike = e -> {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				((Checkbox) e.getSource()).setForeground(Color.red);
			} else {
				((Checkbox) e.getSource()).setForeground(Color.black);
			}

		};

		check.addItemListener(strike);
		check1.addItemListener(strike);
		check2.addItemListener(strike);
	}
}
