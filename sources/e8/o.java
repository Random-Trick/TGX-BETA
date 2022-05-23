package e8;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import b8.m;
import com.google.android.gms.dynamite.DynamiteModule;
import d6.bd;
import d6.cb;
import d6.e;
import d6.g;
import d6.i;
import d6.k;
import d6.n8;
import d8.a;
import d8.c;
import g8.b;
import java.util.ArrayList;
import java.util.List;
import m5.r;
import u5.d;

public final class o implements j {
    public boolean f11387a;
    public final Context f11388b;
    public final e f11389c;
    public final cb f11390d;
    public g f11391e;

    public o(Context context, c cVar, cb cbVar) {
        e eVar = new e();
        this.f11389c = eVar;
        this.f11388b = context;
        eVar.f6465a = cVar.a();
        this.f11390d = cbVar;
    }

    @Override
    public final List<a> a(f8.a aVar) {
        bd[] bdVarArr;
        if (this.f11391e == null) {
            h();
        }
        g gVar = this.f11391e;
        if (gVar != null) {
            g gVar2 = (g) r.k(gVar);
            k kVar = new k(aVar.j(), aVar.f(), 0, 0L, b.a(aVar.i()));
            try {
                int e10 = aVar.e();
                if (e10 == -1) {
                    bdVarArr = gVar2.E1(d.x0(aVar.c()), kVar);
                } else if (e10 == 17) {
                    bdVarArr = gVar2.x0(d.x0(aVar.d()), kVar);
                } else if (e10 == 35) {
                    Image.Plane[] planeArr = (Image.Plane[]) r.k(aVar.h());
                    kVar.f6616a = planeArr[0].getRowStride();
                    bdVarArr = gVar2.x0(d.x0(planeArr[0].getBuffer()), kVar);
                } else if (e10 == 842094169) {
                    bdVarArr = gVar2.x0(d.x0(g8.c.d().c(aVar, false)), kVar);
                } else {
                    int e11 = aVar.e();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unsupported image format: ");
                    sb2.append(e11);
                    throw new x7.a(sb2.toString(), 3);
                }
                ArrayList arrayList = new ArrayList();
                for (bd bdVar : bdVarArr) {
                    arrayList.add(new a(new n(bdVar)));
                }
                return arrayList;
            } catch (RemoteException e12) {
                throw new x7.a("Failed to detect with legacy barcode detector", 13, e12);
            }
        } else {
            throw new x7.a("Error initializing the legacy barcode scanner.", 14);
        }
    }

    @Override
    public final boolean h() {
        if (this.f11391e != null) {
            return false;
        }
        try {
            g V0 = i.q(DynamiteModule.d(this.f11388b, DynamiteModule.f5655b, "com.google.android.gms.vision.dynamite").c("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).V0(d.x0(this.f11388b), this.f11389c);
            this.f11391e = V0;
            if (V0 == null && !this.f11387a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                m.a(this.f11388b, "barcode");
                this.f11387a = true;
                b.e(this.f11390d, n8.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new x7.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            b.e(this.f11390d, n8.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new x7.a("Failed to create legacy barcode detector.", 13, e10);
        } catch (DynamiteModule.a e11) {
            throw new x7.a("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }

    @Override
    public final void zzb() {
        g gVar = this.f11391e;
        if (gVar != null) {
            try {
                gVar.p();
            } catch (RemoteException e10) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e10);
            }
            this.f11391e = null;
        }
    }
}
