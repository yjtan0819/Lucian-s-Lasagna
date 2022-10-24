public class Lasagna {
    private int aExpectedMinutes = 40;
    private int aLayerPreparationTime = 2;

    /**
     *  Creates a new lasagna object
     */
    public Lasagna(){}

    public Lasagna(int pExpectedMinutes, int pLayerPreparationTime)
    {
        aExpectedMinutes = pExpectedMinutes;
        aLayerPreparationTime = pLayerPreparationTime;
    }
    /**
     *
     * @return the number of minutes we should be cooking the lasagna
     */
    public int ExpectedMinutesInOven()
    {
        return aExpectedMinutes;
    }

    /**
     * Checks the number of minutes left
     *
     * @param pNumberMinutesPassed The number of minutes passed
     * @pre pNumberMinutesPassed > 0
     * @pre pNumberMinutesPassed < aExpectedMinutes
     * @return the number of minutes remaining
     */
    public int RemainingMinutesInOven(int pNumberMinutesPassed)
    {
        assert pNumberMinutesPassed > 0;
        assert pNumberMinutesPassed < aExpectedMinutes;
        return aExpectedMinutes - pNumberMinutesPassed;
    }


    public int PreparationTimeInMinutes(int)
}
