import Modle.UserRecrestModel;
import Modle.UserResponseModel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPost {
    StepUser stepUser = new StepUser();
    UserResponseModel model;

    @Test
    public  void firsTest(){
        model = stepUser.createUser("name","job");
        Assert.assertEquals(model.getJob(),"job");
        Assert.assertEquals(model.getName(),"n564ame");
    }
}