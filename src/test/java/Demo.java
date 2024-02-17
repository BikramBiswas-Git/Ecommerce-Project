public class Demo {
    public static void main(String[] args) {
        String input = "BikramBiswas";
        StringBuilder result = removeOddCharacters(input);
        System.out.println(result);
    }

    public static StringBuilder removeOddCharacters(String input) {
    	StringBuilder result = new StringBuilder();
		for(int i=0;i<input.length();i++) {
			if(i%2==0) {
				result.append(input.charAt(i));
		    }
			}
		 return result;
		}
    
   
    }


