package dudepackage;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("dude")
public class RestApp extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>>  classes = new HashSet<>();
		classes.add(DudeResource.class);
		return classes;
	}
}
