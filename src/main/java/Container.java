
public class Container {

    private int quantity;

    public Container() {
    }

    public int contains() {
        return this.quantity;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.quantity = this.quantity + amount;
        }
        if (quantity > 100) {
            this.quantity = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (amount <= this.quantity) {
                this.quantity = this.quantity - amount;
                if (quantity < 0) {
                    this.quantity = 0;
                }
            } else {
                this.quantity = this.quantity - amount;
                if (quantity < 0) {
                    this.quantity = 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        return quantity + "/100";
    }
}
