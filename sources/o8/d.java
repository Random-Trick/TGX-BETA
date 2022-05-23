package o8;

import java.util.LinkedList;
import java.util.List;
import z8.g;

public class d {
    public g f19322a = g.f27034j;
    public List<g> f19323b = new LinkedList();

    public static long b(long j10, long j11) {
        return j11 == 0 ? j10 : b(j11, j10 % j11);
    }

    public void a(g gVar) {
        if (f(gVar.E().h()) != null) {
            gVar.E().t(d());
        }
        this.f19323b.add(gVar);
    }

    public g c() {
        return this.f19322a;
    }

    public long d() {
        long j10 = 0;
        for (g gVar : this.f19323b) {
            if (j10 < gVar.E().h()) {
                j10 = gVar.E().h();
            }
        }
        return j10 + 1;
    }

    public long e() {
        long g10 = g().iterator().next().E().g();
        for (g gVar : g()) {
            g10 = b(gVar.E().g(), g10);
        }
        return g10;
    }

    public g f(long j10) {
        for (g gVar : this.f19323b) {
            if (gVar.E().h() == j10) {
                return gVar;
            }
        }
        return null;
    }

    public List<g> g() {
        return this.f19323b;
    }

    public void h(g gVar) {
        this.f19322a = gVar;
    }

    public void i(List<g> list) {
        this.f19323b = list;
    }

    public String toString() {
        String str = "Movie{ ";
        for (g gVar : this.f19323b) {
            str = String.valueOf(str) + "track_" + gVar.E().h() + " (" + gVar.getHandler() + ") ";
        }
        return String.valueOf(str) + '}';
    }
}
