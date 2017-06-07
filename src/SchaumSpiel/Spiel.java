package SchaumSpiel;

public class Spiel {

 
    public static void main(String[] args) {
        
        int pone;
        int ptwo;
        String one = " ";
        String two = " ";
        String win = " ";
        
        pone = (int) (Math.random() * 3);   //durch jbutton ersetzen
        ptwo = (int) (Math.random() * 3);   // durch jbutton ersetzen
        
        switch(pone){
        case 0:
        one = "Schere";  
        break;
        
        case 1:
        one = "Stein";
        break;
        
        case 2:    
        one = "Papier";
        break;
        
        
         
        
        }
         
        System.out.println("Du hast " + one + "!");
       
        switch(ptwo){
        case 0:
        two = "Schere";  
        break;
        
        case 1:
        two = "Stein";
        break;
        
        case 2:    
        two = "Papier";
        break;
        
        
        }
        
        System.out.println("Dein Gegner hat " + two + "!");
        
        switch(pone){
        
        case 0:
        
        if(pone == 0 && ptwo == 2 || pone == 0 && ptwo == 3){
            win = "Du hast gewonnen!";
        }
        else{
           if(pone == 0 && ptwo == 1 || pone == 0 && ptwo == 4){
              win = "Du hast verloren!";
           }
           else{
              win = "Unentschieden!";
           } 
        }
        break;
        case 1:
        
        if(pone == 1 && ptwo == 0 || pone == 1 && ptwo == 3){
            win = "Du hast gewonnen!";
        }
        else{
           if(pone == 1 && ptwo == 2 || pone == 1 && ptwo == 4){
              win = "Du hast verloren!";
           }
           else{
              win = "Unentschieden!";
           } 
        }
        break;
        case 2:
        
        if(pone == 2 && ptwo == 1 || pone == 2 && ptwo == 4){
            win = "Du hast gewonnen!";
        }
        else{
           if(pone == 2 && ptwo == 0 || pone == 2 && ptwo == 3){
              win = "Du hast verloren!";
           }
           else{
              win = "Unentschieden!";
           } 
        }
        break;
        
       
        }
           
        System.out.println(win);
        
    }
}
