import java.awt.Component;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DominoPicerija {
	
	static void PicasPasutijums(){
		 String[] PicasVeidaIzvele = {"Pica ar sieru","Pica ar annanasiem","Pepperoni","Margarita","Vezuva","Ve�it�r�","Pica ar ��i��i","P�rloc�t�"};
		 String PicasVeids =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas veidu: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,PicasVeidaIzvele,PicasVeidaIzvele[0]);
	
		 switch(PicasVeids){
		 case "Pica ar sieru":
			 
			 break;
			 
		 case "Pica ar annanasiem":
			 
			 break;
			 
		 case "Pepperoni":
			 
			 break;
			 
		 case "Margarita":
			 
			 break;
			 
		 case "Vezuva":
			 
			 break;
			 
		 case "Ve�it�r�":
			 
			 break;
			 
		 case "Pica ar ��i��i":
			 
			 break;
			 
		 case "P�rloc�t�":
			 
			 break;
		 }
		 
		 
		 
		 JPanel myPanel = new JPanel(new GridBagLayout());
		JTextField Adresse = new JTextField(5);
		JTextField TelefonaNum = new JTextField(5);
		

	  

	    myPanel.add(new JLabel("J�su telefona nummurs: \n"));
	    myPanel.add(TelefonaNum);
	    TelefonaNum.setBounds(10, 20, 80, 25);

	    myPanel.add(new JLabel("Ievadiet savu adressi: "));
	    myPanel.add(Adresse);
	    Adresse.setBounds(10, 20, 80, 25);


	   

	    JOptionPane.showInputDialog(myPanel);
		
		

     
	}

	public static void main(String[] args) {
		int metodesIndekss;
	
		
		String[] switchMetodes = {"Pas�t�t picu","Apskat�t picas sast�vda�as","Apskat�t �eku","Apskat�t citus pirc�jus rind�","Beigt darbu."};
		
		do{
       metodesIndekss = (int) JOptionPane.showOptionDialog(null, "Izv�lies darb�bu","Izv�le",0,3,null,switchMetodes,switchMetodes[0]);
				
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
