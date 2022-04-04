package pruebas;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import pq1.contenedores.dinamico.ColaConCaducidad;


public class PruebaColaConCaducidad{
   
    @Test
    public void crearColaCaducidad_01() {
        try {
            new ColaConCaducidad<Integer>(1);
        } catch (Exception e) {
            fail("No deberia dar fallos");
        }
    }

    @Test
    public void acolarElementos_01() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(2).acolar(10).acolar(8);
        } catch (Exception e) {
            fail("No deberia dar fallos");
        }
    }

    @Test
    public void acolarElementos_02() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(2);
            cc.acolar(10);
            cc.acolar(8);
        } catch (Exception e) {
            fail("No deberia dar fallos");
        }
    }

    @Test
    public void acolarElementosInvalidos_01() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(2).acolar(null).acolar(8);
            fail("Debería dar exception");
        } catch (Exception e) {
        }
    }

    @Test
    public void acolarElementosInvalidos_02() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(null).acolar(10).acolar(8);
            fail("Debería dar exception");
        } catch (Exception e) {
        }
    }

    @Test
    public void acolarElementosInvalidos_03() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(2).acolar(10).acolar(null);
            fail("Debería dar exception");
        } catch (Exception e) {
        }
    }

    @Test
    public void acolarElementosInvalidos_04() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(null).acolar(null).acolar(null);
            fail("Debería dar exception");
        } catch (Exception e) {
        }
    }

    @Test
    public void desacolarElemtos_01() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(2).acolar(10).acolar(8);
            cc.desacolar();
        } catch (Exception e) {
            fail("No deberia dar fallos");
        }
    }

    @Test
    public void desacolarElementos_02() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(2).acolar(6).acolar(8);
            cc.desacolar();
            assertEquals(6, cc.desacolar());
        } catch (Exception e) {
            fail("No deberia dar fallos");
        }
    }

    @Test
    public void desacolarElementosCaducados_01() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(2).acolar(6).acolar(8);
            cc.desacolar();
            // TimeUnit.MILLISECONDS.sleep(500);
            // assertEquals(6, cc.desacolar());
        } catch (Exception e) {
            fail("No deberia dar fallos");
        }
    }

    @Test
    public void desacolarElemtosCaducados_02() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(2).acolar(10).acolar(8);
            cc.desacolar();
            Thread.sleep(900);
            //TimeUnit.MILLISECONDS.sleep(900);
            assertEquals(10, cc.desacolar());
        } catch (Exception e) {
            fail("No deberia dar fallos");
        }
    }
    @Test
    public void desacolarElemtosCaducados_03() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(2).acolar(10);
            cc.desacolar();
            TimeUnit.MILLISECONDS.sleep(600);
            cc.acolar(8);
            assertEquals(10, cc.desacolar());
        } catch (Exception e) {
            fail("No deberia dar fallos");
        }
    }

    @Test
    public void desacolarElemtosCaducados_04() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(2).acolar(10);
            cc.desacolar();
            TimeUnit.MILLISECONDS.sleep(600);
            cc.acolar(8);
            TimeUnit.MILLISECONDS.sleep(600);
            assertEquals(8, cc.desacolar());
        } catch (Exception e) {
            fail("No deberia dar fallos");
        }
    }

    @Test
    public void vacia() {
        ColaConCaducidad<Integer> cc;
        try {
            cc = new ColaConCaducidad<Integer>(1);
            cc.acolar(2).acolar(10).acolar(8);
            assertFalse(cc.vacia());
        } catch (Exception e) {
            fail("No deberia dar fallos");
        }
    }

	public static void main(String[] args) throws IOException {
//		Cola<Integer> c = new Cola<>();
//		Cola<Integer> c = new ColaConCaducidad<>(10);
		ColaConCaducidad<Integer> c = new ColaConCaducidad<>(2);
		long tiempoInicio = System.currentTimeMillis();
		long tiempoTranscurrido = 0;
		for (int i = 1; i <= 5; i++) {
			c.acolar(i);
		}
		try {
			while (!c.vacia()) {
				System.in.read();
				tiempoTranscurrido = System.currentTimeMillis()-tiempoInicio;
				System.out.printf("Transcurridos %d mSeg.\n",tiempoTranscurrido);
				System.out.println("Dato: " + c.desacolar());
			}
		} catch (Exception e) {
			System.out.println("Caducaron ya todos los elementos de la cola");
		}
		System.out.println("FIN");
	}

    
}