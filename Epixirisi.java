import java.util.Random;
public class Epixirisi
{
        private static Random rand = new Random();
        private  int  id= rand.nextInt(200) + 1;
        private String onoma;
        private String eidos;
        private String perioxi;
        private double rating;
        private int idioktitis;
        private int maxpeople=5;
        private boolean sponsored;
        public void validateDB(){this.sponsored=true;}
        public void setName(String a){
		this.onoma = a;
	}
	public void setEidos(String a){
		this.eidos = a;
	}
	public void setPerioxi(String a){
		this.perioxi = a;
	}
	public int getID(){return id;}
	public String getName(){return onoma;}
	public String getEidos(){return eidos;}
	public String getPerioxi(){return perioxi;}
        public Epixirisi(String a,int b,String c, String d )
	{
		this.onoma=a;
		this.idioktitis=b;
		this.eidos=c;
		this.perioxi=d;
	}
        public void createBform(){
		System.out.println("Εδω ιδανικα θα εμφανιζόταν η φορμα στοιχειων της επιχειρησης");
		
	}
	public boolean checkForm(Epixirisi e) {
		if (e.getName() != null && e.getName().length()!=0 && e.getEidos() != null&& e.getEidos().length()!=0 && e.getPerioxi()!=null && e.getPerioxi().length()!=0){return true;}
		else{	return false;}
	}
	public void SuccesMessage() {
		System.out.println("Success!!!");
	}
	public boolean validateB(int a){if (a==id){return true;}else{return false;}}
	public void DispPeoplePage(){System.out.println("Γινεται κρατηση μεχρι" +maxpeople+"  ατομα");}
	public boolean CheckDate(){return true;}
	public void DispDatePage(){System.out.println("Γινεται κρατηση οποιαδηποτε ημερομηνια");}
	public boolean CheckPeople(int a){if(a<=maxpeople){return true;}else{return false;}}
}
