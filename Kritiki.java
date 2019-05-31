
/**
 * Γράψτε μια περιγραφή της κλάσης Kritiki εδώ.
 * 
 * @author (Το όνομά σας) 
 * @version (Αριθμός έκδοσης ή ημερομηνία εδώ)
 */
public class Kritiki
{
    private String kimeno;
    private double rating;
    
    public void addDescription(String a){this.kimeno=a;}
    public void addRating(double a){this.rating=a;}
    public boolean checkDescription(){if(kimeno!=null && kimeno.length()!=0){return true;}else{return false;}}
    public boolean checkReview(){if(rating<=5 && rating>0){return true;}else{return false;}}
    public void showsightPage(Database d,int a){
        System.out.println("Επιχυτης Κριτικη");
        for ( Epixirisi e : d.epixiriseis){if(a==e.getID()){System.out.println("Εγινε κριτικη στην επιχειρηση " +e.getName());}}}
}
