public class Main {
    public static void main(String[] args) {
        Cat newCat = new Cat();
        Cat newCat2 = new Cat(5, 45, "Lucy");

        newCat.move();
        newCat2.move2(5);

        newCat.status();
        newCat2.status();

        System.out.println("Before creating objects: " + Cylinder.getNoOfCylinder());
        System.out.println();

        Cylinder c1 = new Cylinder();
        System.out.println("After creating first object " + c1.getNoOfCylinder());
        System.out.println("radius: " + c1.r + " height: " + c1.h);
        System.out.println();

        Cylinder c2 = new Cylinder(10, 20);
        System.out.println("After creating second object " + c2.getNoOfCylinder());
        System.out.println("Base Area: " + c2.calculateBaseArea());
        System.out.println("Surface Area: " + c2.calculateSurfaceArea());
        System.out.println("Volume: " + c2.calculateVolume());
        System.out.println("Mass: " + c2.calculateMass(5.12));

        Person p = new Person();
        p.setName("Selim");
        p.setAge(16);
        System.out.println("Person name: " + p.getName());
        System.out.println("Person id: " + p.getId());
        System.out.println("Person age: " + p.getAge());


        Product p1 = new Product("Iphone 17", 23, 78000);
        Product p2 = new Product();

        System.out.println("Product1 id : " + p1.getProductId());
        System.out.println("Product2 id : " + p2.getProductId());

        System.out.println("Name: " + p1.getName());
        System.out.println("Quantity: " + p1.getQuantity());
        System.out.println("Price:" + p1.getPrice());
        System.out.println("Item Value:" + p1.getItemValue());

        p2.setName("Galaxy Z Fold7");
        p2.setQuantity(20);
        p2.setPrice(50000);

        System.out.println("Second product information: " + p2.toString());
    }
}
