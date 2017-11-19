package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Scanner scanner2 = new Scanner(System.in);
    private static Scanner scanner3 = new Scanner(System.in);
    private static Scanner scanner4 = new Scanner(System.in);
    private static MobilePhone m = new MobilePhone();

    public static void main(String[] args) {
            boolean quit = false;
            int choice = 0;
            while(!quit) {
                printInstructions();
                System.out.println("Enter your choice: " );
                choice = scanner.nextInt();
                scanner.nextLine();

                switch(choice) {
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        m.printContacts();
                        break;
                    case 2:
                        addContact();
                        break;
                    case 3:
                        modifyContact();
                        break;
                    case 4:
                        removeContact();
                        break;
                    case 5:
                        searchContact();
                        break;
                    case 6:
                        quit = true;
                        break;
                }
            }
        }


        public static void printInstructions(){
            System.out.println("\n\nRemy Mobile");
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - To print your list of contacts");
            System.out.println("\t 2 - To add a contact");
            System.out.println("\t 3 - To modify a contact");
            System.out.println("\t 4 - To remove a contact");
            System.out.println("\t 5 - To search for an contact.");
            System.out.println("\t 6 - To quit the application.");
        }

        public static void addContact() {
        System.out.print("Please enter the contact number: \n");
        String tempNumber = scanner.nextLine();
        System.out.print("Please enter the contact name: \n");
        String tempName = scanner2.nextLine();
        m.addContact(tempNumber, tempName);
        }

        public static void modifyContact(){
            System.out.print("How would you like to search for the position to change? \nPress 1 for Name, 2 for Position and any other key to cancel \n");
            int choice = scanner.nextInt();
            if(choice == 1){
                System.out.print("Please enter the name of the contact you would like to change \n");
                String searchName = scanner2.nextLine();
                System.out.print("Please enter the new name of the contact you would like to add \n");
                String setName = scanner3.nextLine();
                System.out.print("Please enter the phonenumber of the contact you would like to add \n");
                String phonenumber = scanner4.nextLine();
                m.modifycontactName(searchName, phonenumber, setName);
            } else if(choice == 2){
                System.out.print("Please enter the position of the contact you would like to change \n");
                int position = scanner.nextInt();
                System.out.print("Please enter the new name of the contact you would like to add \n");
                String setName = scanner2.nextLine();
                System.out.print("Please enter the phonenumber of the contact you would like to add \n");
                String phonenumber = scanner3.nextLine();
                m.modifycontactPosition(position, phonenumber, setName);
                }
            }

        public static void removeContact(){
            System.out.print("Who do you want to remove? (Insert a name or part of a name) \n");
            String delName = scanner.nextLine();
            m.removeContact(delName);
        }

        public static void searchContact(){
            System.out.print("Who do you want to find? (Insert a name or part of a name) \n");
            String searchName = scanner.nextLine();
            m.SearchContacts(searchName);

        }
    }
