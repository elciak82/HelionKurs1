package videopoint.exceptions;

public class Main {
    public static void main(String[] args) { //staraj się uzywać jak najmniej wyjątków
        int size = -4;
        try { //do wyłapywania wyjątków
            System.out.println("area = " + countArea(size));
        } catch (IllegalArgumentException iae) { //NIE catch Exception - wyłapuje wszystko
            System.out.println("Niepoprawne dane");
        } finally { //wykonuje się zawsze
            System.out.println("Blok finally"); //wykona sie gdy poleci wyjątek, oraz gdy nie poleci - to co zawsze musimy wykonać
        }
    }

    public static int countArea (int size) {
        if(size<= 0) {throw new IllegalArgumentException("bok musi być dodatni"); }
        return size * size;
    }
}
