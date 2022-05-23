package q3;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import m3.i;

public final class m implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public final int M;
    public final b[] f21342a;
    public int f21343b;
    public final String f21344c;

    public class a implements Parcelable.Creator<m> {
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final String M;
        public final byte[] N;
        public int f21345a;
        public final UUID f21346b;
        public final String f21347c;

        public class a implements Parcelable.Creator<b> {
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public b a(byte[] bArr) {
            return new b(this.f21346b, this.f21347c, this.M, bArr);
        }

        public boolean b(UUID uuid) {
            return i.f16676a.equals(this.f21346b) || uuid.equals(this.f21346b);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return l0.c(this.f21347c, bVar.f21347c) && l0.c(this.M, bVar.M) && l0.c(this.f21346b, bVar.f21346b) && Arrays.equals(this.N, bVar.N);
        }

        public int hashCode() {
            if (this.f21345a == 0) {
                int hashCode = this.f21346b.hashCode() * 31;
                String str = this.f21347c;
                this.f21345a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.M.hashCode()) * 31) + Arrays.hashCode(this.N);
            }
            return this.f21345a;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f21346b.getMostSignificantBits());
            parcel.writeLong(this.f21346b.getLeastSignificantBits());
            parcel.writeString(this.f21347c);
            parcel.writeString(this.M);
            parcel.writeByteArray(this.N);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f21346b = (UUID) c5.a.e(uuid);
            this.f21347c = str;
            this.M = (String) c5.a.e(str2);
            this.N = bArr;
        }

        public b(Parcel parcel) {
            this.f21346b = new UUID(parcel.readLong(), parcel.readLong());
            this.f21347c = parcel.readString();
            this.M = (String) l0.j(parcel.readString());
            this.N = parcel.createByteArray();
        }
    }

    public m(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public int compare(b bVar, b bVar2) {
        UUID uuid = i.f16676a;
        if (uuid.equals(bVar.f21346b)) {
            return uuid.equals(bVar2.f21346b) ? 0 : 1;
        }
        return bVar.f21346b.compareTo(bVar2.f21346b);
    }

    public m b(String str) {
        return l0.c(this.f21344c, str) ? this : new m(str, false, this.f21342a);
    }

    public b c(int i10) {
        return this.f21342a[i10];
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return l0.c(this.f21344c, mVar.f21344c) && Arrays.equals(this.f21342a, mVar.f21342a);
    }

    public int hashCode() {
        if (this.f21343b == 0) {
            String str = this.f21344c;
            this.f21343b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f21342a);
        }
        return this.f21343b;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21344c);
        parcel.writeTypedArray(this.f21342a, 0);
    }

    public m(b... bVarArr) {
        this(null, bVarArr);
    }

    public m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public m(String str, boolean z10, b... bVarArr) {
        this.f21344c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f21342a = bVarArr;
        this.M = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public m(Parcel parcel) {
        this.f21344c = parcel.readString();
        b[] bVarArr = (b[]) l0.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f21342a = bVarArr;
        this.M = bVarArr.length;
    }
}
