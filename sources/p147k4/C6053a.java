package p147k4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p020b5.C1216l0;
import p174m3.C6693s1;

public final class C6053a extends AbstractC6069i {
    public static final Parcelable.Creator<C6053a> CREATOR = new C6054a();
    public final int f19260M;
    public final byte[] f19261N;
    public final String f19262b;
    public final String f19263c;

    public class C6054a implements Parcelable.Creator<C6053a> {
        public C6053a createFromParcel(Parcel parcel) {
            return new C6053a(parcel);
        }

        public C6053a[] newArray(int i) {
            return new C6053a[i];
        }
    }

    public C6053a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f19262b = str;
        this.f19263c = str2;
        this.f19260M = i;
        this.f19261N = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6053a.class != obj.getClass()) {
            return false;
        }
        C6053a aVar = (C6053a) obj;
        return this.f19260M == aVar.f19260M && C1216l0.m37982c(this.f19262b, aVar.f19262b) && C1216l0.m37982c(this.f19263c, aVar.f19263c) && Arrays.equals(this.f19261N, aVar.f19261N);
    }

    public int hashCode() {
        int i = (527 + this.f19260M) * 31;
        String str = this.f19262b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19263c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f19261N);
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        bVar.m19542H(this.f19261N, this.f19260M);
    }

    @Override
    public String toString() {
        String str = this.f19289a;
        String str2 = this.f19262b;
        String str3 = this.f19263c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19262b);
        parcel.writeString(this.f19263c);
        parcel.writeInt(this.f19260M);
        parcel.writeByteArray(this.f19261N);
    }

    public C6053a(Parcel parcel) {
        super("APIC");
        this.f19262b = (String) C1216l0.m37968j(parcel.readString());
        this.f19263c = parcel.readString();
        this.f19260M = parcel.readInt();
        this.f19261N = (byte[]) C1216l0.m37968j(parcel.createByteArray());
    }
}
