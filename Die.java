
public class Die {
    private int value;
    private int sides;
    
    public Die(int sides) {
     this.sides = sides;
     this.value = this.getRandomValue();
    }

    public Die() {
     this.sides = 6;
     this.value = this.getRandomValue();
    }

    public int getRoll() {
      return this.value;
    }

    public int roll() {
      return this.value;
    }

    private int getRandomValue() {
      return (int) Math.floor(Math.random()*sides)+1;
    }
}

