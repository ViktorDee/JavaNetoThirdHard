public class Main {
    public static void main(String[] args) {
        
        CreditPaymentService service = new CreditPaymentService();
        System.out.println();
        System.out.println("Ежемесячный платёж. 1 год");
        System.out.println(service.calculate(1));

        System.out.println();
        System.out.println("Ежемесячный платёж. 2 года");
        System.out.println(service.calculate(2));
        
        System.out.println();
        System.out.println("Ежемесячный платёж. 3 года");
        System.out.println(service.calculate(3));
    }
}
