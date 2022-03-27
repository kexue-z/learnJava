
/**
 * @auther kexue
 */

import tools.loader;
import tools.test.testloader;

public class run {
    public static void main(String[] args) {
        loader.mainLoader();
        testloader.mainTest();
    }

    /**
     * 
     * @param name
     * @return
     * @throws Exception
     */
    public String test(String name) throws Exception {
        return name;
    }
}
