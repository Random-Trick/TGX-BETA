package p231q4;

import com.google.android.exoplayer2.decoder.AbstractC3437a;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p020b5.C1186a;
import p020b5.C1216l0;
import p217p4.AbstractC8041f;
import p217p4.AbstractC8042g;
import p217p4.AbstractC8047k;
import p217p4.C8046j;
import p231q4.AbstractC8236e;

public abstract class AbstractC8236e implements AbstractC8042g {
    public final ArrayDeque<C8238b> f26688a = new ArrayDeque<>();
    public final ArrayDeque<AbstractC8047k> f26689b;
    public final PriorityQueue<C8238b> f26690c;
    public C8238b f26691d;
    public long f26692e;
    public long f26693f;

    public static final class C8238b extends C8046j implements Comparable<C8238b> {
        public long f26694S;

        public C8238b() {
        }

        public int compareTo(C8238b bVar) {
            if (isEndOfStream() != bVar.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j = this.f26129N - bVar.f26129N;
            if (j == 0) {
                j = this.f26694S - bVar.f26694S;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public static final class C8239c extends AbstractC8047k {
        public AbstractC3437a.AbstractC3438a<C8239c> f26695c;

        public C8239c(AbstractC3437a.AbstractC3438a<C8239c> aVar) {
            this.f26695c = aVar;
        }

        @Override
        public final void release() {
            this.f26695c.mo11834a(this);
        }
    }

    public AbstractC8236e() {
        for (int i = 0; i < 10; i++) {
            this.f26688a.add(new C8238b());
        }
        this.f26689b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f26689b.add(new C8239c(new AbstractC3437a.AbstractC3438a() {
                @Override
                public final void mo11834a(AbstractC3437a aVar) {
                    AbstractC8236e.this.m13060p((AbstractC8236e.C8239c) aVar);
                }
            }));
        }
        this.f26690c = new PriorityQueue<>();
    }

    @Override
    public void mo13074a() {
    }

    @Override
    public void mo13073c(long j) {
        this.f26692e = j;
    }

    @Override
    public void flush() {
        this.f26693f = 0L;
        this.f26692e = 0L;
        while (!this.f26690c.isEmpty()) {
            m13061o((C8238b) C1216l0.m37971j(this.f26690c.poll()));
        }
        C8238b bVar = this.f26691d;
        if (bVar != null) {
            m13061o(bVar);
            this.f26691d = null;
        }
    }

    public abstract AbstractC8041f mo13069g();

    public abstract void mo13068h(C8046j jVar);

    public C8046j mo13071e() {
        C1186a.m38187f(this.f26691d == null);
        if (this.f26688a.isEmpty()) {
            return null;
        }
        C8238b pollFirst = this.f26688a.pollFirst();
        this.f26691d = pollFirst;
        return pollFirst;
    }

    public AbstractC8047k mo13072d() {
        if (this.f26689b.isEmpty()) {
            return null;
        }
        while (!this.f26690c.isEmpty() && ((C8238b) C1216l0.m37971j(this.f26690c.peek())).f26129N <= this.f26692e) {
            C8238b bVar = (C8238b) C1216l0.m37971j(this.f26690c.poll());
            if (bVar.isEndOfStream()) {
                AbstractC8047k kVar = (AbstractC8047k) C1216l0.m37971j(this.f26689b.pollFirst());
                kVar.addFlag(4);
                m13061o(bVar);
                return kVar;
            }
            mo13068h(bVar);
            if (mo13063m()) {
                AbstractC8041f g = mo13069g();
                AbstractC8047k kVar2 = (AbstractC8047k) C1216l0.m37971j(this.f26689b.pollFirst());
                kVar2.m13720e(bVar.f26129N, g, Long.MAX_VALUE);
                m13061o(bVar);
                return kVar2;
            }
            m13061o(bVar);
        }
        return null;
    }

    public final AbstractC8047k m13065k() {
        return this.f26689b.pollFirst();
    }

    public final long m13064l() {
        return this.f26692e;
    }

    public abstract boolean mo13063m();

    public void mo13070f(C8046j jVar) {
        C1186a.m38192a(jVar == this.f26691d);
        C8238b bVar = (C8238b) jVar;
        if (bVar.isDecodeOnly()) {
            m13061o(bVar);
        } else {
            long j = this.f26693f;
            this.f26693f = 1 + j;
            bVar.f26694S = j;
            this.f26690c.add(bVar);
        }
        this.f26691d = null;
    }

    public final void m13061o(C8238b bVar) {
        bVar.clear();
        this.f26688a.add(bVar);
    }

    public void m13060p(AbstractC8047k kVar) {
        kVar.clear();
        this.f26689b.add(kVar);
    }
}
