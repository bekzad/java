class GalToLitTable {
    public static void main(String args[]) {
        double i = 1;
        for (int counter = 0; counter < 144; counter++) {
            System.out.println(i + " inches equals: " + i * 0.0254000508 + " meters" );
            if ( i % 12 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}