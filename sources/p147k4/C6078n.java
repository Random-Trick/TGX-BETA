package p147k4;

import android.os.Parcel;
import android.os.Parcelable;
import p020b5.C1216l0;

public final class C6078n extends AbstractC6069i {
    public static final Parcelable.Creator<C6078n> CREATOR = new C6079a();
    public final String f19302b;
    public final String f19303c;

    public class C6079a implements Parcelable.Creator<C6078n> {
        public C6078n createFromParcel(Parcel parcel) {
            return new C6078n(parcel);
        }

        public C6078n[] newArray(int i) {
            return new C6078n[i];
        }
    }

    public C6078n(String str, String str2, String str3) {
        super(str);
        this.f19302b = str2;
        this.f19303c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6078n.class != obj.getClass()) {
            return false;
        }
        C6078n nVar = (C6078n) obj;
        return this.f19289a.equals(nVar.f19289a) && C1216l0.m37985c(this.f19302b, nVar.f19302b) && C1216l0.m37985c(this.f19303c, nVar.f19303c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f19289a.hashCode()) * 31;
        String str = this.f19302b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19303c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @Override
    public String toString() {
        String str = this.f19289a;
        String str2 = this.f19303c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": url=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19289a);
        parcel.writeString(this.f19302b);
        parcel.writeString(this.f19303c);
    }

    public C6078n(Parcel parcel) {
        super((String) C1216l0.m37971j(parcel.readString()));
        this.f19302b = parcel.readString();
        this.f19303c = (String) C1216l0.m37971j(parcel.readString());
    }
}
