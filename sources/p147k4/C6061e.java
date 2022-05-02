package p147k4;

import android.os.Parcel;
import android.os.Parcelable;
import p020b5.C1216l0;

public final class C6061e extends AbstractC6069i {
    public static final Parcelable.Creator<C6061e> CREATOR = new C6062a();
    public final String f19276M;
    public final String f19277b;
    public final String f19278c;

    public class C6062a implements Parcelable.Creator<C6061e> {
        public C6061e createFromParcel(Parcel parcel) {
            return new C6061e(parcel);
        }

        public C6061e[] newArray(int i) {
            return new C6061e[i];
        }
    }

    public C6061e(String str, String str2, String str3) {
        super("COMM");
        this.f19277b = str;
        this.f19278c = str2;
        this.f19276M = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6061e.class != obj.getClass()) {
            return false;
        }
        C6061e eVar = (C6061e) obj;
        return C1216l0.m37982c(this.f19278c, eVar.f19278c) && C1216l0.m37982c(this.f19277b, eVar.f19277b) && C1216l0.m37982c(this.f19276M, eVar.f19276M);
    }

    public int hashCode() {
        String str = this.f19277b;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19278c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19276M;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @Override
    public String toString() {
        String str = this.f19289a;
        String str2 = this.f19277b;
        String str3 = this.f19278c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": language=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19289a);
        parcel.writeString(this.f19277b);
        parcel.writeString(this.f19276M);
    }

    public C6061e(Parcel parcel) {
        super("COMM");
        this.f19277b = (String) C1216l0.m37968j(parcel.readString());
        this.f19278c = (String) C1216l0.m37968j(parcel.readString());
        this.f19276M = (String) C1216l0.m37968j(parcel.readString());
    }
}
