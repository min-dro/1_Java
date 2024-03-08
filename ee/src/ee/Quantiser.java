package ee;

import javax.sound.midi.MidiMessage;
import javax.sound.midi.Receiver;

public class Quantiser implements Receiver{
    private int[] bpmsInMillis = new int[4];
    private int bpmInMillis=0;
    private double smallestNote = 1;
    private long period=0;

    private long fire=0;
    private long prevTimeStamp=0;

    private Runnable runny = new Runnable() {
        @Override
        public void run() {
            while(true){
                fire = System.nanoTime() + period;
                while(System.nanoTime() < fire){} // busy wait
                // Call some methods here.
            }
        }
    };
    private Thread thread = new Thread(runny);


    public void send1(MidiMessage message, long timeStamp) {

        // Calculate average bpm
        for(int i=0; i<bpmsInMillis.length-1;i++)
            bpmsInMillis[i] = bpmsInMillis[i+1];

        bpmsInMillis[bpmsInMillis.length-1] = (int) ((timeStamp - prevTimeStamp) / 1000);

        bpmInMillis = arithmeticMean(bpmsInMillis);
        prevTimeStamp = timeStamp;

        period = (long) (bpmInMillis * smallestNote * 1000000);

        if(!thread.isAlive()) {
            thread.start();
        }
        /*
        else{
            Calculate delay between signal and thread-signal.
            if(delay != 0){                    
                Delay new thread by "bpm - delay" milliseconds.
                Stop old thread.
                Start new thread.
            }
        */            
    }

    private int arithmeticMean(int[] bpmsInMillis2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
    public void close() {

    }

	@Override
	public void send(MidiMessage message, long timeStamp) {
		// TODO Auto-generated method stub
		
	}
}