package hanlonglin.com.componentlib;

import hanlonglin.com.componentlib.interfaces.EmptyIService;
import hanlonglin.com.componentlib.interfaces.IService;

public class ServiceFactory {
    private static final ServiceFactory ourInstance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return ourInstance;
    }

    private ServiceFactory() {
    }

    private IService loginService;
    private IService liveService;

    public IService getLoginService() {
        if (loginService == null) {
            loginService = new EmptyIService();
        }
        return loginService;
    }

    public void setLoginService(IService loginService) {
        this.loginService = loginService;
    }

    public void setLiveService(IService liveService) {
        this.liveService = liveService;
    }

    public IService getLiveService() {
        if (liveService == null) {
            liveService = new EmptyIService();
        }
        return liveService;
    }
}
