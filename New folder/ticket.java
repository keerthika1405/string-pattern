
import java.util.*;

class Passenger
{
   static int id = 1;//static variable to give id for every new passenger1
    int Theater;
    int Movies;
    int location;
    int Format;// U or L or M
    int language;
    String type;
    int passengerId;// id of passenger created automatically
    String alloted;//alloted type (L,U,M,RAC,WL)
    int number;//seat number
   

    public Passenger(int Movies,int Format,int language,String type,int Theater , int location)
    {
        this.Movies = Movies;
        this.Theater = Theater;
        this.Format = Format;
        this.language = language;
        this.type=type;
        this.location = location;
        
        this.passengerId = id++;
        alloted = "";
        number = -1;
    }

    
}

 class TicketBooker
{
    static int availablefirstClass = 2;//normally 21
    static int availablesecondClass = 2;//normally 21
  
 
    static List<Integer> bookedTicketList =  new ArrayList<>();
    

     static List<Integer> firstClassPositions = new ArrayList<>(Arrays.asList(1,2));//normally 1,2,...21
    static List<Integer> secondClassPositions = new ArrayList<>(Arrays.asList(1,2));//normally 1,2,...21

     static Map<Integer, Passenger> passenger = new HashMap<>();//map of passenger ids to passengers

      public void bookTicket(Passenger p, int poistiontype,String type)
    {
        //assign the seat number and type of berth(L,U,M)
        p.number = poistiontype;
        p.alloted = type;
        // add passenger to the map
        passenger.put(p.passengerId,p);
        //add passenger id to the list of booked tickets
        bookedTicketList.add(p.passengerId);        
        System.out.println("--------------------------Booked Successfully");
    }

        //cancel ticket
    public void cancelTicket(int passengerId)
    {
        //remove the passenger from the map
        Passenger p = passenger.get(passengerId);
        passenger.remove(Integer.valueOf(passengerId));
        //remove the booked ticket from the list
        bookedTicketList.remove(Integer.valueOf(passengerId));

        //take the booked position which is now free
        int positionBooked = p.number;

        System.out.println("---------------cancelled Successfully");

        //add the free position to the correspoding type of list (either L,M,U)
        if(p.alloted.equals("1C")) 
        { 
          availablefirstClass++;
          firstClassPositions.add(positionBooked);
        }
        else if(p.alloted.equals("2C"))
        { 
          availablesecondClass++;
          secondClassPositions.add(positionBooked);
        }
        
    }
   
}



public class ticket {

     public static void bookTicket(Passenger p)
     {
        TicketBooker booker = new TicketBooker();

        if(TicketBooker.availablefirstClass == 0)
        {
            System.out.println("No Tickets Available on firstClass");
            return;
        }
        if(TicketBooker.availablesecondClass == 0)
        {
            System.out.println("No Tickets Available on SecondClass");
            return;
        }



        if((p.type.equals("1C") && TicketBooker.availablefirstClass > 0 )||
        (p.type.equals("2C") && TicketBooker.availablesecondClass > 0))
     {
         System.out.println("Preferred Berth Available");

         
         if(p.type.equals("1C"))
         {
             System.out.println("first class Given");
             //call booking function in the TicketBooker class
             booker.bookTicket(p,(TicketBooker.firstClassPositions.get(0)),"1C");
             //remove the booked position from available positions and also decrease available seats of that
             // particular type
             TicketBooker.firstClassPositions.remove(0);
             TicketBooker.availablefirstClass--;
         }
        else if(p.type.equals("2C"))
         {
             System.out.println("second class Given");
             //call booking function in the TicketBooker class
             booker.bookTicket(p,(TicketBooker.secondClassPositions.get(0)),"2C");
             //remove the booked position from available positions and also decrease available seats of that
             // particular type
             TicketBooker.secondClassPositions.remove(0);
             TicketBooker.availablesecondClass--;
         }

 }
else if(TicketBooker.availablefirstClass > 0)
 {
     System.out.println("first class Given");
     //call booking function in the TicketBooker class
      booker.bookTicket(p,(TicketBooker.firstClassPositions.get(0)),"1C");
     //remove the booked position from available positions and also decrease available seats of that
     // particular type
    TicketBooker.firstClassPositions.remove(0);
             TicketBooker.availablefirstClass--;
     

 }
 else if(TicketBooker.availablesecondClass > 0)
  {
     System.out.println("second class Given");
     //call booking function in the TicketBooker class
     booker.bookTicket(p,(TicketBooker.secondClassPositions.get(0)),"2C");
     //remove the booked position from available positions and also decrease available seats of that
     // particular type
     TicketBooker.secondClassPositions.remove(0);
             TicketBooker.availablesecondClass--;
     

 }

}

