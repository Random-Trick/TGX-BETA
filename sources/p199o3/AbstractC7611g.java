package p199o3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p020b5.C1216l0;

public interface AbstractC7611g {
    public static final ByteBuffer f24356a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class C7612a {
        public static final C7612a f24357e = new C7612a(-1, -1, -1);
        public final int f24358a;
        public final int f24359b;
        public final int f24360c;
        public final int f24361d;

        public C7612a(int i, int i2, int i3) {
            this.f24358a = i;
            this.f24359b = i2;
            this.f24360c = i3;
            this.f24361d = C1216l0.m37969i0(i3) ? C1216l0.m37990W(i3, i2) : -1;
        }

        public String toString() {
            int i = this.f24358a;
            int i2 = this.f24359b;
            int i3 = this.f24360c;
            StringBuilder sb2 = new StringBuilder(83);
            sb2.append("AudioFormat[sampleRate=");
            sb2.append(i);
            sb2.append(", channelCount=");
            sb2.append(i2);
            sb2.append(", encoding=");
            sb2.append(i3);
            sb2.append(']');
            return sb2.toString();
        }
    }

    public static final class C7613b extends Exception {
        public C7613b(p199o3.AbstractC7611g.C7612a r3) {
            throw new UnsupportedOperationException("Method not decompiled: p199o3.AbstractC7611g.C7613b.<init>(o3.g$a):void");
        }
    }

    ByteBuffer mo15314a();

    void mo15305b(ByteBuffer byteBuffer);

    void mo15313c();

    void mo15312d();

    boolean mo15311e();

    boolean mo15310f();

    void flush();

    C7612a mo15309g(C7612a aVar);
}
