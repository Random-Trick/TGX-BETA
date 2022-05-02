package p005a4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p020b5.C1189b0;

public abstract class AbstractC0082a {
    public final int f279a;

    public static final class C0083a extends AbstractC0082a {
        public final long f280b;
        public final List<C0084b> f281c = new ArrayList();
        public final List<C0083a> f282d = new ArrayList();

        public C0083a(int i, long j) {
            super(i);
            this.f280b = j;
        }

        public void m42419d(C0083a aVar) {
            this.f282d.add(aVar);
        }

        public void m42418e(C0084b bVar) {
            this.f281c.add(bVar);
        }

        public C0083a m42417f(int i) {
            int size = this.f282d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0083a aVar = this.f282d.get(i2);
                if (aVar.f279a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public C0084b m42416g(int i) {
            int size = this.f281c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0084b bVar = this.f281c.get(i2);
                if (bVar.f279a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            String a = AbstractC0082a.m42422a(this.f279a);
            String arrays = Arrays.toString(this.f281c.toArray());
            String arrays2 = Arrays.toString(this.f282d.toArray());
            StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
            sb2.append(a);
            sb2.append(" leaves: ");
            sb2.append(arrays);
            sb2.append(" containers: ");
            sb2.append(arrays2);
            return sb2.toString();
        }
    }

    public static final class C0084b extends AbstractC0082a {
        public final C1189b0 f283b;

        public C0084b(int i, C1189b0 b0Var) {
            super(i);
            this.f283b = b0Var;
        }
    }

    public AbstractC0082a(int i) {
        this.f279a = i;
    }

    public static String m42422a(int i) {
        StringBuilder sb2 = new StringBuilder(4);
        sb2.append((char) ((i >> 24) & 255));
        sb2.append((char) ((i >> 16) & 255));
        sb2.append((char) ((i >> 8) & 255));
        sb2.append((char) (i & 255));
        return sb2.toString();
    }

    public static int m42421b(int i) {
        return i & 16777215;
    }

    public static int m42420c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m42422a(this.f279a);
    }
}
