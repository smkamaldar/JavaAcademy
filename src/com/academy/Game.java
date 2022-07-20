package com.academy;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
    private final HashMap<String, Integer> container = new HashMap<String, Integer>();

    public Game() {
        container.put("fizz", 0);
        container.put("buzz", 0);
        container.put("fizzBuzz", 0);
    }

    public String fizzBuzz(int num) {

        if ((num % 3 == 0) && (num % 5 == 0)) {
            return "fizzBuzz";
        } else if (num % 3 == 0) {
            return "fizz";
        } else if (num % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(num);
    }

    public String fizzBuzz(int num1, int num2) {
        if (num2 < num1) {
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        for (int i = num1; i <= num2; i++) {
            String result = fizzBuzz(i);
            try{
                container.put(result, container.get(result) + 1);
            }
            catch(Exception e){

            }
        }

        return String.format("fizz: %d, buzz: %d, fizzBuzz: %d",
                container.get("fizz"),
                container.get("buzz"),
                container.get("fizzBuzz"));

    }

    public String fizzBuzz() {
        System.out.println("Please provide two numbers :");
        Scanner input1 = new Scanner(System.in);
        String number1 = input1.next();
        int num1 = Integer.parseInt(number1);

        Scanner input2 = new Scanner(System.in);
        String number2 = input2.next();
        int num2 = Integer.parseInt(number2);
        return fizzBuzz(num1, num2);
    }

    public void saveJson() {
//      Gson lib for converting a hashmap to json
        Gson gson = new Gson();
//      getasjsonobject ===>  make json tree to json object
        JsonObject json = gson.toJsonTree(container).getAsJsonObject();
//        write JSON file
        try (FileWriter file = new FileWriter("fizzbuzz.json")) {
            file.write(json.toString());
            file.flush();
//            exception occurs when an IO operation fails
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public void saveXml() throws JAXBException {
//        JAXBContext jaxbContext = JAXBContext.newInstance();
//        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//    }

}
