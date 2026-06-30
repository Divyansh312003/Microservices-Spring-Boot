package microservices.limits_service.modal;

public class Limits {
    int mini;
    int maxi;

    public Limits(int mini, int maxi) {
        this.mini = mini;
        this.maxi = maxi;

    }

    public int getMaxi() {
        return maxi;
    }

    public void setMaxi(int maxi) {
        this.maxi = maxi;
    }

    public int getMini() {
        return mini;
    }

    public void setMini(int mini) {
        this.mini = mini;
    }
}
