
import java.awt.GridBagLayout;


import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DominoPicerija {
	
	
	static void PicasPasutijums(){
		double cena=0;
		int sk=0;
		String []izmers={"Liel�","Videj�","Maz�"};
		
	int pasutijumuSK = Integer.parseInt(JOptionPane.showInputDialog(null,"Cik picas v�laties pas�t�t?"));
	double []cenuIevade=new double[pasutijumuSK];
	int skaititajs=1;
	
	
		 do{
		 String[] PicasVeidaIzvele = {"Pica ar sieru","Pica ar annanasiem","Pepperoni","Margarita","Vezuva","Ve�it�r�","Pica ar ��i��i","P�rloc�t�"};
		 String PicasVeids =(String) JOptionPane.showInputDialog(null,"Izv�lieties "+skaititajs+". picas veidu: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,PicasVeidaIzvele,PicasVeidaIzvele[0]);
		 String PicasVeiduUzkratuve = null;
		 String PicasIzmers = null;
		
		  
		  
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
		 
		 skaititajs++;
		 
		 cenuIevade[sk]+=cena;
		 PicasVeiduUzkratuve += PicasVeids+" "+PicasIzmers+" "+cenuIevade[sk]+"EUR\n";
		 pasutijumuSK--;
	}while(pasutijumuSK!=0); 
		 
		 
		
		JTextField Adresse = new JTextField();
		JTextField TelefonaNum = new JTextField();
		JTextField Vards = new JTextField();
		JTextField Uzvards = new JTextField();

	  Object [] Dati = {"Adresse: ",Adresse,"Telefona nummurs:",TelefonaNum,"Vards:",Vards,"Uzv�rds:",Uzvards };

	   

	    JOptionPane.showConfirmDialog(null,Dati,"Jaut�jums",JOptionPane.OK_CANCEL_OPTION);
		
		

     
	}

	public static void main(String[] args) {
		int metodesIndekss;
	
		
		String[] switchMetodes = {"Pas�t�t picu","Apskat�t picas komplektus","Apskat�t �eku","Beigt darbu."};
		
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
					JOptionPane.showMessageDialog(null,"J�s izg�j�t no picerijas!");
					break;
				
	}
		}while(metodesIndekss!=3);
}
}
