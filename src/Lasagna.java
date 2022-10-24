public class Lasagna {
    private int aExpectedMinutes = 40;
    private int aLayerPreparationTime = 2;

    /**
     *  Creates a new lasagna object
     */
    public Lasagna(){}

    /**
     * Creates a new lasagna with pExpectedMinutes and pLayerPreparation time
     *
     * @param pExpectedMinutes The number of minutes to cook a lasagna
     * @param pLayerPreparationTime The number of minutes to prepare a layer
     * @pre pExpectedMinutes > 0
     * @pre pLayerPreparationTime > 0
     */
    public Lasagna(int pExpectedMinutes, int pLayerPreparationTime)
    {
        assert pExpectedMinutes > 0 && pLayerPreparationTime > 0;
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

    /**
     * Calculates the number of minutes to prepare the lasagna
     * depending on the number of layers
     *
     * @param pNumLayers the number of layers
     * @pre pNumLayers > 0
     * @return the number of minutes to prepare the lasagna
     */
    public int PreparationTimeInMinutes(int pNumLayers)
    {
        return aLayerPreparationTime * pNumLayers;
    }

    /**
     * Calculates the number of minutes spent cooking the lasagna
     *
     * @param pNumLayers the number of layers
     * @param pNumberMinutesPassed the number of minutes passed
     * @pre pNumLayers > 0
     * @pre pNumberMinutesPassed > 0
     * @return the number of minutes elapsed
     */
    public int ElapsedTimeInMinutes(int pNumLayers, int pNumberMinutesPassed)
    {
        assert pNumLayers > 0 && pNumberMinutesPassed > 0;
        return pNumLayers * aLayerPreparationTime + pNumberMinutesPassed;
    }
}
