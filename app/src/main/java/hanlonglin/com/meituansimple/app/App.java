package hanlonglin.com.meituansimple.app;

import android.app.Application;
import android.util.Log;

import hanlonglin.com.componentlib.interfaces.IAppComponent;

public class App extends Application implements IAppComponent {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("TAG", "main app start....");
        initialize(this);
    }

    @Override
    public void initialize(Application app) {
        //对每个组件的 接口进行注册
        for(String component:COMPONENTS){
            try {
                Class<?> clazz=Class.forName(component);
                Object obj=clazz.newInstance();
                if(obj instanceof IAppComponent){
                    ((IAppComponent)obj).initialize(this);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
