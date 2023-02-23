package Backend;

import javax.swing.JLabel;

public class Validate {
    
    //uses length, presence and format check
    public static boolean validateSpeciesName(String species_name, JLabel error_label){
        
        char [] arr  = species_name.toCharArray();
        
        //format check for numbers, spaces or special characters
        //cant have numbers in name
        //cannot have any special characters in name
        //cannot have whitespace in name
        
        for(int i = 0; i < arr.length;i++){
            
            if(Character.isDigit(arr[i])){
                error_label.setText("Pokemon name cannot contain a number");
                return false;
                
            }
            else if(Character.isSpaceChar(arr[i])){
                error_label.setText("Pokemon name cannot contain a space");
                return false;
            }
            else if(!Character.isAlphabetic(arr[i])){
                error_label.setText("Pokemon name cannot contain a special Character");
                return false;
            }
              
        }

        //name box must be filled in, so species name cannot be blank
        if(species_name.equals(null)){
            error_label.setText("please enter a name");
            return false;
        }        
        
        //name must be at least 5 characters long and less than 20 characters long.
        if(species_name.length() < 5 | species_name.length() > 20){
            error_label.setText("name must be less than 20 characters and greater than 5 characters");
            return false;
        }
        

        
        //otherise we return true;
        error_label.setText("");
        return true;
    }
    
    public boolean checkSpeciesWeight(){
        
        
        
    }
    
}
