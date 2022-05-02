package p235q8;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p191n8.AbstractC7300a;
import p191n8.AbstractC7306f;
import p191n8.AbstractC7307g;
import p191n8.C7308h;
import p249r8.AbstractC8380b;
import p249r8.C8383e;
import p249r8.C8386h;
import p269t2.AbstractC8950a;
import p345y8.AbstractC10452f;

public class C8277a extends AbstractC7300a {
    public static AbstractC10452f f26757O = AbstractC10452f.m5099a(C8277a.class);
    public AbstractC7307g[] f26758M;
    public SampleDescriptionBox f26759N;

    public C8277a(AbstractC7307g... gVarArr) {
        super(m12966m(gVarArr));
        this.f26758M = gVarArr;
        for (AbstractC7307g gVar : gVarArr) {
            SampleDescriptionBox sampleDescriptionBox = this.f26759N;
            if (sampleDescriptionBox == null) {
                SampleDescriptionBox sampleDescriptionBox2 = new SampleDescriptionBox();
                this.f26759N = sampleDescriptionBox2;
                sampleDescriptionBox2.addBox((AbstractC8950a) gVar.getSampleDescriptionBox().getBoxes(SampleEntry.class).get(0));
            } else {
                this.f26759N = m12968A0(sampleDescriptionBox, gVar.getSampleDescriptionBox());
            }
        }
    }

    public static String m12966m(AbstractC7307g... gVarArr) {
        String str = "";
        for (AbstractC7307g gVar : gVarArr) {
            str = String.valueOf(str) + gVar.mo17091b() + " + ";
        }
        return str.substring(0, str.length() - 3);
    }

