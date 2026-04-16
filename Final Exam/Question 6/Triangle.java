class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getDescription() {
        return "Triangle with base = " + base + ", height = " + height;
    }
}
