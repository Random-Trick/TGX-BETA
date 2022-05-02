package p048d8;

import android.content.Context;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.ArrayList;
import java.util.List;
import p009a8.C0222m;
import p033c6.AbstractBinderC1764i;
import p033c6.C1673bd;
import p033c6.C1686cb;
import p033c6.C1704e;
import p033c6.C1734g;
import p033c6.C1794k;
import p033c6.EnumC1846n8;
import p035c8.C2033a;
import p035c8.C2035c;
import p063e8.C4164a;
import p077f8.C4322b;
import p077f8.C4323c;
import p163l5.C6378r;
import p272t5.BinderC8986d;
import p314w7.C9987a;

public final class C3914o implements AbstractC3909j {
    public boolean f13214a;
    public final Context f13215b;
    public final C1704e f13216c;
    public final C1686cb f13217d;
    public C1734g f13218e;

    public C3914o(Context context, C2035c cVar, C1686cb cbVar) {
        C1704e eVar = new C1704e();
        this.f13216c = eVar;
        this.f13215b = context;
        eVar.f6232a = cVar.m35786a();
        this.f13217d = cbVar;
    }

    @Override
    public final boolean mo29601h() {
        if (this.f13218e != null) {
            return false;
        }
        try {
            C1734g Y = AbstractBinderC1764i.m35996q(DynamiteModule.m30364d(this.f13215b, DynamiteModule.f11601b, "com.google.android.gms.vision.dynamite").m30365c("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).mo35992Y(BinderC8986d.m10764E0(this.f13215b), this.f13216c);
            this.f13218e = Y;
            if (Y == null && !this.f13214a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                C0222m.m42066a(this.f13215b, "barcode");
                this.f13214a = true;
                C3901b.m29616e(this.f13217d, EnumC1846n8.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C9987a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            C3901b.m29616e(this.f13217d, EnumC1846n8.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new C9987a("Failed to create legacy barcode detector.", 13, e);
        } catch (DynamiteModule.C3488a e2) {
            throw new C9987a("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }

    @Override
    public final List<C2033a> mo29600i(C4164a aVar) {
        C1673bd[] bdVarArr;
        if (this.f13218e == null) {
            mo29601h();
        }
        C1734g gVar = this.f13218e;
        if (gVar != null) {
            C1734g gVar2 = (C1734g) C6378r.m20506k(gVar);
            C1794k kVar = new C1794k(aVar.m28636j(), aVar.m28640f(), 0, 0L, C4322b.m28282a(aVar.m28637i()));
            try {
                int e = aVar.m28641e();
                if (e == -1) {
                    bdVarArr = gVar2.m36043G1(BinderC8986d.m10764E0(aVar.m28643c()), kVar);
                } else if (e == 17) {
                    bdVarArr = gVar2.m36044E0(BinderC8986d.m10764E0(aVar.m28642d()), kVar);
                } else if (e != 35) {
                    if (e == 842094169) {
                        bdVarArr = gVar2.m36044E0(BinderC8986d.m10764E0(C4323c.m28278d().m28279c(aVar, false)), kVar);
                    }
                    int e2 = aVar.m28641e();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unsupported image format: ");
                    sb2.append(e2);
                    throw new C9987a(sb2.toString(), 3);
                } else {
                    if (Build.VERSION.SDK_INT >= 19) {
                        Image.Plane[] planeArr = (Image.Plane[]) C6378r.m20506k(aVar.m28638h());
                        kVar.f6415a = planeArr[0].getRowStride();
                        bdVarArr = gVar2.m36044E0(BinderC8986d.m10764E0(planeArr[0].getBuffer()), kVar);
                    }
                    int e22 = aVar.m28641e();
                    StringBuilder sb22 = new StringBuilder(37);
                    sb22.append("Unsupported image format: ");
                    sb22.append(e22);
                    throw new C9987a(sb22.toString(), 3);
                }
                ArrayList arrayList = new ArrayList();
                for (C1673bd bdVar : bdVarArr) {
                    arrayList.add(new C2033a(new C3913n(bdVar)));
                }
                return arrayList;
            } catch (RemoteException e3) {
                throw new C9987a("Failed to detect with legacy barcode detector", 13, e3);
            }
        } else {
            throw new C9987a("Error initializing the legacy barcode scanner.", 14);
        }
    }

    @Override
    public final void zzb() {
        C1734g gVar = this.f13218e;
        if (gVar != null) {
            try {
                gVar.m36042p();
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.f13218e = null;
        }
    }
}
