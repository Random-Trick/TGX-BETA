package c4;

import c4.i0;
import c5.b0;
import com.google.android.exoplayer2.extractor.g;
import org.thunderdog.challegram.Log;
import t3.f;
import t3.g;
import t3.h;
import t3.l;
import t3.q;

public final class e implements f {
    public static final l f4471d = d.f4468b;
    public final f f4472a = new f();
    public final b0 f4473b = new b0((int) Log.TAG_VIDEO);
    public boolean f4474c;

    public static f[] d() {
        return new f[]{new e()};
    }

    @Override
    public void a() {
    }

    @Override
    public void b(long j10, long j11) {
        this.f4474c = false;
        this.f4472a.c();
    }

    @Override
    public int e(g gVar, q qVar) {
        int b10 = gVar.b(this.f4473b.d(), 0, Log.TAG_VIDEO);
        if (b10 == -1) {
            return -1;
        }
        this.f4473b.P(0);
        this.f4473b.O(b10);
        if (!this.f4474c) {
            this.f4472a.f(0L, 4);
            this.f4474c = true;
        }
        this.f4472a.a(this.f4473b);
        return 0;
    }

    @Override
    public void f(h hVar) {
        this.f4472a.e(hVar, new i0.d(0, 1));
        hVar.k();
        hVar.a(new g.b(-9223372036854775807L));
    }

    @Override
    public boolean j(t3.g r9) {
        throw new UnsupportedOperationException("Method not decompiled: c4.e.j(t3.g):boolean");
    }
}
