package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import java.util.ArrayList;
import java.util.List;
import m3.c2;

public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public final String f15654b;
    public final String f15655c;

    public class a implements Parcelable.Creator<m> {
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f15654b = str2;
        this.f15655c = str3;
    }

    public static List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return l0.c(this.f15647a, mVar.f15647a) && l0.c(this.f15654b, mVar.f15654b) && l0.c(this.f15655c, mVar.f15655c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f15647a.hashCode()) * 31;
        String str = this.f15654b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15655c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        String str = this.f15647a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    bVar.M(this.f15655c);
                    return;
                case 1:
                case 11:
                    bVar.R(this.f15655c);
                    return;
                case 2:
                case '\f':
                    bVar.d0(Integer.valueOf(Integer.parseInt(this.f15655c.substring(2, 4)))).c0(Integer.valueOf(Integer.parseInt(this.f15655c.substring(0, 2))));
                    return;
                case 3:
                case 17:
                    bVar.N(this.f15655c);
                    return;
                case 4:
                case 18:
                    bVar.L(this.f15655c);
                    return;
                case 5:
                case 19:
                    bVar.S(this.f15655c);
                    return;
                case 6:
                case 20:
                    String[] B0 = l0.B0(this.f15655c, "/");
                    bVar.n0(Integer.valueOf(Integer.parseInt(B0[0]))).m0(B0.length > 1 ? Integer.valueOf(Integer.parseInt(B0[1])) : null);
                    return;
                case 7:
                case 16:
                    bVar.k0(this.f15655c);
                    return;
                case '\b':
                case 15:
                    bVar.p0(this.f15655c);
                    return;
                case '\t':
                case 21:
                    bVar.e0(Integer.valueOf(Integer.parseInt(this.f15655c)));
                    return;
                case '\r':
                    List<Integer> a10 = a(this.f15655c);
                    int size = a10.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.c0(a10.get(2));
                            } else {
                                return;
                            }
                        }
                        bVar.d0(a10.get(1));
                    }
                    bVar.e0(a10.get(0));
                    return;
                case 14:
                    List<Integer> a11 = a(this.f15655c);
                    int size2 = a11.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.f0(a11.get(2));
                            } else {
                                return;
                            }
                        }
                        bVar.g0(a11.get(1));
                    }
                    bVar.h0(a11.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override
    public String toString() {
        String str = this.f15647a;
        String str2 = this.f15654b;
        String str3 = this.f15655c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": description=");
        sb2.append(str2);
        sb2.append(": value=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15647a);
        parcel.writeString(this.f15654b);
        parcel.writeString(this.f15655c);
    }

    public m(Parcel parcel) {
        super((String) l0.j(parcel.readString()));
        this.f15654b = parcel.readString();
        this.f15655c = (String) l0.j(parcel.readString());
    }
}
