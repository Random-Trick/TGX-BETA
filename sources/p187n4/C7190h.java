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
    public final AbstractC0154k.AbstractC0155a f22878a;
    public final C7191a f22879b;
    public long f22880c;
    public long f22881d;
    public long f22882e;
    public float f22883f;
    public float f22884g;

    public static final class C7191a {
        public final AbstractC0154k.AbstractC0155a f22885a;
        public final AbstractC8965l f22886b;
        public final Map<Integer, AbstractC10444n<AbstractC7164a0>> f22887c = new HashMap();
        public final Set<Integer> f22888d = new HashSet();
        public final Map<Integer, AbstractC7164a0> f22889e = new HashMap();

        public C7191a(AbstractC0154k.AbstractC0155a aVar, AbstractC8965l lVar) {
            this.f22885a = aVar;
            this.f22886b = lVar;
        }
    }

    public C7190h(Context context, AbstractC8965l lVar) {
        this(new C0167s.C0168a(context), lVar);
    }

    public C7190h(AbstractC0154k.AbstractC0155a aVar, AbstractC8965l lVar) {
        this.f22878a = aVar;
        this.f22879b = new C7191a(aVar, lVar);
        this.f22880c = -9223372036854775807L;
        this.f22881d = -9223372036854775807L;
        this.f22882e = -9223372036854775807L;
        this.f22883f = -3.4028235E38f;
        this.f22884g = -3.4028235E38f;
    }
}
