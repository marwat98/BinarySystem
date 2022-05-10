package marwat98.com.github;


class TrueorFalse2{
    boolean rain;

    TrueorFalse2(boolean rain){
    }
}

public class TakeaUmbrella {
    public static void main(String[] args) {
        boolean TrueorFalse = false;
        TrueorFalse2 rain2 = new TrueorFalse2(true);
        if (rain2.rain != TrueorFalse){
        System.out.println("Open a umbrella");
    } else
            System.out.println("Close a umbrella");
    }
}
