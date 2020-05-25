package dudepackage;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DudeService {

	
	public void doThatThing() {
		System.err.println("service done that thing");
	}
}
