
                        import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Random;
import java.util.Scanner;  
import java.io.*;
import java.util.concurrent.TimeUnit;

public class Main {
   
public static void Main()
{
     
        Random rand = new Random();
        int choice;
        int choice2;
        boolean SwitchExit;
        Database database1 = new Database();// dimiourgia mias database kenis arxika
        Businessman bman = new Businessman("Kwstas","Antoniou");
        User user1 = new User("Nikos","Mpouzoukis");
        Epixirisi epix1 = new Epixirisi("epix1",1236,"kafe","Patra");
        Minima min1 = new Minima(1235,1234,"geia xara");
        Pliromi plir1 = new Pliromi(1237,1236,"12-1-2019",510);
        Anazitisi anaz1 = new Anazitisi("patra");
        Guest guest = new Guest();
        Scanner keyboard = new Scanner(System.in);
        DataInputStream answer = new DataInputStream(System.in);
        Minima Apantisi=new Minima();
        database1.storeBus(epix1);
        System.out.println("Πληκτρολογήστε 1-8 για να εκτελεστεί μία από τις παρακάτω επιλογές");
        System.out.println("1.Προσθήκη Λογαριασμού");
        System.out.println("2.Προσθήκη Επιχείρησης");
        System.out.println("3.Ανταλλαγη Μηνυματων");
        System.out.println("4.Κριτικη ");
        System.out.println("5.Καντε μια πληρωμη");
        System.out.println("6.Χορηγηση Επιχειρησης");
        System.out.println("7.Προσθηκη Κρατησης");
        System.out.println("8.Καντε Αναζητηση");
        System.out.println("9.Έξοδος");
        SwitchExit=false;    

        while(SwitchExit == false)
            {
                choice = keyboard.nextInt(); 
                switch (choice)
                {
                     case 1:
                    {   
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        guest.DisplayForm();
                        choice2 = keyboard.nextInt();
                        System.out.println("Ιδανικα θα εμφανιζοταν η φορμα συμπληρωσης στοιχειων");
                        System.out.println("Press Any Key To Continue...");
                        keyboard.nextLine();
                        System.out.println("Δωσε Ονομα ");
                        String name = keyboard.nextLine();
                        System.out.println("Press Any Key To Continue...");
                        keyboard.nextLine();
                        System.out.println("Δωσε Επονυμο ");                        
                        String eponimo = keyboard.nextLine();                      
                        System.out.println("Press Any Key To Continue...");
                        keyboard.nextLine();
                        int id1= rand.nextInt(10) + 1;
                        if ( choice2 == 1)
                            {
                                User user3 = new User(name,eponimo);
                                while(user3.checkForm()==false)
                                {
                                    user3=null;
                                    System.out.println("Βαλε σωστα τα στοιχεία");
                                    System.out.println("Δωσε Ονομα ");
                                    name = keyboard.nextLine();
                                    System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                                    System.out.println("Δωσε Επονυμο ");

                                    //System.out.println("Press Any Key To Continue...");
                                    //keyboard.nextLine(); 
                                    user3.setName(name);
                                    user3.setEponimo(eponimo);
                                }
                                database1.storeAcc1(user3);
                                user3.SuccesMessage();
                                break;
                            }
                        else 
                            {
                                Businessman bus3 = new Businessman(name,eponimo);
                                while(bus3.checkForm()==false)
                                {
                                    bus3=null;
                                    System.out.println("Βαλε σωστα τα στοιχεία");
                                    System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                                    System.out.println("Δωσε Ονομα ");
                                    name = keyboard.nextLine();
                                    System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                                    System.out.println("Δωσε Επονυμο "); 
                                    eponimo = keyboard.nextLine();
                                    System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                                    bus3.setName(name);
                                    bus3.setEponimo(eponimo);
                                }
                                database1.storeAcc2(bus3);
                                bus3.SuccesMessage();
                                break;
                            }
                    }
                    case 2:
                    {
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Υποθετουμε οτι ειναι συνδεδεμενος ενας χρηστης τυπου Businessman και συγκεκριμενα ως bman");
                        epix1.createBform();
                        System.out.println("Press Any Key To Continue...");
                        keyboard.nextLine();
                        System.out.println("Δωσε Ονομα ");
                        String name = keyboard.nextLine();
                        System.out.println("Press Any Key To Continue...");
                        keyboard.nextLine();
                        System.out.println("Δωσε Ειδος");
                        String eidos = keyboard.nextLine();
                        System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                        System.out.println("Δωσε Περιοχη");
                        String perioxi=keyboard.nextLine();
                        Epixirisi epix3 = new Epixirisi(name,bman.getID(),eidos,perioxi);
                        while(epix3.checkForm(epix3)==false)
                            {
                                System.out.println("Δωσε Ονομα ");
                                name = keyboard.nextLine();
                                System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                                System.out.println("Δωσε Ειδος");
                                eidos = keyboard.nextLine();
                                System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                                System.out.println("Δωσε Περιοχη");
                                perioxi=keyboard.nextLine();
                                System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                                epix3.setName(name);
                                epix3.setEidos(eidos);
                                epix3.setPerioxi(perioxi);
                            }
                        database1.storeBus(epix3);
                        epix3.SuccesMessage();
                        break;
                    }
                    case 3:
                    {
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Θεωρουμε πως ο χρηστης user1 θελει να στειλει μηνυμα στον χρηστη bman");
                        user1.disMsgUI();
                        String text = keyboard.nextLine();
                        user1.dispReceivers(database1);
                        Minima msg3 = new Minima(user1.getID(),bman.getID(),text);
                        while(msg3.MsgConfirm()==false)
                            {
                                msg3.remaintopage();
                                text = keyboard.nextLine();
                                msg3.setKimeno(text);
                            }
                        msg3.validatesend();
                        msg3.notifyreceiverUser(bman.getID(),database1);
                        database1.createMsg(msg3);
                        System.out.println("Θεωρουμε πως ο χρηστης bman θελει να απαντησει στον χρηστη user1");
                        Apantisi=bman.composeReplyMsg(bman.getID(),user1.getID(),"apantisi tou bman");
                        break;
                    }
                    case 4:
                    {   
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Θεωρουμε οτι γινεται μια κριτικη για την επιχειρηση epix1");
                        System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                                    keyboard.nextLine();
                        Kritiki krit3 = new Kritiki();
                        
                        System.out.println("Δωσε Κειμενο Κριτικης");
                        String text = keyboard.nextLine();
                        
                        krit3.addDescription(text);
                        
                        System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                        System.out.println("Δωσε Βαθμολογια Κριτικης");            
                        double rate = keyboard.nextDouble();
                       
                        krit3.addRating(rate);
                        if(krit3.checkDescription()==false){System.out.println("Κενο κειμενο κριτικης"); break;}
                        if(krit3.checkReview()==false){System.out.println("Μη εγκυρη βαθμολογια");break;}
                        database1.updateReviews(krit3);
                        krit3.showsightPage(database1,epix1.getID());
                        break;
                    }
                    case 5:
                    {
                            System.out.println("Θεωρουμε οτι ο user1(password= 1234) θελει να κανει μια πληρωμη στην epix1 ");
            
            int pass=0;
            while ( pass==0)
            {
                if( user1.validateClient()== true){pass=1;}
                else
                {
                    System.out.println("Λαθος κωδικος");
                    user1.dispPassForm();
                    System.out.println("Press Any Key To Continue...");
                    new java.util.Scanner(System.in).nextLine();
                            }
                        }
                        user1.createCardForm();
                        System.out.println("Ο παρακατω ελεγχος της μεθοδου validatePayment() θα γυρναει παντα true ");
                        int pass2=0;
                        while ( pass2==0)
                        {
                            if( user1.validatePayment()== true)
                            {
                                pass2=2;
                                System.out.println("Press Any Key To Continue...");
                                new java.util.Scanner(System.in).nextLine();
                                System.out.println("Επιτυχης Πληρωμη");
                                
                            }
                            else
                            {
                                System.out.println("Λαθος στοιχεια καρτα");
                                user1.createCardForm();
                            }
                        }
                        Pliromi plir3 = new Pliromi(user1.getID(),epix1.getID(),"12-1-2019",510);//tixaia stixia kathws tha ta pername apo ta stixia is kartas
                        break;
                    }
                    case 6:
                    {
                            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Θεωρουμε οτι ο bman θελει να κανει την epix1 χορηγουμενη που εχει id " + epix1.getID());
                        bman.createBform();
                        int id = keyboard.nextInt();
                        System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                        if ( epix1.validateB(id)==true )
                        {
                            if ( bman.validateOroi()==true )
                            {
                                bman.createCardForm();
                                
                                System.out.println("Ο παρακατω ελεγχος της μεθοδου validatePayment() θα γυρναει παντα true ");
                                if(bman.validateCard()==true){
                                    epix1.validateDB();
                                    System.out.println("Eπιτυχης Χορηγηση!!");
                                }
                                else 
                                {
                                    System.out.println("Λαθος στοιχεια καρτας ");
                                    bman.createCardForm();
                                }
                            }
                            else
                            {
                                break;
                            }   
                        }
                        else
                        {
                            System.out.println(" Λαθος στοιχεια επιχειρησης");
                            bman.createBform();
                            id = keyboard.nextInt();
                        }
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Υποθετουμε πως ο χρηστης user1 θελει να κανει κρατηση στην επιχειρηση epix1");
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        user1.DispReservationpage();
                        epix1.DispDatePage();
                        System.out.println("Δωσε ημερομηνια");
                        String date=keyboard.nextLine();
                        System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                        while( epix1.CheckDate()== false){
                            epix1.DispDatePage();
                            System.out.println("Δωσε ημερομηνια");
                            date=keyboard.nextLine();
                            System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                        }
                        epix1.DispPeoplePage();
                        epix1.DispDatePage();
                        System.out.println("Δωσε αριθμο ατομων");
                        int atoma = keyboard.nextInt();
                        System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                        while( epix1.CheckPeople(atoma)== false){
                            epix1.DispPeoplePage();
                            System.out.println("Δωσε σωστο αριθμο ατομων");
                            atoma=keyboard.nextInt();
                            System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                        }
                        Kratisi krat3 = new Kratisi(user1.getID(),epix1.getID(),date,atoma);
                        krat3.DisReservationOK();
                        break;
                    }
                    case 8:
                    {
                            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println("Υποθετουμε πως ο χρηστης user1 θελει να κανει αναζητηση βαση την περιοχη");
                        user1.DispSearchPage();
                        String perioxi=keyboard.nextLine();
                        System.out.println("Press Any Key To Continue...");
                                    keyboard.nextLine();
                        Anazitisi anaz3=new Anazitisi(perioxi);
                        while ( anaz3.checkSearch(anaz3)==false)
                        {
                            System.out.println("Κενη αναζητηση προσπαθηστε ξανα");
                            user1.DispSearchPage();
                            perioxi=keyboard.nextLine();
                            anaz3.setText(perioxi);
                        }
                        anaz3.SearchDatabase(perioxi,database1);  
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Είστε σιγουρος οτι θέλετε να γίνει έξοδος προγράμματος?(y/n)");
                        try 
                        {   
                            String asnwer;
                            if ( answer.readLine().equals("y"))
                            {
                                SwitchExit=true;
                                break;
                            }
                        } 
                        catch (IOException e)
                        {
                            System.out.println(e);
                        }
                        
                    }
                }
                if(SwitchExit==false)
                {
                    System.out.println("Πληκτρολογήστε 1-9 για να εκτελεστεί μία από τις παρακάτω επιλογές");
                    System.out.println("1.Προσθήκη Λογαριασμού");
                    System.out.println("2.Προσθήκη Επιχείρησης");
                    System.out.println("3.Ανταλλαγη Μηνυματων");
                    System.out.println("4.Κριτικη ");
                    System.out.println("5.Καντε μια πληρωμη");
                    System.out.println("6.Χορηγηση Επιχειρησης");
                    System.out.println("7.Προσθηκη Κρατησης");
                    System.out.println("8.Καντε Αναζητηση");
                    System.out.println("9.Έξοδος");
                }
            }
        System.out.println("Πραγματοποιήθηκε έξοδος");
    }   
}
