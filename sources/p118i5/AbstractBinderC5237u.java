package p118i5;

import java.lang.ref.WeakReference;

public abstract class AbstractBinderC5237u extends AbstractBinderC5235s {
    public static final WeakReference<byte[]> f17384c = new WeakReference<>(null);
    public WeakReference<byte[]> f17385b = f17384c;

    public AbstractBinderC5237u(byte[] bArr) {
        super(bArr);
    }

    public abstract byte[] mo23560E0();

    @Override
    public final byte[] mo23559s() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f17385b.get();
            if (bArr == null) {
                bArr = mo23560E0();
                this.f17385b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
