package g6;

import a6.t;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import k5.a;
import k5.e;
import l5.o;
import l5.r;
import n6.m;

public class l extends e<a.d.c> {
    public l(@RecentlyNonNull Context context) {
        super(context, f.f12106a, a.d.f15661a, e.a.f15674c);
    }

    @RecentlyNonNull
    public n6.l<h> t(@RecentlyNonNull final g gVar) {
        return e(r.a().b(new o(gVar) {
            public final g f12138a;

            {
                this.f12138a = gVar;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                ((t) obj).s0(this.f12138a, new p0((m) obj2), null);
            }
        }).e(2426).a());
    }
}
