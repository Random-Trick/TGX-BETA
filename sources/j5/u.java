package j5;

import java.lang.ref.WeakReference;

public abstract class u extends s {
    public static final WeakReference<byte[]> f15087c = new WeakReference<>(null);
    public WeakReference<byte[]> f15088b = f15087c;

    public u(byte[] bArr) {
        super(bArr);
    }

    @Override
    public final byte[] r() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f15088b.get();
            if (bArr == null) {
                bArr = x0();
                this.f15088b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] x0();
}
