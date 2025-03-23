class strbuilder {
    public static void main(String[] args) {
        // String builder are mutable
        
        // StringBuilder sb1 = new StringBuilder();//blank default capacity 16
        StringBuilder sb2 = new StringBuilder("Hello");
        // StringBuilder sb3 = new StringBuilder(50);

        sb2.append(" World!");
        System.out.println("Append: "+sb2);

        sb2.insert(5," Java");
        System.out.println("Insert: "+sb2);

        sb2.reverse();
        System.out.println("Reverse: "+sb2);
        
        sb2.delete(5,11);
        System.out.println("Delete: "+sb2);


    }
}
