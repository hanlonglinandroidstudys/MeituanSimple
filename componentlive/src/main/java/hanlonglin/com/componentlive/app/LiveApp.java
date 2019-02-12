package hanlonglin.com.componentlive.app;

import android.app.Application;
import android.util.Log;

import hanlonglin.com.componentlib.ServiceFactory;
import hanlonglin.com.componentlib.interfaces.IAppComponent;
import hanlonglin.com.componentlive.LiveService;

public class LiveApp extends Application implements IAppComponent {
    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("TAG","Live app start.....");
    }

    @Override
    public void initialize(Application app) {
        application=app;
        //ServiceFactory.getInstance().setLoginService();

        Log.e("TAG","Live app initialize.....");
        ServiceFactory.getInstance().setLiveService(new LiveService());
    }
}
