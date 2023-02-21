package Backend;

public class Validate {
    
    public static void main(String[] args) {

        validateSpeciesName("Pi%kachu");
        
    }
    
    public static boolean validateSpeciesName(String species_name){
        
        char [] arr  = species_name.toCharArray();
        for(int i = 0; i < arr.length;i++){
            
            if(Character.isDigit(arr[i])){
                System.out.println("Pokemon name cannot contain a number");
                return false;
                
            }
            else if(Character.isSpaceChar(arr[i])){
                System.out.println("Pokemon name cannot contain a space");
                return false;
            }
            else if(!Character.isAlphabetic(arr[i])){
                System.out.println("Pokemon name cannot contain a special Character");
                return false;
            }
              
        }
        //cant have numbers in name
        //cannot have any special characters in name
        //cannot have whitespace in name
        
        return true;
    }
    
    //need a height and weight check
    
    
}
