package p343y6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class C10438l {
    public final AbstractC10423c f33503a;
    public final boolean f33504b;
    public final AbstractC10442c f33505c;
    public final int f33506d;

    public static class C10439a implements AbstractC10442c {
        public final AbstractC10423c f33507a;

        public class C10440a extends AbstractC10441b {
            public C10440a(C10438l lVar, CharSequence charSequence) {
                super(lVar, charSequence);
            }

            @Override
            public int mo5108e(int i) {
                return i + 1;
            }

            @Override
            public int mo5107f(int i) {
                return C10439a.this.f33507a.mo5142c(this.f33513c, i);
            }
        }

        public C10439a(AbstractC10423c cVar) {
            this.f33507a = cVar;
        }

        public AbstractC10441b mo5106a(C10438l lVar, CharSequence charSequence) {
            return new C10440a(lVar, charSequence);
        }
    }

    public static abstract class AbstractC10441b extends AbstractC10419a<String> {
        public final AbstractC10423c f33509M;
        public final boolean f33510N;
        public int f33511O = 0;
        public int f33512P;
        public final CharSequence f33513c;

        public AbstractC10441b(C10438l lVar, CharSequence charSequence) {
            this.f33509M = lVar.f33503a;
            this.f33510N = lVar.f33504b;
            this.f33512P = lVar.f33506d;
            this.f33513c = charSequence;
        }

        public String mo5110a() {
            int f;
            int i = this.f33511O;
            while (true) {
                int i2 = this.f33511O;
                if (i2 == -1) {
                    return m5153b();
                }
                f = mo5107f(i2);
                if (f == -1) {
                    f = this.f33513c.length();
                    this.f33511O = -1;
                } else {
                    this.f33511O = mo5108e(f);
                }
                int i3 = this.f33511O;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f33511O = i4;
                    if (i4 > this.f33513c.length()) {
                        this.f33511O = -1;
                    }
                } else {
                    while (i < f && this.f33509M.mo5141e(this.f33513c.charAt(i))) {
                        i++;
                    }
                    while (f > i && this.f33509M.mo5141e(this.f33513c.charAt(f - 1))) {
                        f--;
                    }
                    if (!this.f33510N || i != f) {
                        break;
                    }
                    i = this.f33511O;
                }
            }
            int i5 = this.f33512P;
            if (i5 == 1) {
                f = this.f33513c.length();
                this.f33511O = -1;
                while (f > i && this.f33509M.mo5141e(this.f33513c.charAt(f - 1))) {
                    f--;
                }
            } else {
                this.f33512P = i5 - 1;
            }
            return this.f33513c.subSequence(i, f).toString();
        }

        public abstract int mo5108e(int i);

        public abstract int mo5107f(int i);
    }

    public interface AbstractC10442c {
        Iterator<String> mo5106a(C10438l lVar, CharSequence charSequence);
    }

    public C10438l(AbstractC10442c cVar) {
        this(cVar, false, AbstractC10423c.m5144f(), Integer.MAX_VALUE);
    }

    public static C10438l m5115d(char c) {
        return m5114e(AbstractC10423c.m5145d(c));
    }

    public static C10438l m5114e(AbstractC10423c cVar) {
        C10433i.m5129i(cVar);
        return new C10438l(new C10439a(cVar));
    }

    public List<String> m5113f(CharSequence charSequence) {
        C10433i.m5129i(charSequence);
        Iterator<String> g = m5112g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add(g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator<String> m5112g(CharSequence charSequence) {
        return this.f33505c.mo5106a(this, charSequence);
    }

    public C10438l(AbstractC10442c cVar, boolean z, AbstractC10423c cVar2, int i) {
        this.f33505c = cVar;
        this.f33504b = z;
        this.f33503a = cVar2;
        this.f33506d = i;
    }
}
