package Modle;

public class UserResponseModel {
    private String job;
    private String name;

    public UserResponseModel(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

}
