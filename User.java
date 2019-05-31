import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Random;
import java.util.Scanner;  
import java.io.*;

public class User extends Guest
{   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner keyboard = new Scanner(System.in);
    DataInputStream answer = new DataInputStream(System.in);
    private static Random rand = new Random();
    private  int  id= rand.nextInt(200) + 1;
    private String onoma;
    private String epitheto;
    private int password=1234;
    private boolean found=false;
    public void setName(String a){
		this.onoma = a;
	}
	public void setEponimo(String a){
		this.epitheto = a;
	}
	public String getName(){
		return onoma;
	}
      public User(String a , String b)
    {
        this.onoma=a;
        this.epitheto=b;
    }
    public int getID(){
        return id;
    }
   public boolean checkForm()
   {
       if((onoma!=null&& onoma.length()!=0)&&(epitheto!=null&& epitheto.length()!=0)){return true;}
       else { return false;}
   }
   public void SuccesMessage() {
		System.out.println("Success!!!");
	}
	public void disMsgUI() {
		System.out.println("Enter text");
	}
	public void dispReceivers(Database d)
	{
	    for ( User u : d.users){System.out.println("Ονομα χρηστη" +u.getName());}
	    for ( Businessman b : d.bmans){System.out.println("Ονομα χρηστη" +b.getName());}
	}
	public boolean validateClient(){
	    System.out.println("Συμπληρωσε τον κωδικο σου για ταυτοποιηση");
	    try 
		    	 		{	
							String asnwer;
							if ( answer.readLine().equals("1234"))
							{
								this.found=true;
								
							}
						} 
		    	 		catch (IOException e)
						{
							System.out.println(e);
						}
						return found;
				}
	  public void dispPassForm(){System.out.println("Συμπληρωστε τον κωδικο σας για ταυτοποιηση του λογαριασμου");}
	  public void createCardForm(){System.out.println("Εδω ιδανικα θα εμφανιζοταν η φορμα συμπληρωσης των στοιχειων της καρτας τωρα θα την αφησουμε κενή γιατι δεν μπορει να γινει καποιος ελεγχος χωρις συνδεση στο διαδικτυο");}
	  public boolean validatePayment(){return true;}
	  public void DispReservationpage(){System.out.println("Εδω ιδανικα θα εμφανιζοταν η φορμα συμπληρωσης των στοιχειων της κρατησης ");}
	  public void DispSearchPage(){System.out.println("Εδω ειναι η μπαρα της αναζητησης, βαλτε παραμετρο ");}
	  
}
