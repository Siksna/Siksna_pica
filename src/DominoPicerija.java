import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class DominoPicerija {
	
	static String fNosaukums;
	
	static void ierakstit(String PicasVeiduUzkratuve, JTextField Adresse, JTextField TelefonaNum, JTextField Vards, JTextField Uzvards,int attalums, double cena){
		
		
		
		double piegCena = 0;
		fNosaukums = "("+Vards.getText()+" "+Uzvards.getText()+") �eks";
		try{
			FileWriter fw = new FileWriter(fNosaukums,true);
			PrintWriter pw = new PrintWriter(fw);
			
			if(attalums<=5){
				piegCena=1.10;
		
			}else if(attalums>5&&attalums<=10){
				piegCena=1.60;
				
		}else if(attalums>10&&attalums<=15){
				piegCena=2.30;
				
		}else if(attalums>15&&attalums<=20){
				piegCena=5.10;
				
	}else if(attalums>20){
				piegCena=7.25;
				
				
	}
			
			String txt=PicasVeiduUzkratuve+"\nCena par pieg�di: "+piegCena+"�\nKop�ja cena par visu: "+cena+"\nKop�j� cena par visu ar PVN: "+cena/100*79+"\nPersonas Telefona nummurs: "+TelefonaNum.getText()+"\nPersonas v�rds un uzv�rds: "+Vards.getText()+" "+Uzvards.getText();
			
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
	
	
	public static void PicasPasutijums(String PicasVeiduUzkratuve, JTextField Adresse, JTextField TelefonaNum, JTextField Vards, JTextField Uzvards,double cena){
		
		
		
		int sk=0;
		
		String []izmers1={"Liel�-8.99�","Videj�-7.99�","Maz�-6.99�"};
		 String []izmers2={"Liel�-10.99�","Videj�-8.99�","Maz�-6.99�"};
		 String []izmers3={"Liel�-8.59�","Videj�-7.79�","Maz�-6.99�"};
		String []izmers4={"Liel�-11.99�","Videj�-10.99�","Maz�-9.99�"};
		String []izmers5={"Liel�-8.69�","Videj�-6.89�","Maz�-5.59�"};
		 String []izmers6={"Liel�-8.99�","Videj�-7.99�","Maz�-6.99�"};
		 String []izmers7={"Liel�-8.99�","Videj�-7.99�","Maz�-6.99�"};
		 String []izmers8={"Liel�-8.99�","Videj�-7.99�","Maz�-6.99�"};
		
	int pasutijumuSK = Integer.parseInt(JOptionPane.showInputDialog(null,"Cik picas v�laties pas�t�t?"));
	double []cenuIevade=new double[pasutijumuSK];
	int skaititajs=1;
	
		 do{
		 String[] PicasVeidaIzvele = {"Pica ar sieru","Pica ar annanasiem","Pepperoni","Margarita","Vezuva","Ve�it�r�","Pica ar ��i��i","P�rloc�t�"};
		 String PicasVeids =(String) JOptionPane.showInputDialog(null,"Izv�lieties "+skaititajs+". picas veidu: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,PicasVeidaIzvele,PicasVeidaIzvele[0]);
		
		 String PicasIzmers = null;
		
		  
		  
		 switch(PicasVeids){
		 case "Pica ar sieru":
			 
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers1,izmers1[1]);
			
			 if(PicasIzmers=="Liel�-8.99�")
			 cena+=8.99;
			 else if(PicasIzmers=="Videj�-7.99�")
				 cena+=7.99;
			 else if(PicasIzmers=="Maz�-6.99�")
				 cena+=6.99;
			 break;
			 
		 case "Pica ar annanasiem":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers2,izmers2[1]);
				
			 if(PicasIzmers=="Liel�-10.99�")
			 cena+=10.99;
			 else if(PicasIzmers=="Videj�-8.99�")
				 cena+=8.99;
			 else if(PicasIzmers=="Maz�-6.99�")
				 cena+=6.99;
			 break;
			 
		 case "Pepperoni":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers3,izmers3[1]);
				
			 if(PicasIzmers=="Liel�-8.59�")
			 cena+=8.59;
			 else if(PicasIzmers=="Videj�-7.79�")
				 cena+=7.79;
			 else if(PicasIzmers=="Maz�-6.99�")
				 cena+=6.99;
			 
			 break;
			 
		 case "Margarita":
			 
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers4,izmers4[1]);
				
			 if(PicasIzmers=="Liel�-11.99�")
			 cena+=11.99;
			 else if(PicasIzmers=="Videj�-10.99�")
				 cena+=10.99;
			 else if(PicasIzmers=="Maz�-9.99�")
				 cena+=9.99; 
			
			 break;
			 
		 case "Vezuva":
			 
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers5,izmers5[1]);
				
			 if(PicasIzmers=="Liel�-8.69�")
			 cena+=8.69;
			 else if(PicasIzmers=="Videj�-6.89�")
				 cena+=6.89;
			 else if(PicasIzmers=="Maz�-5.59�")
				 cena+=5.59;
			 break;
			 
		 case "Ve�it�r�":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers6,izmers6[1]);
				
			 if(PicasIzmers=="Liel�-8.99�")
			 cena+=8.99;
			 else if(PicasIzmers=="Videj�-7.99�")
				 cena+=7.99;
			 else if(PicasIzmers=="Maz�-6.99�")
				 cena+=6.99;
			 break;
			 
		 case "Pica ar ��i��i":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers7,izmers7[1]);
				
			 if(PicasIzmers=="Liel�-8.99�")
			 cena+=8.99;
			 else if(PicasIzmers=="Videj�-7.99�")
				 cena+=7.99;
			 else if(PicasIzmers=="Maz�-6.99�")
				 cena+=6.99;
			 break;
			 
		 case "P�rloc�t�":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izv�lieties picas izm�ru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers8,izmers8[1]);
				
			 if(PicasIzmers=="Liel�-12.99�")
			 cena+=12.99;
			 else if(PicasIzmers=="Videj�-10.49�")
				 cena+=10.49;
			 else if(PicasIzmers=="Maz�-8.99�")
				 cena+=8.99;
			 break;
			 
		 }
		 
		 skaititajs++;
		 
		 cenuIevade[sk]+=cena;
		 PicasVeiduUzkratuve += PicasVeids+" "+PicasIzmers+" "+cenuIevade[sk]+"EUR\n";
		 
		 sk++;
		 pasutijumuSK--;
	}while(pasutijumuSK!=0); 
		 
		 
		JOptionPane.showMessageDialog(null,PicasVeiduUzkratuve);
		

	  Object [] Dati = {"Adresse: ",Adresse,"Telefona nummurs:",TelefonaNum,"Vards:",Vards,"Uzv�rds:",Uzvards };
	    JOptionPane.showConfirmDialog(null,Dati,"Jaut�jums",JOptionPane.OK_CANCEL_OPTION);
		
	}

	public static void main(String[] args) {
		double cena=0;
		int attalums = 0;
		int metodesIndekss;
		String PicasVeiduUzkratuve=" ";
		JTextField Adresse = new JTextField();
		JTextField TelefonaNum = new JTextField();
		JTextField Vards = new JTextField();
		JTextField Uzvards = new JTextField();
		
		String[] switchMetodes = {"Pas�t�t picu","Apskat�t �eku","Beigt darbu."};
		
		do{
       metodesIndekss = (int) JOptionPane.showOptionDialog(null, "Izv�lies darb�bu","Izv�le",0,3,null,switchMetodes,switchMetodes[0]);
				
				switch(metodesIndekss){
				case 0:
					String [] PasutijumaOpcijas={"Uz vietas","Pieg�de"};
					int PasutijumaVeids= JOptionPane.showOptionDialog(null, "Izv�lies darb�bu","Izv�le",0,3,null,PasutijumaOpcijas,PasutijumaOpcijas[0]);
					
					if(PasutijumaVeids==1){
						attalums=Integer.parseInt(JOptionPane.showInputDialog(null,"Cik t�lu j�s dz�vojat?(km)"));
						
						if(attalums<=5){
							cena+=1.10;
						JOptionPane.showMessageDialog(null,"J�su cena par pas�tijumu piegadi b�s 1.10�");
						}else if(attalums>5&&attalums<=10){
							cena+=1.60;
							JOptionPane.showMessageDialog(null,"J�su cena par pas�tijumu piegadi b�s 1.60�");
					}else if(attalums>10&&attalums<=15){
							cena+=2.30;
							JOptionPane.showMessageDialog(null,"J�su cena par pas�tijumu piegadi b�s 2.30�");
					}else if(attalums>15&&attalums<=20){
							cena+=5.10;
							JOptionPane.showMessageDialog(null,"J�su cena par pas�tijumu piegadi b�s 5.10�");
				}else if(attalums>20){
							cena+=7.25;
							JOptionPane.showMessageDialog(null,"J�su cena par pas�tijumu piegadi b�s 7.25�");
							
				}
					}
					PicasPasutijums(PicasVeiduUzkratuve,Adresse,TelefonaNum,Vards,Uzvards,cena);
					break;
					
				case 1:
					if(PicasVeiduUzkratuve==" "){
						JOptionPane.showMessageDialog(null, "J�ms nav pas�t�jums!");
					}else{
					ierakstit(PicasVeiduUzkratuve,Adresse,TelefonaNum,Vards,Uzvards,attalums,cena);
					apskatit();
					}
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"J�s izg�j�t no pic�rijas!");
					break;
				
	}
		}while(metodesIndekss!=2);
}
}
