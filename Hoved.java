import static javax.swing.JOptionPane.*;

public class Hoved{
	public static void main(String[] args){
		int rader = Integer.parseInt(showInputDialog(null, "antall rader: "));
		int kolonner = rader;
		String symbol = showInputDialog(null, "tast inn ett symbol");
		for (int i = 0; i < rader; i++){
			for (int j = 0; j < kolonner; j++){
				if (i < (rader/2)){
					if (j < (kolonner/2)-i){
						System.out.print(" ");
					} else if (j > (kolonner/2)+i){
						System.out.print(" ");
					} else {
						System.out.print(symbol); 
					}
				} else if (i > (rader/2)){ 
					if (j < i-(kolonner/2)){  
						System.out.print(" "); 
					} else if (j > (kolonner-i)+(rader/2)-1){
						System.out.print(" ");
					} else {
						System.out.print(symbol); 
					}
				} else {
						System.out.print(symbol); 
					}
			}
			System.out.println("");
		}
		
	}
}
