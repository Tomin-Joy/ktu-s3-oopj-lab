package labInternal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class App extends JFrame implements ActionListener{
	JTextField name,phone,username,email,passWord,confirmPass;
    JButton register,clear;
    Label msg;
    
    void run() {
    	setLayout(new GridLayout(8,1,30,30));
    	setSize(300,500);
    	setVisible(true);
    	name =new JTextField("Name..");
    	phone = new JTextField("Phone Number..");
    	username = new JTextField("Username..");
    	email=new JTextField("Email..");
    	passWord = new JTextField("Password..");
    	confirmPass = new JTextField("confirm Password");
    	msg = new Label();
    	Panel p = new Panel();
    	register = new JButton("Register");
    	clear = new JButton("Clear");
    	p.setLayout(new FlowLayout());
    	p.add(register);
    	p.add(clear);
    	add(name);
    	add(phone);
    	add(username);
    	add(email);
    	add(passWord);
    	add(confirmPass);
    	add(p);
    	add(msg);
    	register.addActionListener(this);
    	clear.addActionListener(this);
    	
    	
    }
    	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)e.getSource();
		if(source==clear) {
			name.setText("Name..");
			username.setText("Username..");
			phone.setText("Phone..");
			email.setText("Email..");
			passWord.setText("Password..");
			confirmPass.setText("Confirm Password");
			
		}
		else {
			if(passWord.getText().equals(confirmPass.getText())){
				if(name.getText().length()>5 ) {
					int flag = 0;
					for (char i : passWord.getText().toCharArray()) {
						if(Character.isDigit(i)) {
							flag=1;
							break;
					    }
					}
					if(flag==1) {
						msg.setText("Registration Successful");
					}
					else {
						msg.setText("Registration failled. Try again");
					}
				}else {
					msg.setText("Registration failled. Try again");
				}
			}else {
				msg.setText("Registration failled. Try again");
			}
		}
		
	}



}

public class Registration {

	public static void main(String[] args) {
		App app = new App();
		app.run();

	}

}