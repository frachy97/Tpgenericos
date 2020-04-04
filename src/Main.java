public class Main  {
    public static void main(String[] args) {

        Generic genericos = new Generic<Product>();

        Product lapiz = new Product("lapiz", 50);
        Product fibron= new Product("fibron", 60);
        Product cuaderno= new Product("cuaderno", 160);


        genericos.add(lapiz);
        genericos.add(fibron);
        genericos.add(cuaderno);

        System.out.println("Maximo:" + genericos.max().toString());
        System.out.println("Min:" + genericos.min().toString());


        System.out.println("Borrando:" + genericos.deleteLastElement().toString());



        Pila pila = new Pila<Integer>();
        pila.push(2);
        pila.push(3);
        pila.push(3);
        pila.push(4);

        System.out.println("Cantidad Pila:"+ pila.size());

        System.out.println("Primer elemento:"+ pila.pop());

        System.out.println("Cantidad Pila:"+ pila.size());

    }
}
