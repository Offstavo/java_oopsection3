//Composition in oop "Using classes inside another class"
package com.example.oopsection3;

public class Main {
    public static void main(String[] args) {
        //Comment all the code below except methods
//        Engine engine = new Engine("Renault",8000);
//        Car mercedes = new Car("Merceds AMG",2,"Silver",engine);


        //Comment all the code below if you wish to use this section
        //Altenatively
        Car mercedes = new Car("Merceds AMG",2,"Silver",new Engine("Renault",8000));
        System.out.println(mercedes.getName());
        Engine engine = mercedes.getEngine();
        System.out.println("Engine Model: "+ mercedes.getEngine().getModel());

        //comment all the code above if you wish to use this section
        //    Car mercedes = null; whenever an object is set to null you cannot use its methods
//        mercedes.getName();


    }
}

//    final int a = 5;//You cannot change the value of this variable
//    final Engine engine = new Engine("Renault",7000);
//        engine.setRpm(10000);//However we can change the properties of engine we just cant change the whole instance


