package a4;

import c5.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class a {
    public final int f230a;

    public static final class C0011a extends a {
        public final long f231b;
        public final List<b> f232c = new ArrayList();
        public final List<C0011a> f233d = new ArrayList();

        public C0011a(int i10, long j10) {
            super(i10);
            this.f231b = j10;
        }

        public void d(C0011a aVar) {
            this.f233d.add(aVar);
        }

        public void e(b bVar) {
            this.f232c.add(bVar);
        }

        public C0011a f(int i10) {
            int size = this.f233d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0011a aVar = this.f233d.get(i11);
                if (aVar.f230a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f232c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f232c.get(i11);
                if (bVar.f230a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            String a10 = a.a(this.f230a);
            String arrays = Arrays.toString(this.f232c.toArray());
            String arrays2 = Arrays.toString(this.f233d.toArray());
            StringBuilder sb2 = new StringBuilder(String.valueOf(a10).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
            sb2.append(a10);
            sb2.append(" leaves: ");
            sb2.append(arrays);
            sb2.append(" containers: ");
            sb2.append(arrays2);
            return sb2.toString();
        }
    }

    public static final class b extends a {
        public final b0 f234b;

        public b(int i10, b0 b0Var) {
            super(i10);
            this.f234b = b0Var;
        }
    }

    public a(int i10) {
        this.f230a = i10;
    }

    public static String a(int i10) {
        StringBuilder sb2 = new StringBuilder(4);
        sb2.append((char) ((i10 >> 24) & 255));
        sb2.append((char) ((i10 >> 16) & 255));
        sb2.append((char) ((i10 >> 8) & 255));
        sb2.append((char) (i10 & 255));
        return sb2.toString();
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f230a);
    }
}
