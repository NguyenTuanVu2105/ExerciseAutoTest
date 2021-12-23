package caculator;

// import org.junit.Test;
import org.testng.Assert;

import org.testng.annotations.Test;


public class SubTest {
    @Test(enabled=true)
    public void Sub(){
        App sub= new App();
        Assert.assertEquals(sub.sub(2,1),1);
    }
    @Test(enabled=true) 
    public void Sub1(){
        App sub= new App();
        Assert.assertEquals(sub.sub(3,1),1);
    }
    @Test(enabled=true) 
    public void Sub2(){
        App sub= new App();
        Assert.assertEquals(sub.sub(2,4),1);
    }
    
}
