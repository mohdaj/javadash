package sa.alrajhi.jbl.serverutilization.Classes;

public class user {
    String wlp;
    String admin;
    String oauth;
    String portal;

    public user() {
    }

    public user(String wlp, String admin, String oauth, String portal) {
        super();
        this.wlp = wlp;
        this.admin = admin;
        this.oauth = oauth;
        this.portal = portal;
    }

    public String getWlp() {
        return wlp;
    }

    public void setWlp(String wlp) {
        this.wlp = wlp;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getOauth() {
        return oauth;
    }

    public void setOauth(String oauth) {
        this.oauth = oauth;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }
}
