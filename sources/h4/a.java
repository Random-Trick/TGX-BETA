package h4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import f4.a;
import f4.b;
import java.util.Arrays;
import m3.c2;
import m3.q1;

public final class a implements a.b {
    public final long M;
    public final byte[] N;
    public int O;
    public final String f12518a;
    public final String f12519b;
    public final long f12520c;
    public static final q1 P = new q1.b().e0("application/id3").E();
    public static final q1 Q = new q1.b().e0("application/x-scte35").E();
    public static final Parcelable.Creator<a> CREATOR = new C0115a();

    public class C0115a implements Parcelable.Creator<a> {
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f12518a = str;
        this.f12519b = str2;
        this.f12520c = j10;
        this.M = j11;
        this.N = bArr;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12520c == aVar.f12520c && this.M == aVar.M && l0.c(this.f12518a, aVar.f12518a) && l0.c(this.f12519b, aVar.f12519b) && Arrays.equals(this.N, aVar.N);
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.N;
        }
        return null;
    }

    @Override
    public q1 getWrappedMetadataFormat() {
        String str = this.f12518a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c10 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return Q;
            case 1:
            case 2:
                return P;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.O == 0) {
            String str = this.f12518a;
            int i10 = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f12519b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.f12520c;
            long j11 = this.M;
            this.O = ((((((hashCode + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.N);
        }
        return this.O;
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        b.c(this, bVar);
    }

    public String toString() {
        String str = this.f12518a;
        long j10 = this.M;
        long j11 = this.f12520c;
        String str2 = this.f12519b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j10);
        sb2.append(", durationMs=");
        sb2.append(j11);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12518a);
        parcel.writeString(this.f12519b);
        parcel.writeLong(this.f12520c);
        parcel.writeLong(this.M);
        parcel.writeByteArray(this.N);
    }

    public a(Parcel parcel) {
        this.f12518a = (String) l0.j(parcel.readString());
        this.f12519b = (String) l0.j(parcel.readString());
        this.f12520c = parcel.readLong();
        this.M = parcel.readLong();
        this.N = (byte[]) l0.j(parcel.createByteArray());
    }
}
