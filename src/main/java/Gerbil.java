import java.util.ArrayList;
import java.util.List;

public class Gerbil {
    int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("gerbilNumber " + gerbilNumber);
    }

    public static void main(String[] args) {
        List<Gerbil> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
          list.add(new Gerbil(i));
        }

        for (int i = 0; i < 10; i++) {
            list.get(i).hop();
        }
    }
}
