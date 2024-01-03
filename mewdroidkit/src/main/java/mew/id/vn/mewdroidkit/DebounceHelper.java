package mew.id.vn.mewdroidkit;

import android.os.Handler;
import android.os.Looper;

public class DebounceHelper {

    private final long time;
    private final Handler handler;
    private final Runnable runnable;

    public DebounceHelper(long time, final Runnable runnable) {
        this.time = time;
        this.handler = new Handler(Looper.getMainLooper());
        this.runnable = runnable;
    }

    public void run() {
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(runnable, time);
    }
}
