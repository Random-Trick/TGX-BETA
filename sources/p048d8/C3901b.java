package p048d8;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.thunderdog.challegram.Log;
import p009a8.C0218i;
import p033c6.AbstractC1656ab;
import p033c6.C1661b1;
import p033c6.C1686cb;
import p033c6.C1714e9;
import p033c6.C1731fb;
import p033c6.C1848na;
import p033c6.C1874p8;
import p033c6.C1876pa;
import p033c6.EnumC1654a9;
import p033c6.EnumC1832m8;
import p033c6.EnumC1834ma;
import p033c6.EnumC1846n8;
import p033c6.EnumC1860o8;
import p033c6.EnumC2014z8;
import p035c8.C2035c;

public final class C3901b {
    public static final SparseArray<EnumC2014z8> f13181a;
    public static final SparseArray<EnumC1654a9> f13182b;
    public static final AtomicReference<Boolean> f13183c = new AtomicReference<>();
    @SuppressLint({"UseSparseArrays"})
    public static final Map<Integer, EnumC1834ma> f13184d;

    static {
        SparseArray<EnumC2014z8> sparseArray = new SparseArray<>();
        f13181a = sparseArray;
        SparseArray<EnumC1654a9> sparseArray2 = new SparseArray<>();
        f13182b = sparseArray2;
        sparseArray.put(-1, EnumC2014z8.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC2014z8.FORMAT_CODE_128);
        sparseArray.put(2, EnumC2014z8.FORMAT_CODE_39);
        sparseArray.put(4, EnumC2014z8.FORMAT_CODE_93);
        sparseArray.put(8, EnumC2014z8.FORMAT_CODABAR);
        sparseArray.put(16, EnumC2014z8.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC2014z8.FORMAT_EAN_13);
        sparseArray.put(64, EnumC2014z8.FORMAT_EAN_8);
        sparseArray.put(Log.TAG_YOUTUBE, EnumC2014z8.FORMAT_ITF);
        sparseArray.put(Log.TAG_CRASH, EnumC2014z8.FORMAT_QR_CODE);
        sparseArray.put(Log.TAG_GIF_LOADER, EnumC2014z8.FORMAT_UPC_A);
        sparseArray.put(Log.TAG_CAMERA, EnumC2014z8.FORMAT_UPC_E);
        sparseArray.put(Log.TAG_VOICE, EnumC2014z8.FORMAT_PDF417);
        sparseArray.put(Log.TAG_EMOJI, EnumC2014z8.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC1654a9.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC1654a9.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC1654a9.TYPE_EMAIL);
        sparseArray2.put(3, EnumC1654a9.TYPE_ISBN);
        sparseArray2.put(4, EnumC1654a9.TYPE_PHONE);
        sparseArray2.put(5, EnumC1654a9.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC1654a9.TYPE_SMS);
        sparseArray2.put(7, EnumC1654a9.TYPE_TEXT);
        sparseArray2.put(8, EnumC1654a9.TYPE_URL);
        sparseArray2.put(9, EnumC1654a9.TYPE_WIFI);
        sparseArray2.put(10, EnumC1654a9.TYPE_GEO);
        sparseArray2.put(11, EnumC1654a9.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC1654a9.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f13184d = hashMap;
        hashMap.put(1, EnumC1834ma.CODE_128);
        hashMap.put(2, EnumC1834ma.CODE_39);
        hashMap.put(4, EnumC1834ma.CODE_93);
        hashMap.put(8, EnumC1834ma.CODABAR);
        hashMap.put(16, EnumC1834ma.DATA_MATRIX);
        hashMap.put(32, EnumC1834ma.EAN_13);
        hashMap.put(64, EnumC1834ma.EAN_8);
        hashMap.put(Integer.valueOf((int) Log.TAG_YOUTUBE), EnumC1834ma.ITF);
        hashMap.put(Integer.valueOf((int) Log.TAG_CRASH), EnumC1834ma.QR_CODE);
        hashMap.put(Integer.valueOf((int) Log.TAG_GIF_LOADER), EnumC1834ma.UPC_A);
        hashMap.put(Integer.valueOf((int) Log.TAG_CAMERA), EnumC1834ma.UPC_E);
        hashMap.put(Integer.valueOf((int) Log.TAG_VOICE), EnumC1834ma.PDF417);
        hashMap.put(Integer.valueOf((int) Log.TAG_EMOJI), EnumC1834ma.AZTEC);
    }

    public static EnumC2014z8 m29620a(int i) {
        EnumC2014z8 z8Var = f13181a.get(i);
        return z8Var == null ? EnumC2014z8.FORMAT_UNKNOWN : z8Var;
    }

    public static EnumC1654a9 m29619b(int i) {
        EnumC1654a9 a9Var = f13182b.get(i);
        return a9Var == null ? EnumC1654a9.TYPE_UNKNOWN : a9Var;
    }

    public static C1876pa m29618c(C2035c cVar) {
        int a = cVar.m35786a();
        C1661b1 b1Var = new C1661b1();
        if (a == 0) {
            b1Var.m36116f(f13184d.values());
        } else {
            for (Map.Entry<Integer, EnumC1834ma> entry : f13184d.entrySet()) {
                if ((entry.getKey().intValue() & a) != 0) {
                    b1Var.m36117e(entry.getValue());
                }
            }
        }
        C1848na naVar = new C1848na();
        naVar.m35971b(b1Var.m36115g());
        return naVar.m35970c();
    }

    public static String m29617d() {
        return true != m29615f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    public static void m29616e(C1686cb cbVar, final EnumC1846n8 n8Var) {
        cbVar.m36097b(new AbstractC1656ab() {
            @Override
            public final C1731fb zza() {
                EnumC1846n8 n8Var2 = EnumC1846n8.this;
                C1874p8 p8Var = new C1874p8();
                p8Var.m35957e(C3901b.m29615f() ? EnumC1832m8.TYPE_THICK : EnumC1832m8.TYPE_THIN);
                C1714e9 e9Var = new C1714e9();
                e9Var.m36065b(n8Var2);
                p8Var.m35954h(e9Var.m36064c());
                return C1731fb.m36048d(p8Var);
            }
        }, EnumC1860o8.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean m29615f() {
        AtomicReference<Boolean> atomicReference = f13183c;
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        boolean a = C3912m.m29605a(C0218i.m42077c().m42078b());
        atomicReference.set(Boolean.valueOf(a));
        return a;
    }
}
