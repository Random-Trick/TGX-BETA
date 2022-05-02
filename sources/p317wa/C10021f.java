package p317wa;

import java.util.NoSuchElementException;
import p123ia.AbstractC5286d0;

public final class C10021f extends AbstractC5286d0 {
    public int f32627M;
    public final int f32628a;
    public final int f32629b;
    public boolean f32630c;

    public C10021f(int i, int i2, int i3) {
        this.f32628a = i3;
        this.f32629b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f32630c = z;
        this.f32627M = !z ? i2 : i;
    }

    @Override
    public int mo6206e() {
        int i = this.f32627M;
        if (i != this.f32629b) {
            this.f32627M = this.f32628a + i;
        } else if (this.f32630c) {
            this.f32630c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    @Override
    public boolean hasNext() {
        return this.f32630c;
    }
}
