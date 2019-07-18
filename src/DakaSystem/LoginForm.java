package DakaSystem;
/**
 * 
 * @<p> Can not GUI Programming,I think I can do this at first,but I found I can not do this all day like Capter American in the end,so I am very sad to write this Information to give out my sadness,I hope I never meet this Exception again in future programming life.Mabey you will think I am to fucking to write this words that is very long,but I say it is very interesting and I never imaged the Eclipse can write so long in each line,I am Happy now.</p>
 * @author Iron-Man :Jinxi Wang; John Wick;Tom Crus;Jennepher;Thor;son of Daddy;Genji;Hanzong;Solder:76;Wenston;Trecer;Up-Turn-Fist;Anna;Mei;Gaylen;Garvin VI;Assasion Creed;Brother Hood;Porlist;Eclipse;ThunderBird;Sougou;Jakey Ma;Charlie Puth;Justin Bieber;Taylor Swift;Obama;JJ Fly;Nobody;Actually The All Author Is Null;Because Everyone Is Me:Thunos;In The End;Not Yet, I Am DeadPool,So You Know Who I Am,And I Will See You Later.To Be Continue...(ROUNDABOUT)
 * @version 1.0 2019-7-12 18:29
 * @deprecated
 * 
 * Copyright (c) 2019 东软睿道沈阳实训中心
 */
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jp1,jp2,jp3;
	private JButton jb1,jb2;
	private JLabel jl1,jl2;
	private JTextField jtf;
	private JPasswordField jpf;
	
	public static void main(String[] args) {
		new LoginForm();
	}
//	
	public LoginForm() throws HeadlessException {
		// TODO Auto-generated constructor stub
		try {
			this.setTitle("OVERWATCH");
			this.setSize(300,200);
			this.setLocation(100,100);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			this.setLayout(new GridLayout(3,1));
			jp1 = new JPanel();
			jl1 = new JLabel("用户名:");
			jtf = new JTextField(20);
			jp1.add(jl1); jp1.add(jtf);
			this.add(jp1);
			
			jp2 = new JPanel();
			jl2 = new JLabel("密  码：");
			jtf = new JPasswordField(20);
			jp2.add(jl2);
			jp2.add(jpf);
			this.add(jp2);
			
			jp3 = new JPanel();
			jb1 = new JButton("冲浪");
			jb2 = new JButton("下网");
			jp3.add(jb1); jp3.add(jb2);
			this.add(jp3);
			
			this.setVisible(true);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
		
		
		
	}

	public LoginForm(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public LoginForm(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public LoginForm(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

}