   //cancel ticket function
   public static void cancelTicket(int id)
   {
       TicketBooker booker = new TicketBooker();
       //check if passenger id is valid
       if(!TicketBooker.passenger.containsKey(id))
       {
           System.out.println("Passenger detail Unknown");
       }
       else{
        booker.cancelTicket(id);
       }
          
     }

    public static void main( String[]args){

    Scanner sc = new Scanner(System.in);

    boolean loop = true ;
    while(loop)
    {
        System.out.println("Preferred location");
        System.out.println("\n1.Chennai \n2.Velacherry \n3.exits" ); //n3.Villivakkam  \n4.Trichy
        int location=sc.nextInt();
   
        switch(location)
        {
            case 1:{ 
                System.out.println("choose Movies :");   
                System.out.println("\n1.openheimer \n2.Barbie \n3.Harry Potter  \n4.Marvel Studio");
                int Movie=sc.nextInt();

            
                switch(Movie)
                {
                    
                   case 1:{
                    System.out.println("Available Theater:");
                    System.out.println("\n1.S2 Theater(perambur) \n 2. PVR Cinemas(Anna Naga) \n3. Ganga Theater(Kolathur) \n4. Sangam Cinema's(Kilpau) ");
                    int Theater=sc.nextInt();
                   
                        switch(Theater)
                    {
                        case 1:
                        {
                            System.out.println(" select your  language \n1.Tamil  \n2.telugu");
                            int  language= sc.nextInt();
                            switch(language)
                            {
                                case 1:
                            {
                            System.out.println(" select your formate: \n1.2D  or  \n2.IMAX  \n3.cancel ");
                            int format= sc.nextInt();
                           
                            switch(format)
                            {
                                case 1:
                                {
                            System.out.println("select type firstclass or secondclass AS 1C / 2C ");
                            String type= sc.next();
                              Passenger p = new Passenger(Movie,format,language,type,Theater,location);
                            bookTicket(p);
                                  
                                }
                                break;
                                case 2:
                                {
                             System.out.println("select type firstclass or secondclass AS 1C / 2C ");
                            String type= sc.next();
                             Passenger p = new Passenger(Movie,format,language,type,Theater,location);
                            bookTicket(p);
                          
                            }break;         
                            case 3:
                            {
                                System.out.println("Enter passenger Id to cancel");
                                int id = sc.nextInt();
                                cancelTicket(id);
                            }break;
             }
  }
  break;
                            }
                            

                            }
                            break;
                           
                            
                        }
                  }
                  break;


                }
                }
                break;
                
                                      
                default:
                break;                    
                    //  case 2:{
                    //  System.out.println(" \n1.AGS Cinema's (T-Nagar) \n2.Rohini Theater(Koyembedu) \n3.INOX (OMR)");
                    //  int theater=sc.nextInt();

                    // }
                    // break;
                    // case 3:{
                    //  System.out.println("2D");
                    // }
                    //  break;
                    // case 4:{
                    //  System.out.println("2D or IMAX");
                    // }
                 
            


            // case 2:
            // {
            //    System.out.println("Available Movies :");
            //     System.out.println("\n1.Mark Antony \n2.Jailer \n3.LEO  \n4.KGF2");

            //     int Movies=sc.nextInt();
            //     switch(Movies)
            //     {

            //         case 1:{
            //          System.out.println("2D OR IMAX");
            //         }
            //         break;
            //          case 2:{
            //          System.out.println("2D OR IMAX");
            //         }
            //         break;
            //         case 3:{
            //          System.out.println("2D");
            //         }
            //          break;
            //         case 4:{
            //          System.out.println("2D or IMAX");
            //         }
                 
            //     }
            // }
            // break;

            // case 3:
            // {
            //      loop = false;
            // }
            // break;

            // default:
            // break;
            //     case 3:{
            //     System.out.println("Select your language and Formate ( Telugu or Tamil) and (2D or  IMAX) ");
            //     // String language= sc.nextLine();
            //     // String Formate= sc.nextLine();
            // }
            // break;
            //      case 4:{
            //     System.out.println("Select your language and Formate ( Telugu or Tamil or malayalam) and (IMAX) ");
            //     // String language= sc.nextLine();
            //     // String Formate= sc.nextLine();
            // }
            // break;
             
        }

    }
    sc.close();
}


    }

