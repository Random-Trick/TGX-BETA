package xa;

import ja.d0;
import java.util.NoSuchElementException;

public final class f extends d0 {
    public int M;
    public final int f26194a;
    public final int f26195b;
    public boolean f26196c;

    public f(int i10, int i11, int i12) {
        this.f26194a = i12;
        this.f26195b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f26196c = z10;
        this.M = !z10 ? i11 : i10;
    }

    @Override
    public int d() {
        int i10 = this.M;
        if (i10 != this.f26195b) {
            this.M = this.f26194a + i10;
        } else if (this.f26196c) {
            this.f26196c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }

    @Override
    public boolean hasNext() {
        return this.f26196c;
    }
}
