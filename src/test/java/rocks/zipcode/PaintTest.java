package rocks.zipcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaintTest {

    @org.junit.jupiter.api.Test
    void getBrand() {
        Paint p = new Paint("Vallejo", "Black Grey", "Generic");
        String expected = "Vallejo";
        assertEquals(expected, p.getBrand());
    }

    @org.junit.jupiter.api.Test
    void getPaintName() {
        Paint p = new Paint("Vallejo", "Black Grey", "Generic");
        String expected = "Black Grey";
        assertEquals(expected, p.getPaintName());
    }

    @org.junit.jupiter.api.Test
    void getPaintType() {
        //Given
        Paint p = new Paint("Vallejo", "Black Grey", "Generic");

        //When
        String expected = "Generic";

        //Then
        assertEquals(expected, p.getPaintType());
    }

    @Test
    void setBrand() {
        //Given
        Paint p = new Paint("Vallejo", "Black Grey", "Generic");

        //When
        p.setBrand("Citadel");
        String expected = "Citadel";

        //Then
        assertEquals(expected, p.getBrand());

    }

    @Test
    void setPaintName() {
        //Given
        Paint p = new Paint("Vallejo", "Black Grey", "Generic");

        //When
        p.setPaintName("Rainbow");
        String expected = "Rainbow";

        //then
        assertEquals(expected, p.getPaintName());

    }

    @Test
    void setPaintType() {
        //Given
        Paint p = new Paint("Vallejo", "Black Grey", "Generic");

        //When
        p.setPaintType("Ink");
        String expected = "Ink";

        //Then
        assertEquals(expected, p.getPaintType());
    }
}