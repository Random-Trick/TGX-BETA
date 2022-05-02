package p217p4;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import p020b5.C1186a;
import p358z6.AbstractC11396q;

public final class C8036d implements AbstractC8042g {
    public final C8035c f26194a = new C8035c();
    public final C8046j f26195b = new C8046j();
    public final Deque<AbstractC8047k> f26196c = new ArrayDeque();
    public int f26197d;
    public boolean f26198e;

    public class C8037a extends AbstractC8047k {
        public C8037a() {
        }

        @Override
        public void release() {
            C8036d.this.m13732k(this);
        }
    }

    public static final class C8038b implements AbstractC8041f {
        public final long f26200a;
        public final AbstractC11396q<C8032b> f26201b;

        public C8038b(long j, AbstractC11396q<C8032b> qVar) {
            this.f26200a = j;
            this.f26201b = qVar;
        }

        @Override
        public int mo5200a(long j) {
            return this.f26200a > j ? 0 : -1;
        }

        @Override
        public long mo5199b(int i) {
            C1186a.m38192a(i == 0);
            return this.f26200a;
        }

        @Override
        public List<C8032b> mo5198c(long j) {
            return j >= this.f26200a ? this.f26201b : AbstractC11396q.m768D();
        }

        @Override
        public int mo5197d() {
            return 1;
        }
    }

    public C8036d() {
        for (int i = 0; i < 2; i++) {
            this.f26196c.addFirst(new C8037a());
        }
        this.f26197d = 0;
    }

    @Override
    public void mo13074a() {
        this.f26198e = true;
    }

    @Override
    public String mo13105b() {
        return "ExoplayerCuesDecoder";
    }

    @Override
    public void mo13073c(long j) {
    }

    @Override
    public void flush() {
        C1186a.m38187f(!this.f26198e);
        this.f26195b.clear();
        this.f26197d = 0;
    }

    public C8046j mo13071e() {
        C1186a.m38187f(!this.f26198e);
        if (this.f26197d != 0) {
            return null;
        }
        this.f26197d = 1;
        return this.f26195b;
    }

    public AbstractC8047k mo13072d() {
        C1186a.m38187f(!this.f26198e);
        if (this.f26197d != 2 || this.f26196c.isEmpty()) {
            return null;
        }
        AbstractC8047k removeFirst = this.f26196c.removeFirst();
        if (this.f26195b.isEndOfStream()) {
            removeFirst.addFlag(4);
        } else {
            C8046j jVar = this.f26195b;
            removeFirst.m13720e(this.f26195b.f26129N, new C8038b(jVar.f26129N, this.f26194a.m13737a(((ByteBuffer) C1186a.m38188e(jVar.f26135c)).array())), 0L);
        }
        this.f26195b.clear();
        this.f26197d = 0;
        return removeFirst;
    }

    public void mo13070f(C8046j jVar) {
        boolean z = true;
        C1186a.m38187f(!this.f26198e);
        C1186a.m38187f(this.f26197d == 1);
        if (this.f26195b != jVar) {
            z = false;
        }
        C1186a.m38192a(z);
        this.f26197d = 2;
    }

    public final void m13732k(AbstractC8047k kVar) {
        C1186a.m38187f(this.f26196c.size() < 2);
        C1186a.m38192a(!this.f26196c.contains(kVar));
        kVar.clear();
        this.f26196c.addFirst(kVar);
    }
}
