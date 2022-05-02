package p317wa;

import java.util.NoSuchElementException;
import p123ia.AbstractC5286d0;

public final class C10021f extends AbstractC5286d0 {
    public int f32630M;
    public final int f32631a;
    public final int f32632b;
    public boolean f32633c;

    public C10021f(int i, int i2, int i3) {
        this.f32631a = i3;
        this.f32632b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f32633c = z;
        this.f32630M = !z ? i2 : i;
    }

    @Override
    public int mo6206e() {
        int i = this.f32630M;
        if (i != this.f32632b) {
            this.f32630M = this.f32631a + i;
        } else if (this.f32633c) {
            this.f32633c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    @Override
    public boolean hasNext() {
        return this.f32633c;
    }
}
