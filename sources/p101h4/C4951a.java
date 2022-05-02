package p101h4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p020b5.C1216l0;
import p073f4.C4260a;
import p073f4.C4263b;
import p174m3.C6600g1;
import p174m3.C6693s1;

public final class C4951a implements C4260a.AbstractC4262b {
    public final long f16865M;
    public final byte[] f16866N;
    public int f16867O;
    public final String f16868a;
    public final String f16869b;
    public final long f16870c;
    public static final C6600g1 f16863P = new C6600g1.C6602b().m19859e0("application/id3").m19890E();
    public static final C6600g1 f16864Q = new C6600g1.C6602b().m19859e0("application/x-scte35").m19890E();
    public static final Parcelable.Creator<C4951a> CREATOR = new C4952a();

    public class C4952a implements Parcelable.Creator<C4951a> {
        public C4951a createFromParcel(Parcel parcel) {
            return new C4951a(parcel);
        }

        public C4951a[] newArray(int i) {
            return new C4951a[i];
        }
    }

    public C4951a(String str, String str2, long j, long j2, byte[] bArr) {
        this.f16868a = str;
        this.f16869b = str2;
        this.f16870c = j;
        this.f16865M = j2;
        this.f16866N = bArr;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4951a.class != obj.getClass()) {
            return false;
        }
        C4951a aVar = (C4951a) obj;
        return this.f16870c == aVar.f16870c && this.f16865M == aVar.f16865M && C1216l0.m37985c(this.f16868a, aVar.f16868a) && C1216l0.m37985c(this.f16869b, aVar.f16869b) && Arrays.equals(this.f16866N, aVar.f16866N);
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f16866N;
        }
        return null;
    }

    @Override
    public C6600g1 getWrappedMetadataFormat() {
        String str = this.f16868a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f16864Q;
            case 1:
            case 2:
                return f16863P;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f16867O == 0) {
            String str = this.f16868a;
            int i = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f16869b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.f16870c;
            long j2 = this.f16865M;
            this.f16867O = ((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f16866N);
        }
        return this.f16867O;
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        C4263b.m28324c(this, bVar);
    }

    public String toString() {
        String str = this.f16868a;
        long j = this.f16865M;
        long j2 = this.f16870c;
        String str2 = this.f16869b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j);
        sb2.append(", durationMs=");
        sb2.append(j2);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16868a);
        parcel.writeString(this.f16869b);
        parcel.writeLong(this.f16870c);
        parcel.writeLong(this.f16865M);
        parcel.writeByteArray(this.f16866N);
    }

    public C4951a(Parcel parcel) {
        this.f16868a = (String) C1216l0.m37971j(parcel.readString());
        this.f16869b = (String) C1216l0.m37971j(parcel.readString());
        this.f16870c = parcel.readLong();
        this.f16865M = parcel.readLong();
        this.f16866N = (byte[]) C1216l0.m37971j(parcel.createByteArray());
    }
}
