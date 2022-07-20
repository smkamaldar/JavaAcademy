/*
Create a method called fizzBuzz( ) :
GIVEN an integer input which is divisible by 3WHEN fizzBuzz is calledTHEN return “Fizz”
*
GIVEN an integer input which is divisible by 5WHEN
 fizzBuzz is calledTHEN return “Buzz”

GIVEN an integer input which is divisible by 3 and 5WHEN
fizzBuzz is calledTHEN return “FizzBuzz”

GIVEN an integer input which is not divisible by 3 or 5WHEN
fizzBuzz is calledTHEN return the input as a String value
* */
package com.academy;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
//        result = game.fizzBuzz(15);
//        result = game.fizzBuzz(3,10);
        String result;
        result = game.fizzBuzz();
        System.out.println("Result is ==> " + result);
        game.saveJson();


    }
}




//      ********************  for passing arg from program args ********************************8
//        for(int i = 0; i<args.length; i++) {
////            System.out.println("args[" + i + "]: " + args[i]);
//            Game game = new Game();
//           result = game.fizzBuzz(Integer.parseInt(args[i]));
//            System.out.println("Result is : " + result);
//        }
