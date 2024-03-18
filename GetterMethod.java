public class JavaApplication3 {
    private String name;
    private int age;
    private String gender;
    
    public JavaApplication3(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
                
    }
    public String getName(){
        return name;
    }
    public String getgender(){
        return gender;
    }
    public int getage(){
        return age;
    }

    public static void main(String[] args) {
       JavaApplication3 person = new JavaApplication3("carl andrey",18,"male");
        System.out.println(" Name " + person.getName() + " age " +person.getage() + " gender " + person.getgender());
    }
    
}
