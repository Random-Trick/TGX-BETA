package p235q8;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import p191n8.AbstractC7300a;
import p191n8.AbstractC7306f;
import p191n8.AbstractC7307g;
import p191n8.C7308h;

public class C8280d extends AbstractC7300a {
    public AbstractC7307g f26762M;
    public int f26763N;
    public int f26764O;

    public C8280d(AbstractC7307g gVar, long j, long j2) {
        super("crop(" + gVar.mo17091b() + ")");
        this.f26762M = gVar;
        this.f26763N = (int) j;
        this.f26764O = (int) j2;
    }

    public static List<CompositionTimeToSample.C3420a> m12954m(List<CompositionTimeToSample.C3420a> list, long j, long j2) {
        CompositionTimeToSample.C3420a next;
        if (list == null || list.isEmpty()) {
            return null;
        }
        long j3 = 0;
        ListIterator<CompositionTimeToSample.C3420a> listIterator = list.listIterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            next = listIterator.next();
            if (next.m30633a() + j3 > j) {
                break;
            }
            j3 += next.m30633a();
        }
        if (next.m30633a() + j3 >= j2) {
            arrayList.add(new CompositionTimeToSample.C3420a((int) (j2 - j), next.m30632b()));
            return arrayList;
        }
        arrayList.add(new CompositionTimeToSample.C3420a((int) ((next.m30633a() + j3) - j), next.m30632b()));
        int a = next.m30633a();
        while (true) {
            j3 += a;
            if (!listIterator.hasNext()) {
                break;
            }
            next = listIterator.next();
            if (next.m30633a() + j3 >= j2) {
                break;
            }
            arrayList.add(next);
            a = next.m30633a();
        }
        arrayList.add(new CompositionTimeToSample.C3420a((int) (j2 - j3), next.m30632b()));
        return arrayList;
    }

    @Override
    public C7308h mo12960D() {
        return this.f26762M.mo12960D();
    }

    @Override
    public synchronized long[] mo12959G() {
        if (this.f26762M.mo12959G() == null) {
            return null;
        }
        long[] G = this.f26762M.mo12959G();
        int length = G.length;
        int i = 0;
        while (i < G.length && G[i] < this.f26763N) {
            i++;
        }
        while (length > 0 && this.f26764O < G[length - 1]) {
            length--;
        }
        long[] copyOfRange = Arrays.copyOfRange(this.f26762M.mo12959G(), i, length);
        for (int i2 = 0; i2 < copyOfRange.length; i2++) {
            copyOfRange[i2] = copyOfRange[i2] - this.f26763N;
        }
        return copyOfRange;
    }

    @Override
    public SubSampleInformationBox mo12958I() {
        return this.f26762M.mo12958I();
    }

    @Override
    public synchronized long[] mo12957R() {
        long[] jArr;
        int i = this.f26764O - this.f26763N;
        jArr = new long[i];
        System.arraycopy(this.f26762M.mo12957R(), this.f26763N, jArr, 0, i);
        return jArr;
    }

    @Override
    public List<AbstractC7306f> mo12956Y() {
        return this.f26762M.mo12956Y().subList(this.f26763N, this.f26764O);
    }

    @Override
    public void close() {
        this.f26762M.close();
    }

    @Override
    public String getHandler() {
        return this.f26762M.getHandler();
    }

    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f26762M.getSampleDescriptionBox();
    }

    @Override
    public List<CompositionTimeToSample.C3420a> mo12955l() {
        return m12954m(this.f26762M.mo12955l(), this.f26763N, this.f26764O);
    }

    @Override
    public List<SampleDependencyTypeBox.C3425a> mo12953w0() {
        if (this.f26762M.mo12953w0() == null || this.f26762M.mo12953w0().isEmpty()) {
            return null;
        }
        return this.f26762M.mo12953w0().subList(this.f26763N, this.f26764O);
    }
}
