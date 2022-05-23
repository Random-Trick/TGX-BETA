package c4;

import c4.i0;
import c5.b0;
import com.google.android.exoplayer2.extractor.g;
import t3.f;
import t3.g;
import t3.h;
import t3.l;
import t3.q;

public final class b implements f {
    public static final l f4446d = a.f4425b;
    public final c f4447a = new c();
    public final b0 f4448b = new b0(2786);
    public boolean f4449c;

    public static f[] d() {
        return new f[]{new b()};
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        this.f4449c = false;
        this.f4447a.c();
    }

    @Override
    public int e(g gVar, q qVar) {
        int b10 = gVar.b(this.f4448b.d(), 0, 2786);
        if (b10 == -1) {
            return -1;
        }
        this.f4448b.P(0);
        this.f4448b.O(b10);
        if (!this.f4449c) {
            this.f4447a.f(0L, 4);
            this.f4449c = true;
        }
        this.f4447a.a(this.f4448b);
        return 0;
    }

    @Override
    public void f(h hVar) {
        this.f4447a.e(hVar, new i0.d(0, 1));
        hVar.k();
        hVar.a(new g.b(-9223372036854775807L));
    }

    @Override
    public boolean j(t3.g r8) {
        throw new UnsupportedOperationException("Method not decompiled: c4.b.j(t3.g):boolean");
    }
}
