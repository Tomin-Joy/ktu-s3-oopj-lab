package lab;
import java.awt.*;
import java.awt.event.*;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;



public class Experiment13 {

	public static void main(String[] args) {
		App app = new App();
		app.run();

	}

}

class App extends Frame implements WindowListener,ActionListener{
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Button add,sub,mul,div,cls,eq;
	Label T;
	String s;
	void run(){
		s="";
		setSize(420,340); 
		setLayout(null);
		Panel p = new Panel(new GridLayout(4,4,10,10));
		setVisible(true);
		setResizable(false);
		addWindowListener(this);
		b0=new Button("0");
		b1= new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		add=new Button("+");
		mul=new Button("*");
		div=new Button("/");
		cls=new Button("C");
		sub=new Button("-");
		eq=new Button("=");
		T =new Label("0",2);
		T.setFont (new Font ("TimesRoman", Font.BOLD,34));
		add(T);
		T.setBackground(Color.BLACK);
		T.setForeground(Color.WHITE);
		T.setBounds(10,10,400,100);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(add);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(sub);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(mul);
		p.add(div);
		p.add(b0);
		p.add(eq);
		p.add(cls);
		add(p);
		p.setBounds(10,120,400,200);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		cls.addActionListener(this);
		eq.addActionListener(this);
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button) e.getSource();
		if(b!=eq && b!=cls) {
			s=s+b.getLabel();
			
		}
		else if(b==cls) {
			s="";
			
		}
		else {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");
			try {
				Object result = engine.eval(s);
				s=result.toString();
			} catch (ScriptException e1) {
				
			}
		}
		T.setText(s);
	}
	
	
}