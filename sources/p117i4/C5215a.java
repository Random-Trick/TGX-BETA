package p117i4;

import android.os.Parcel;
import android.os.Parcelable;
import p020b5.C1216l0;
import p073f4.C4260a;
import p073f4.C4263b;
import p174m3.C6600g1;
import p174m3.C6693s1;

public final class C5215a implements C4260a.AbstractC4262b {
    public static final Parcelable.Creator<C5215a> CREATOR = new C5216a();
    public final String f17351a;
    public final String f17352b;

    public class C5216a implements Parcelable.Creator<C5215a> {
        public C5215a createFromParcel(Parcel parcel) {
            return new C5215a(parcel);
        }

        public C5215a[] newArray(int i) {
            return new C5215a[i];
        }
    }

    public C5215a(String str, String str2) {
        this.f17351a = str;
        this.f17352b = str2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5215a.class != obj.getClass()) {
            return false;
        }
        C5215a aVar = (C5215a) obj;
        return this.f17351a.equals(aVar.f17351a) && this.f17352b.equals(aVar.f17352b);
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        return C4263b.m28326a(this);
    }

    @Override
    public C6600g1 getWrappedMetadataFormat() {
        return C4263b.m28325b(this);
    }

    public int hashCode() {
        return ((527 + this.f17351a.hashCode()) * 31) + this.f17352b.hashCode();
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        String str = this.f17351a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bVar.m19538M(this.f17352b);
                return;
            case 1:
                bVar.m19503k0(this.f17352b);
                return;
            case 2:
                bVar.m19531T(this.f17352b);
                return;
            case 3:
                bVar.m19539L(this.f17352b);
                return;
            case 4:
                bVar.m19537N(this.f17352b);
                return;
            default:
                return;
        }
    }

    public String toString() {
        String str = this.f17351a;
        String str2 = this.f17352b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17351a);
        parcel.writeString(this.f17352b);
    }

    public C5215a(Parcel parcel) {
        this.f17351a = (String) C1216l0.m37971j(parcel.readString());
        this.f17352b = (String) C1216l0.m37971j(parcel.readString());
    }
}
