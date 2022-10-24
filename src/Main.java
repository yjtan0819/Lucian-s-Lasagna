public class Main {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.ExpectedMinutesInOven());
        System.out.println(lasagna.RemainingMinutesInOven(30));
        System.out.println(lasagna.PreparationTimeInMinutes(2));
        System.out.println(lasagna.ElapsedTimeInMinutes(3,20));
    }
}
