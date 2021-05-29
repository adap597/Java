public class LC { 

    public static void main(String[] args) {

        // print integers from 1 to 100, 10 per line
        int START = 1;
        int END   = 100;
        int PER_LINE = 10;
        for (int i = START; i <= END; i++) {
            System.out.print(i + " ");
            if ((i + 1) % PER_LINE == 0) System.out.println();
        }
        System.out.println();
    }
}
