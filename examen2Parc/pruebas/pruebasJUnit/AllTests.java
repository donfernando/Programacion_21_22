package pruebasJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({PruebasCrearTriangulo.class,PruebasDeKarim.class,PruebasDeMiguelJesus.class})
public class AllTests {

}
