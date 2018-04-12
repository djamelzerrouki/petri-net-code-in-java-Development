package application;
import javafx.scene.shape.Circle;
 import javafx.scene.text.Text;
public class Médecins {
	Circle c;
	Text txt;
	public Médecins(Circle c, Text txt) {
		super();
		this.c = c;
		this.txt = txt;
	}
	public Circle getC() {
		return c;
	}
	public void setC(Circle c) {
		this.c = c;
	}
	public int getTxt() {
		int number=Integer.parseInt(txt.getText());
		return number;
	}
	public void setTxt(int number) {
		this.txt.setText(number+"");
	}

	public boolean isEmpty() {
		int number=Integer.parseInt(txt.getText());
		return number>0;
	}

}
