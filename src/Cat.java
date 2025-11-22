class Cat {
    public int x;
    public double direction;
    public String name;

    Cat() {
        this(0, 180.0, "");
    }

    Cat(int x, double direction, String name) {
        this.x = x;
        this.direction = direction;
        this.name = name;
    }

    void move() {
        x += 20;
    }

    void move2(int a) {
        direction += a;
    }

    void turn(double angle) {
        direction += angle;
    }

    void status() {
        System.out.println("Name: " + name + " X: " + x + " direction: " + direction);
    }
}
