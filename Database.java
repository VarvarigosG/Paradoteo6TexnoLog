import java.util.ArrayList;

public class Database{

public ArrayList<User> users = new ArrayList<User>();
public ArrayList<Businessman> bmans = new ArrayList<Businessman>();
public ArrayList<Epixirisi> epixiriseis = new ArrayList<Epixirisi>();
public ArrayList<Kritiki> kritikes = new ArrayList<Kritiki>();
public ArrayList<Aksiotheato> theata = new ArrayList<Aksiotheato>();
public ArrayList<Anazitisi> anazitiseis = new ArrayList<Anazitisi>();
public ArrayList<Minima> minimata = new ArrayList<Minima>();
public ArrayList<Pliromi> pliromes = new ArrayList<Pliromi>();

public Database(){
	
}
public void storeAcc1(User p) {
	users.add(p);

}

public void storeAcc2(Businessman p) {
	bmans.add(p);
}
public void storeBus(Epixirisi p) {
epixiriseis.add(p);
}

public void updateReviews(Kritiki p) {
kritikes.add(p);
}
public void addTheata(Aksiotheato p) {
theata.add(p);
}
public void addAnazitisi(Anazitisi p) {
anazitiseis.add(p);
}
public void createMsg(Minima p) {
minimata.add(p);
}
public void addPliromi(Pliromi p) {
pliromes.add(p);
}
}