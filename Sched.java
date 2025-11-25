import java.util.Scanner;
public class Sched {

    public static void main(String[] args) {
      
        String cho,note;
        

        Scanner in=new Scanner(System.in);
        
        System.out.println("=============");
        System.out.println("[M]onday");
        System.out.println("[T]eusday");
        System.out.println("[W]ednesday");
        System.out.println("{Thu]rsday");
        System.out.println("[F]riday");
        System.out.println("[S]aturday");
        System.out.println("[Sun]day");
        System.out.println("[E]xit");
        System.out.println("=============");
        System.out.print("Choice: ");
        cho=in.nextLine();
        
        if (cho.equalsIgnoreCase("M"))
        {
            System.out.println("Niel's Schedules every Monday");
            System.out.println("============================= ");
            System.out.println("          Afternoon");
            System.out.println("3:30-5:30 = CCE 102 / Laboratory day ");
            System.out.println("5:30-6:30 = Purposive ");
            System.out.println("6:30-7:30 = Modern Math ");
            System.out.println("7:30 = Uwian time ");
            System.out.println("=============================");
            System.out.println("Leave a note fora day : ");
            note=in.nextLine();
            
            
            
        }
        else if (cho.equalsIgnoreCase("T"))
        {
            System.out.println("Niel's Schedules every Teusday");
            System.out.println("============================= ");
            System.out.println("          Morning ");
            System.out.println("============================= ");
            System.out.println("7:00- 11:00 = PAHF 1");
            System.out.println("          Afternoon");
            System.out.println("==============================");
            System.out.println("3:30-5:30 = CCE 102/ Laboratory day ");
            System.out.println("5:30-6:30 = Purposive ");
            System.out.println("6:30-7:30 = Modern Math ");
            System.out.println("7:30 = Uwian time ");
            System.out.println("=============================");
            System.out.println("Leave a note: ");
            note=in.nextLine();
            
        }
        else if (cho.equalsIgnoreCase("W"))
        {
            System.out.println("Niel's Schedules every Wednesday");
            System.out.println("============================= ");
            System.out.println("          Afternoon");
            System.out.println("3:30-5:30 = CCE 102/Lecture day ");
            System.out.println("5:30-6:30 = Purposive ");
            System.out.println("6:30-7:30 = Modern Math ");
            System.out.println("7:30 = Uwian time ");
            System.out.println("=============================");
            System.out.println("Leave a note for a day : ");
            note=in.nextLine();
            
        }
        else if (cho.equalsIgnoreCase("Thu"))
        {
            System.out.println("Niel's Schedules every Wednesday");
            System.out.println("============================= ");
            System.out.println("          Afternoon");
            System.out.println("3:30-5:30 = CCE 102/Research or Self study day");
            System.out.println("5:30-6:30 = Purposive /Quipper");
            System.out.println("6:30-7:30 = Modern Math /Quipper");
            System.out.println("7:30 Free time ");
            System.out.println("=============================");
            System.out.println("Leave a note for a day : ");
            note=in.nextLine();
        }
        else if (cho.equalsIgnoreCase("F"))
        {
            System.out.println("Niel's Schedules every Friday");
            System.out.println("============================= ");
            System.out.println("          Afternoon");
            System.out.println("3:30-5:30 = CCE 102/Research or Self study day");
            System.out.println("5:30-6:30 = Purposive /Quipper");
            System.out.println("6:30-7:30 = Modern Math /Quipper");
            System.out.println("7:30 Free time ");
            System.out.println("=============================");
            System.out.println("Leave a note for a day : ");
            note=in.nextLine();
        }
        else if (cho.equalsIgnoreCase("S"))
        {
            System.out.println("Niel's Schedules every Saturday");          
            System.out.println("============================= ");
            System.out.println("          Morning");
            System.out.println("8:00-11:00 = NSTP/ UM Main ");
            System.out.println("11:00= Uwian time");
            System.out.println("11:00 Free time ");
            System.out.println("=============================");
            System.out.println("Leave a note for a day : ");
            note=in.nextLine();
            
        }
         else if (cho.equalsIgnoreCase("Sun"))
        {
            System.out.println("Niel's Schedules every ");
            System.out.println("============================= ");
            System.out.println("10:00am- 11::00am = Teacher every second and fourth sunday ");
            System.out.println("11:00= Uwian time");
            System.out.println("11:00 = free time");
            System.out.println("=============================");
        }
        else if (cho.equalsIgnoreCase("E"))
        {
            System.out.print("Have a good day :) ");
           
            System.exit(0);           
                    
            
        }
        else 
        {
            System.out.println("Invalid Entry!!!, program will automatically terminated!!!! ");
            System.exit(0);
        }
    
    
}}