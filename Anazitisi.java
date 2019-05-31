
/**
 * Γράψτε μια περιγραφή της κλάσης Anazitisi εδώ.
 * 
 * @author (Το όνομά σας) 
 * @version (Αριθμός έκδοσης ή ημερομηνία εδώ)
 */
public class Anazitisi
{
    String text;
    public Anazitisi(String a){
        this.text=a;}
        public String getText(){return text;}
     public void setText(String a){this.text=a;}
    public boolean checkSearch(Anazitisi a){if(a.getText()!=null&& a.getText().length()!=0){return true;}else{return false;}}
    public void SearchDatabase(String a,Database d){for ( Epixirisi e : d.epixiriseis){if(a.equals(e.getPerioxi())){System.out.println("Αποτελεσματα : " +e.getName());}}System.out.println("Αναζητηση Επιτυχης");}
}
