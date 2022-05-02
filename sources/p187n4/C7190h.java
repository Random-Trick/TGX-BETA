package p187n4;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p006a5.AbstractC0154k;
import p006a5.C0167s;
import p270t3.AbstractC8965l;
import p343y6.AbstractC10444n;

public final class C7190h implements AbstractC7164a0 {
    public final AbstractC0154k.AbstractC0155a f22881a;
    public final C7191a f22882b;
    public long f22883c;
    public long f22884d;
    public long f22885e;
    public float f22886f;
    public float f22887g;

    public static final class C7191a {
        public final AbstractC0154k.AbstractC0155a f22888a;
        public final AbstractC8965l f22889b;
        public final Map<Integer, AbstractC10444n<AbstractC7164a0>> f22890c = new HashMap();
        public final Set<Integer> f22891d = new HashSet();
        public final Map<Integer, AbstractC7164a0> f22892e = new HashMap();

        public C7191a(AbstractC0154k.AbstractC0155a aVar, AbstractC8965l lVar) {
            this.f22888a = aVar;
            this.f22889b = lVar;
        }
    }

    public C7190h(Context context, AbstractC8965l lVar) {
        this(new C0167s.C0168a(context), lVar);
    }

    public C7190h(AbstractC0154k.AbstractC0155a aVar, AbstractC8965l lVar) {
        this.f22881a = aVar;
        this.f22882b = new C7191a(aVar, lVar);
        this.f22883c = -9223372036854775807L;
        this.f22884d = -9223372036854775807L;
        this.f22885e = -9223372036854775807L;
        this.f22886f = -3.4028235E38f;
        this.f22887g = -3.4028235E38f;
    }
}
