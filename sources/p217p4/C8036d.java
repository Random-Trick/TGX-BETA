package p217p4;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import p020b5.C1186a;
import p358z6.AbstractC11396q;

public final class C8036d implements AbstractC8042g {
    public final C8035c f26191a = new C8035c();
    public final C8046j f26192b = new C8046j();
    public final Deque<AbstractC8047k> f26193c = new ArrayDeque();
    public int f26194d;
    public boolean f26195e;

    public class C8037a extends AbstractC8047k {
        public C8037a() {
        }

        @Override
        public void release() {
            C8036d.this.m13733k(this);
        }
    }

    public static final class C8038b implements AbstractC8041f {
        public final long f26197a;
        public final AbstractC11396q<C8032b> f26198b;

        public C8038b(long j, AbstractC11396q<C8032b> qVar) {
            this.f26197a = j;
            this.f26198b = qVar;
        }

        @Override
        public int mo5200a(long j) {
            return this.f26197a > j ? 0 : -1;
        }

        @Override
        public long mo5199b(int i) {
            C1186a.m38189a(i == 0);
            return this.f26197a;
        }

        @Override
        public List<C8032b> mo5198c(long j) {
            return j >= this.f26197a ? this.f26198b : AbstractC11396q.m768D();
        }

        @Override
        public int mo5197d() {
            return 1;
        }
    }

    public C8036d() {
        for (int i = 0; i < 2; i++) {
            this.f26193c.addFirst(new C8037a());
        }
        this.f26194d = 0;
    }

    @Override
    public void mo13075a() {
        this.f26195e = true;
    }

    @Override
    public String mo13106b() {
        return "ExoplayerCuesDecoder";
    }

    @Override
    public void mo13074c(long j) {
    }

    @Override
    public void flush() {
        C1186a.m38184f(!this.f26195e);
        this.f26192b.clear();
        this.f26194d = 0;
    }

    public C8046j mo13072e() {
        C1186a.m38184f(!this.f26195e);
        if (this.f26194d != 0) {
            return null;
        }
        this.f26194d = 1;
        return this.f26192b;
    }

    public AbstractC8047k mo13073d() {
        C1186a.m38184f(!this.f26195e);
        if (this.f26194d != 2 || this.f26193c.isEmpty()) {
            return null;
        }
        AbstractC8047k removeFirst = this.f26193c.removeFirst();
        if (this.f26192b.isEndOfStream()) {
            removeFirst.addFlag(4);
        } else {
            C8046j jVar = this.f26192b;
            removeFirst.m13721e(this.f26192b.f26126N, new C8038b(jVar.f26126N, this.f26191a.m13738a(((ByteBuffer) C1186a.m38185e(jVar.f26132c)).array())), 0L);
        }
        this.f26192b.clear();
        this.f26194d = 0;
        return removeFirst;
    }

    public void mo13071f(C8046j jVar) {
        boolean z = true;
        C1186a.m38184f(!this.f26195e);
        C1186a.m38184f(this.f26194d == 1);
        if (this.f26192b != jVar) {
            z = false;
        }
        C1186a.m38189a(z);
        this.f26194d = 2;
    }

    public final void m13733k(AbstractC8047k kVar) {
        C1186a.m38184f(this.f26193c.size() < 2);
        C1186a.m38189a(!this.f26193c.contains(kVar));
        kVar.clear();
        this.f26193c.addFirst(kVar);
    }
}
