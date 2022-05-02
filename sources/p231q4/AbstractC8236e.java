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
    public final ArrayDeque<C8238b> f26685a = new ArrayDeque<>();
    public final ArrayDeque<AbstractC8047k> f26686b;
    public final PriorityQueue<C8238b> f26687c;
    public C8238b f26688d;
    public long f26689e;
    public long f26690f;

    public static final class C8238b extends C8046j implements Comparable<C8238b> {
        public long f26691S;

        public C8238b() {
        }

        public int compareTo(C8238b bVar) {
            if (isEndOfStream() != bVar.isEndOfStream()) {
                return isEndOfStream() ? 1 : -1;
            }
            long j = this.f26126N - bVar.f26126N;
            if (j == 0) {
                j = this.f26691S - bVar.f26691S;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public static final class C8239c extends AbstractC8047k {
        public AbstractC3437a.AbstractC3438a<C8239c> f26692c;

        public C8239c(AbstractC3437a.AbstractC3438a<C8239c> aVar) {
            this.f26692c = aVar;
        }

        @Override
        public final void release() {
            this.f26692c.mo11835a(this);
        }
    }

    public AbstractC8236e() {
        for (int i = 0; i < 10; i++) {
            this.f26685a.add(new C8238b());
        }
        this.f26686b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f26686b.add(new C8239c(new AbstractC3437a.AbstractC3438a() {
                @Override
                public final void mo11835a(AbstractC3437a aVar) {
                    AbstractC8236e.this.m13061p((AbstractC8236e.C8239c) aVar);
                }
            }));
        }
        this.f26687c = new PriorityQueue<>();
    }

    @Override
    public void mo13075a() {
    }

    @Override
    public void mo13074c(long j) {
        this.f26689e = j;
    }

    @Override
    public void flush() {
        this.f26690f = 0L;
        this.f26689e = 0L;
        while (!this.f26687c.isEmpty()) {
            m13062o((C8238b) C1216l0.m37968j(this.f26687c.poll()));
        }
        C8238b bVar = this.f26688d;
        if (bVar != null) {
            m13062o(bVar);
            this.f26688d = null;
        }
    }

    public abstract AbstractC8041f mo13070g();

    public abstract void mo13069h(C8046j jVar);

    public C8046j mo13072e() {
        C1186a.m38184f(this.f26688d == null);
        if (this.f26685a.isEmpty()) {
            return null;
        }
        C8238b pollFirst = this.f26685a.pollFirst();
        this.f26688d = pollFirst;
        return pollFirst;
    }

    public AbstractC8047k mo13073d() {
        if (this.f26686b.isEmpty()) {
            return null;
        }
        while (!this.f26687c.isEmpty() && ((C8238b) C1216l0.m37968j(this.f26687c.peek())).f26126N <= this.f26689e) {
            C8238b bVar = (C8238b) C1216l0.m37968j(this.f26687c.poll());
            if (bVar.isEndOfStream()) {
                AbstractC8047k kVar = (AbstractC8047k) C1216l0.m37968j(this.f26686b.pollFirst());
                kVar.addFlag(4);
                m13062o(bVar);
                return kVar;
            }
            mo13069h(bVar);
            if (mo13064m()) {
                AbstractC8041f g = mo13070g();
                AbstractC8047k kVar2 = (AbstractC8047k) C1216l0.m37968j(this.f26686b.pollFirst());
                kVar2.m13721e(bVar.f26126N, g, Long.MAX_VALUE);
                m13062o(bVar);
                return kVar2;
            }
            m13062o(bVar);
        }
        return null;
    }

    public final AbstractC8047k m13066k() {
        return this.f26686b.pollFirst();
    }

    public final long m13065l() {
        return this.f26689e;
    }

    public abstract boolean mo13064m();

    public void mo13071f(C8046j jVar) {
        C1186a.m38189a(jVar == this.f26688d);
        C8238b bVar = (C8238b) jVar;
        if (bVar.isDecodeOnly()) {
            m13062o(bVar);
        } else {
            long j = this.f26690f;
            this.f26690f = 1 + j;
            bVar.f26691S = j;
            this.f26687c.add(bVar);
        }
        this.f26688d = null;
    }

    public final void m13062o(C8238b bVar) {
        bVar.clear();
        this.f26685a.add(bVar);
    }

    public void m13061p(AbstractC8047k kVar) {
        kVar.clear();
        this.f26686b.add(kVar);
    }
}
