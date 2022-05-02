package p176m5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

public class C6750b {

    public static class C6751a extends RuntimeException {
        public C6751a(@androidx.annotation.RecentlyNonNull java.lang.String r4, @androidx.annotation.RecentlyNonNull android.os.Parcel r5) {
            throw new UnsupportedOperationException("Method not decompiled: p176m5.C6750b.C6751a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    @RecentlyNonNull
    public static Bundle m19151a(@RecentlyNonNull Parcel parcel, int i) {
        int v = m19130v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + v);
        return readBundle;
    }

    @RecentlyNonNull
    public static byte[] m19150b(@RecentlyNonNull Parcel parcel, int i) {
        int v = m19130v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + v);
        return createByteArray;
    }

    @RecentlyNonNull
    public static int[] m19149c(@RecentlyNonNull Parcel parcel, int i) {
        int v = m19130v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + v);
        return createIntArray;
    }

    @RecentlyNonNull
    public static <T extends Parcelable> T m19148d(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int v = m19130v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + v);
        return createFromParcel;
    }

    @RecentlyNonNull
    public static String m19147e(@RecentlyNonNull Parcel parcel, int i) {
        int v = m19130v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + v);
        return readString;
    }

    @RecentlyNonNull
    public static String[] m19146f(@RecentlyNonNull Parcel parcel, int i) {
        int v = m19130v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + v);
        return createStringArray;
    }

    @RecentlyNonNull
    public static ArrayList<String> m19145g(@RecentlyNonNull Parcel parcel, int i) {
        int v = m19130v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + v);
        return createStringArrayList;
    }

    @RecentlyNonNull
    public static <T> T[] m19144h(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int v = m19130v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + v);
        return tArr;
    }

    @RecentlyNonNull
    public static <T> ArrayList<T> m19143i(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable.Creator<T> creator) {
        int v = m19130v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + v);
        return createTypedArrayList;
    }

    public static void m19142j(@RecentlyNonNull Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Overread allowed size end=");
            sb2.append(i);
            throw new C6751a(sb2.toString(), parcel);
        }
    }

    public static int m19141k(int i) {
        return (char) i;
    }

    public static boolean m19140l(@RecentlyNonNull Parcel parcel, int i) {
        m19127y(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte m19139m(@RecentlyNonNull Parcel parcel, int i) {
        m19127y(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double m19138n(@RecentlyNonNull Parcel parcel, int i) {
        m19127y(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float m19137o(@RecentlyNonNull Parcel parcel, int i) {
        m19127y(parcel, i, 4);
        return parcel.readFloat();
    }

    @RecentlyNonNull
    public static Float m19136p(@RecentlyNonNull Parcel parcel, int i) {
        int v = m19130v(parcel, i);
        if (v == 0) {
            return null;
        }
        m19126z(parcel, i, v, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int m19135q(@RecentlyNonNull Parcel parcel) {
        return parcel.readInt();
    }

    @RecentlyNonNull
    public static IBinder m19134r(@RecentlyNonNull Parcel parcel, int i) {
        int v = m19130v(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (v == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + v);
        return readStrongBinder;
    }

    public static int m19133s(@RecentlyNonNull Parcel parcel, int i) {
        m19127y(parcel, i, 4);
        return parcel.readInt();
    }

    @RecentlyNonNull
    public static Integer m19132t(@RecentlyNonNull Parcel parcel, int i) {
        int v = m19130v(parcel, i);
        if (v == 0) {
            return null;
        }
        m19126z(parcel, i, v, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long m19131u(@RecentlyNonNull Parcel parcel, int i) {
        m19127y(parcel, i, 8);
        return parcel.readLong();
    }

    public static int m19130v(@RecentlyNonNull Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void m19129w(@RecentlyNonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m19130v(parcel, i));
    }

    public static int m19128x(@RecentlyNonNull Parcel parcel) {
        int q = m19135q(parcel);
        int v = m19130v(parcel, q);
        int dataPosition = parcel.dataPosition();
        if (m19141k(q) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(q));
            throw new C6751a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = v + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Size read is invalid start=");
        sb2.append(dataPosition);
        sb2.append(" end=");
        sb2.append(i);
        throw new C6751a(sb2.toString(), parcel);
    }

    public static void m19127y(Parcel parcel, int i, int i2) {
        int v = m19130v(parcel, i);
        if (v != i2) {
            String hexString = Integer.toHexString(v);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb2.append("Expected size ");
            sb2.append(i2);
            sb2.append(" got ");
            sb2.append(v);
            sb2.append(" (0x");
            sb2.append(hexString);
            sb2.append(")");
            throw new C6751a(sb2.toString(), parcel);
        }
    }

    public static void m19126z(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb2.append("Expected size ");
            sb2.append(i3);
            sb2.append(" got ");
            sb2.append(i2);
            sb2.append(" (0x");
            sb2.append(hexString);
            sb2.append(")");
            throw new C6751a(sb2.toString(), parcel);
        }
    }
}
