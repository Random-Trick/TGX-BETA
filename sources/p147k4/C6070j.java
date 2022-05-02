package p147k4;

import android.os.Parcel;
import android.os.Parcelable;
import p020b5.C1216l0;

public final class C6070j extends AbstractC6069i {
    public static final Parcelable.Creator<C6070j> CREATOR = new C6071a();
    public final String f19290M;
    public final String f19291b;
    public final String f19292c;

    public class C6071a implements Parcelable.Creator<C6070j> {
        public C6070j createFromParcel(Parcel parcel) {
            return new C6070j(parcel);
        }

        public C6070j[] newArray(int i) {
            return new C6070j[i];
        }
    }

    public C6070j(String str, String str2, String str3) {
        super("----");
        this.f19291b = str;
        this.f19292c = str2;
        this.f19290M = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6070j.class != obj.getClass()) {
            return false;
        }
        C6070j jVar = (C6070j) obj;
        return C1216l0.m37985c(this.f19292c, jVar.f19292c) && C1216l0.m37985c(this.f19291b, jVar.f19291b) && C1216l0.m37985c(this.f19290M, jVar.f19290M);
    }

    public int hashCode() {
        String str = this.f19291b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19292c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19290M;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @Override
    public String toString() {
        String str = this.f19289a;
        String str2 = this.f19291b;
        String str3 = this.f19292c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": domain=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19289a);
        parcel.writeString(this.f19291b);
        parcel.writeString(this.f19290M);
    }

    public C6070j(Parcel parcel) {
        super("----");
        this.f19291b = (String) C1216l0.m37971j(parcel.readString());
        this.f19292c = (String) C1216l0.m37971j(parcel.readString());
        this.f19290M = (String) C1216l0.m37971j(parcel.readString());
    }
}