    public final SampleDescriptionBox m12968A0(SampleDescriptionBox sampleDescriptionBox, SampleDescriptionBox sampleDescriptionBox2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            sampleDescriptionBox.getBox(Channels.newChannel(byteArrayOutputStream));
            sampleDescriptionBox2.getBox(Channels.newChannel(byteArrayOutputStream2));
            if (!Arrays.equals(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream.toByteArray())) {
                SampleEntry z0 = m12963z0((SampleEntry) sampleDescriptionBox.getBoxes(SampleEntry.class).get(0), (SampleEntry) sampleDescriptionBox2.getBoxes(SampleEntry.class).get(0));
                if (z0 != null) {
                    sampleDescriptionBox.setBoxes(Collections.singletonList(z0));
                } else {
                    throw new IOException("Cannot merge " + sampleDescriptionBox.getBoxes(SampleEntry.class).get(0) + " and " + sampleDescriptionBox2.getBoxes(SampleEntry.class).get(0));
                }
            }
            return sampleDescriptionBox;
        } catch (IOException e) {
            f26757O.mo5097c(e.getMessage());
            return null;
        }
    }

    public final VisualSampleEntry m12967B0(VisualSampleEntry visualSampleEntry, VisualSampleEntry visualSampleEntry2) {
        VisualSampleEntry visualSampleEntry3 = new VisualSampleEntry();
        if (visualSampleEntry.getHorizresolution() == visualSampleEntry2.getHorizresolution()) {
            visualSampleEntry3.setHorizresolution(visualSampleEntry.getHorizresolution());
            visualSampleEntry3.setCompressorname(visualSampleEntry.getCompressorname());
            if (visualSampleEntry.getDepth() == visualSampleEntry2.getDepth()) {
                visualSampleEntry3.setDepth(visualSampleEntry.getDepth());
                if (visualSampleEntry.getFrameCount() == visualSampleEntry2.getFrameCount()) {
                    visualSampleEntry3.setFrameCount(visualSampleEntry.getFrameCount());
                    if (visualSampleEntry.getHeight() == visualSampleEntry2.getHeight()) {
                        visualSampleEntry3.setHeight(visualSampleEntry.getHeight());
                        if (visualSampleEntry.getWidth() == visualSampleEntry2.getWidth()) {
                            visualSampleEntry3.setWidth(visualSampleEntry.getWidth());
                            if (visualSampleEntry.getVertresolution() == visualSampleEntry2.getVertresolution()) {
                                visualSampleEntry3.setVertresolution(visualSampleEntry.getVertresolution());
                                if (visualSampleEntry.getHorizresolution() == visualSampleEntry2.getHorizresolution()) {
                                    visualSampleEntry3.setHorizresolution(visualSampleEntry.getHorizresolution());
                                    if (visualSampleEntry.getBoxes().size() == visualSampleEntry2.getBoxes().size()) {
                                        Iterator<AbstractC8950a> it = visualSampleEntry2.getBoxes().iterator();
                                        for (AbstractC8950a aVar : visualSampleEntry.getBoxes()) {
                                            AbstractC8950a next = it.next();
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                            try {
                                                aVar.getBox(Channels.newChannel(byteArrayOutputStream));
                                                next.getBox(Channels.newChannel(byteArrayOutputStream2));
                                                if (Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                                                    visualSampleEntry3.addBox(aVar);
                                                } else if ((aVar instanceof AbstractDescriptorBox) && (next instanceof AbstractDescriptorBox)) {
                                                    AbstractDescriptorBox abstractDescriptorBox = (AbstractDescriptorBox) aVar;
                                                    abstractDescriptorBox.setDescriptor(m12964y0(abstractDescriptorBox.getDescriptor(), ((AbstractDescriptorBox) next).getDescriptor()));
                                                    visualSampleEntry3.addBox(aVar);
                                                }
                                            } catch (IOException e) {
                                                f26757O.mo5096d(e.getMessage());
                                                return null;
                                            }
                                        }
                                    }
                                    return visualSampleEntry3;
                                }
                                f26757O.mo5097c("horizontal resolution differs");
                                return null;
                            }
                            f26757O.mo5097c("vert resolution differs");
                            return null;
                        }
                        f26757O.mo5097c("width differs");
                        return null;
                    }
                    f26757O.mo5097c("height differs");
                    return null;
                }
                f26757O.mo5097c("frame count differs");
                return null;
            }
            f26757O.mo5097c("Depth differs");
            return null;
        }
        f26757O.mo5097c("Horizontal Resolution differs");
        return null;
    }

    @Override
    public C7308h mo12960D() {
        return this.f26758M[0].mo12960D();
    }

    @Override
    public long[] mo12959G() {
        if (this.f26758M[0].mo12959G() == null || this.f26758M[0].mo12959G().length <= 0) {
            return null;
        }
        int i = 0;
        for (AbstractC7307g gVar : this.f26758M) {
            i += gVar.mo12959G().length;
        }
        long[] jArr = new long[i];
        long j = 0;
        int i2 = 0;
        for (AbstractC7307g gVar2 : this.f26758M) {
            for (long j2 : gVar2.mo12959G()) {
                i2++;
                jArr[i2] = j2 + j;
            }
            j += gVar2.mo12956Y().size();
        }
        return jArr;
    }

    @Override
    public SubSampleInformationBox mo12958I() {
        return this.f26758M[0].mo12958I();
    }

    @Override
    public synchronized long[] mo12957R() {
        long[] jArr;
        int i = 0;
        for (AbstractC7307g gVar : this.f26758M) {
            i += gVar.mo12957R().length;
        }
        jArr = new long[i];
        int i2 = 0;
        for (AbstractC7307g gVar2 : this.f26758M) {
            for (long j : gVar2.mo12957R()) {
                i2++;
                jArr[i2] = j;
            }
        }
        return jArr;
    }

    @Override
    public List<AbstractC7306f> mo12956Y() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC7307g gVar : this.f26758M) {
            arrayList.addAll(gVar.mo12956Y());
        }
        return arrayList;
    }

    @Override
    public void close() {
        for (AbstractC7307g gVar : this.f26758M) {
            gVar.close();
        }
    }

    @Override
    public String getHandler() {
        return this.f26758M[0].getHandler();
    }

    @Override
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f26759N;
    }

    @Override
    public List<CompositionTimeToSample.C3420a> mo12955l() {
        if (this.f26758M[0].mo12955l() == null || this.f26758M[0].mo12955l().isEmpty()) {
            return null;
        }
        LinkedList<int[]> linkedList = new LinkedList();
        for (AbstractC7307g gVar : this.f26758M) {
            linkedList.add(CompositionTimeToSample.blowupCompositionTimes(gVar.mo12955l()));
        }
        LinkedList linkedList2 = new LinkedList();
        for (int[] iArr : linkedList) {
            for (int i : iArr) {
                if (linkedList2.isEmpty() || ((CompositionTimeToSample.C3420a) linkedList2.getLast()).m30632b() != i) {
                    linkedList2.add(new CompositionTimeToSample.C3420a(1, i));
                } else {
                    CompositionTimeToSample.C3420a aVar = (CompositionTimeToSample.C3420a) linkedList2.getLast();
                    aVar.m30631c(aVar.m30633a() + 1);
                }
            }
        }
        return linkedList2;
    }

    public final AudioSampleEntry m12965t(AudioSampleEntry audioSampleEntry, AudioSampleEntry audioSampleEntry2) {
        AudioSampleEntry audioSampleEntry3 = new AudioSampleEntry(audioSampleEntry2.getType());
        if (audioSampleEntry.getBytesPerFrame() == audioSampleEntry2.getBytesPerFrame()) {
            audioSampleEntry3.setBytesPerFrame(audioSampleEntry.getBytesPerFrame());
            if (audioSampleEntry.getBytesPerPacket() == audioSampleEntry2.getBytesPerPacket()) {
                audioSampleEntry3.setBytesPerPacket(audioSampleEntry.getBytesPerPacket());
                if (audioSampleEntry.getBytesPerSample() == audioSampleEntry2.getBytesPerSample()) {
                    audioSampleEntry3.setBytesPerSample(audioSampleEntry.getBytesPerSample());
                    if (audioSampleEntry.getChannelCount() == audioSampleEntry2.getChannelCount()) {
                        audioSampleEntry3.setChannelCount(audioSampleEntry.getChannelCount());
                        if (audioSampleEntry.getPacketSize() == audioSampleEntry2.getPacketSize()) {
                            audioSampleEntry3.setPacketSize(audioSampleEntry.getPacketSize());
                            if (audioSampleEntry.getCompressionId() == audioSampleEntry2.getCompressionId()) {
                                audioSampleEntry3.setCompressionId(audioSampleEntry.getCompressionId());
                                if (audioSampleEntry.getSampleRate() == audioSampleEntry2.getSampleRate()) {
                                    audioSampleEntry3.setSampleRate(audioSampleEntry.getSampleRate());
                                    if (audioSampleEntry.getSampleSize() == audioSampleEntry2.getSampleSize()) {
                                        audioSampleEntry3.setSampleSize(audioSampleEntry.getSampleSize());
                                        if (audioSampleEntry.getSamplesPerPacket() == audioSampleEntry2.getSamplesPerPacket()) {
                                            audioSampleEntry3.setSamplesPerPacket(audioSampleEntry.getSamplesPerPacket());
                                            if (audioSampleEntry.getSoundVersion() == audioSampleEntry2.getSoundVersion()) {
                                                audioSampleEntry3.setSoundVersion(audioSampleEntry.getSoundVersion());
                                                if (Arrays.equals(audioSampleEntry.getSoundVersion2Data(), audioSampleEntry2.getSoundVersion2Data())) {
                                                    audioSampleEntry3.setSoundVersion2Data(audioSampleEntry.getSoundVersion2Data());
                                                    if (audioSampleEntry.getBoxes().size() == audioSampleEntry2.getBoxes().size()) {
                                                        Iterator<AbstractC8950a> it = audioSampleEntry2.getBoxes().iterator();
                                                        for (AbstractC8950a aVar : audioSampleEntry.getBoxes()) {
                                                            AbstractC8950a next = it.next();
                                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                                            try {
                                                                aVar.getBox(Channels.newChannel(byteArrayOutputStream));
                                                                next.getBox(Channels.newChannel(byteArrayOutputStream2));
                                                                if (Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray())) {
                                                                    audioSampleEntry3.addBox(aVar);
                                                                } else if (ESDescriptorBox.TYPE.equals(aVar.getType()) && ESDescriptorBox.TYPE.equals(next.getType())) {
                                                                    ESDescriptorBox eSDescriptorBox = (ESDescriptorBox) aVar;
                                                                    eSDescriptorBox.setDescriptor(m12964y0(eSDescriptorBox.getEsDescriptor(), ((ESDescriptorBox) next).getEsDescriptor()));
                                                                    audioSampleEntry3.addBox(aVar);
                                                                }
                                                            } catch (IOException e) {
                                                                f26757O.mo5096d(e.getMessage());
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                    return audioSampleEntry3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return null;
                        }
                        f26757O.mo5097c("ChannelCount differ");
                    }
                    return null;
                }
                f26757O.mo5097c("BytesPerSample differ");
            }
            return null;
        }
        f26757O.mo5097c("BytesPerFrame differ");
        return null;
    }

    @Override
    public List<SampleDependencyTypeBox.C3425a> mo12953w0() {
        if (this.f26758M[0].mo12953w0() == null || this.f26758M[0].mo12953w0().isEmpty()) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (AbstractC7307g gVar : this.f26758M) {
            linkedList.addAll(gVar.mo12953w0());
        }
        return linkedList;
    }

    public final C8386h m12964y0(AbstractC8380b bVar, AbstractC8380b bVar2) {
        if (!(bVar instanceof C8386h) || !(bVar2 instanceof C8386h)) {
            f26757O.mo5097c("I can only merge ESDescriptors");
            return null;
        }
        C8386h hVar = (C8386h) bVar;
        C8386h hVar2 = (C8386h) bVar2;
        if (hVar.m12603n() != hVar2.m12603n()) {
            return null;
        }
        hVar.m12602o();
        hVar2.m12602o();
        if (hVar.m12610g() != hVar2.m12610g() || hVar.m12609h() != hVar2.m12609h() || hVar.m12600q() != hVar2.m12600q() || hVar.m12599r() != hVar2.m12599r() || hVar.m12607j() != hVar2.m12607j() || hVar.m12605l() != hVar2.m12605l()) {
            return null;
        }
        hVar.m12604m();
        hVar2.m12604m();
        if (hVar.m12601p() != null) {
            hVar.m12601p().equals(hVar2.m12601p());
        } else {
            hVar2.m12601p();
        }
        if (hVar.m12611f() == null ? hVar2.m12611f() != null : !hVar.m12611f().equals(hVar2.m12611f())) {
            C8383e f = hVar.m12611f();
            C8383e f2 = hVar2.m12611f();
            if (f.m12628f() != null && f2.m12628f() != null && !f.m12628f().equals(f2.m12628f())) {
                return null;
            }
            if (f.m12627g() != f2.m12627g()) {
                f.m12616r((f.m12627g() + f2.m12627g()) / 2);
            }
            f.m12626h();
            f2.m12626h();
            if (f.m12625i() == null ? f2.m12625i() != null : !f.m12625i().equals(f2.m12625i())) {
                return null;
            }
            if (f.m12624j() != f2.m12624j()) {
                f.m12614t(Math.max(f.m12624j(), f2.m12624j()));
            }
            if (!(f.m12622l().equals(f2.m12622l()) && f.m12623k() == f2.m12623k() && f.m12621m() == f2.m12621m() && f.m12620n() == f2.m12620n())) {
                return null;
            }
        }
        if (hVar.m12608i() == null ? hVar2.m12608i() != null : !hVar.m12608i().equals(hVar2.m12608i())) {
            return null;
        }
        if (hVar.m12606k() == null ? hVar2.m12606k() == null : hVar.m12606k().equals(hVar2.m12606k())) {
            return hVar;
        }
        return null;
    }

    public final SampleEntry m12963z0(SampleEntry sampleEntry, SampleEntry sampleEntry2) {
        if (!sampleEntry.getType().equals(sampleEntry2.getType())) {
            return null;
        }
        if ((sampleEntry instanceof VisualSampleEntry) && (sampleEntry2 instanceof VisualSampleEntry)) {
            return m12967B0((VisualSampleEntry) sampleEntry, (VisualSampleEntry) sampleEntry2);
        }
        if (!(sampleEntry instanceof AudioSampleEntry) || !(sampleEntry2 instanceof AudioSampleEntry)) {
            return null;
        }
        return m12965t((AudioSampleEntry) sampleEntry, (AudioSampleEntry) sampleEntry2);
    }
}
