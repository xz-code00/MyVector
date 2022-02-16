class Main {

    public static void main(String args[]) {
        Dipendente d1 = new Dipendente("Rossi", 1500);
        Dipendente d2 = new Dipendente("Bianchi", 4000);
        Dipendente d3 = new Dipendente("Blu", 1500);
        Dipendente d4 = new Dipendente("Verdi", 4000);
        Dipendente d5 = new Dipendente("Viola", 1500);


        MyVector vettore1 = new MyVector();

        vettore1.add(d1);
        vettore1.add(d2);
        vettore1.add(d3);
        vettore1.add(d4);
        vettore1.add(d5);

        System.out.println(vettore1.toString());

        System.out.println(vettore1.contains(d1));

        vettore1.remove(2);
        System.out.println(vettore1.toString());

        vettore1.clear();
        System.out.println(vettore1.toString());

        System.out.println(vettore1.size());

    }

}
