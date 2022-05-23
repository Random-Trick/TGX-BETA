package i4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import f4.a;
import f4.b;
import m3.c2;
import m3.q1;

@Deprecated
public class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0122a();
    public final String f13988a;
    public final String f13989b;

    public class C0122a implements Parcelable.Creator<a> {
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2) {
        this.f13988a = str;
        this.f13989b = str2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13988a.equals(aVar.f13988a) && this.f13989b.equals(aVar.f13989b);
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        return b.a(this);
    }

    @Override
    public q1 getWrappedMetadataFormat() {
        return b.b(this);
    }

    public int hashCode() {
        return ((527 + this.f13988a.hashCode()) * 31) + this.f13989b.hashCode();
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        String str = this.f13988a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bVar.M(this.f13989b);
                return;
            case 1:
                bVar.k0(this.f13989b);
                return;
            case 2:
                bVar.T(this.f13989b);
                return;
            case 3:
                bVar.L(this.f13989b);
                return;
            case 4:
                bVar.N(this.f13989b);
                return;
            default:
                return;
        }
    }

    public String toString() {
        String str = this.f13988a;
        String str2 = this.f13989b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13988a);
        parcel.writeString(this.f13989b);
    }

    public a(Parcel parcel) {
        this.f13988a = (String) l0.j(parcel.readString());
        this.f13989b = (String) l0.j(parcel.readString());
    }
}
