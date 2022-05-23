package d2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import k0.a;

public class b extends a {
    public final SparseIntArray f6141d;
    public final Parcel f6142e;
    public final int f6143f;
    public final int f6144g;
    public final String f6145h;
    public int f6146i;
    public int f6147j;
    public int f6148k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    @Override
    public void A(byte[] bArr) {
        if (bArr != null) {
            this.f6142e.writeInt(bArr.length);
            this.f6142e.writeByteArray(bArr);
            return;
        }
        this.f6142e.writeInt(-1);
    }

    @Override
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f6142e, 0);
    }

    @Override
    public void E(int i10) {
        this.f6142e.writeInt(i10);
    }

    @Override
    public void G(Parcelable parcelable) {
        this.f6142e.writeParcelable(parcelable, 0);
    }

    @Override
    public void I(String str) {
        this.f6142e.writeString(str);
    }

    @Override
    public void a() {
        int i10 = this.f6146i;
        if (i10 >= 0) {
            int i11 = this.f6141d.get(i10);
            int dataPosition = this.f6142e.dataPosition();
            this.f6142e.setDataPosition(i11);
            this.f6142e.writeInt(dataPosition - i11);
            this.f6142e.setDataPosition(dataPosition);
        }
    }

    @Override
    public a b() {
        Parcel parcel = this.f6142e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f6147j;
        if (i10 == this.f6143f) {
            i10 = this.f6144g;
        }
        int i11 = i10;
        return new b(parcel, dataPosition, i11, this.f6145h + "  ", this.f6138a, this.f6139b, this.f6140c);
    }

    @Override
    public boolean g() {
        return this.f6142e.readInt() != 0;
    }

    @Override
    public byte[] i() {
        int readInt = this.f6142e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f6142e.readByteArray(bArr);
        return bArr;
    }

    @Override
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f6142e);
    }

    @Override
    public boolean m(int i10) {
        while (this.f6147j < this.f6144g) {
            int i11 = this.f6148k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f6142e.setDataPosition(this.f6147j);
            int readInt = this.f6142e.readInt();
            this.f6148k = this.f6142e.readInt();
            this.f6147j += readInt;
        }
        return this.f6148k == i10;
    }

    @Override
    public int o() {
        return this.f6142e.readInt();
    }

    @Override
    public <T extends Parcelable> T q() {
        return (T) this.f6142e.readParcelable(getClass().getClassLoader());
    }

    @Override
    public String s() {
        return this.f6142e.readString();
    }

    @Override
    public void w(int i10) {
        a();
        this.f6146i = i10;
        this.f6141d.put(i10, this.f6142e.dataPosition());
        E(0);
        E(i10);
    }

    @Override
    public void y(boolean z10) {
        this.f6142e.writeInt(z10 ? 1 : 0);
    }

    public b(Parcel parcel, int i10, int i11, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f6141d = new SparseIntArray();
        this.f6146i = -1;
        this.f6148k = -1;
        this.f6142e = parcel;
        this.f6143f = i10;
        this.f6144g = i11;
        this.f6147j = i10;
        this.f6145h = str;
    }
}
