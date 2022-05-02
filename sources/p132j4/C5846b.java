package p132j4;

import android.os.Parcel;
import android.os.Parcelable;
import p020b5.C1186a;
import p020b5.C1216l0;
import p073f4.C4260a;
import p073f4.C4263b;
import p174m3.C6600g1;
import p174m3.C6693s1;

public final class C5846b implements C4260a.AbstractC4262b {
    public static final Parcelable.Creator<C5846b> CREATOR = new C5847a();
    public final String f18712M;
    public final boolean f18713N;
    public final int f18714O;
    public final int f18715a;
    public final String f18716b;
    public final String f18717c;

    public class C5847a implements Parcelable.Creator<C5846b> {
        public C5846b createFromParcel(Parcel parcel) {
            return new C5846b(parcel);
        }

        public C5846b[] newArray(int i) {
            return new C5846b[i];
        }
    }

    public C5846b(int i, String str, String str2, String str3, boolean z, int i2) {
        C1186a.m38192a(i2 == -1 || i2 > 0);
        this.f18715a = i;
        this.f18716b = str;
        this.f18717c = str2;
        this.f18712M = str3;
        this.f18713N = z;
        this.f18714O = i2;
    }

    public static p132j4.C5846b m21943a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        throw new UnsupportedOperationException("Method not decompiled: p132j4.C5846b.m21943a(java.util.Map):j4.b");
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5846b.class != obj.getClass()) {
            return false;
        }
        C5846b bVar = (C5846b) obj;
        return this.f18715a == bVar.f18715a && C1216l0.m37985c(this.f18716b, bVar.f18716b) && C1216l0.m37985c(this.f18717c, bVar.f18717c) && C1216l0.m37985c(this.f18712M, bVar.f18712M) && this.f18713N == bVar.f18713N && this.f18714O == bVar.f18714O;
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
        int i = (527 + this.f18715a) * 31;
        String str = this.f18716b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18717c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18712M;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f18713N ? 1 : 0)) * 31) + this.f18714O;
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        String str = this.f18717c;
        if (str != null) {
            bVar.m19507i0(str);
        }
        String str2 = this.f18716b;
        if (str2 != null) {
            bVar.m19526Y(str2);
        }
    }

    public String toString() {
        String str = this.f18717c;
        String str2 = this.f18716b;
        int i = this.f18715a;
        int i2 = this.f18714O;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb2.append("IcyHeaders: name=\"");
        sb2.append(str);
        sb2.append("\", genre=\"");
        sb2.append(str2);
        sb2.append("\", bitrate=");
        sb2.append(i);
        sb2.append(", metadataInterval=");
        sb2.append(i2);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18715a);
        parcel.writeString(this.f18716b);
        parcel.writeString(this.f18717c);
        parcel.writeString(this.f18712M);
        C1216l0.m38007I0(parcel, this.f18713N);
        parcel.writeInt(this.f18714O);
    }

    public C5846b(Parcel parcel) {
        this.f18715a = parcel.readInt();
        this.f18716b = parcel.readString();
        this.f18717c = parcel.readString();
        this.f18712M = parcel.readString();
        this.f18713N = C1216l0.m37942x0(parcel);
        this.f18714O = parcel.readInt();
    }
}
