/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
//clean code
//encapsulation: to make the variacle safe
//constractor: same class value, function, no return value
//more than constractor(constractor over loading)
//default constractor
public class Person {
    private String name;
    private int age;
    
    public void sayHello(){
            System.out.println("hello,my name is atta");
        
}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;  //shadowing "adding "this" when local variable same instance value
    }
}
