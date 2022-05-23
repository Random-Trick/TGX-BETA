package va;

import java.util.Random;

public abstract class a extends c {
    @Override
    public double b() {
        return e().nextDouble();
    }

    @Override
    public float c() {
        return e().nextFloat();
    }

    @Override
    public int d(int i10) {
        return e().nextInt(i10);
    }

    public abstract Random e();
}
