import javax.swing.JOptionPane;


public class DominoPicerija {
	
	static void PicasPasutijums(){
String[] PicasVeids = {"Pica ar sieru","Pica ar annanasiem","Pepperoni","Margarita","Vezuva","Ve�it�r�","Pica ar ��i��i","P�rloc�t�"};
      int IzveletaisPicasVeids = (int) JOptionPane.showOptionDialog(null, "Izv�lies picas veidu","Izv�le",0,3,null,PicasVeids,PicasVeids[0]);
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
