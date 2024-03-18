package javaapplication4;

/**
 *
 * @author Administrator
 */
public class JavaApplication4 {
    private String name;
public JavaApplication4(String name){ 
    this.name = name;
}
public String getName(){
    return name;
}
public void setName(String newName){
    this.name = newName;
}    

    public static void main(String[] args) {
        JavaApplication4 person = new JavaApplication4("carl andrey");
        System.out.println("Original name: " + person.getName());
        person.setName("alice");
        System.out.println("Modified Name: " + person.getName());
       
    }
    
}
