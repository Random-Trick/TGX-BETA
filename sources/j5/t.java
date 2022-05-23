package j5;

import java.util.Arrays;

public final class t extends s {
    public final byte[] f15086b;

    public t(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f15086b = bArr;
    }

    @Override
    public final byte[] r() {
        return this.f15086b;
    }
}
