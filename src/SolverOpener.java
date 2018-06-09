import java.awt.Font;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SolverOpener extends JFrame {
	
	private JFrame frame;
	
	Integer c = 0;
	//private Integer midwordlength;
	//private Integer maxwordlength;
	public SolverOpener (String a1, String a2, String a3, String a4, String b1, String b2, String b3, String b4, String c1, String c2, String c3, String c4, String d1, String d2, String d3, String d4) {
        initialize(a1, a2, a3, a4, b1, b2, b3, b4, c1, c2, c3, c4, d1, d2, d3, d4);	
	}
	
	public void initialize (String a1, String a2, String a3, String a4, String b1, String b2, String b3, String b4, String c1, String c2, String c3, String c4, String d1, String d2, String d3, String d4) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 615, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Results:");
		lblNewLabel.setBounds(239, 19, 142, 22);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		//String[] bogrows = {a1+a2+a3+a4, b1+b2+b3+b4, c1+c2+c3+c4, d1+d2+d3+d4};
		String commaboard = a1+a2+a3+a4+","+b1+b2+b3+b4+","+c1+c2+c3+c4+","+d1+d2+d3+d4;
		//String[] allwords;
		//String commaboard2 = "ABCD,RHAO,OSND,OTHA";
		
		Solver s = new Solver();
        s.generateBoardFromString(commaboard);
        String dictString = "";
        
        try {
			dictString = s.dictionaryCreation("dictionary.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        File dictfile = new File("C:/Documents/boggledictionary2.txt");
        
        try (PrintWriter out = new PrintWriter(dictfile)) {
            out.println(dictString);
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
//        s.dictionaryCreation();
        
        // Create a stream to hold the output
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    // IMPORTANT: Save the old System.out!
	    PrintStream old = System.out;
	    // Tell Java to use your special stream
	    System.setOut(ps);
        
        s.loadDictionary("C:/Documents/boggledictionary2.txt");
        s.run();
        
        // Put things back
	    System.out.flush();
	    System.setOut(old);
	    // Show what happened
	    String results = baos.toString();
	    
	    //Solver.exit();
	    
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 50, 470, 313);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setText(results);
		
		JPanel panel = new JPanel();
		panel.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setBounds(34, 41, 500, 263);
		textArea.setCaretPosition(0);
		
		frame.getContentPane().add(scrollPane);
		
		frame.setVisible(true);
	}
}
