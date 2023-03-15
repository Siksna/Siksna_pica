import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class DominoPicerija {
	
	static String fNosaukums;
	
	static void ierakstit(String PicasVeiduUzkratuve, JTextField Adresse, JTextField TelefonaNum, JTextField Vards, JTextField Uzvards,int attalums){
		
		fNosaukums = JOptionPane.showInputDialog("("+Vards+") �eks.txt");
		try{
			FileWriter fw = new FileWriter(fNosaukums,true);
			PrintWriter pw = new PrintWriter(fw);
			
			String txt=PicasVeiduUzkratuve+"\nPersonas Telefona nummurs: "+TelefonaNum.getText()+"\nPersonas v�rds un uzv�rds"+Vards.getText()+" "+Uzvards.getText();
			
			pw.println(txt);
			pw.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Rad�s k��da veidojot �eku!","K��da",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	static void apskatit(){
		String teksts, str = "";
		try{
			FileReader fr = new FileReader(fNosaukums);
			BufferedReader br = new BufferedReader(fr);
			while((teksts=br.readLine())!=null){
				str+=teksts+"\n";
			}
			br.close();
			JOptionPane.showMessageDialog(null, str,"Saturs",JOptionPane.INFORMATION_MESSAGE);

		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "K��da apskatot �eku!","K��da",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public static void PicasPasutijums(String PicasVeiduUzkratuve, JTextField Adresse, JTextField TelefonaNum, JTextField Vards, JTextField Uzvards,int attalums){
		
		
		double cena=0;
		int sk=0;
		
		String []izmers1={"Liel�-8.99�","Videj�-7.99�","Maz�-6.99�"};
		 String []izmers2={"Liel�-10.99�","Videj�-8.99�","Maz�-6.99�"};
		 String []izmers3={"Liel�-8.59�","Videj�-7.79�","Maz�-6.99�"};
		String []izmers4={"Liel�-11.99�","Videj�-10.99�","Maz�-9.99�"};
		String []izmers5={"Liel�-8.69�","Videj�-6.89�","Maz�-5.59�"};
		 String []izmers6={"Liel�-8.99�","Videj�=7.99�","Maz�-6.99�"};
		 String []izmers7={"Liel�-8.99�","Videj�-7.99�","Maz�-6.99�"};
		 String []izmers8={"Liel�-8.99�","Videj�-7.99�","Maz�-6.99�"};
		
	int pasutijumuSK = Integer.parseInt(JOptionPane.showInputDialog(null,"Cik picas v�laties pas�t�t?"));
	double []cenuIevade=new double[pasutijumuSK];
	int skaititajs=1;
	
	
	
	
	
	String [] PasutijumaOpcijas={"Uz vietas","Pieg�de"};
	int PasutijumaVeids= JOptionPane.showOptionDialog(null, "Izv�lies darb�bu","Izv�le",0,3,null,PasutijumaOpcijas,PasutijumaOpcijas[0]);
	
	if(PasutijumaVeids==1){
		attalums=Integer.parseInt(JOptionPane.showInputDialog(null,"Cik t�lu j�s dz�vojat?"));
		
		if(attalums<=5)
			cena+=1.10;
		else if(attalums>5||attalums<=10)
			cena+=1.60;
		else if(attalums>10||attalums<=15)
			cena+=2.30;
		else if(attalums>15||attalums<=20)
			cena+=5.10;
		else if(attalums>20)
			cena+=7.25;
	}
	
	
	
	
		 do{
		 String[] PicasVeidaIzvele = {"Pica ar sieru-7.99�","Pica ar annanasiem-8.99�","Pepperoni-7.79�","Margarita-10.99�","Vezuva-6.89�","Ve�it�r�-7.99�","Pica ar ��i��i-7.99�","P�rloc�t�-7.99�"};
		 String PicasVeids =(String) JOptionPane.showInputDialog(null,"Izv�lieties "+skaititajs+". picas veidu: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,PicasVeidaIzvele,PicasVeidaIzvele[0]);
		
		 String PicasIzmers = null;
		
		  
		  
		 switch(PicasVeids){
		 case "Pica ar sieru-7.99�":
			 
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers1,izmers1[1]);
			
			 if(PicasIzmers=="Liel�")
			 cena+=8.99;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=7.99;
			 else if(PicasIzmers=="Maz�")
				 cena+=6.99;
			 break;
			 
		 case "Pica ar annanasiem-8.99�":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers2,izmers2[1]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=10.99;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=8.99;
			 else if(PicasIzmers=="Maz�")
				 cena+=6.99;
			 break;
			 
		 case "Pepperoni-7.79�":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers3,izmers3[1]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=8.59;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=7.79;
			 else if(PicasIzmers=="Maz�")
				 cena+=6.99;
			 
			 break;
			 
		 case "Margarita-10.99�":
			 
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers4,izmers4[1]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=11.99;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=10.99;
			 else if(PicasIzmers=="Maz�")
				 cena+=9.99; 
			
			 break;
			 
		 case "Vezuva-6.89�":
			 
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers5,izmers5[1]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=8.69;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=6.89;
			 else if(PicasIzmers=="Maz�")
				 cena+=5.59;
			 break;
			 
		 case "Ve�it�r�-7.99�":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers6,izmers6[1]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=8.99;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=7.99;
			 else if(PicasIzmers=="Maz�")
				 cena+=6.99;
			 break;
			 
		 case "Pica ar ��i��i-7.99�":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers7,izmers7[1]);
				
			 if(PicasIzmers=="Liel�")
			 cena+=8.99;
			 else if(PicasIzmers=="Vid�j�")
				 cena+=7.99;
			 else if(PicasIzmers=="Maz�")
				 cena+=6.99;
			 break;
			 
		 case "P�rloc�t�-7.99�":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers8,izmers8[1]);
				
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
		 
		 
		
		

	  Object [] Dati = {"Adresse: ",Adresse,"Telefona nummurs:",TelefonaNum,"Vards:",Vards,"Uzv�rds:",Uzvards };

	   

	    JOptionPane.showConfirmDialog(null,Dati,"Jaut�jums",JOptionPane.OK_CANCEL_OPTION);
		
		

	}

	public static void main(String[] args) {
		int attalums = 0;
		int metodesIndekss;
		String PicasVeiduUzkratuve = null;
		JTextField Adresse = new JTextField();
		JTextField TelefonaNum = new JTextField();
		JTextField Vards = new JTextField();
		JTextField Uzvards = new JTextField();
		
		String[] switchMetodes = {"Pas�t�t picu","Apskat�t picas komplektus","Apskat�t �eku","Beigt darbu."};
		
		do{
       metodesIndekss = (int) JOptionPane.showOptionDialog(null, "Izv�lies darb�bu","Izv�le",0,3,null,switchMetodes,switchMetodes[0]);
				
				switch(metodesIndekss){
				case 0:
					 
					PicasPasutijums(PicasVeiduUzkratuve,Adresse,TelefonaNum,Vards,Uzvards,attalums);
					break;
				case 1:
					
					break;
				case 2:
					ierakstit(PicasVeiduUzkratuve,Adresse,TelefonaNum,Vards,Uzvards,attalums);
					apskatit();
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"J�s izg�j�t no pic�rijas!");
					break;
				
	}
		}while(metodesIndekss!=3);
}
}
