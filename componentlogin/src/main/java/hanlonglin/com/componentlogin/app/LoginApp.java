package hanlonglin.com.componentlogin.app;

import android.app.Application;
import android.util.Log;

import hanlonglin.com.componentlib.ServiceFactory;
import hanlonglin.com.componentlib.interfaces.IAppComponent;
import hanlonglin.com.componentlogin.LoginService;

public class LoginApp extends Application implements IAppComponent {
    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("TAG", "LoginApp start....");
    }

    @Override
    public void initialize(Application app) {
        application = app;
        Log.e("TAG", "Loginapp initialize.....");
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
