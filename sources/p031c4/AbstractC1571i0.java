package p031c4;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import p020b5.C1189b0;
import p020b5.C1205i0;
import p270t3.AbstractC8960h;

public interface AbstractC1571i0 {

    public static final class C1572a {
        public final String f5648a;
        public final int f5649b;
        public final byte[] f5650c;

        public C1572a(String str, int i, byte[] bArr) {
            this.f5648a = str;
            this.f5649b = i;
            this.f5650c = bArr;
        }
    }

    public static final class C1573b {
        public final int f5651a;
        public final String f5652b;
        public final List<C1572a> f5653c;
        public final byte[] f5654d;

        public C1573b(int i, String str, List<C1572a> list, byte[] bArr) {
            List<C1572a> list2;
            this.f5651a = i;
            this.f5652b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f5653c = list2;
            this.f5654d = bArr;
        }
    }

    public interface AbstractC1574c {
        SparseArray<AbstractC1571i0> mo36405a();

        AbstractC1571i0 mo36404b(int i, C1573b bVar);
    }

    public static final class C1575d {
        public final String f5655a;
        public final int f5656b;
        public final int f5657c;
        public int f5658d;
        public String f5659e;

        public C1575d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public void m36409a() {
            int i = this.f5658d;
            int i2 = i == Integer.MIN_VALUE ? this.f5656b : i + this.f5657c;
            this.f5658d = i2;
            String str = this.f5655a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11);
            sb2.append(str);
            sb2.append(i2);
            this.f5659e = sb2.toString();
        }

        public String m36408b() {
            m36406d();
            return this.f5659e;
        }

        public int m36407c() {
            m36406d();
            return this.f5658d;
        }

        public final void m36406d() {
            if (this.f5658d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public C1575d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(i);
                sb2.append("/");
                str = sb2.toString();
            } else {
                str = "";
            }
            this.f5655a = str;
            this.f5656b = i2;
            this.f5657c = i3;
            this.f5658d = Integer.MIN_VALUE;
            this.f5659e = "";
        }
    }

    void mo36321a(C1205i0 i0Var, AbstractC8960h hVar, C1575d dVar);

    void mo36320b(C1189b0 b0Var, int i);

    void mo36319c();
}
