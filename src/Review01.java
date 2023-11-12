
public class Review01 {

    public static void main(String[] args) {
        //価格と税率を設定
        int price = 1500;
        double tax = 0.1;

        //計算結果を出力
        System.out.println(price + "円の商品の税込価格は" + (tax(price, tax) + price) + "円" + "（消費税は" + tax(price, tax) + "円）です。");
    }

    //価格x税率を計算
    public static int tax(int price, double tax) {
        double result = price * tax;
        return (int)result;
    }

}
