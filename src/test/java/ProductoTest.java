import com.mycompany.parcial1.Producto;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    Producto producto;

    

    @BeforeEach
    public void setup() {
        producto = new Producto("iPhone", "iPhone 13", 999.99, 10);
        System.out.println("Se ejecuta antes de cada prueba");
    }

    @Test
    public void testCrearProducto() {
        assertEquals("iPhone", producto.getNombre());
        assertEquals("iPhone 13", producto.getDescripcion());
        assertEquals(999.99, producto.getPrecio());
        assertEquals(10, producto.getCantidadInventario());
    }

    @Test
    public void testModificarInventario() {
        producto.setCantidadInventario(8);
        assertEquals(8, producto.getCantidadInventario());
    }

    @Test
    public void testCambiarPrecio() {
        producto.setPrecio(1099.99);
        assertEquals(1099.99, producto.getPrecio());
    }

   
    
}
    
 