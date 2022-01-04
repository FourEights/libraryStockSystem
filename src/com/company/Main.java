package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    private static File myFile = new File("libraryList.txt"); //Change to something sensible
    private static Scanner deleteQuery = new Scanner(System.in);
    private static ArrayList<String> bookTitles = new ArrayList<String>();
    private static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("If you need to create a new file, click [Y]. If you already have one, click [N].");
        String createNew = inputScanner.nextLine(); //assigns the answer for addAnother to the variable
        if (createNew.equals("Y")) {
            CreateFile();
        }



        try { //try|catch error check initiation
            boolean addNewBook = true;
            while (addNewBook == true) { //initiate a loop that continues until they want to stop adding books

                GetTitle();
                GetAuthor();
                GetISBN();
                GetGenre();


                System.out.println("Would you like to add another book? Y/N");
                String addAnother = inputScanner.nextLine(); //assigns the answer for addAnother to the variable
                if (addAnother.equals("N")) {
                    addNewBook = false; //if they don't want to add another, end the loop.
                }

            }
            String titleList = bookTitles.toString();
            System.out.println(titleList);

        } catch(Exception e){
            System.out.println("An error has occurred!");//try|catch error check
            e.printStackTrace();
        }

    }


    public static void GetTitle() {

        try { //try|catch error check initiation

            System.out.println("Please add a book name.");
            String bookInput = inputScanner.nextLine(); //dumps the book title into the scanner
            bookTitles.add(bookInput); //dumps scanner contents into the array


        } catch (Exception e) {
            System.out.println("An error has occurred!");//try|catch error check
            e.printStackTrace();
        }

    }

    public static void GetAuthor() {

        try { //try|catch error check initiation

            System.out.println("Please add the book's author.");
            String bookInput = inputScanner.nextLine(); //dumps the book title into the scanner
            bookTitles.add(bookInput); //dumps scanner contents into the array


        } catch (Exception e) {
            System.out.println("An error has occurred!");//try|catch error check
            e.printStackTrace();
        }

    }

    public static void GetISBN() {

        try { //try|catch error check initiation

            System.out.println("Please add the book's ISBN.");
            String bookInput = inputScanner.nextLine(); //dumps the book title into the scanner
            bookTitles.add(bookInput); //dumps scanner contents into the array


        } catch (Exception e) {
            System.out.println("An error has occurred!");//try|catch error check
            e.printStackTrace();
        }

    }

    public static void GetGenre() {

        try { //try|catch error check initiation

            System.out.println("Please add the book's genre.");
            String bookInput = inputScanner.nextLine(); //dumps the book title into the scanner
            bookTitles.add(bookInput); //dumps scanner contents into the array


        } catch (Exception e) {
            System.out.println("An error has occurred!");//try|catch error check
            e.printStackTrace();
        }

    }

    public static void CreateFile() {
        try {
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void WriteToFile() {
        try {
            FileWriter myWriter = new FileWriter(myFile.getName(), true); //True means append to file contents, False means overwrite
            System.out.println("This is the contents of the file:");
            myWriter.write(""); //makes a space between each book
            myWriter.write(bookTitles.get(0)); // adds the current list to the file
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}

