package e8;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import d6.cb;
import d6.dc;
import d6.fc;
import d6.n8;
import d6.oc;
import d6.qc;
import d6.xc;
import d8.a;
import d8.c;
import g8.b;
import g8.d;
import java.util.ArrayList;
import java.util.List;
import m5.r;

public final class m implements j {
    public boolean f11379a;
    public boolean f11380b;
    public boolean f11381c;
    public final Context f11382d;
    public final c f11383e;
    public final cb f11384f;
    public oc f11385g;

    public m(Context context, c cVar, cb cbVar) {
        this.f11382d = context;
        this.f11383e = cVar;
        this.f11384f = cbVar;
    }

    public static boolean b(Context context) {
        return DynamiteModule.a(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    @Override
    public final List<a> a(f8.a aVar) {
        if (this.f11385g == null) {
            h();
        }
        oc ocVar = (oc) r.k(this.f11385g);
        if (!this.f11379a) {
            try {
                ocVar.E1();
                this.f11379a = true;
            } catch (RemoteException e10) {
                throw new x7.a("Failed to init barcode scanner.", 13, e10);
            }
        }
        int j10 = aVar.j();
        if (aVar.e() == 35) {
            j10 = ((Image.Plane[]) r.k(aVar.h()))[0].getRowStride();
        }
        try {
            List<dc> x02 = ocVar.x0(d.b().a(aVar), new xc(aVar.e(), j10, aVar.f(), b.a(aVar.i()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (dc dcVar : x02) {
                arrayList.add(new a(new l(dcVar)));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new x7.a("Failed to run barcode scanner.", 13, e11);
        }
    }

    public final oc c(DynamiteModule.b bVar, String str, String str2) {
        return qc.q(DynamiteModule.d(this.f11382d, bVar, str).c(str2)).E(u5.d.x0(this.f11382d), new fc(this.f11383e.a()));
    }

    @Override
    public final boolean h() {
        if (this.f11385g != null) {
            return this.f11380b;
        }
        if (b(this.f11382d)) {
            this.f11380b = true;
            try {
                this.f11385g = c(DynamiteModule.f5656c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e10) {
                throw new x7.a("Failed to create thick barcode scanner.", 13, e10);
            } catch (DynamiteModule.a e11) {
                throw new x7.a("Failed to load the bundled barcode module.", 13, e11);
            }
        } else {
            this.f11380b = false;
            try {
                this.f11385g = c(DynamiteModule.f5655b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException e12) {
                b.e(this.f11384f, n8.OPTIONAL_MODULE_INIT_ERROR);
                throw new x7.a("Failed to create thin barcode scanner.", 13, e12);
            } catch (DynamiteModule.a unused) {
                if (!this.f11381c) {
                    b8.m.a(this.f11382d, "barcode");
                    this.f11381c = true;
                }
                b.e(this.f11384f, n8.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new x7.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
        }
        b.e(this.f11384f, n8.NO_ERROR);
        return this.f11380b;
    }

    @Override
    public final void zzb() {
        oc ocVar = this.f11385g;
        if (ocVar != null) {
            try {
                ocVar.F1();
            } catch (RemoteException e10) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e10);
            }
            this.f11385g = null;
            this.f11379a = false;
        }
    }
}
