package o4;

import android.content.Context;
import b5.k;
import b5.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o4.s;
import t3.l;
import z6.o;

public final class g implements s.a {
    public final k.a f19064a;
    public final a f19065b;
    public long f19066c;
    public long f19067d;
    public long f19068e;
    public float f19069f;
    public float f19070g;

    public static final class a {
        public final k.a f19071a;
        public final l f19072b;
        public final Map<Integer, o<s.a>> f19073c = new HashMap();
        public final Set<Integer> f19074d = new HashSet();
        public final Map<Integer, s.a> f19075e = new HashMap();

        public a(k.a aVar, l lVar) {
            this.f19071a = aVar;
            this.f19072b = lVar;
        }
    }

    public g(Context context, l lVar) {
        this(new s.a(context), lVar);
    }

    public g(k.a aVar, l lVar) {
        this.f19064a = aVar;
        this.f19065b = new a(aVar, lVar);
        this.f19066c = -9223372036854775807L;
        this.f19067d = -9223372036854775807L;
        this.f19068e = -9223372036854775807L;
        this.f19069f = -3.4028235E38f;
        this.f19070g = -3.4028235E38f;
    }
}
