package january.ex010hackerrankcalculatemealprice;

public class MealPriceCalculator {

    // TODO: 24.01.2024 Finish it
    public static void main(String[] args) {
        class Person {
            private int age;

            public Person(int initialAge) {
                if (initialAge >= 0) {
                    this.age = initialAge;
                } else {
                    this.age = 0;
                    System.out.println("Age is not valid, setting age to 0.");
                }
            }

            public void yearPasses() {
                this.age++;
            }

            public void amIOld() {
                if (this.age < 13) {
                    System.out.println("You are young.");
                } else if (this.age < 18) {
                    System.out.println("You are a teenager.");
                } else {
                    System.out.println("You are old.");
                }
            }
        }

    }
}