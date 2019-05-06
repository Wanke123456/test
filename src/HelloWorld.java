import java.io.File;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.createFile();
    }

    public void createFile(){
        File dir = new File(".");
        try {
            String path = dir.getCanonicalPath();
            path = path + "\\test.log";
            File file = new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
