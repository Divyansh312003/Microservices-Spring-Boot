package microservices.limits_service.modal;

public class Limits {
    int maxi;
    int mini;

    public Limits(int maxi, int mini) {
        this.maxi = maxi;
        this.mini = mini;
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
