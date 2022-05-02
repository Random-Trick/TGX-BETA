package p048d8;

import com.google.mlkit.vision.barcode.internal.BarcodeScannerImpl;
import p009a8.C0209d;
import p033c6.C1863ob;
import p035c8.C2035c;

public final class C3904e {
    public final C3905f f13187a;
    public final C0209d f13188b;

    public C3904e(C3905f fVar, C0209d dVar) {
        this.f13187a = fVar;
        this.f13188b = dVar;
    }

    public final BarcodeScannerImpl m29614a(C2035c cVar) {
        return new BarcodeScannerImpl(cVar, this.f13187a.m42085b(cVar), this.f13188b.m42086a(cVar.m35785b()), C1863ob.m35965b(C3901b.m29617d()));
    }
}
