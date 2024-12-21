package primitive_datatypes;

public class FloatAndDouble {

    public static void main(String[] args) {
        //gives compilation error. says double value is provided to float variable
        //float f = 0.7;

        float f = 0.7f;
        System.out.println(f);  //0.7
        System.out.println((double)f);  //0.699999988079071

        float x = 4.125f;
        System.out.println(x);  //4.125
        System.out.println((double)x);  //4.125
    }


}
