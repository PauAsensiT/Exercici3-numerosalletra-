package numerosalletra;

/**
 *
 * @author pau
 */
public class NumerosALletra {

   
    public static void main(String[] args) {
        
        
    }
    
    /**
     * 
     * @param q Numero del que volem saber els digits que te.
     * @return Retorna el numero de digits que te : 1 , 2 o 3 ....
     */
    public static int digitUnitats(int q){
        if(q<10)
            return 1;
        
        return 1+digitUnitats(q/10);
    }
    
    
    public static int digitDesenes(int q){
       q = q /10;
       return q%10;
        
    }
    
    public static int digitCentenes(int q){
        
        q = q /100;
       return q%100;
    }
    
    public static  String digitEnLLetres(int dig){
        
        switch(dig){
            case 1:
		return "uno";
            case 2:
		return "dos";
            case 3:
		return "tres";
            case 4:
		return "cuatre";
            case 5:
		return "cinc";
            case 6:
		return "sis";
            case 7:
		return "set";
            case 8:
		return "huit";
            case 9:
		return "nou";
            
            default:
		return "";
            
        }
    }
    
    
    public static String desenaEnLletres(int des){
        
        switch(des){
            case 1:
		return "deu";
            case 2:
		return "vint";
            case 3:
		return "trenta";
            case 4:
		return "quaranta";
            case 5:
		return "cincuanta";
            case 6:
		return "sisanta";
            case 7:
		return "setanta";
            case 8:
		return "huitanta";
            case 9:
		return "noranta";
            
            default:
		return "";
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
