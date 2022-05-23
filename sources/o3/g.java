package o3;

import c5.l0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface g {
    public static final ByteBuffer f18781a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {
        public static final a f18782e = new a(-1, -1, -1);
        public final int f18783a;
        public final int f18784b;
        public final int f18785c;
        public final int f18786d;

        public a(int i10, int i11, int i12) {
            this.f18783a = i10;
            this.f18784b = i11;
            this.f18785c = i12;
            this.f18786d = l0.j0(i12) ? l0.X(i12, i11) : -1;
        }

        public String toString() {
            int i10 = this.f18783a;
            int i11 = this.f18784b;
            int i12 = this.f18785c;
            StringBuilder sb2 = new StringBuilder(83);
            sb2.append("AudioFormat[sampleRate=");
            sb2.append(i10);
            sb2.append(", channelCount=");
            sb2.append(i11);
            sb2.append(", encoding=");
            sb2.append(i12);
            sb2.append(']');
            return sb2.toString();
        }
    }

    public static final class b extends Exception {
        public b(o3.g.a r3) {
            throw new UnsupportedOperationException("Method not decompiled: o3.g.b.<init>(o3.g$a):void");
        }
    }

    ByteBuffer a();

    void b(ByteBuffer byteBuffer);

    void c();

    void d();

    boolean e();

    boolean f();

    void flush();

    a g(a aVar);
}
