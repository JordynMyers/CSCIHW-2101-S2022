package HW3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        //CLASSNAME NAME = new CLASSNAME();
        Pyramid py = new Pyramid();
        // Pyramid.Output();
        // To call a method once an object is created
        // NAME.METHODNAME(PARAMETERS);
        py.Output();
        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        //story(String name, int age, String favoriteColor)
        Adlibs ad = new Adlibs();
        System.out.println(ad.story("Jordyn",20,"Purple"));
        
        
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        //charReplace(String s, int x, char z)
        // charReplace("I MAKE BREAD",2,'T')
        // EX: I MAKE BREAD, 2, T
        //     I TAKE BREAD
        Replace re = new Replace();
        System.out.println(re.charReplace("I MAKE BREAD",2,'T'));
        
      
        
    }
}
