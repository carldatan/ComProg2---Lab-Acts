import java.awt.*;
import javax.swing.BoxLayout;


public class GroceryList{
	public static void main(String Args[]){
		Frame frame = new Frame();
		Panel panel = new Panel();
		Label label = new Label();

		Checkbox check = new Checkbox("Milk");
		Checkbox check1 = new Checkbox("Eggs");
		Checkbox check2 = new Checkbox("Maple Syrup");

		frame.setTitle("Grocery List");
		frame.setLayout(new FlowLayout());
		frame.setSize(250,250);
		frame.setVisible(true);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setPreferredSize(new Dimension(150,200));

		label.setText("Grocery Items");

		frame.add(panel);
		panel.add(label);
		panel.add(check);
		panel.add(check1);
		panel.add(check2);
	}
}
