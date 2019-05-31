

public class Minima
{
    private int apostoleas;
    private int paraliptis;
    private String kimeno;
    public void setKimeno(String text){this.kimeno=text;}
    public Minima(){}
    public Minima(int receiver,int sender,String text){
		this.apostoleas = sender;
		this.paraliptis = receiver;
		this.kimeno = text; 
	}
	public boolean MsgConfirm(){
	    if(kimeno!=null&& kimeno.length()!=0){return true;}
	    else{return false;}
	    
	}
	public void remaintopage(){
	   System.out.println("Δωστε μη κενο μηνυμα");
        }
        public void validatesend(){
	   System.out.println("Επιτυχης αποστολη");
        }
        public void notifyreceiverUser(int a,Database d){
	   for ( Businessman b : d.bmans){if(a==b.getID()){b.setMessages();}}
        }
}
