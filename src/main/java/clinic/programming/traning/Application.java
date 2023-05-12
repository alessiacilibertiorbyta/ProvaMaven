package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
	
	public int countWords(String words){
		String[] eparateWords = StringUtils.split(words,' ');
		return (separateWords == null) ? 0 : separateWords.lenght;
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	int sount = app.countWords("I have four words");
	System.out.println("Word Count: "+count);
    }
}