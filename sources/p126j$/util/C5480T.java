package p126j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import org.thunderdog.challegram.Log;
import p126j$.util.Iterator;
import p126j$.util.function.Consumer;

public class C5480T implements AbstractC5468G {
    private final Collection f17958a;
    private Iterator f17959b = null;
    private final int f17960c;
    private long f17961d;
    private int f17962e;

    public C5480T(Collection collection, int i) {
        this.f17958a = collection;
        this.f17960c = (i & Log.TAG_EMOJI) == 0 ? i | 64 | Log.TAG_VIDEO : i;
    }

    @Override
    public boolean mo22125a(Consumer consumer) {
        Objects.requireNonNull(consumer);
        if (this.f17959b == null) {
            this.f17959b = this.f17958a.iterator();
            this.f17961d = this.f17958a.size();
        }
        if (!this.f17959b.hasNext()) {
            return false;
        }
        consumer.mo22129k(this.f17959b.next());
        return true;
    }

    @Override
    public int characteristics() {
        return this.f17960c;
    }

    @Override
    public long estimateSize() {
        if (this.f17959b != null) {
            return this.f17961d;
        }
        this.f17959b = this.f17958a.iterator();
        long size = this.f17958a.size();
        this.f17961d = size;
        return size;
    }

    @Override
    public void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Iterator it = this.f17959b;
        if (it == null) {
            it = this.f17958a.iterator();
            this.f17959b = it;
            this.f17961d = this.f17958a.size();
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
        }
    }

    @Override
    public Comparator getComparator() {
        if (AbstractC5485a.m22569j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override
    public long getExactSizeIfKnown() {
        return AbstractC5485a.m22570h(this);
    }

    @Override
    public boolean hasCharacteristics(int i) {
        return AbstractC5485a.m22569j(this, i);
    }

    @Override
    public AbstractC5468G trySplit() {
        long j;
        java.util.Iterator it = this.f17959b;
        if (it == null) {
            it = this.f17958a.iterator();
            this.f17959b = it;
            j = this.f17958a.size();
            this.f17961d = j;
        } else {
            j = this.f17961d;
        }
        if (j <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.f17962e + Log.TAG_CAMERA;
        if (i > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.f17962e = i2;
        long j2 = this.f17961d;
        if (j2 != Long.MAX_VALUE) {
            this.f17961d = j2 - i2;
        }
        return new C5473L(objArr, 0, i2, this.f17960c);
    }
}
