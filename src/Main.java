import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        Printer mah = new Printer();
        Sum a = Sum.create();
        int r = a.add(1,2);
        mah.print(r);
    }
}



