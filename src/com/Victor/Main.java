package com.Victor;

import com.Victor.pojo.Box;
import com.Victor.pojo.Cat;

import static com.Victor.pojo.Cat.getCountOfCats;

public class Main {

    public static void main(String[] args) {
	// write your code here
//

//        Cat cat;
//        for(int i = 0; i<1000; i++){
//            new Cat();
//        }
//
//        Cat cat1 = new Cat();
//
//        System.out.println(Cat.getCountOfCats());
//        System.out.println(Cat.TAG);



        Object obj = new Cat();
        Object obj1 = new Box();

        printClassName(obj);

        getCountOfCats();


        //System.out.println(cat.);

    }

    private static void printClassName(Object obj){
        if(obj instanceof Cat){
            System.out.println("Cat");
           int a = ((Cat) obj).age;
        }else if(obj instanceof Box){
            System.out.println("Box");
        }else{
            System.out.println("Main");
        }
    }
}
