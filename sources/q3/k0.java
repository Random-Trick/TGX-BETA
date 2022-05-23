package q3;

import a4.l;
import android.annotation.SuppressLint;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import c5.b0;
import c5.l0;
import c5.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m3.i;
import n3.p1;
import q3.g0;
import q3.m;
import z6.d;

public final class k0 implements g0 {
    public static final g0.c f21329d = j0.f21327a;
    public final UUID f21330a;
    public final MediaDrm f21331b;
    public int f21332c = 1;

    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, p1 p1Var) {
            LogSessionId a10 = p1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                ((MediaDrm.PlaybackComponent) c5.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(a10);
            }
        }
    }

    public k0(UUID uuid) {
        c5.a.e(uuid);
        c5.a.b(!i.f16677b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f21330a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f21331b = mediaDrm;
        if (i.f16679d.equals(uuid) && B()) {
            w(mediaDrm);
        }
    }

    public static g0 A(UUID uuid) {
        try {
            return C(uuid);
        } catch (p0 unused) {
            String valueOf = String.valueOf(uuid);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 53);
            sb2.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb2.append(valueOf);
            sb2.append(".");
            s.c("FrameworkMediaDrm", sb2.toString());
            return new d0();
        }
    }

    public static boolean B() {
        return "ASUS_Z00AD".equals(l0.f4844d);
    }

    public static k0 C(UUID uuid) {
        try {
            return new k0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new p0(1, e10);
        } catch (Exception e11) {
            throw new p0(2, e11);
        }
    }

    public static byte[] q(byte[] bArr) {
        b0 b0Var = new b0(bArr);
        int q10 = b0Var.q();
        short s10 = b0Var.s();
        short s11 = b0Var.s();
        if (s10 == 1 && s11 == 1) {
            short s12 = b0Var.s();
            Charset charset = d.f27016e;
            String B = b0Var.B(s12, charset);
            if (B.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = B.indexOf("</DATA>");
            if (indexOf == -1) {
                s.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String substring = B.substring(0, indexOf);
            String substring2 = B.substring(indexOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 26 + String.valueOf(substring2).length());
            sb2.append(substring);
            sb2.append("<LA_URL>https://x</LA_URL>");
            sb2.append(substring2);
            String sb3 = sb2.toString();
            int i10 = q10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort(s10);
            allocate.putShort(s11);
            allocate.putShort((short) (sb3.length() * 2));
            allocate.put(sb3.getBytes(charset));
            return allocate.array();
        }
        s.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    public static byte[] r(UUID uuid, byte[] bArr) {
        return i.f16678c.equals(uuid) ? q3.a.a(bArr) : bArr;
    }

    public static byte[] s(java.util.UUID r3, byte[] r4) {
        throw new UnsupportedOperationException("Method not decompiled: q3.k0.s(java.util.UUID, byte[]):byte[]");
    }

    public static String t(UUID uuid, String str) {
        return (l0.f4841a >= 26 || !i.f16678c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    public static UUID u(UUID uuid) {
        return (l0.f4841a >= 27 || !i.f16678c.equals(uuid)) ? uuid : i.f16677b;
    }

    @SuppressLint({"WrongConstant"})
    public static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static m.b y(UUID uuid, List<m.b> list) {
        boolean z10;
        if (!i.f16679d.equals(uuid)) {
            return list.get(0);
        }
        if (l0.f4841a >= 28 && list.size() > 1) {
            m.b bVar = list.get(0);
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                m.b bVar2 = list.get(i11);
                byte[] bArr = (byte[]) c5.a.e(bVar2.N);
                if (!l0.c(bVar2.M, bVar.M) || !l0.c(bVar2.f21347c, bVar.f21347c) || !l.c(bArr)) {
                    z10 = false;
                    break;
                }
                i10 += bArr.length;
            }
            z10 = true;
            if (z10) {
                byte[] bArr2 = new byte[i10];
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    byte[] bArr3 = (byte[]) c5.a.e(list.get(i13).N);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i12, length);
                    i12 += length;
                }
                return bVar.a(bArr2);
            }
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            m.b bVar3 = list.get(i14);
            int g10 = l.g((byte[]) c5.a.e(bVar3.N));
            int i15 = l0.f4841a;
            if (i15 < 23 && g10 == 0) {
                return bVar3;
            }
            if (i15 >= 23 && g10 == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    public void z(g0.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    @Override
    public synchronized void a() {
        int i10 = this.f21332c - 1;
        this.f21332c = i10;
        if (i10 == 0) {
            this.f21331b.release();
        }
    }

    @Override
    public void b(final g0.b bVar) {
        this.f21331b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                k0.this.z(bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override
    public Map<String, String> c(byte[] bArr) {
        return this.f21331b.queryKeyStatus(bArr);
    }

    @Override
    public void d(byte[] bArr, p1 p1Var) {
        if (l0.f4841a >= 31) {
            a.b(this.f21331b, bArr, p1Var);
        }
    }

    @Override
    public g0.d e() {
        MediaDrm.ProvisionRequest provisionRequest = this.f21331b.getProvisionRequest();
        return new g0.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override
    public byte[] g() {
        return this.f21331b.openSession();
    }

    @Override
    public boolean h(byte[] bArr, String str) {
        if (l0.f4841a >= 31) {
            return a.a(this.f21331b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f21330a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override
    public void i(byte[] bArr, byte[] bArr2) {
        this.f21331b.restoreKeys(bArr, bArr2);
    }

    @Override
    public void j(byte[] bArr) {
        this.f21331b.closeSession(bArr);
    }

    @Override
    public byte[] k(byte[] bArr, byte[] bArr2) {
        if (i.f16678c.equals(this.f21330a)) {
            bArr2 = q3.a.b(bArr2);
        }
        return this.f21331b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public void l(byte[] bArr) {
        this.f21331b.provideProvisionResponse(bArr);
    }

    @Override
    @SuppressLint({"WrongConstant"})
    public g0.a m(byte[] bArr, List<m.b> list, int i10, HashMap<String, String> hashMap) {
        String str;
        byte[] bArr2;
        m.b bVar = null;
        if (list != null) {
            bVar = y(this.f21330a, list);
            bArr2 = s(this.f21330a, (byte[]) c5.a.e(bVar.N));
            str = t(this.f21330a, bVar.M);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f21331b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] r10 = r(this.f21330a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f21347c)) {
            defaultUrl = bVar.f21347c;
        }
        return new g0.a(r10, defaultUrl, l0.f4841a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override
    public int n() {
        return 2;
    }

    public h0 f(byte[] bArr) {
        return new h0(u(this.f21330a), bArr, l0.f4841a < 21 && i.f16679d.equals(this.f21330a) && "L3".equals(x("securityLevel")));
    }

    public String x(String str) {
        return this.f21331b.getPropertyString(str);
    }
}
