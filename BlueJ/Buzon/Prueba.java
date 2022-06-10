
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Prueba
{
    public static void main(String[] a){
        Usuario eva,wallie;
        eva=new Usuario("Eva");
        wallie=new Usuario("Wallie");
        eva.mensaje(3,3,"HOLA");
        wallie.print(3,3);
    }

    @Test
    public void funcion(){
        Usuario eva,wallie;
        eva=new Usuario("Eva");
        wallie=new Usuario("Wallie");
        eva.mensaje(3,3,"HOLA");
        wallie.print(2,3);
        assertTrue(true);
    }

}

