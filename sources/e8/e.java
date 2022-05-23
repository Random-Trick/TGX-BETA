package e8;

import b8.d;
import com.google.mlkit.vision.barcode.internal.BarcodeScannerImpl;
import d6.ob;
import d8.c;

public final class e {
    public final f f11360a;
    public final d f11361b;

    public e(f fVar, d dVar) {
        this.f11360a = fVar;
        this.f11361b = dVar;
    }

    public final BarcodeScannerImpl a(c cVar) {
        return new BarcodeScannerImpl(cVar, this.f11360a.b(cVar), this.f11361b.a(cVar.b()), ob.b(b.d()));
    }
}
