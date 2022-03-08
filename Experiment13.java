

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Experiment13 {
	public static void main(String[] args) {
		App app = new App();
		app.run();
	}
}
class App extends JFrame implements ActionListener {
	Label T = new Label("0", 2);
	String[] symbols = { "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "/", "0", "C", "=" };
	JButton buttonArray[] = new JButton[16];
	String str1 = "";
	int p = 0, q = 0;
	String operator;

	void run() {
		Panel p = new Panel(new GridLayout(4, 4, 10, 10));
		T.setFont(new Font("TimesRoman", Font.BOLD, 34));
		add(T);
		T.setBackground(Color.BLACK);
		T.setForeground(Color.WHITE);
		T.setBounds(10, 10, 400, 100);
		Font font = new Font("TimesRoman", Font.BOLD, 24);
		for (int i = 0; i < 16; i++) {
			buttonArray[i] = new JButton("" + symbols[i]);
			p.add(buttonArray[i]);
			buttonArray[i].setFont(font);
			buttonArray[i].addActionListener(this);

		}
		add(p);
		p.setBounds(10, 120, 400, 200);
		setSize(430, 370);
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		try {
			switch (str) {
				case "+":
				case "-":
				case "*":
				case "/":
					p = Integer.parseInt(T.getText());
					operator = str;
					str1 = "";
					T.setText(str1);
					break;
				case "=":
					str1 = "";

					switch (operator) {
						case "+":
							q = Integer.parseInt(T.getText());
							T.setText(p + " + " + q + " = " + String.valueOf((p + q)));
							break;
						case "-":
							q = Integer.parseInt(T.getText());
							T.setText(p + " - " + q + " = " + String.valueOf((p - q)));
							break;
						case "*":
							q = Integer.parseInt(T.getText());
							T.setText(p + " * " + q + " = " + String.valueOf((p * q)));
							break;
						case "/":
							q = Integer.parseInt(T.getText());
							T.setText(p + " / " + q + " = " + String.valueOf((p / q)));
							break;
						}
					break;
				case "C":
					p = 0;
					q = 0;
					T.setText("");
					str1 = "";
					T.setText("0");
					break;
				default: {
					T.setText(str1.concat(str));
					str1 = T.getText();
				}
			}
		} catch (Exception ex) {
			T.setText("Syntax Error");
		}
	}
}