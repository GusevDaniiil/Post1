import Modle.UserRecrestModel;
import Modle.UserResponseModel;

public class StepUser {
    ApiUser apiUser = new ApiUser();

    public UserResponseModel createUser(String name, String job){
        UserRecrestModel model = new UserRecrestModel(name, job);
        return apiUser.createUser(model);

    }

}