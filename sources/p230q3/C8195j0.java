package p230q3;

import android.annotation.SuppressLint;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p005a4.C0106l;
import p020b5.C1186a;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p020b5.C1230s;
import p174m3.C6615i;
import p230q3.AbstractC8169f0;
import p230q3.C8201m;
import p343y6.C10428d;

public final class C8195j0 implements AbstractC8169f0 {
    public static final AbstractC8169f0.AbstractC8172c f26543d = C8193i0.f26540a;
    public final UUID f26544a;
    public final MediaDrm f26545b;
    public int f26546c = 1;

    public static class C8196a {
        public static boolean m13225a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    public C8195j0(UUID uuid) {
        C1186a.m38185e(uuid);
        C1186a.m38188b(!C6615i.f20676b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f26544a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m13232t(uuid));
        this.f26545b = mediaDrm;
        if (C6615i.f20678d.equals(uuid) && m13253A()) {
            m13230v(mediaDrm);
        }
    }

    public static boolean m13253A() {
        return "ASUS_Z00AD".equals(C1216l0.f4529d);
    }

    public static C8195j0 m13252B(UUID uuid) {
        try {
            return new C8195j0(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new C8210o0(1, e);
        } catch (Exception e2) {
            throw new C8210o0(2, e2);
        }
    }

    public static byte[] m13236p(byte[] bArr) {
        C1189b0 b0Var = new C1189b0(bArr);
        int q = b0Var.m38126q();
        short s = b0Var.m38124s();
        short s2 = b0Var.m38124s();
        if (s == 1 && s2 == 1) {
            short s3 = b0Var.m38124s();
            Charset charset = C10428d.f33500e;
            String B = b0Var.m38158B(s3, charset);
            if (B.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = B.indexOf("</DATA>");
            if (indexOf == -1) {
                C1230s.m37881i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String substring = B.substring(0, indexOf);
            String substring2 = B.substring(indexOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 26 + String.valueOf(substring2).length());
            sb2.append(substring);
            sb2.append("<LA_URL>https://x</LA_URL>");
            sb2.append(substring2);
            String sb3 = sb2.toString();
            int i = q + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort(s);
            allocate.putShort(s2);
            allocate.putShort((short) (sb3.length() * 2));
            allocate.put(sb3.getBytes(charset));
            return allocate.array();
        }
        C1230s.m37884f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    public static byte[] m13235q(UUID uuid, byte[] bArr) {
        return C6615i.f20677c.equals(uuid) ? C8155a.m13345a(bArr) : bArr;
    }

    public static byte[] m13234r(java.util.UUID r3, byte[] r4) {
        throw new UnsupportedOperationException("Method not decompiled: p230q3.C8195j0.m13234r(java.util.UUID, byte[]):byte[]");
    }

    public static String m13233s(UUID uuid, String str) {
        return (C1216l0.f4526a >= 26 || !C6615i.f20677c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    public static UUID m13232t(UUID uuid) {
        return (C1216l0.f4526a >= 27 || !C6615i.f20677c.equals(uuid)) ? uuid : C6615i.f20676b;
    }

    @SuppressLint({"WrongConstant"})
    public static void m13230v(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static C8201m.C8203b m13228x(UUID uuid, List<C8201m.C8203b> list) {
        boolean z;
        if (!C6615i.f20678d.equals(uuid)) {
            return list.get(0);
        }
        if (C1216l0.f4526a >= 28 && list.size() > 1) {
            C8201m.C8203b bVar = list.get(0);
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                C8201m.C8203b bVar2 = list.get(i2);
                byte[] bArr = (byte[]) C1186a.m38185e(bVar2.f26562N);
                if (!C1216l0.m37982c(bVar2.f26561M, bVar.f26561M) || !C1216l0.m37982c(bVar2.f26565c, bVar.f26565c) || !C0106l.m42286c(bArr)) {
                    z = false;
                    break;
                }
                i += bArr.length;
            }
            z = true;
            if (z) {
                byte[] bArr2 = new byte[i];
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    byte[] bArr3 = (byte[]) C1186a.m38185e(list.get(i4).f26562N);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i3, length);
                    i3 += length;
                }
                return bVar.m13214a(bArr2);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            C8201m.C8203b bVar3 = list.get(i5);
            int g = C0106l.m42282g((byte[]) C1186a.m38185e(bVar3.f26562N));
            int i6 = C1216l0.f4526a;
            if (i6 < 23 && g == 0) {
                return bVar3;
            }
            if (i6 >= 23 && g == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    public void m13227y(AbstractC8169f0.AbstractC8171b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.mo13268a(this, bArr, i, i2, bArr2);
    }

    public static AbstractC8169f0 m13226z(UUID uuid) {
        try {
            return m13252B(uuid);
        } catch (C8210o0 unused) {
            String valueOf = String.valueOf(uuid);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 53);
            sb2.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb2.append(valueOf);
            sb2.append(".");
            C1230s.m37887c("FrameworkMediaDrm", sb2.toString());
            return new C8165d0();
        }
    }

    @Override
    public synchronized void mo13251a() {
        int i = this.f26546c - 1;
        this.f26546c = i;
        if (i == 0) {
            this.f26545b.release();
        }
    }

    @Override
    public void mo13250b(final AbstractC8169f0.AbstractC8171b bVar) {
        this.f26545b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C8195j0.this.m13227y(bVar, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override
    public Map<String, String> mo13249c(byte[] bArr) {
        return this.f26545b.queryKeyStatus(bArr);
    }

    @Override
    public AbstractC8169f0.C8173d mo13248d() {
        MediaDrm.ProvisionRequest provisionRequest = this.f26545b.getProvisionRequest();
        return new AbstractC8169f0.C8173d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override
    public byte[] mo13246f() {
        return this.f26545b.openSession();
    }

    @Override
    public boolean mo13245g(byte[] bArr, String str) {
        if (C1216l0.f4526a >= 31) {
            return C8196a.m13225a(this.f26545b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f26544a, bArr);
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
    public void mo13244h(byte[] bArr, byte[] bArr2) {
        this.f26545b.restoreKeys(bArr, bArr2);
    }

    @Override
    public void mo13243i(byte[] bArr) {
        this.f26545b.closeSession(bArr);
    }

    @Override
    public byte[] mo13242j(byte[] bArr, byte[] bArr2) {
        if (C6615i.f20677c.equals(this.f26544a)) {
            bArr2 = C8155a.m13344b(bArr2);
        }
        return this.f26545b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public void mo13241k(byte[] bArr) {
        this.f26545b.provideProvisionResponse(bArr);
    }

    @Override
    @SuppressLint({"WrongConstant"})
    public AbstractC8169f0.C8170a mo13240l(byte[] bArr, List<C8201m.C8203b> list, int i, HashMap<String, String> hashMap) {
        String str;
        byte[] bArr2;
        C8201m.C8203b bVar = null;
        if (list != null) {
            bVar = m13228x(this.f26544a, list);
            bArr2 = m13234r(this.f26544a, (byte[]) C1186a.m38185e(bVar.f26562N));
            str = m13233s(this.f26544a, bVar.f26561M);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f26545b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] q = m13235q(this.f26544a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f26565c)) {
            defaultUrl = bVar.f26565c;
        }
        return new AbstractC8169f0.C8170a(q, defaultUrl, C1216l0.f4526a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override
    public int mo13239m() {
        return 2;
    }

    public C8181g0 mo13247e(byte[] bArr) {
        return new C8181g0(m13232t(this.f26544a), bArr, C1216l0.f4526a < 21 && C6615i.f20678d.equals(this.f26544a) && "L3".equals(m13229w("securityLevel")));
    }

    public String m13229w(String str) {
        return this.f26545b.getPropertyString(str);
    }
}
