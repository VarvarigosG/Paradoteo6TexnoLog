
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Random;
import java.util.Scanner;  
import java.io.*;

public class Businessman extends Guest
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner keyboard = new Scanner(System.in);
    DataInputStream answer = new DataInputStream(System.in);
    private static Random rand = new Random();
    private  int  id= rand.nextInt(200) + 1;
    private String onoma;
    private String epitheto;
    private String password;
    private int messages=0;
    private boolean found=false;
    public void setMessages(){this.messages=this.messages+1;}
        public void setName(String a){
		this.onoma = a;
	}
	public void setEponimo(String a){
		this.epitheto = a;
	}
	public String getName(){
		return onoma;
	}
    public Businessman(String a , String b)
    {
        this.onoma=a;
        this.epitheto=b;
    }
    public int getID(){
		return id;
	}
	 public boolean checkForm()
   {
       if((onoma!=null && onoma.length()!=0)&&(epitheto!=null&& epitheto.length()!=0)){return true;}
       else { return false;}
   }
      public void SuccesMessage() {
		System.out.println("Success!!!");
	}
	public Minima composeReplyMsg(int a ,int b , String c)
	{  Minima msg13 = new Minima(a,b,c);
	    return msg13;
	   }
	  public void createCardForm(){System.out.println("Εδω ιδανικα θα εμφανιζοταν η φορμα συμπληρωσης των στοιχειων της καρτας τωρα θα την αφησουμε κενή γιατι δεν μπορει να γινει καποιος ελεγχος χωρις συνδεση στο διαδικτυο");}
	  public void createBform(){System.out.println("Εισαγετε το id της επιχειρησης που θελετε να λαβει τα προνομοια sposnor");}
	  public boolean validateOroi(){System.out.println("Αποδεχεστε τους ορους?");
	   try 
		    	 		{	
							String asnwer;
							if ( answer.readLine().equals("y"))
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
	  public boolean validateCard(){return true;}
}
