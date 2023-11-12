
public class Review01 {

    public static void main(String[] args) {
        //
        int price = 1500;
        int tax = 10;
        
        System.out.println(price + "円の商品の税込価格は" + (tax(price, tax) + price) + "円" + "（消費税は" + tax(price, tax) + "円）です。");
    }
    
    public static int tax(int price, int tax) {
        return price / tax;
    }

}
