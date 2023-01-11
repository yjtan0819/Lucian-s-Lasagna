import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LasagnaTest {
    private final Lasagna lasagna = new Lasagna();
    private final Lasagna lasagna2 = new Lasagna(120, 5);

    @org.junit.jupiter.api.Test
    void expectedMinutesInOven() {
        assertEquals(40, lasagna.ExpectedMinutesInOven());
        assertEquals(120, lasagna2.ExpectedMinutesInOven());
    }

    @Test
    void getLayerPreparationTime() {
        assertEquals(2, lasagna.GetLayerPreparationTime());
        assertEquals(5, lasagna2.GetLayerPreparationTime());
    }

    @org.junit.jupiter.api.Test
    void remainingMinutesInOven() {
        assertEquals(10, lasagna.RemainingMinutesInOven(30));
        assertEquals(30, lasagna2.RemainingMinutesInOven(90));
    }

    @org.junit.jupiter.api.Test
    void preparationTimeInMinutes() {
        assertEquals(4, lasagna.PreparationTimeInMinutes(2));
        assertEquals(10, lasagna2.PreparationTimeInMinutes(2));
    }

    @org.junit.jupiter.api.Test
    void elapsedTimeInMinutes() {
        assertEquals(26, lasagna.ElapsedTimeInMinutes(3, 20));
        assertEquals(55, lasagna2.ElapsedTimeInMinutes(3, 40));
    }
}