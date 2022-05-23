package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import org.thunderdog.challegram.Log;

public class U implements H {
    private final Collection f14346a;
    private Iterator f14347b = null;
    private final int f14348c;
    private long f14349d;
    private int f14350e;

    public U(Collection collection, int i10) {
        this.f14346a = collection;
        this.f14348c = (i10 & Log.TAG_EMOJI) == 0 ? i10 | 64 | Log.TAG_VIDEO : i10;
    }

    @Override
    public final boolean a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        if (this.f14347b == null) {
            this.f14347b = this.f14346a.iterator();
            this.f14349d = this.f14346a.size();
        }
        if (!this.f14347b.hasNext()) {
            return false;
        }
        consumer.l(this.f14347b.next());
        return true;
    }

    @Override
    public final int characteristics() {
        return this.f14348c;
    }

    @Override
    public final long estimateSize() {
        if (this.f14347b != null) {
            return this.f14349d;
        }
        this.f14347b = this.f14346a.iterator();
        long size = this.f14346a.size();
        this.f14349d = size;
        return size;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Iterator it = this.f14347b;
        if (it == null) {
            it = this.f14346a.iterator();
            this.f14347b = it;
            this.f14349d = this.f14346a.size();
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
        }
    }

    @Override
    public Comparator getComparator() {
        if (AbstractC0264a.k(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override
    public final long getExactSizeIfKnown() {
        return AbstractC0264a.h(this);
    }

    @Override
    public final boolean hasCharacteristics(int i10) {
        return AbstractC0264a.k(this, i10);
    }

    @Override
    public final H trySplit() {
        long j10;
        java.util.Iterator it = this.f14347b;
        if (it == null) {
            it = this.f14346a.iterator();
            this.f14347b = it;
            j10 = this.f14346a.size();
            this.f14349d = j10;
        } else {
            j10 = this.f14349d;
        }
        if (j10 <= 1 || !it.hasNext()) {
            return null;
        }
        int i10 = this.f14350e + Log.TAG_CAMERA;
        if (i10 > j10) {
            i10 = (int) j10;
        }
        if (i10 > 33554432) {
            i10 = 33554432;
        }
        Object[] objArr = new Object[i10];
        int i11 = 0;
        do {
            objArr[i11] = it.next();
            i11++;
            if (i11 >= i10) {
                break;
            }
        } while (it.hasNext());
        this.f14350e = i11;
        long j11 = this.f14349d;
        if (j11 != Long.MAX_VALUE) {
            this.f14349d = j11 - i11;
        }
        return new M(objArr, 0, i11, this.f14348c);
    }
}
