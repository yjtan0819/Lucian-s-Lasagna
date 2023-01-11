public class Main {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.ExpectedMinutesInOven());
        System.out.println(lasagna.RemainingMinutesInOven(30));
        System.out.println(lasagna.PreparationTimeInMinutes(2));
        System.out.println(lasagna.ElapsedTimeInMinutes(3,20));

        Lasagna lasagna2 = new Lasagna(60,5);
        System.out.println(lasagna2.ExpectedMinutesInOven());
        System.out.println(lasagna2.RemainingMinutesInOven(20));
        System.out.println(lasagna2.PreparationTimeInMinutes(4));
        System.out.println(lasagna2.ElapsedTimeInMinutes(4,30));
    }
}
