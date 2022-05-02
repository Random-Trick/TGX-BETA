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
    public AbstractC7307g f26759M;
    public int f26760N;
    public int f26761O;

    public C8280d(AbstractC7307g gVar, long j, long j2) {
        super("crop(" + gVar.mo17091b() + ")");
        this.f26759M = gVar;
        this.f26760N = (int) j;
        this.f26761O = (int) j2;
    }

    public static List<CompositionTimeToSample.C3420a> m12955m(List<CompositionTimeToSample.C3420a> list, long j, long j2) {
        CompositionTimeToSample.C3420a next;
        if (list == null || list.isEmpty()) {
            return null;
        }
        long j3 = 0;
        ListIterator<CompositionTimeToSample.C3420a> listIterator = list.listIterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            next = listIterator.next();
            if (next.m30631a() + j3 > j) {
                break;
            }
            j3 += next.m30631a();
        }
        if (next.m30631a() + j3 >= j2) {
            arrayList.add(new CompositionTimeToSample.C3420a((int) (j2 - j), next.m30630b()));
            return arrayList;
        }
        arrayList.add(new CompositionTimeToSample.C3420a((int) ((next.m30631a() + j3) - j), next.m30630b()));
        int a = next.m30631a();
        while (true) {
            j3 += a;
            if (!listIterator.hasNext()) {
                break;
            }
            next = listIterator.next();
            if (next.m30631a() + j3 >= j2) {
                break;
            }
            arrayList.add(next);
            a = next.m30631a();
        }
        arrayList.add(new CompositionTimeToSample.C3420a((int) (j2 - j3), next.m30630b()));
        return arrayList;
    }

    @Override
    public C7308h mo12961D() {
        return this.f26759M.mo12961D();
    }

    @Override
    public synchronized long[] mo12960G() {
        if (this.f26759M.mo12960G() == null) {
            return null;
        }
        long[] G = this.f26759M.mo12960G();
        int length = G.length;
        int i = 0;
        while (i < G.length && G[i] < this.f26760N) {
            i++;
        }
        while (length > 0 && this.f26761O < G[length - 1]) {
            length--;
        }
        long[] copyOfRange = Arrays.copyOfRange(this.f26759M.mo12960G(), i, length);
        for (int i2 = 0; i2 < copyOfRange.length; i2++) {
            copyOfRange[i2] = copyOfRange[i2] - this.f26760N;
        }
        return copyOfRange;
    }

    @Override
    public SubSampleInformationBox mo12959I() {
        return this.f26759M.mo12959I();
    }

    @Override
    public synchronized long[] mo12958R() {
        long[] jArr;
        int i = this.f26761O - this.f26760N;
        jArr = new long[i];
        System.arraycopy(this.f26759M.mo12958R(), this.f26760N, jArr, 0, i);
        return jArr;
    }

    @Override
    public List<AbstractC7306f> mo12957Y() {
        return this.f26759M.mo12957Y().subList(this.f26760N, this.f26761O);
    }

    @Override
    public void close() {
        this.f26759M.close();
    }

    @Override
    public String getHandler() {
        return this.f26759M.getHandler();
    }

    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f26759M.getSampleDescriptionBox();
    }

    @Override
    public List<CompositionTimeToSample.C3420a> mo12956l() {
        return m12955m(this.f26759M.mo12956l(), this.f26760N, this.f26761O);
    }

    @Override
    public List<SampleDependencyTypeBox.C3425a> mo12954w0() {
        if (this.f26759M.mo12954w0() == null || this.f26759M.mo12954w0().isEmpty()) {
            return null;
        }
        return this.f26759M.mo12954w0().subList(this.f26760N, this.f26761O);
    }
}
