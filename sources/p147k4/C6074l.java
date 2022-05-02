package p147k4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p020b5.C1216l0;

public final class C6074l extends AbstractC6069i {
    public static final Parcelable.Creator<C6074l> CREATOR = new C6075a();
    public final String f19298b;
    public final byte[] f19299c;

    public class C6075a implements Parcelable.Creator<C6074l> {
        public C6074l createFromParcel(Parcel parcel) {
            return new C6074l(parcel);
        }

        public C6074l[] newArray(int i) {
            return new C6074l[i];
        }
    }

    public C6074l(String str, byte[] bArr) {
        super("PRIV");
        this.f19298b = str;
        this.f19299c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6074l.class != obj.getClass()) {
            return false;
        }
        C6074l lVar = (C6074l) obj;
        return C1216l0.m37982c(this.f19298b, lVar.f19298b) && Arrays.equals(this.f19299c, lVar.f19299c);
    }

    public int hashCode() {
        String str = this.f19298b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f19299c);
    }

    @Override
    public String toString() {
        String str = this.f19289a;
        String str2 = this.f19298b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": owner=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19298b);
        parcel.writeByteArray(this.f19299c);
    }

    public C6074l(Parcel parcel) {
        super("PRIV");
        this.f19298b = (String) C1216l0.m37968j(parcel.readString());
        this.f19299c = (byte[]) C1216l0.m37968j(parcel.createByteArray());
    }
}
