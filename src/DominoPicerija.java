import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DominoPicerija {
	
	static void PicasPasutijums(){
		/*
		JPanel myPanel = new JPanel(new GridBagLayout());
		JTextField locationField = new JTextField(10);
	    JTextField usedByField = new JTextField(5);
	    JTextField commentField = new JTextField(50);

	   

	    myPanel.add(new JLabel("Location: ");
	    myPanel.add(locationField);

	    myPanel.add(new JLabel("Used By: ");
	    myPanel.add(usedByField);

	    myPanel.add(new JLabel("Comments: ");
	    myPanel.add(commentField);

	   

	    JOptionPane.showInputDialog(myPanel);
		*/
		
String[] PicasVeids = {"Pica ar sieru","Pica ar annanasiem","Pepperoni","Margarita","Vezuva","Veìitârâ","Pica ar ðíiòíi","Pârlocîtâ"};
      int IzveletaisPicasVeids = (int) JOptionPane.showOptionDialog(null, "Izvçlies picas veidu","Izvçle",0,3,null,PicasVeids,PicasVeids[0]);
	}

	public static void main(String[] args) {
		int metodesIndekss;
	
		
		String[] switchMetodes = {"Pasûtît picu","Apskatît picas sastâvdaïas","Apskatît èeku","Apskatît citus pircçjus rindâ","Beigt darbu."};
		
		do{
       metodesIndekss = (int) JOptionPane.showOptionDialog(null, "Izvçlies darbîbu","Izvçle",0,3,null,switchMetodes,switchMetodes[0]);
				
				switch(metodesIndekss){
				case 0:
					PicasPasutijums();
					break;
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
	}
		}while(metodesIndekss!=4);
}
}
