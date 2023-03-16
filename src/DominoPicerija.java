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
		fNosaukums = "("+Vards.getText()+" "+Uzvards.getText()+") Èeks";
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
			
			String txt=PicasVeiduUzkratuve+"\nCena par piegâdi: "+piegCena+"€\nKopçja cena par visu: "+cena+"\nKopçjâ cena par visu ar PVN: "+cena/100*79+"\nPersonas Telefona nummurs: "+TelefonaNum.getText()+"\nPersonas vârds un uzvârds: "+Vards.getText()+" "+Uzvards.getText();
			
			pw.println(txt);
			pw.close();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Radâs kïûda veidojot èeku!","Kïûda",JOptionPane.ERROR_MESSAGE);
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
			JOptionPane.showMessageDialog(null, "Kïûda apskatot èeku!","Kïûda",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	public static void PicasPasutijums(String PicasVeiduUzkratuve, JTextField Adresse, JTextField TelefonaNum, JTextField Vards, JTextField Uzvards,double cena){
		
		
		
		int sk=0;
		
		String []izmers1={"Lielâ-8.99€","Videjâ-7.99€","Mazâ-6.99€"};
		 String []izmers2={"Lielâ-10.99€","Videjâ-8.99€","Mazâ-6.99€"};
		 String []izmers3={"Lielâ-8.59€","Videjâ-7.79€","Mazâ-6.99€"};
		String []izmers4={"Lielâ-11.99€","Videjâ-10.99€","Mazâ-9.99€"};
		String []izmers5={"Lielâ-8.69€","Videjâ-6.89€","Mazâ-5.59€"};
		 String []izmers6={"Lielâ-8.99€","Videjâ-7.99€","Mazâ-6.99€"};
		 String []izmers7={"Lielâ-8.99€","Videjâ-7.99€","Mazâ-6.99€"};
		 String []izmers8={"Lielâ-8.99€","Videjâ-7.99€","Mazâ-6.99€"};
		
	int pasutijumuSK = Integer.parseInt(JOptionPane.showInputDialog(null,"Cik picas vçlaties pasûtît?"));
	double []cenuIevade=new double[pasutijumuSK];
	int skaititajs=1;
	
		 do{
		 String[] PicasVeidaIzvele = {"Pica ar sieru","Pica ar annanasiem","Pepperoni","Margarita","Vezuva","Veìitârâ","Pica ar ðíiòíi","Pârlocîtâ"};
		 String PicasVeids =(String) JOptionPane.showInputDialog(null,"Izvçlieties "+skaititajs+". picas veidu: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,PicasVeidaIzvele,PicasVeidaIzvele[0]);
		
		 String PicasIzmers = null;
		
		  
		  
		 switch(PicasVeids){
		 case "Pica ar sieru":
			 
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izvçlieties picas izmçru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers1,izmers1[1]);
			
			 if(PicasIzmers=="Lielâ-8.99€")
			 cena+=8.99;
			 else if(PicasIzmers=="Videjâ-7.99€")
				 cena+=7.99;
			 else if(PicasIzmers=="Mazâ-6.99€")
				 cena+=6.99;
			 break;
			 
		 case "Pica ar annanasiem":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izvçlieties picas izmçru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers2,izmers2[1]);
				
			 if(PicasIzmers=="Lielâ-10.99€")
			 cena+=10.99;
			 else if(PicasIzmers=="Videjâ-8.99€")
				 cena+=8.99;
			 else if(PicasIzmers=="Mazâ-6.99€")
				 cena+=6.99;
			 break;
			 
		 case "Pepperoni":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izvçlieties picas izmçru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers3,izmers3[1]);
				
			 if(PicasIzmers=="Lielâ-8.59€")
			 cena+=8.59;
			 else if(PicasIzmers=="Videjâ-7.79€")
				 cena+=7.79;
			 else if(PicasIzmers=="Mazâ-6.99€")
				 cena+=6.99;
			 
			 break;
			 
		 case "Margarita":
			 
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izvçlieties picas izmçru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers4,izmers4[1]);
				
			 if(PicasIzmers=="Lielâ-11.99€")
			 cena+=11.99;
			 else if(PicasIzmers=="Videjâ-10.99€")
				 cena+=10.99;
			 else if(PicasIzmers=="Mazâ-9.99€")
				 cena+=9.99; 
			
			 break;
			 
		 case "Vezuva":
			 
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izvçlieties picas izmçru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers5,izmers5[1]);
				
			 if(PicasIzmers=="Lielâ-8.69€")
			 cena+=8.69;
			 else if(PicasIzmers=="Videjâ-6.89€")
				 cena+=6.89;
			 else if(PicasIzmers=="Mazâ-5.59€")
				 cena+=5.59;
			 break;
			 
		 case "Veìitârâ":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izvçlieties picas izmçru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers6,izmers6[1]);
				
			 if(PicasIzmers=="Lielâ-8.99€")
			 cena+=8.99;
			 else if(PicasIzmers=="Videjâ-7.99€")
				 cena+=7.99;
			 else if(PicasIzmers=="Mazâ-6.99€")
				 cena+=6.99;
			 break;
			 
		 case "Pica ar ðíiòíi":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izvçlieties picas izmçru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers7,izmers7[1]);
				
			 if(PicasIzmers=="Lielâ-8.99€")
			 cena+=8.99;
			 else if(PicasIzmers=="Videjâ-7.99€")
				 cena+=7.99;
			 else if(PicasIzmers=="Mazâ-6.99€")
				 cena+=6.99;
			 break;
			 
		 case "Pârlocîtâ":
			
			 PicasIzmers =(String) JOptionPane.showInputDialog(null,"Izvçlieties picas izmçru: ","Informacija",JOptionPane.INFORMATION_MESSAGE,null,izmers8,izmers8[1]);
				
			 if(PicasIzmers=="Lielâ-12.99€")
			 cena+=12.99;
			 else if(PicasIzmers=="Videjâ-10.49€")
				 cena+=10.49;
			 else if(PicasIzmers=="Mazâ-8.99€")
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
		

	  Object [] Dati = {"Adresse: ",Adresse,"Telefona nummurs:",TelefonaNum,"Vards:",Vards,"Uzvârds:",Uzvards };
	    JOptionPane.showConfirmDialog(null,Dati,"Jautâjums",JOptionPane.OK_CANCEL_OPTION);
		
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
		
		String[] switchMetodes = {"Pasûtît picu","Apskatît èeku","Beigt darbu."};
		
		do{
       metodesIndekss = (int) JOptionPane.showOptionDialog(null, "Izvçlies darbîbu","Izvçle",0,3,null,switchMetodes,switchMetodes[0]);
				
				switch(metodesIndekss){
				case 0:
					String [] PasutijumaOpcijas={"Uz vietas","Piegâde"};
					int PasutijumaVeids= JOptionPane.showOptionDialog(null, "Izvçlies darbîbu","Izvçle",0,3,null,PasutijumaOpcijas,PasutijumaOpcijas[0]);
					
					if(PasutijumaVeids==1){
						attalums=Integer.parseInt(JOptionPane.showInputDialog(null,"Cik tâlu jûs dzîvojat?(km)"));
						
						if(attalums<=5){
							cena+=1.10;
						JOptionPane.showMessageDialog(null,"Jûsu cena par pasûtijumu piegadi bûs 1.10€");
						}else if(attalums>5&&attalums<=10){
							cena+=1.60;
							JOptionPane.showMessageDialog(null,"Jûsu cena par pasûtijumu piegadi bûs 1.60€");
					}else if(attalums>10&&attalums<=15){
							cena+=2.30;
							JOptionPane.showMessageDialog(null,"Jûsu cena par pasûtijumu piegadi bûs 2.30€");
					}else if(attalums>15&&attalums<=20){
							cena+=5.10;
							JOptionPane.showMessageDialog(null,"Jûsu cena par pasûtijumu piegadi bûs 5.10€");
				}else if(attalums>20){
							cena+=7.25;
							JOptionPane.showMessageDialog(null,"Jûsu cena par pasûtijumu piegadi bûs 7.25€");
							
				}
					}
					PicasPasutijums(PicasVeiduUzkratuve,Adresse,TelefonaNum,Vards,Uzvards,cena);
					break;
					
				case 1:
					if(PicasVeiduUzkratuve==" "){
						JOptionPane.showMessageDialog(null, "Jûms nav pasûtîjums!");
					}else{
					ierakstit(PicasVeiduUzkratuve,Adresse,TelefonaNum,Vards,Uzvards,attalums,cena);
					apskatit();
					}
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Jûs izgâjât no picçrijas!");
					break;
				
	}
		}while(metodesIndekss!=2);
}
}
