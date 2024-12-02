public class Fox {
    private int age;
    private String color;

    Fox(int age, String color) {
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fox is " + age + " years old and it's color is " + color + '\n';
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
}