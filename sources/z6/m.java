package z6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

public final class m {
    public final z6.c f27019a;
    public final boolean f27020b;
    public final c f27021c;
    public final int f27022d;

    public class a implements c {
        public final z6.c f27023a;

        public class C0260a extends b {
            public C0260a(m mVar, CharSequence charSequence) {
                super(mVar, charSequence);
            }

            @Override
            public int e(int i10) {
                return i10 + 1;
            }

            @Override
            public int f(int i10) {
                return a.this.f27023a.c(this.f27024c, i10);
            }
        }

        public a(z6.c cVar) {
            this.f27023a = cVar;
        }

        public b a(m mVar, CharSequence charSequence) {
            return new C0260a(mVar, charSequence);
        }
    }

    public static abstract class b extends z6.a<String> {
        public final z6.c M;
        public final boolean N;
        public int O = 0;
        public int P;
        public final CharSequence f27024c;

        public b(m mVar, CharSequence charSequence) {
            this.M = mVar.f27019a;
            this.N = mVar.f27020b;
            this.P = mVar.f27022d;
            this.f27024c = charSequence;
        }

        @CheckForNull
        public String a() {
            int f10;
            int i10 = this.O;
            while (true) {
                int i11 = this.O;
                if (i11 == -1) {
                    return b();
                }
                f10 = f(i11);
                if (f10 == -1) {
                    f10 = this.f27024c.length();
                    this.O = -1;
                } else {
                    this.O = e(f10);
                }
                int i12 = this.O;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.O = i13;
                    if (i13 > this.f27024c.length()) {
                        this.O = -1;
                    }
                } else {
                    while (i10 < f10 && this.M.e(this.f27024c.charAt(i10))) {
                        i10++;
                    }
                    while (f10 > i10 && this.M.e(this.f27024c.charAt(f10 - 1))) {
                        f10--;
                    }
                    if (!this.N || i10 != f10) {
                        break;
                    }
                    i10 = this.O;
                }
            }
            int i14 = this.P;
            if (i14 == 1) {
                f10 = this.f27024c.length();
                this.O = -1;
                while (f10 > i10 && this.M.e(this.f27024c.charAt(f10 - 1))) {
                    f10--;
                }
            } else {
                this.P = i14 - 1;
            }
            return this.f27024c.subSequence(i10, f10).toString();
        }

        public abstract int e(int i10);

        public abstract int f(int i10);
    }

    public interface c {
        Iterator<String> a(m mVar, CharSequence charSequence);
    }

    public m(c cVar) {
        this(cVar, false, z6.c.f(), Integer.MAX_VALUE);
    }

    public static m d(char c10) {
        return e(z6.c.d(c10));
    }

    public static m e(z6.c cVar) {
        j.i(cVar);
        return new m(new a(cVar));
    }

    public List<String> f(CharSequence charSequence) {
        j.i(charSequence);
        Iterator<String> g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add(g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator<String> g(CharSequence charSequence) {
        return this.f27021c.a(this, charSequence);
    }

    public m(c cVar, boolean z10, z6.c cVar2, int i10) {
        this.f27021c = cVar;
        this.f27020b = z10;
        this.f27019a = cVar2;
        this.f27022d = i10;
    }
}
