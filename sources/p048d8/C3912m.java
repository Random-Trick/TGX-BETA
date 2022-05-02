package p048d8;

import android.content.Context;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.List;
import p009a8.C0222m;
import p033c6.AbstractBinderC1892qc;
import p033c6.C1686cb;
import p033c6.C1702dc;
import p033c6.C1732fc;
import p033c6.C1864oc;
import p033c6.C1990xc;
import p033c6.EnumC1846n8;
import p035c8.C2033a;
import p035c8.C2035c;
import p063e8.C4164a;
import p077f8.C4322b;
import p077f8.C4324d;
import p163l5.C6378r;
import p272t5.BinderC8986d;
import p314w7.C9987a;

public final class C3912m implements AbstractC3909j {
    public boolean f13206a;
    public boolean f13207b;
    public boolean f13208c;
    public final Context f13209d;
    public final C2035c f13210e;
    public final C1686cb f13211f;
    public C1864oc f13212g;

    public C3912m(Context context, C2035c cVar, C1686cb cbVar) {
        this.f13209d = context;
        this.f13210e = cVar;
        this.f13211f = cbVar;
    }

    public static boolean m29607a(Context context) {
        return DynamiteModule.m30369a(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    public final C1864oc m29606b(DynamiteModule.AbstractC3489b bVar, String str, String str2) {
        return AbstractBinderC1892qc.m35939q(DynamiteModule.m30366d(this.f13209d, bVar, str).m30367c(str2)).mo35915n0(BinderC8986d.m10763E0(this.f13209d), new C1732fc(this.f13210e.m35789a()));
    }

    @Override
    public final boolean mo29603h() {
        if (this.f13212g != null) {
            return this.f13207b;
        }
        if (m29607a(this.f13209d)) {
            this.f13207b = true;
            try {
                this.f13212g = m29606b(DynamiteModule.f11602c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new C9987a("Failed to create thick barcode scanner.", 13, e);
            } catch (DynamiteModule.C3488a e2) {
                throw new C9987a("Failed to load the bundled barcode module.", 13, e2);
            }
        } else {
            this.f13207b = false;
            try {
                this.f13212g = m29606b(DynamiteModule.f11601b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException e3) {
                C3901b.m29618e(this.f13211f, EnumC1846n8.OPTIONAL_MODULE_INIT_ERROR);
                throw new C9987a("Failed to create thin barcode scanner.", 13, e3);
            } catch (DynamiteModule.C3488a unused) {
                if (!this.f13208c) {
                    C0222m.m42069a(this.f13209d, "barcode");
                    this.f13208c = true;
                }
                C3901b.m29618e(this.f13211f, EnumC1846n8.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C9987a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
        }
        C3901b.m29618e(this.f13211f, EnumC1846n8.NO_ERROR);
        return this.f13207b;
    }

    @Override
    public final List<C2033a> mo29602i(C4164a aVar) {
        if (this.f13212g == null) {
            mo29603h();
        }
        C1864oc ocVar = (C1864oc) C6378r.m20507k(this.f13212g);
        if (!this.f13206a) {
            try {
                ocVar.m35966G1();
                this.f13206a = true;
            } catch (RemoteException e) {
                throw new C9987a("Failed to init barcode scanner.", 13, e);
            }
        }
        int j = aVar.m28638j();
        if (aVar.m28643e() == 35 && Build.VERSION.SDK_INT >= 19) {
            j = ((Image.Plane[]) C6378r.m20507k(aVar.m28640h()))[0].getRowStride();
        }
        try {
            List<C1702dc> E0 = ocVar.m35967E0(C4324d.m28274b().m28275a(aVar), new C1990xc(aVar.m28643e(), j, aVar.m28642f(), C4322b.m28284a(aVar.m28639i()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (C1702dc dcVar : E0) {
                arrayList.add(new C2033a(new C3911l(dcVar)));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new C9987a("Failed to run barcode scanner.", 13, e2);
        }
    }

    @Override
    public final void zzb() {
        C1864oc ocVar = this.f13212g;
        if (ocVar != null) {
            try {
                ocVar.m35965H1();
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.f13212g = null;
            this.f13206a = false;
        }
    }
}
