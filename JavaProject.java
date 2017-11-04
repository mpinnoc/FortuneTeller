import java.util.Scanner;

public class JavaProject
  { 
      public static void main(String[] args)
         {
            
            Scanner keyboard = new Scanner(System.in);
            int choice, num1= 0, num2 =0,luckynum =0, kids, years, i; 
            double salary;
            String name, prefix = "";              


            greetings();   
            
            System.out.println("\nWhat is your name?");
            name = keyboard.nextLine(); 
           
            
            System.out.println("Do you prefer to go by Mr., Ms., Mrs., etc...?");
            prefix = keyboard.nextLine();

              
  
            System.out.println("\nSelect one of the choices below");
            menu();
            System.out.print("\nEnter your choice: ");
            
            choice = keyboard.nextInt();
            
            
            System.out.print("\nPick a number, from 1-10: ");
            num1 = keyboard.nextInt();
            System.out.print("\nPick a number, from 1-10: ");
            num2 = keyboard.nextInt();


            if(num1 % 2 == 0)
               num1 = num1 + 3;
            else
               num1 = num1 - 1;
               
            if(num2 > 5)
               num2 = num2 - 5;
            else
               num2 = num2 + 2;           
               
            while(num1 <0 || num1 > 10)
                     {
                        System.out.println("    Invalid input. Please enter a number larger than 0.\n    Example: 4");
                        System.out.print("\nPick a number, from 1-10: ");
                        num1 = keyboard.nextInt();
                     }
     
   
            System.out.print("\nPick a lucky number, from 1-10: ");
            luckynum = keyboard.nextInt();
            
            while(luckynum <0 ||luckynum > 10)
                     {
                        System.out.println("    Invalid input. Please enter a number larger than 0.\n    Example: 4");
                        System.out.print("\nPick a lucky number, from 1-10: ");
                        luckynum = keyboard.nextInt();
                     }
            
            String[] car = {"Toyota Prius", "Tesla Model S", "Volvo S60", "BMW i8", "Mercedes AMG GT S", "Jeep Wrangler", "Dodge Charger"};
           
               System.out.println("\nSelect a number from 0-6:");
               i = keyboard.nextInt();
               
               while(i < 0 || i > 6)
                  {
                     System.out.println("\nPlease select a number from 1-6");
                     i = keyboard.nextInt();                  
                  }

            
            System.out.println("\n" + prefix + " " + name +"," + "\nHere's what we have to say about your personality:");   
            
            switch (choice)
             {
               case 1: 
                  System.out.println("\n  Blue: If blue is your favorite color you love harmony, are reliable, sensitive and always make an effort to think of others. \n    You like to keep things clean and tidy and feel that stability is the most important aspect in life.");
                     break;
               case 2: 
                  System.out.println("\n  Green: Those who love the color green are often affectionate, loyal and frank. \n      Green lovers are also aware of what others think of them and consider their reputation very important.");
                     break;
               case 3: 
                  System.out.println("\n  Yellow: You enjoy learning and sharing your knowledge with others. \n      Finding happiness comes easy to you and others would compare you to sunshine. ");
                     break;
               case 4: 
                  System.out.println("\n  Red: Those who love red live life to the fullest and are tenacious and determined in their endeavors.");
                     break;
               case 5: 
                  System.out.println("\n  Purlpe: You are artistic and unique.  You have a great respect for people but at times can be arrogant.");
                     break;
               case 6: 
                  System.out.println("\n  Black: People who choose black as their favorite color are often artistic and sensitive.  \n    While these people aren't introverts, they are careful with the details of their lives and do not share easily with others. ");
                     break;
               case 7: 
                  System.out.println("\n  Brown: You are a good friend and try your hardest to be reliable and dependable.  \n      Flashy objects are not something you desire; you just want a stable life.");
                     break;
               case 8: 
                  System.out.println("\n  White: People who like white are often organized and logical and don't have a great deal of clutter in their lives. ");
                     break;
               default:
                  System.out.println("    Error. Please select one of the choices below\n");
              } 
            
           
            years = showYears(num2);
            System.out.println("\nIn the next " + years + " years..."); 
            
                        
            System.out.print("\n    You will be the owner of a " + car[i]);
        
            
            kids = showKids(num1);
            if(kids == 1)
               System.out.print("\n    You will have " + kids + " child");
            else
               System.out.print("\n    You will have " + kids + " children.");
            
            
                          
            switch (luckynum)
             {
                case 1:
                  System.out.println("\n    You will have a career as a Teacher.");
                  salary= showSalary(num1,  num2,  luckynum, i);
                  System.out.println("With a starting pay of $" + salary); 
                     break;
                case 2:
                  System.out.println("\n    You will have a career as a Computer Programmer");
                  salary= showSalary(num1,  num2,  luckynum, i);
                  System.out.println("    With a starting pay of $" + salary); 
                     break;
                case 3:
                  System.out.println("\n    You will have a career as an Engineer");
                  salary= showSalary(num1,  num2,  luckynum, i);
                  System.out.println("    With a starting pay of $" + salary); 
                     break;
                case 4:
                  System.out.println("\n    You will have a career as a Mechanic");
                  salary= showSalary(num1,  num2,  luckynum, i);
                  System.out.println("    With a starting pay of $" + salary); 
                     break;
                case 5:
                  System.out.println("\n    You will have a career as a Public Healh Administator");
                  salary= showSalary(num1,  num2,  luckynum, i);
                  System.out.println("    With a starting pay of $" + salary); 
                     break;
                case 6:
                  System.out.println("\n    You will have a career as a Surgeon");
                  salary= showSalary(num1,  num2,  luckynum, i);
                  System.out.println("    With a starting pay of $" + salary); 
                     break;
                case 7:
                  System.out.println("\n    You will have a career as a Police Officer");
                  salary= showSalary(num1,  num2,  luckynum, i);
                  System.out.println("    With a starting pay of $" + salary); 
                     break;
                case 8:
                  System.out.println("\n    You will be the President of the United States");
                  salary= showSalary(num1,  num2,  luckynum, i);
                  System.out.println("    With a starting pay of $" + salary); 
                     break;
                case 9:
                  System.out.println("\n    You will have a career as an Architecture");
                  salary= showSalary(num1,  num2,  luckynum, i);
                  System.out.println("    With a starting pay of $" + salary); 
                     break;
                case 10:
                  System.out.println("\n    You will have a career as a NBA Player");
                  salary= showSalary(num1,  num2,  luckynum, i);
                  System.out.println("    With a starting pay of $" + salary); 
                     break;
                default:
                  System.out.println("\n    You will be unemployed.");

               }
                
               quitProgram();                             
         }
    
         public static void greetings()
            {
               System.out.println("This is a fortuneteller program that will give insight to your future and tell you about your personality.");
            }
         public static void menu()
            {
               System.out.println(" 1. Blue");
               System.out.println(" 2. Green");
               System.out.println(" 3. Yellow");
               System.out.println(" 4. Red");
               System.out.println(" 5. Purple");
               System.out.println(" 6. Black");
               System.out.println(" 7. Brown");
               System.out.println(" 8. White ");
            }
         public static int showKids(int num1)
            {
             int kids;
             kids = num1 * 3;
             return kids;
            }
         public static int showYears(int num2)
            {
             int years;
             years = num2 * 4;
             return years;
            }
         public static double showSalary( int num1, int num2, int luckynum, int i)
            {
             double salary;
             salary = 85000.0 + (num1 * num2 / i  * luckynum);
             return salary;
            }
         public static void quitProgram()
             {
               System.out.println("Goodbye!");
             }
      }
