package p147k4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p020b5.C1216l0;

public final class C6063f extends AbstractC6069i {
    public static final Parcelable.Creator<C6063f> CREATOR = new C6064a();
    public final String f19279M;
    public final byte[] f19280N;
    public final String f19281b;
    public final String f19282c;

    public class C6064a implements Parcelable.Creator<C6063f> {
        public C6063f createFromParcel(Parcel parcel) {
            return new C6063f(parcel);
        }

        public C6063f[] newArray(int i) {
            return new C6063f[i];
        }
    }

    public C6063f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f19281b = str;
        this.f19282c = str2;
        this.f19279M = str3;
        this.f19280N = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6063f.class != obj.getClass()) {
            return false;
        }
        C6063f fVar = (C6063f) obj;
        return C1216l0.m37982c(this.f19281b, fVar.f19281b) && C1216l0.m37982c(this.f19282c, fVar.f19282c) && C1216l0.m37982c(this.f19279M, fVar.f19279M) && Arrays.equals(this.f19280N, fVar.f19280N);
    }

    public int hashCode() {
        String str = this.f19281b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19282c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19279M;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f19280N);
    }

    @Override
    public String toString() {
        String str = this.f19289a;
        String str2 = this.f19281b;
        String str3 = this.f19282c;
        String str4 = this.f19279M;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", filename=");
        sb2.append(str3);
        sb2.append(", description=");
        sb2.append(str4);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19281b);
        parcel.writeString(this.f19282c);
        parcel.writeString(this.f19279M);
        parcel.writeByteArray(this.f19280N);
    }

    public C6063f(Parcel parcel) {
        super("GEOB");
        this.f19281b = (String) C1216l0.m37968j(parcel.readString());
        this.f19282c = (String) C1216l0.m37968j(parcel.readString());
        this.f19279M = (String) C1216l0.m37968j(parcel.readString());
        this.f19280N = (byte[]) C1216l0.m37968j(parcel.createByteArray());
    }
}
