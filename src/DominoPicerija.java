
import java.awt.GridBagLayout;


import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DominoPicerija {
	
	
	static void PicasPasutijums(){
		double cena=0;
		String []izmers={"Liel�","Videj�","Maz�"};
		
	int pasutijumuSK = Integer.parseInt(JOptionPane.showInputDialog(null,"Cik picas v�laties pas�t�t?"));
		 
		 do{
		 String[] PicasVeidaIzvele = {"Pica ar sieru","Pica ar annanasiem","Pepperoni","Margarita","Vezuva","Ve�it�r�","Pica ar ��i��i","P�rloc�t�"};
		 String PicasVeids =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas veidu: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,PicasVeidaIzvele,PicasVeidaIzvele[0]);
		 String PicasVeiduUzkratuve = null;
		 String PicasIzmers;
		  PicasVeiduUzkratuve += PicasVeids+"\n";
		 switch(PicasVeids){
		 case "Pica ar sieru":
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers,izmers[0]);
			
			 if(PicasIzmers=="Liel�")
			 cena+=8.99;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=7.99;
			 else if(PicasIzmers=="Maz�")
				 cena+=6.99;
			 break;
			 
		 case "Pica ar annanasiem":
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers,izmers[0]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=10.99;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=8.99;
			 else if(PicasIzmers=="Maz�")
				 cena+=6.99;
			 break;
			 
		 case "Pepperoni":
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers,izmers[0]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=8.59;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=7.79;
			 else if(PicasIzmers=="Maz�")
				 cena+=6.99;
			 
			 break;
			 
		 case "Margarita":
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers,izmers[0]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=11.99;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=10.99;
			 else if(PicasIzmers=="Maz�")
				 cena+=9.99; 
			
			 break;
			 
		 case "Vezuva":
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers,izmers[0]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=8.69;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=6.89;
			 else if(PicasIzmers=="Maz�")
				 cena+=5.59;
			 break;
			 
		 case "Ve�it�r�":
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers,izmers[0]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=8.99;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=7.99;
			 else if(PicasIzmers=="Maz�")
				 cena+=6.99;
			 break;
			 
		 case "Pica ar ��i��i":
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers,izmers[0]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=8.99;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=7.99;
			 else if(PicasIzmers=="Maz�")
				 cena+=6.99;
			 break;
			 
		 case "P�rloc�t�":
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers,izmers[0]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=8.99;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=7.99;
			 else if(PicasIzmers=="Maz�")
				 cena+=6.99;
			 break;
			 
		 }
		 double []cenuIevade=new double[pasutijumuSK];
		 cenuIevade+=cena;
		 pasutijumuSK--;
	}while(pasutijumuSK!=0); 
		 
		 
		 JPanel myPanel = new JPanel(new GridBagLayout());
		JTextField Adresse = new JTextField(20);
		JTextField TelefonaNum = new JTextField(20);
		JTextField VardsUzv = new JTextField(20);

	  

	    myPanel.add(new JLabel("J�su telefona nummurs:"));
	    myPanel.add(TelefonaNum);
	    TelefonaNum.setBounds(10, 20, 50, 25);

	    myPanel.add(new JLabel("Ievadiet savu adressi:"));
	    myPanel.add(Adresse);
	    Adresse.setBounds(10, 20, 50, 25);
        
	    myPanel.add(new JLabel("Ievadiet savu v�rdu un uzv�rdu:"));
	    myPanel.add(VardsUzv);
	    Adresse.setBounds(10, 20, 50, 25);

	   

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
