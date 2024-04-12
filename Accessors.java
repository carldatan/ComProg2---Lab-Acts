public class Accessors{
    private String name;
    private int age;
    private String gender;

    public Accessors(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }

    public static void main(String args[]) {
       Accessors p1 = new Accessors("Justinn Adrian Modrigo", "Male", 18);
       System.out.println("Hi! My name is " + p1.getName () + ", " + p1.getAge() + " and I'm a " + p1.getGender());
        
    } 
}