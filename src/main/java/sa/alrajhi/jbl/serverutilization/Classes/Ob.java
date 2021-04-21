package sa.alrajhi.jbl.serverutilization.Classes;

public class Ob {
    String env;
    services services;
    user user;

    public Ob() {
    }

    public Ob(String env, sa.alrajhi.jbl.serverutilization.Classes.services services, sa.alrajhi.jbl.serverutilization.Classes.user user) {
        super();
        this.env = env;
        this.services = services;
        this.user = user;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public sa.alrajhi.jbl.serverutilization.Classes.services getServices() {
        return services;
    }

    public void setServices(sa.alrajhi.jbl.serverutilization.Classes.services services) {
        this.services = services;
    }

    public sa.alrajhi.jbl.serverutilization.Classes.user getUser() {
        return user;
    }

    public void setUser(sa.alrajhi.jbl.serverutilization.Classes.user user) {
        this.user = user;
    }
}
