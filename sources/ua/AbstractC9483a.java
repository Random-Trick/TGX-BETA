package ua;

import java.util.Random;

public abstract class AbstractC9483a extends AbstractC9486c {
    @Override
    public double mo8552b() {
        return mo6669e().nextDouble();
    }

    @Override
    public float mo8551c() {
        return mo6669e().nextFloat();
    }

    @Override
    public int mo8550d(int i) {
        return mo6669e().nextInt(i);
    }

    public abstract Random mo6669e();
}
