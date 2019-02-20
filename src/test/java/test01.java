import com.wl.bean.User;

public class test01 {

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user);
        throw new RuntimeException("错误");
    }
}
