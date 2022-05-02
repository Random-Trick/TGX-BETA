package p174m3;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
import p020b5.AbstractC1192d;
import p020b5.C1186a;

public final class C6654n2 {
    public final AbstractC6656b f20785a;
    public final AbstractC6655a f20786b;
    public final AbstractC1192d f20787c;
    public final AbstractC6604g3 f20788d;
    public int f20789e;
    public Object f20790f;
    public Looper f20791g;
    public int f20792h;
    public long f20793i = -9223372036854775807L;
    public boolean f20794j = true;
    public boolean f20795k;
    public boolean f20796l;
    public boolean f20797m;
    public boolean f20798n;

    public interface AbstractC6655a {
        void mo19649d(C6654n2 n2Var);
    }

    public interface AbstractC6656b {
        void mo15492u(int i, Object obj);
    }

    public C6654n2(AbstractC6655a aVar, AbstractC6656b bVar, AbstractC6604g3 g3Var, int i, AbstractC1192d dVar, Looper looper) {
        this.f20786b = aVar;
        this.f20785a = bVar;
        this.f20788d = g3Var;
        this.f20791g = looper;
        this.f20787c = dVar;
        this.f20792h = i;
    }

    public synchronized boolean m19663a(long j) {
        boolean z;
        C1186a.m38187f(this.f20795k);
        C1186a.m38187f(this.f20791g.getThread() != Thread.currentThread());
        long d = this.f20787c.mo38084d() + j;
        while (true) {
            z = this.f20797m;
            if (z || j <= 0) {
                break;
            }
            this.f20787c.mo38085c();
            wait(j);
            j = d - this.f20787c.mo38084d();
        }
        if (!z) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f20796l;
    }

    public boolean m19662b() {
        return this.f20794j;
    }

    public Looper m19661c() {
        return this.f20791g;
    }

    public int m19660d() {
        return this.f20792h;
    }

    public Object m19659e() {
        return this.f20790f;
    }

    public long m19658f() {
        return this.f20793i;
    }

    public AbstractC6656b m19657g() {
        return this.f20785a;
    }

    public AbstractC6604g3 m19656h() {
        return this.f20788d;
    }

    public int m19655i() {
        return this.f20789e;
    }

    public synchronized boolean m19654j() {
        return this.f20798n;
    }

    public synchronized void m19653k(boolean z) {
        this.f20796l = z | this.f20796l;
        this.f20797m = true;
        notifyAll();
    }

    public C6654n2 m19652l() {
        C1186a.m38187f(!this.f20795k);
        if (this.f20793i == -9223372036854775807L) {
            C1186a.m38192a(this.f20794j);
        }
        this.f20795k = true;
        this.f20786b.mo19649d(this);
        return this;
    }

    public C6654n2 m19651m(Object obj) {
        C1186a.m38187f(!this.f20795k);
        this.f20790f = obj;
        return this;
    }

    public C6654n2 m19650n(int i) {
        C1186a.m38187f(!this.f20795k);
        this.f20789e = i;
        return this;
    }
}
