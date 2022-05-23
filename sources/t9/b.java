package t9;

import ca.b;
import ia.h;
import ia.q;
import java.nio.ByteBuffer;
import o9.d;
import ra.k;
import v9.a;
import v9.b;
import v9.i;
import x9.i;

public final class b extends a<q, v9.b, d, c> {
    public final i f23001c = new i("Reader");
    public final b.a f23002d = v9.b.f24786a;
    public final b.a f23003e = new b.a();
    public final ca.b f23004f;
    public final d f23005g;

    public b(ca.b bVar, d dVar) {
        k.e(bVar, "source");
        k.e(dVar, "track");
        this.f23004f = bVar;
        this.f23005g = dVar;
    }

    public static final c l(b bVar) {
        return bVar.j();
    }

    @Override
    public v9.i<d> i(i.b<q> bVar, boolean z10) {
        v9.i<d> bVar2;
        k.e(bVar, "state");
        if (this.f23004f.l()) {
            this.f23001c.c("Source is drained! Returning Eos as soon as possible.");
            h<ByteBuffer, Integer> c10 = l(this).c();
            if (c10 == null) {
                this.f23001c.h("Returning State.Wait because buffer is null.");
                return i.d.f24805a;
            }
            ByteBuffer c11 = c10.c();
            int intValue = c10.d().intValue();
            ByteBuffer byteBuffer = c11;
            byteBuffer.limit(0);
            b.a aVar = this.f23003e;
            aVar.f4998a = byteBuffer;
            aVar.f4999b = false;
            aVar.f5001d = true;
            bVar2 = new i.a<>(new d(aVar, intValue));
        } else if (!this.f23004f.i(this.f23005g)) {
            x9.i iVar = this.f23001c;
            iVar.c("Returning State.Wait because source can't read " + this.f23005g + " right now.");
            return i.d.f24805a;
        } else {
            h<ByteBuffer, Integer> c12 = l(this).c();
            if (c12 == null) {
                this.f23001c.h("Returning State.Wait because buffer is null.");
                return i.d.f24805a;
            }
            ByteBuffer c13 = c12.c();
            int intValue2 = c12.d().intValue();
            b.a aVar2 = this.f23003e;
            aVar2.f4998a = c13;
            this.f23004f.h(aVar2);
            bVar2 = new i.b<>(new d(this.f23003e, intValue2));
        }
        return bVar2;
    }

    public b.a f() {
        return this.f23002d;
    }
}
