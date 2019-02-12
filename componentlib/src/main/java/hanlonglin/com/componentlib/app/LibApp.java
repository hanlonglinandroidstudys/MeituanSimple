package hanlonglin.com.componentlib.app;

import android.app.Application;
import android.util.Log;

public class LibApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("TAG","lib app start....");
    }
}
