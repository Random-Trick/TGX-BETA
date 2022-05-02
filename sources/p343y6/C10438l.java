package p343y6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class C10438l {
    public final AbstractC10423c f33506a;
    public final boolean f33507b;
    public final AbstractC10442c f33508c;
    public final int f33509d;

    public static class C10439a implements AbstractC10442c {
        public final AbstractC10423c f33510a;

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
                return C10439a.this.f33510a.mo5142c(this.f33516c, i);
            }
        }

        public C10439a(AbstractC10423c cVar) {
            this.f33510a = cVar;
        }

        public AbstractC10441b mo5106a(C10438l lVar, CharSequence charSequence) {
            return new C10440a(lVar, charSequence);
        }
    }

    public static abstract class AbstractC10441b extends AbstractC10419a<String> {
        public final AbstractC10423c f33512M;
        public final boolean f33513N;
        public int f33514O = 0;
        public int f33515P;
        public final CharSequence f33516c;

        public AbstractC10441b(C10438l lVar, CharSequence charSequence) {
            this.f33512M = lVar.f33506a;
            this.f33513N = lVar.f33507b;
            this.f33515P = lVar.f33509d;
            this.f33516c = charSequence;
        }

        public String mo5110a() {
            int f;
            int i = this.f33514O;
            while (true) {
                int i2 = this.f33514O;
                if (i2 == -1) {
                    return m5153b();
                }
                f = mo5107f(i2);
                if (f == -1) {
                    f = this.f33516c.length();
                    this.f33514O = -1;
                } else {
                    this.f33514O = mo5108e(f);
                }
                int i3 = this.f33514O;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f33514O = i4;
                    if (i4 > this.f33516c.length()) {
                        this.f33514O = -1;
                    }
                } else {
                    while (i < f && this.f33512M.mo5141e(this.f33516c.charAt(i))) {
                        i++;
                    }
                    while (f > i && this.f33512M.mo5141e(this.f33516c.charAt(f - 1))) {
                        f--;
                    }
                    if (!this.f33513N || i != f) {
                        break;
                    }
                    i = this.f33514O;
                }
            }
            int i5 = this.f33515P;
            if (i5 == 1) {
                f = this.f33516c.length();
                this.f33514O = -1;
                while (f > i && this.f33512M.mo5141e(this.f33516c.charAt(f - 1))) {
                    f--;
                }
            } else {
                this.f33515P = i5 - 1;
            }
            return this.f33516c.subSequence(i, f).toString();
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
        return this.f33508c.mo5106a(this, charSequence);
    }

    public C10438l(AbstractC10442c cVar, boolean z, AbstractC10423c cVar2, int i) {
        this.f33508c = cVar;
        this.f33507b = z;
        this.f33506a = cVar2;
        this.f33509d = i;
    }
}
