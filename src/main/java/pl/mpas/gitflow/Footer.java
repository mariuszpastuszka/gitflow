package pl.mpas.gitflow;

public class Footer {
    String footer;

    public Footer(String footer) {
        this.footer = footer;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "Footer{" +
                "footer='" + footer + '\'' +
                '}';
    }
}
