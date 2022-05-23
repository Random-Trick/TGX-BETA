package c4;

import android.util.SparseArray;
import c5.b0;
import java.util.Collections;
import java.util.List;
import t3.h;

public interface i0 {

    public static final class a {
        public final String f4565a;
        public final int f4566b;
        public final byte[] f4567c;

        public a(String str, int i10, byte[] bArr) {
            this.f4565a = str;
            this.f4566b = i10;
            this.f4567c = bArr;
        }
    }

    public static final class b {
        public final int f4568a;
        public final String f4569b;
        public final List<a> f4570c;
        public final byte[] f4571d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            List<a> list2;
            this.f4568a = i10;
            this.f4569b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f4570c = list2;
            this.f4571d = bArr;
        }
    }

    public interface c {
        SparseArray<i0> a();

        i0 b(int i10, b bVar);
    }

    public static final class d {
        public final String f4572a;
        public final int f4573b;
        public final int f4574c;
        public int f4575d;
        public String f4576e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public void a() {
            int i10 = this.f4575d;
            int i11 = i10 == Integer.MIN_VALUE ? this.f4573b : i10 + this.f4574c;
            this.f4575d = i11;
            String str = this.f4572a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11);
            sb2.append(str);
            sb2.append(i11);
            this.f4576e = sb2.toString();
        }

        public String b() {
            d();
            return this.f4576e;
        }

        public int c() {
            d();
            return this.f4575d;
        }

        public final void d() {
            if (this.f4575d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(i10);
                sb2.append("/");
                str = sb2.toString();
            } else {
                str = "";
            }
            this.f4572a = str;
            this.f4573b = i11;
            this.f4574c = i12;
            this.f4575d = Integer.MIN_VALUE;
            this.f4576e = "";
        }
    }

    void a(b0 b0Var, int i10);

    void b(c5.i0 i0Var, h hVar, d dVar);

    void c();
}
