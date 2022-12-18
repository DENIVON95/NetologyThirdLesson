public class MilesCalculator {
    public static void main(String[] args) {
        int ticketPrice = 2000; // стоимость авиабилета в рублях
        int roublesPerBonusMile = 20; // количество рублей, необходимое для получения бонусной мили

        int bonusMilesCount = ticketPrice / roublesPerBonusMile;
        System.out.println("Количество бонусных миль за билет: " + bonusMilesCount);

    }
}
