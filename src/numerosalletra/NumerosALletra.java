package numerosalletra;
import java.util.*;


public class NumerosALletra {
public static Scanner teclado=new Scanner(System.in);
   
    public static void main(String[] args) {
        
        for(int i =1; i <= 222 ; i++){
        System.out.println(tresDigitsEnLletres(i));
        
        }
        
        
       
        System.out.println("Dime:");
        long numerodefinitiu=teclado.nextLong();
        int numero=(int) numerodefinitiu;
        int n_digits=contarNumeros(numero);

        
        do{
        
        if(n_digits<=3){
            String tresNumeros=tresDigitsEnLletres(numero);
            System.out.println(tresNumeros);
        }
        else if(n_digits  > 3 && n_digits <= 6){
            String sisNumeros=sisDigitsEnLletres(numero);
            System.out.println(sisNumeros);
        }
        else if(n_digits >6 && n_digits <=18){
            String moltNumeros=quantitatEnLletres(numerodefinitiu);
            System.out.println(moltNumeros);

            }
        }while(numerodefinitiu!=0);
    }
    
  

public static int digitUnitats(int q){
        return q%10;
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
    
    
    public static String desenaEnLletres(int des,int unit){
        
        switch(des){
            case 1:
                switch(unit){
                    case 1:
                return "onze";
                    case 2:
                return "dotze";
                    case 3:
                return "tretze";
                    case 4:
                return "catorze";
                    case 5:
                return "quinze";
                    case 6:
                return "setge";
                    case 7:
                return "deset";
                    case 8:
                return "dibuit";
                    case 9:
                return "deneu";
                
                default:
                    return "deu";
                
                 }
            case 2:
		    return "vint-i-";
            case 3:
		    return "trenta-";
            case 4:
		    return "quaranta-";
            case 5:
		    return "cincuanta-";
            case 6:
		    return "sisanta-";
            case 7:
		    return "setanta-";
            case 8:
		    return "huitanta-";
            case 9:
		    return "noranta-";
            
            default:
		return "";
            
        }
    }
    
    
public static String centenesEnLletra(int centena){
    switch(centena){
        case 1:
    return "cent ";
        case 2:
    return "dos-cents ";
        case 3:
    return "tres-cents ";
        case 4:
    return "cuatre-cents ";
        case 5:
    return "cinc-cents ";
        case 6:
    return "sis-cents ";
        case 7:
    return "set-cents ";
        case 8:
    return "huit-cents ";
        case 9:
    return "nou-cents ";
        
        default:
    return "";
        
    }
}
    
    
 public static String tresDigitsEnLletres(int q3){

    int centenes=digitCentenes(q3);
    int unitat =digitUnitats(q3);
    int desena=digitDesenes(q3);

    String cente=centenesEnLletra(centenes);
    String unit=digitEnLLetres(unitat);
    String dese=desenaEnLletres(desena, unitat);
   
    if(desena==1){
        
        String frase2=cente+dese;
        return frase2;
    }
    else{
        String frase3=cente+dese+unit;
        return frase3;
        
    }
 } 
    
public static int contarNumeros(int num){
   String contador=num+"";
   int digitstotals=contador.length();
   return digitstotals;

} 
public static long contarNumerosLlargs(long num){
    String contador=num+"";
    long digitstotals=contador.length();
    return digitstotals;
}
    
public static String sisDigitsEnLletres(int q6){
    int n_digits=contarNumeros(q6);
    int grup1=q6%1000;
    int grup2=q6/1000;
    String fraseG1=tresDigitsEnLletres(grup1);
    String fraseG2=tresDigitsEnLletres(grup2);
            
    String fraseSisDigits=fraseG2+" mil "+fraseG1;
    return fraseSisDigits;
}    
    
    
    
public static int grupDeSisDigits(long q18,int grup){
    
    long n_numeros=contarNumerosLlargs(q18);
    if(n_numeros>12){
        long primerGrup=q18%1000000;
        long segonGrup=(q18/1000000)%1000000;
        long tercerGrup=(q18/1000000)/1000000;
        
        switch(grup){
        case 1:
            int firstGroup=(int)primerGrup;
            return firstGroup;
        case 2:
            int secondGroup=(int)segonGrup;
            return secondGroup;
        case 3:
            int tercerdGroup=(int)tercerGrup;
            return tercerdGroup;  
        default:
            return 1;
         
    }
        
    }
    
    long primerGrup=q18%1000000;
    long segonGrup=q18/1000000;
    long tercerGrup=segonGrup/1000000;
       
    switch(grup){
        case 1:
            int firstGroup=(int)primerGrup;
            return firstGroup;
        case 2:
            int secondGroup=(int)segonGrup;
            return secondGroup;
        case 3:
            int tercerdGroup=(int)tercerGrup;
            return tercerdGroup;  
        default:
            return 1;
         
    }
        
    
  

}    
    
    
public static String quantitatEnLletres(long q18){
    long cant_digits=contarNumerosLlargs(q18);
    
    if(cant_digits>6 && cant_digits<=12){
       int grupUno=grupDeSisDigits(q18,1);
       int grupDos=grupDeSisDigits(q18,2);
       
       String fraseUno=sisDigitsEnLletres(grupUno);
       String fraseDos=sisDigitsEnLletres(grupDos);
       
       String fraseCompleta=fraseDos+" millons "+fraseUno;
       return fraseCompleta;
    }
    else if(cant_digits>6 && cant_digits<=18 ){
       int grupUno=grupDeSisDigits(q18,1);
       int grupDos=grupDeSisDigits(q18,2);
       int grupTres=grupDeSisDigits(q18,3);
       
       String fraseUno=sisDigitsEnLletres(grupUno);
       String fraseDos=sisDigitsEnLletres(grupDos);
       String fraseTres=sisDigitsEnLletres(grupTres);

       String fraseCompleta=fraseTres+" billions "+fraseDos+" millons "+fraseUno;
       return fraseCompleta;
    }
    
    return "error";
    
    
    
}    
 



}