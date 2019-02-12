package hanlonglin.com.componentlib.interfaces;

import android.app.Application;

public interface IAppComponent {

    String COMPONENTS[] = {
            "hanlonglin.com.componentlive.app.LiveApp",
            "hanlonglin.com.componentlogin.app.LoginApp"
    };

    public void initialize(Application app);
}
