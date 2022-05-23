package e8;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import b8.i;
import d6.a9;
import d6.ab;
import d6.b1;
import d6.cb;
import d6.e9;
import d6.fb;
import d6.m8;
import d6.ma;
import d6.n8;
import d6.na;
import d6.o8;
import d6.p8;
import d6.pa;
import d6.z8;
import d8.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.thunderdog.challegram.Log;

public final class b {
    public static final SparseArray<z8> f11354a;
    public static final SparseArray<a9> f11355b;
    public static final AtomicReference<Boolean> f11356c = new AtomicReference<>();
    @SuppressLint({"UseSparseArrays"})
    public static final Map<Integer, ma> f11357d;

    static {
        SparseArray<z8> sparseArray = new SparseArray<>();
        f11354a = sparseArray;
        SparseArray<a9> sparseArray2 = new SparseArray<>();
        f11355b = sparseArray2;
        sparseArray.put(-1, z8.FORMAT_UNKNOWN);
        sparseArray.put(1, z8.FORMAT_CODE_128);
        sparseArray.put(2, z8.FORMAT_CODE_39);
        sparseArray.put(4, z8.FORMAT_CODE_93);
        sparseArray.put(8, z8.FORMAT_CODABAR);
        sparseArray.put(16, z8.FORMAT_DATA_MATRIX);
        sparseArray.put(32, z8.FORMAT_EAN_13);
        sparseArray.put(64, z8.FORMAT_EAN_8);
        sparseArray.put(Log.TAG_YOUTUBE, z8.FORMAT_ITF);
        sparseArray.put(Log.TAG_CRASH, z8.FORMAT_QR_CODE);
        sparseArray.put(Log.TAG_GIF_LOADER, z8.FORMAT_UPC_A);
        sparseArray.put(Log.TAG_CAMERA, z8.FORMAT_UPC_E);
        sparseArray.put(Log.TAG_VOICE, z8.FORMAT_PDF417);
        sparseArray.put(Log.TAG_EMOJI, z8.FORMAT_AZTEC);
        sparseArray2.put(0, a9.TYPE_UNKNOWN);
        sparseArray2.put(1, a9.TYPE_CONTACT_INFO);
        sparseArray2.put(2, a9.TYPE_EMAIL);
        sparseArray2.put(3, a9.TYPE_ISBN);
        sparseArray2.put(4, a9.TYPE_PHONE);
        sparseArray2.put(5, a9.TYPE_PRODUCT);
        sparseArray2.put(6, a9.TYPE_SMS);
        sparseArray2.put(7, a9.TYPE_TEXT);
        sparseArray2.put(8, a9.TYPE_URL);
        sparseArray2.put(9, a9.TYPE_WIFI);
        sparseArray2.put(10, a9.TYPE_GEO);
        sparseArray2.put(11, a9.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, a9.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f11357d = hashMap;
        hashMap.put(1, ma.CODE_128);
        hashMap.put(2, ma.CODE_39);
        hashMap.put(4, ma.CODE_93);
        hashMap.put(8, ma.CODABAR);
        hashMap.put(16, ma.DATA_MATRIX);
        hashMap.put(32, ma.EAN_13);
        hashMap.put(64, ma.EAN_8);
        hashMap.put(Integer.valueOf((int) Log.TAG_YOUTUBE), ma.ITF);
        hashMap.put(Integer.valueOf((int) Log.TAG_CRASH), ma.QR_CODE);
        hashMap.put(Integer.valueOf((int) Log.TAG_GIF_LOADER), ma.UPC_A);
        hashMap.put(Integer.valueOf((int) Log.TAG_CAMERA), ma.UPC_E);
        hashMap.put(Integer.valueOf((int) Log.TAG_VOICE), ma.PDF417);
        hashMap.put(Integer.valueOf((int) Log.TAG_EMOJI), ma.AZTEC);
    }

    public static z8 a(int i10) {
        z8 z8Var = f11354a.get(i10);
        return z8Var == null ? z8.FORMAT_UNKNOWN : z8Var;
    }

    public static a9 b(int i10) {
        a9 a9Var = f11355b.get(i10);
        return a9Var == null ? a9.TYPE_UNKNOWN : a9Var;
    }

    public static pa c(c cVar) {
        int a10 = cVar.a();
        b1 b1Var = new b1();
        if (a10 == 0) {
            b1Var.f(f11357d.values());
        } else {
            for (Map.Entry<Integer, ma> entry : f11357d.entrySet()) {
                if ((entry.getKey().intValue() & a10) != 0) {
                    b1Var.e(entry.getValue());
                }
            }
        }
        na naVar = new na();
        naVar.b(b1Var.g());
        return naVar.c();
    }

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    public static void e(cb cbVar, final n8 n8Var) {
        cbVar.b(new ab() {
            @Override
            public final fb zza() {
                n8 n8Var2 = n8.this;
                p8 p8Var = new p8();
                p8Var.e(b.f() ? m8.TYPE_THICK : m8.TYPE_THIN);
                e9 e9Var = new e9();
                e9Var.b(n8Var2);
                p8Var.h(e9Var.c());
                return fb.d(p8Var);
            }
        }, o8.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean f() {
        AtomicReference<Boolean> atomicReference = f11356c;
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        boolean b10 = m.b(i.c().b());
        atomicReference.set(Boolean.valueOf(b10));
        return b10;
    }
}
